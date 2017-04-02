package org.ciat.partners.helper;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class FileHelper {
	
	static Logger logger = LogManager.getLogger(FileHelper.class);
			
	public static void createFileIfNotExist(String filePath) {
		try {
			FileUtils.openOutputStream(new File(filePath), true);
		} catch (IOException e) {
			logger.fatal("The file path for " + filePath + " is incorrect check permission, types");
			e.printStackTrace();
			System.exit(1);
		}
	}
	
	public static String fileToString(String filePath) {
		try {
			return FileUtils.readFileToString(new File(filePath));
		} catch (IOException e) {
			logger.fatal("Is not possible to read " + filePath + " ");
			e.printStackTrace();
			System.exit(1);
		}
		return "";
	}
	
	public static void writeToFile(String filePath, String data ) {
		try {
			FileUtils.writeStringToFile(new File(filePath), data, "UTF-8");
		} catch (IOException e) {
			logger.fatal("Is not possible to write on " + filePath + " ");
			e.printStackTrace();
			System.exit(1);
		}
	}
	
}
