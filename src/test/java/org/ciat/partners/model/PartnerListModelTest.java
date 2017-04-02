package org.ciat.partners.model;

import static org.junit.Assert.*;

import java.io.File;

import org.ciat.partners.helper.FileHelper;
import org.ciat.partners.languages.*;
import org.junit.BeforeClass;
import org.junit.Test;

public class PartnerListModelTest {
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		new File(PartnerListModel.filePath).delete();
	}
	
	@Test
	public void savePartnerTest(){
		PartnerListModel plm = PartnerListModel.getInstance();
		
		PartnerModel pm = new PartnerModel();
		pm.setAcronym("TDD");
		pm.setName("Test Driven Development");
		pm.setBranch(false);
		pm.setCity("Cali");
		pm.setCountry("Colombia");
		pm.setType("Donor");
		plm.add(pm);
		
		String result = FileHelper.fileToString(PartnerListModel.filePath);
		String expect = "[{\"branch\":false,\"acronym\":\"TDD\",\"name\":\"Test Driven Development\",\"type\":\"Donor\",\"country\":\"Colombia\",\"city\":\"Cali\"}]";
		assertEquals(result, expect);
	}
	
	@Test
	public void TestNotExistName() {
		EnglishMessages msg = new EnglishMessages(); 
		PartnerListModel plm = PartnerListModel.getInstance();
		
		PartnerModel pm = new PartnerModel();
		pm.setAcronym("TDD!");
		pm.setName("Test Driven Development!");
		pm.setBranch(false);
		pm.setCity("Cali");
		pm.setCountry("Colombia");
		pm.setType("Donor");
		
		assertEquals(0, plm.add(pm));
		assertEquals(1, plm.add(pm));
		pm.setBranch(true);
		assertEquals(2, plm.add(pm));
		
		pm = new PartnerModel();
		pm.setAcronym("TDD!");
		pm.setName("Test Driven Development!");
		pm.setBranch(true);
		pm.setType("Donor");
		pm.setCity("Paris");
		pm.setCountry("Francia");
		assertEquals(0, plm.add(pm));

	}
}
