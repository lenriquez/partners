package org.ciat.partners.model;

import org.ciat.partners.helper.FileHelper;

public class CountriesModel {
	private String[] list;
	public static final String filePath = "data/CountryList.txt";
	
	public CountriesModel(){
		setList(FileHelper.fileToString(CountriesModel.filePath).split("~"));
	}

	public String[] getList() {
		return list;
	}

	public void setList(String[] list) {
		this.list = list;
	}

}
