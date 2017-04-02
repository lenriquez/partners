package org.ciat.partners.helper;

import static org.junit.Assert.*;
import org.junit.Test;

import java.io.File;
 
import org.ciat.partners.helper.FileHelper;

public class FileHelperTest {

	@Test
	public void createFileIfNotExistTest() {
		FileHelper.createFileIfNotExist("data/test.json");
	    assertEquals(true, new File("data/test.json").exists());
	}
	
	@Test
	public void writeToFileTest() {
		FileHelper.writeToFile("data/test.json","[cat]");
	    assertEquals("[cat]", FileHelper.fileToString("data/test.json"));
	}
	
}
