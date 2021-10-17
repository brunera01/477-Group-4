package net.sf.jftp.Presentation;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

import net.sf.jftp.GeneralSettings;

public class GUISettings extends GeneralSettings{
	public static boolean nfsAllowed = true;
	public static boolean sftpAllowed = true;
	public static boolean smbAllowed = true;
	public static boolean webDavAllowed = true;
	
	
	
    public static int smallSizeUp = 0; //50000;
    public static int smallSize = 0; //100000;
    public static boolean useLogFlusher = false; // obsolete
    public static int logFlushInterval = 2000; // obsolete
    public static boolean reconnect = true;
    
    // 1: manual, 2: onclick, 0: off
    public static int runtimeCommands = 2;
    public static boolean askToRun = false;
	
	public static boolean showNewlineOption = false;
	public static boolean askToResume = true;
	
	public static final String changelog = "docs/CHANGELOG";
	public static final String todo = "docs/TODO";
	
	// overridden title for insomniac client
    public static final String insomniacTitle = ">>> Insomniac client BETA 1 <<< Based on JFtp ";

    // override ui with the insomniac client configuration
    public static boolean isInsomniacClient = false;
    public static int refreshDelay = 250;
    public static boolean useDefaultDir = true;
    
    // currently changed by remotedir on-the-fly
    public static boolean showDateNoSize = false;
    public static boolean showLocalDateNoSize = false;
    
    public static final int visibleFileRows = 15;
    public static final String greeting = "Have a lot of fun...";
    public static boolean enableWebDav = false;
    public static boolean showFileSize = true;
    public static boolean useFixedTableWidths = true;
    
    
    public static final String nfsinfo = "docs/doc/nfsinfo";
    
    public static String hiddenPassword = "<%hidden%>";
	
	public static String iconImage;
    public static String hostImage;   
    public static String closeImage;
    public static String infoImage;  
    public static String listImage;  
 
    public static String rmdirImage;  
    public static String mkdirImage;   
    public static String refreshImage;
    public static String refreshImage2; 
    public static String cdImage; 
    public static String cmdImage;   
    public static String downloadImage;
    public static String queueImage;
    public static String uploadImage;
    public static String fileImage;
    public static String dirImage; 
    public static String codeFileImage;
    public static String textFileImage;
    public static String execFileImage;
    public static String audioFileImage;
    public static String videoFileImage;
    public static String htmlFileImage;
    public static String zipFileImage;
    public static String imageFileImage;
    public static String presentationFileImage;
    public static String spreadsheetFileImage;
    public static String bookFileImage;  
    public static String copyImage;   
    public static String openImage;
    public static String sftpImage;
    public static String nfsImage;
    public static String webdavImage;  
    public static String linkImage;
    public static String typeImage;
    public static String deleteImage; 
    public static String deleteImage2; 
    public static String clearImage; 
    public static String clearImage2; 
    public static String resumeImage;
    public static String resumeImage2;
    public static String pauseImage;
    public static String pauseImage2;
    public static String saveImage;
    public static String cdUpImage;
    public static String helpImage;
	
    

    public static String sshHostKeyVerificationFile = System.getProperty("user.home") +
                                                      File.separator + ".jftp" +
                                                      File.separator +
                                                      ".ssh_hostfile";
    
    public static boolean getEnableStatusAnimation()
    {
        String what = p.getProperty("jftp.gui.enableStatusAnimation", "false");

        if(what.trim().equals("false"))
        {
            return false;
        }
        else
        {
            return true;
        }
    }
    
    public static boolean getAskToDelete()
    {
        String what = p.getProperty("jftp.gui.askToDelete", "true");

        if(what.trim().equals("false"))
        {
            return false;
        }
        else
        {
            return true;
        }
    }
    
    
    public static boolean getUseBackground()
    {
        String what = p.getProperty("jftp.useBackground", "true");

        if(what.trim().equals("false"))
        {
            return false;
        }
        else
        {
            return true;
        }
    }
    
    
    public static boolean getEnableSshKeys()
    {
        String what = p.getProperty("jftp.useSshKeyVerification", "false");

        if(what.trim().equals("false"))
        {
            return false;
        }
        else
        {
            return true;
        }
    }
    
    
    public static boolean getHideLocalDotNames() {
        String what = p.getProperty("jftp.hideHiddenDotNames", "false");

        if(what.trim().equals("false"))
        {
            return false;
        }
        else
        {
            return true;
        }
    }
    
    public static boolean getUseDefaultDir()
    {
        String what = p.getProperty("jftp.useDefaultDir", "true");

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
        	hostImage = "images/org/javalobby/icons/20x20/ComputerIn.gif";
        	closeImage = "images/org/javalobby/icons/20x20/Error.gif";
        	infoImage = "images/org/javalobby/icons/20x20/Inform.gif";
        	listImage = "images/org/javalobby/icons/20x20/List.gif";
        	deleteImage = "images/org/javalobby/icons/16x16/DeleteDocument.gif";
        	deleteImage2 = "images/org/javalobby/icons/16x16/DeleteDocument.gif";
        	rmdirImage = "images/org/javalobby/icons/16x16/DeleteFolder.gif";
        	mkdirImage = "images/org/javalobby/icons/16x16/NewFolder.gif";
        	refreshImage = "images/org/javalobby/icons/16x16/Undo.gif";
        	refreshImage2 = "images/org/javalobby/icons/16x16/Undo.gif";
        	cdImage = "images/org/javalobby/icons/16x16/Open.gif";
        	cmdImage = "images/org/javalobby/icons/16x16/ExecuteProject.gif";
        	downloadImage = "images/org/javalobby/icons/16x16/Left.gif";
        	uploadImage = "images/org/javalobby/icons/16x16/Right.gif";
        	queueImage = "images/org/javalobby/icons/16x16/Left.gif";
        	fileImage = "images/org/javalobby/icons/16x16/Document.gif";
        	dirImage = "images/org/javalobby/icons/16x16/Folder.gif";
        	codeFileImage = "images/org/javalobby/icons/16x16/List.gif";
        	textFileImage = "images/org/javalobby/icons/16x16/DocumentDraw.gif";
        	execFileImage = "images/org/javalobby/icons/16x16/ExecuteProject.gif";
        	audioFileImage = "images/org/javalobby/icons/16x16/cd.gif";
        	videoFileImage = "images/org/javalobby/icons/16x16/CameraFlash.gif";
        	htmlFileImage = "images/org/javalobby/icons/16x16/World2.gif";
        	zipFileImage = "images/org/javalobby/icons/16x16/DataStore.gif";
        	imageFileImage = "images/org/javalobby/icons/16x16/Camera.gif";
        	presentationFileImage = "images/org/javalobby/icons/16x16/DocumentDiagram.gif";
        	spreadsheetFileImage = "images/org/javalobby/icons/16x16/DatePicker.gif";
        	bookFileImage = "images/org/javalobby/icons/16x16/Book.gif";
        	copyImage = "images/org/javalobby/icons/16x16/Copy.gif";
        	openImage = "images/org/javalobby/icons/16x16/World2.gif";
        	sftpImage = "images/org/javalobby/icons/16x16/NewEnvelope.gif";
        	nfsImage = "images/org/javalobby/icons/16x16/TrafficGreen.gif";
        	webdavImage = "images/org/javalobby/icons/16x16/DataStore.gif";
        	linkImage = "images/org/javalobby/icons/16x16/Right.gif";
        	typeImage = "images/org/javalobby/icons/20x20/Type.gif";
        	clearImage = "images/org/javalobby/icons/16x16/Undo.gif";
        	resumeImage = "images/org/javalobby/icons/16x16/GreenCircle.gif";
        	pauseImage = "images/org/javalobby/icons/16x16/RedCircle.gif";
        	clearImage2 = "images/org/javalobby/icons/16x16/Undo.gif";
        	resumeImage2 = "images/org/javalobby/icons/16x16/GreenCircle.gif";
        	pauseImage2 = "images/org/javalobby/icons/16x16/RedCircle.gif";
        	saveImage = "images/org/javalobby/icons/16x16/Save.gif";
        	cdUpImage = "images/org/javalobby/icons/16x16/Exit.gif";
        	nextRSSImage = "images/org/javalobby/icons/16x16/Forward.gif";
        	helpImage = "images/current/help.png";
        }
        else {  
        	iconImage = "images/current/server_add.png";
        	hostImage = "images/current/server_add.png";   
        	closeImage = "images/current/cancel.png";
        	infoImage = "images/current/information.png";  
        	listImage = "images/current/page_white_text.png";  

        	rmdirImage = "images/current/folder_delete.png";  
        	mkdirImage = "images/current/folder_add.png";   
        	refreshImage = "images/current/control_repeat.png";
        	refreshImage2 = "images/current/control_repeat_blue.png"; 
        	cdImage = "images/current/folder_explore.png"; 
        	cmdImage = "images/current/application_xp_terminal.png";   
        	downloadImage = "images/graphicsfuel/arrow-left.png";
        	uploadImage = "images/graphicsfuel/arrow-right.png";
        	queueImage = "images/current/arrow_left.png";       	
        	fileImage = "images/current/page_white.png";
        	dirImage = "images/current/folder.png"; 
        	codeFileImage = "images/current/page_white_wrench.png";
        	textFileImage = "images/current/page_white_text.png";
        	execFileImage = "images/current/cog.png";
        	audioFileImage = "images/current/ipod.png";
        	videoFileImage = "images/current/camera.png";
        	htmlFileImage = "images/current/html.png";
        	zipFileImage = "images/current/page_white_zip.png";
        	imageFileImage = "images/current/image.png";
        	presentationFileImage = "images/current/page_white_powerpoint.png";
        	spreadsheetFileImage = "images/current/page_excel.png";
        	bookFileImage = "images/current/book.png";  
        	copyImage = "images/current/disk_multiple.png";   
        	openImage = "images/current/drive_web.png";
        	sftpImage = "images/current/drive_link.png";
        	nfsImage = "images/current/drive_network.png";
        	webdavImage = "images/current/house_go.png";  
        	linkImage = "images/current/arrow_right.png";
        	typeImage = "images/current/email_go.png";
        	deleteImage = "images/current/control_stop.png"; 
        	deleteImage2 = "images/current/control_stop_blue.png"; 
        	clearImage = "images/current/control_eject.png"; 
        	clearImage2 = "images/current/control_eject_blue.png"; 
        	resumeImage = "images/current/control_play.png";
        	resumeImage2 = "images/current/control_play_blue.png";
        	pauseImage = "images/current/control_pause.png";
        	pauseImage2 = "images/current/control_pause_blue.png";
        	saveImage = "images/current/disk.png";
        	cdUpImage = "images/current/arrow_up.png";
        	nextRSSImage = "images/current/rss_go.png";
        	helpImage = "images/current/help.png";
        }

    }
    
}
