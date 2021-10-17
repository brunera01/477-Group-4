package net.sf.jftp.DataSource;

import java.io.FileInputStream;

import net.sf.jftp.GeneralSettings;

public class DataSettings extends GeneralSettings {
	
	public static boolean shortProgress = true;
	public static final int connectionTimeout = 30000;
	public static int statusMessageAfterMillis = 1000;
	public static boolean ftpKeepAlive = true;
    public static int ftpKeepAliveInterval = 29000;
    public static int ftpTransferThreadPause = 2000;
    
    // sends NOOPs to ensure that buffers are empty
    public static boolean safeMode = false;
    
    // enables some delays 
    public static boolean enableFtpDelays = false;
	
	// for DataConnection - lower means less buffer, more updates in the downloadmanager
    // i recommend to use values greater than 2048 bytes
    public static int bufferSize = 8192;
    
	
	public static int getSocketTimeout()
    {
        return 3000;
    }
	
	public static int getMaxConnections()
    {
        return maxConnections;
    }
	
	public static String getRSSFeed()
    {
        String what = p.getProperty("jftp.customRSSFeed",
                                    "http://slashdot.org/rss/slashdot.rss");

        return what;
    }
	

}
