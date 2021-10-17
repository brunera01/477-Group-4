package net.sf.jftp;


import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

public abstract class GeneralSettings {
	
	private static String noUploadMultiThreading = "false";
	public static final String defaultWorkDir = System.getProperty("user.home");
    public static final String defaultDir = "<default>";
    
    
    protected static Properties p = new Properties();
    public static final String propertyFilename = System.getProperty("user.home") +
                                                  File.separator +
                                                  ".jftp/jftp.properties".replace('/',
                                                                                  File.separatorChar);

    public static boolean IS_JAVA_1_6 = true;
    
    public static final String defaultWidth = "1000";
    public static final String defaultHeight = "740";
    public static final String defaultX = "20";
    public static final String defaultY = "20";
    
    //set to false if you want it to run as an applet
    public static boolean isStandalone = true;
    
    public static String background = "images/back.jpg";
    public static boolean enableResuming = false; // overridden by JFtp
    public static boolean enableUploadResuming = false;
    public static boolean noUploadResumingQuestion = true;
    public static int uiRefresh = 500;
    private static String storePasswords = "false";
    private static String defaultEnableDebug = "false";
    private static String enableMultiThreading = "true";
    private static String defaultFtpPasvMode = "true";
    public static int maxConnections = 3;
    
    private static String enableSmbMultiThreading = "true";
	private static String enableSftpMultiThreading = "true";
    
    public static final String readme = "docs/readme";
    
    // hides some messages like MODE, Type etc.
    public static boolean hideStatus = false;
    
    // title of the app
    public static final String title = "JFtp - The Java Network Browser";
    
    // may the windows be resized?
    public static boolean resize = true;
    
    public static String iconImage;
    public static String nextRSSImage;
    public static String scrollLockImage = "images/current/drive_link.png";
    public static String clearLogImage = "images/current/delete.png";
    
public static final String userHomeDir = System.getProperty("user.home");
	
	public static final String appHomeDir = userHomeDir +
            "/.jftp/".replace('/',
                              File.separatorChar);
	
	public static final String bookmarks = appHomeDir +
            "bookmarks.txt".replace('/',
                                    File.separatorChar);
	
	public static final String login_def = appHomeDir +
            ".login_default".replace('/',
                                     File.separatorChar);
	public static final String login = appHomeDir +
        ".login".replace('/', File.separatorChar);

//*** The new files that I have created
	public static final String last_cons = appHomeDir +
            ".last_cons".replace('/',
                                 File.separatorChar);
	public static final String login_def_sftp = appHomeDir +
                 ".last_cons_sftp".replace('/',
                                           File.separatorChar);
	public static final String login_def_smb = appHomeDir +
                ".last_cons_smb".replace('/',
                                         File.separatorChar);
	public static final String login_def_nfs = appHomeDir +
                ".last_cons_nfs".replace('/',
                                         File.separatorChar);
	public static final String ls_out = appHomeDir+".ls_out".replace('/', File.separatorChar);
	public static final String adv_settings = appHomeDir +
            ".adv_settings".replace('/',
                                    File.separatorChar);
    
    public static java.awt.Dimension getWindowSize()
    {
        int width = Integer.parseInt(p.getProperty("jftp.window.width",
                                                   defaultWidth));
        int height = Integer.parseInt(p.getProperty("jftp.window.height",
                                                    defaultHeight));

        if(width < 100 || height < 100) {
        	width = Integer.parseInt(defaultWidth);
        	height = Integer.parseInt(defaultHeight);
        }
        
        return new java.awt.Dimension(width, height);
    }
    
    public static boolean getEnableRSS()
    {
        String what = p.getProperty("jftp.enableRSS", "false");

        if(what.trim().equals("false"))
        {
            return false;
        }
        else
        {
            return true;
        }
    }
    
    public static String getProperty(String key) {
    	return ""+p.getProperty(key);
    }
    
    public static Object setProperty(String key, String value)
    {
        return p.setProperty(key, value);
    }
    
    public static Object setProperty(String key, boolean value)
    {
        String val = "false";

        if(value)
        {
            val = "true";
        }

        return p.setProperty(key, val);
    }
    
    public static Object setProperty(String key, int value)
    {
        return p.setProperty(key, Integer.toString(value));
    }
    
    public static void save()
    {
        try
        {
            new File(System.getProperty("user.home") + File.separator +
                     ".jftp").mkdir();
            p.store(new FileOutputStream(propertyFilename), "jftp.properties");
        }
        catch(Exception e)
        {
            System.out.println("Cannot save properties...");

            //e.printStackTrace();
        }
    }
    
    public static String getSocksProxyHost()
    {
        String what = p.getProperty("jftp.socksProxyHost", "");

        return what;
    }

    public static String getSocksProxyPort()
    {
        String what = p.getProperty("jftp.socksProxyPort", "");

        return what;
    }
    
    public static String getLookAndFeel()
    {
        return p.getProperty("jftp.gui.look", null);
    }
    
    public static java.awt.Point getWindowLocation()
    {
        int x = Integer.parseInt(p.getProperty("jftp.window.x", defaultX));
        int y = Integer.parseInt(p.getProperty("jftp.window.y", defaultY));

        if(x < 0 || y < 0) {
        	x = 0;
        	y = 0;
        }
               
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

        if(x >=  screenSize.height) {
            x = Integer.parseInt(defaultX);
        }
        if(y >=  screenSize.height) {
            y = Integer.parseInt(defaultY);
        }        
        
        return new java.awt.Point(x, y);
    }
    
    public static boolean getUseNewIcons()
    {
        String what = p.getProperty("jftp.gui.look.newIcons", "true");
        
        if(what.trim().equals("false"))
        {
            return false;
        }
        else
        {
            return true;
        }
    }
    
    public static boolean getStorePasswords()
    {
        String what = p.getProperty("jftp.security.storePasswords",
                                    storePasswords);

        if(what.trim().equals("false"))
        {
            return false;
        }
        else
        {
            return true;
        }
    }
    
    public static boolean getDisableLog()
    {
        String what = p.getProperty("jftp.disableLog", "false");

        if(what.trim().equals("false"))
        {
            return false;
        }
        else
        {
            return true;
        }
    }
    
    public static boolean getEnableDebug()
    {
        String what = p.getProperty("jftp.enableDebug", defaultEnableDebug);

        if(what.trim().equals("false"))
        {
            return false;
        }
        else
        {
            return true;
        }
    }
    
    public static boolean getEnableSftpMultiThreading()
    {
        String what = p.getProperty("jftp.enableSftpMultiThreading",
                                    enableSftpMultiThreading);

        if(what.trim().equals("false"))
        {
            return false;
        }
        else
        {
            return true;
        }
    }
    
    public static boolean getEnableSmbMultiThreading()
    {
        String what = p.getProperty("jftp.enableSmbMultiThreading",
                                    enableSmbMultiThreading);

        if(what.trim().equals("false"))
        {
            return false;
        }
        else
        {
            return true;
        }
    }
    
    public static boolean getFtpPasvMode()
    {
        String what = p.getProperty("jftp.ftpPasvMode", defaultFtpPasvMode);

        if(what.trim().equals("false"))
        {
            return false;
        }
        else
        {
            return true;
        }
    }
    
    public static boolean getEnableMultiThreading()
    {
        String what = p.getProperty("jftp.enableMultiThreading",
                                    enableMultiThreading);

        if(what.trim().equals("false"))
        {
            return false;
        }
        else
        {
            return true;
        }
    }
    
    public static boolean getNoUploadMultiThreading()
    {
        String what = p.getProperty("jftp.noUploadMultiThreading",
                                    noUploadMultiThreading);

        if(what.trim().equals("false"))
        {
            return false;
        }
        else
        {
            return true;
        }
    }
    
    static
    {
        try
        {
            p.load(new FileInputStream(propertyFilename));
        }
        catch(Exception e)
        {
            System.out.println("no property file loaded, using defaults... (" +
                               e + ")");
        }
        
        if(!getUseNewIcons()) {
        	iconImage = "images/org/javalobby/icons/20x20/ComputerIn.gif";
        	nextRSSImage = "images/org/javalobby/icons/16x16/Forward.gif";
        }
        else {  
        	iconImage = "images/current/server_add.png";
        	nextRSSImage = "images/current/rss_go.png";
        }

    }
    
//None of this is ever used.
//    public static boolean sortDir = true;
//    public static int scrollSpeed = 9;
//    public static int numFiles = 9;
//    public static final int testTimeout = 5000;
//
//    public static boolean getEnableResuming()
//    {
//        String what = p.getProperty("jftp.enableResuming", "true");
//
//        if(what.trim().equals("false"))
//        {
//            return false;
//        }
//        else
//        {
//            return true;
//        }
//    }
    
}
