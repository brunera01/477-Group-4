package net.sf.jftp.Presentation.gui.base;

import net.sf.jftp.JFtp;
import net.sf.jftp.Presentation.GUISettings;



public class LogFlusher implements Runnable
{
    private Thread runner;

    public LogFlusher()
    {
        runner = new Thread(this);

        if(GUISettings.useLogFlusher)
        {
            runner.start();
        }
    }

    public void run()
    {
        while(true)
        {
            try
            {
                runner.sleep(GUISettings.logFlushInterval);
            }
            catch(InterruptedException ex)
            {
                ex.printStackTrace();
            }

            //System.out.println("logflush");
            JFtp.statusP.jftp.ensureLogging();
        }
    }
}
