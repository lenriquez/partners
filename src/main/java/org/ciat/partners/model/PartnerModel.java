package org.ciat.partners.model;

public class PartnerModel {
	private boolean branch;
	private String acronym;
	private String name;
	private String type;
	private String country;
	private String city;
	private String parent;
	
	public PartnerModel() {
	}

	public boolean isBranch() {
		return branch;
	}

	public void setBranch(boolean branch) {
		this.branch = branch;
	}

	public String getAcronym() {
		return acronym;
	}

	public void setAcronym(String acronym) {
		this.acronym = acronym.trim();
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type.trim();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name.trim();
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country.trim();
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city.trim();
	}

	public String getParent() {
		return parent;
	}

	public void setParent(String parent) {
		this.parent = parent;
	}
}
