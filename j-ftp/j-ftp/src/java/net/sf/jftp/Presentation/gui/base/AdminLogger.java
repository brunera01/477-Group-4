package net.sf.jftp.Presentation.gui.base;

import java.io.File;
import java.io.FileWriter;
import java.util.Date;

public class AdminLogger {
	
	private final String folderName = "AdminLogs";
	
	public static boolean LogError(String errorLog, Date timestamp) {
		try {
			String fileName = "errors/"+timestamp.toString()+".txt";
			fileName = fileName.replace(":","");
			File logFile = new File(fileName);
			logFile.createNewFile();
			FileWriter logWriter = new FileWriter(fileName);
			logWriter.write(errorLog);
			logWriter.close();
			return true;
		} catch(Exception e) {
			e.printStackTrace();
			return false;
		}
	}
}
