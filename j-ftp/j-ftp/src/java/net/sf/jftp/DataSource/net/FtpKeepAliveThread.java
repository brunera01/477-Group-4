package net.sf.jftp.DataSource.net;

import net.sf.jftp.DataSource.DataSettings;

public class FtpKeepAliveThread implements Runnable {

	private Thread runner;
	private FtpConnection conn;
	
	public FtpKeepAliveThread(FtpConnection conn) {
		this.conn = conn;
		
		runner = new Thread(this);
		runner.start();
	}
	
	public void run() {
		while(conn.isConnected()) {
			try {
				Thread.sleep(DataSettings.ftpKeepAliveInterval);
				
				conn.noop();
			}
			catch(Exception ex) {
				ex.printStackTrace();
			}
		}
	}
}
