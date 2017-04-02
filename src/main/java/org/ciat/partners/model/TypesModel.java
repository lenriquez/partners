package org.ciat.partners.model;

public class TypesModel {
	String[] types;
	
	public TypesModel(){
		types = new String[]{ "Academic Institutions", "Donor", "Non-Govermental Organization", "Research Intitution" };
	}
	
	public String[] getTypes(){
		return types;
		
	}
}

