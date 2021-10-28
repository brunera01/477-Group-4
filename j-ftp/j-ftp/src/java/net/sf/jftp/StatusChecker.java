package net.sf.jftp;

import net.sf.jftp.DataSource.net.ConnectionHandler;
import net.sf.jftp.DataSource.net.FtpConnection;
import net.sf.jftp.Domain.system.logging.Log;
import net.sf.jftp.Domain.system.logging.SystemLogger;
import net.sf.jftp.Presentation.gui.hostchooser.HostChooser;

public class StatusChecker {
	
	public boolean checkStatus() {
		try {
			return Log.getStatus() && HostChooser.getStatus() && ConnectionHandler.getStatus();
		}
		catch(Exception e) {
			return false;
		}
	}
	
}