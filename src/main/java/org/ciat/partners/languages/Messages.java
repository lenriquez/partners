package org.ciat.partners.languages;

import java.util.Map;

public abstract class Messages {
	protected  Map<String,String> msg;
	
	public String getMsg(String key){
		return msg.get(key);
	}
}
