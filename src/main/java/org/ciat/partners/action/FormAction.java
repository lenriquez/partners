package org.ciat.partners.action;

import java.util.Vector;

import org.ciat.partners.languages.EnglishMessages;
import org.ciat.partners.languages.Messages;
import org.ciat.partners.model.CountriesModel;
import org.ciat.partners.model.PartnerListModel;
import org.ciat.partners.model.PartnerModel;
import org.ciat.partners.model.TypesModel;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.Preparable;

public class FormAction extends ActionSupport implements Preparable{

	private static final long serialVersionUID = 1L;
	
	private Vector<PartnerModel> list;
	
	private static Messages m = new EnglishMessages(); // This should use dependency injection
	
	private PartnerModel partnerModel;
	
	private String message;
	
	private String[] partners;

	public PartnerModel getPartnerModel(){
		return partnerModel;
	}
	
	public void prepare() {
		list = PartnerListModel.getInstance().getArray();
		partners = new String[list.size()];
		int i = 0;
		for(PartnerModel pm : list) {
			partners[i++]= pm.getName();
		}
	}
	
	public void setPartnerModel(PartnerModel pmBean){
		this.partnerModel = pmBean;
	}
	
	public String[] getTypes(){
		return new TypesModel().getTypes();
	}
	
	public String[] getCountries(){
		return new CountriesModel().getList();
	}
	
	public String getMessage(){
		return message;
	}
	
	public String[] getPartners(){
		return partners;
	}	
	
	public String execute() throws Exception {
		list = PartnerListModel.getInstance().getArray();
		return SUCCESS;
	}
	
	public String save(){
		int message = PartnerListModel.getInstance().add(getPartnerModel());
		System.out.println(message);
		if(message==0){
			return SUCCESS;
		}else if(message >= 0){
			this.message = m.getMsg("case" + Integer.toString(message));
		}
		return "error";
	}

}
