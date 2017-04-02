package org.ciat.partners.model;

import java.util.Vector;

import org.ciat.partners.helper.FileHelper;
import org.ciat.partners.languages.EnglishMessages;
import org.ciat.partners.languages.Messages;

import com.google.gson.Gson;


public class PartnerListModel {
	protected Vector<PartnerModel> partners = new Vector<PartnerModel>();
	public static final String filePath = "data/partners.json";
	private static PartnerListModel partnerListModel;
	
	private PartnerListModel(){
		FileHelper.createFileIfNotExist(filePath);
		loadData();
	}
	
	public static PartnerListModel getInstance(){
		if (partnerListModel == null){
			partnerListModel = new PartnerListModel();
		}
		return partnerListModel;
	}
	
	public Vector<PartnerModel> getArray(){
		return partners;
	}
	
	protected void loadData() {
		String partnersStr = FileHelper.fileToString(filePath);
		partnersStr = partnersStr.isEmpty() ? "[ ]" : partnersStr;
		Gson gson = new Gson();
		PartnerModel[] partners = gson.fromJson(partnersStr, PartnerModel[].class);
		for (PartnerModel partner : partners) {
			add(partner);
		}
	}
	
	public int verifyRules( PartnerModel newp ) {
		for (PartnerModel p : partners) {
			// If name or acronym are equal ignore
			if( !(p.getName().equals(newp.getName())  || p.getAcronym().equals(newp.getAcronym()) ) ) {
				continue;
			}
			System.out.println("I am verifiying branch");
			// If is not a branch return false because is duplicated  
			if (newp.isBranch() == false){
				System.out.println("branch");
				return 1;
			}
			// Is a branch, verify that the partner is located in a different country and city
			if(p.getCity().equals(newp.getCity()) && p.getCountry().equals(newp.getCountry())) {
				return  2; // Is a branch located on the same country and city
			}
		}
		return 0;
	}

	public synchronized int add(PartnerModel partner) {
		if(partner == null) {
			return -1;
		}
		
		int message = verifyRules(partner);
		if ( message != 0) {
			return message;
		}
		partners.add(partner);
		Gson gson = new Gson();
		FileHelper.writeToFile(filePath, gson.toJson(partners).toString());
		return 0;
	}

}
