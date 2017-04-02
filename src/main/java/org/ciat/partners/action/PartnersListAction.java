package org.ciat.partners.action;

import java.util.Vector;

import org.ciat.partners.model.PartnerListModel;
import org.ciat.partners.model.PartnerModel;

import com.opensymphony.xwork2.ActionSupport;

public class PartnersListAction extends ActionSupport {

	private static final long serialVersionUID = 1L;
	
	private Vector<PartnerModel> list;
	
	public Vector<PartnerModel> getList(){
		return list;
	}
	
	public String execute() throws Exception {
		list = PartnerListModel.getInstance().getArray();
		return SUCCESS;
	}

	public PartnerModel getMessageStore() {
		return null;
	}

	public void setMessageStore(PartnerModel messageStore) {
		//this.messageStore = messageStore;
	}
}
