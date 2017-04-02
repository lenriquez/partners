package org.ciat.partners.languages;

import java.util.HashMap;

public class EnglishMessages extends Messages{
	public EnglishMessages(){
		msg = new HashMap<String, String>();
		msg.put("case1", "Name or acronym are equal to another partner and this is not a branch of it");
		msg.put("case2", "There is another branch on the same city or country");
		msg.put("success", "Your changes have been saved successfully");
	}
}