package pt.automatictext;
import java.awt.*;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;

import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import org.jnativehook.GlobalScreen;
import org.jnativehook.keyboard.NativeKeyEvent;
import org.jnativehook.keyboard.NativeKeyListener;

import pt.automatictext.registration.License;
import pt.automatictext.registration.RegistrationState;

/**
 * @author Rafael Campos
 *
 */
public class Launcher implements NativeKeyListener{
	 	
	public final static String 	DEVELOPERS_MAIL = "mashashi.nakamura@gmail.com";
	public final static String 	APP_NAME 		= "AutomaticText";
	public final static String 	APP_VERSION 	= "1.5";
	public final static int		APP_YEAR 		= 2011;
	
	public final static String APP_NAME_VERSION = Launcher.APP_NAME+" v."+Launcher.APP_VERSION;
	
	
	
	
	
	private RegistrationState registrationState;
	
	private static boolean ctrlPressed 	= false;
	private static boolean vPressed 	= false;
	private static boolean cPressed 	= false;
	
	private static Message command;
	
	private enum Message{REFRESH, DO_NOTHING};
	
	//Unregister settings
	private final static String		UNREGISTERED_DELAY_BETWEEN_CHARS  	= "100";
	private final static String 	UNREGISTERED_CLEAR_CLIPBOARD 		= "true";
	private final static String 	UNREGISTERED_SHOW_ABOUT 	 		= "true";
	private final static String 	UNREGISTERED_START_SOUND 	 		= "false";
	
	@SuppressWarnings("unused")
	private final static byte		UNREGISTERED_WAIT_TIME_PLEASE_REGISTER_IN_SECONDS	= 5;
	
	public Launcher(){
		
		License licensing = new License();
    	registrationState = licensing.checkLicense(licensing.readLicense());
    	
		command = Message.DO_NOTHING;
	}
	
	public RegistrationState getRegistrationState() {
		return registrationState;
	}
	
    public static void main(String[] args) throws  InterruptedException {
//    	0 false false true false 100
    	try{
    		
    	
	    	final Launcher launcher = new Launcher();
	    	
	    	try {
//	    		Set L&F from the plataform it self
	    		UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		    } catch (UnsupportedLookAndFeelException|ClassNotFoundException|InstantiationException|IllegalAccessException e) {}
	    	
	    	JDialog.setDefaultLookAndFeelDecorated(true);
	    	
	    	final Utilities utils = new Utilities();
	    	
	    	JDialog dialog = null;
	    	
	    	try{
	    		
	    		boolean registered =  true;//launcher.getRegistrationState().equals(RegistrationState.REGISTERED);
	    		
	    		/*
		    		sleepInSeconds
					clearClipboard
					showAbout
					startSound
					stopSound
					delay
	    		 */
	    		args = new String[]{
	    				"0", 
	    				"false", 
	    				"false", 
	    				"true", 
	    				"true", 
	    				"100"
	    		};
	    		
	    		args = new String[] {args[0], registered?args[1]:UNREGISTERED_CLEAR_CLIPBOARD,
	    				registered?args[2]:UNREGISTERED_SHOW_ABOUT, registered?args[3]:UNREGISTERED_START_SOUND, registered?args[4]:args[1],
	    						registered?args[5]:UNREGISTERED_DELAY_BETWEEN_CHARS};
	    		
	    		ExceptionProgramArguments.checkArguments(args);
	    		
	    		
	    		
	    		int sleepInSeconds 		= Integer.parseInt(args[0]);
	    		boolean clearClipboard 	= Boolean.parseBoolean(args[1]);
	    		boolean showAbout		= Boolean.parseBoolean(args[2]);
	    		boolean startSound		= Boolean.parseBoolean(args[3]);
	    		boolean stopSound		= Boolean.parseBoolean(args[4]);
	    		int delay 				= Integer.parseInt(args[5]);
	    		
//	    		final Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
//		    	Transferable clipData = clipboard.getContents(clipboard);
//		    	if(clipData.isDataFlavorSupported(DataFlavor.stringFlavor)){}
	    		
			    CommandExecutor.initialize();	
			    
			    if(showAbout){
	    			JOptionPane.showMessageDialog(null, APP_NAME_VERSION+", program written by Rafael Campos and reviewed by Marta Aparício @"+APP_YEAR+"\nFor further details contact "+DEVELOPERS_MAIL+"\n\nWhat you should really know\n   1.You can view all the necessary parameters by not providing any argument\n   2.This program only supports  portuguese from  portugal keys,  except for the following  characters between  quotations \"«»ºª\"\n\nHave fun!", "About",JOptionPane.INFORMATION_MESSAGE,new Utilities().createImageIcon("images/at.png", ""));
	    		}
			    
			    dialog = utils.showProcessWindow(launcher);
			    try {
			    	
			    	GlobalScreen.getInstance().addNativeKeyListener(launcher);
			    	
		    		String write = utils.getTextFromClipboard();
		    		utils.pasteOnClipboard("");
		    		
		    		synchronized(launcher){
			    		while((!ctrlPressed || !vPressed) && CommandExecutor.getStateWriting().equals(CommandExecutor.StatusCommandExecutor.INITIALIZED)){
			    			launcher.wait();
			    			if(command.equals(Message.REFRESH)){
			    				int maxTrys = 5;
			    				do{
			    					try{
				    					Thread.sleep((long) (Math.random()*50));
					    				write = utils.getTextFromClipboard();
					    				if(!write.isEmpty()){ 
					    					utils.pasteOnClipboard(""); 
					    				}
					    				command = Message.DO_NOTHING;
			    					}catch(IllegalStateException e){}
			    				}while(--maxTrys!=0 && write.isEmpty());
			    			}		
			    		}
		    		}
		    		
			    	GlobalScreen.getInstance().removeNativeKeyListener(launcher);
			    	
				    Thread.sleep((long)((0.5+sleepInSeconds)*1000));
				    
			    	if(startSound && CommandExecutor.getStateWriting().equals(CommandExecutor.StatusCommandExecutor.INITIALIZED)){
			    		Toolkit.getDefaultToolkit().beep();
			    	}
			    	
			    	Robot robot = new Robot();
			    	robot.setAutoDelay(10+delay);
			    	
			    	CommandExecutor.writeText(new String(write), robot, registered);
			    	
			    	if(!clearClipboard){
						utils.pasteOnClipboard(write);
					}
					if(stopSound && CommandExecutor.getStateWriting().equals(CommandExecutor.StatusCommandExecutor.INITIALIZED)){
						Toolkit.getDefaultToolkit().beep();
					}
				}catch(ExceptionInInitializerError e){
					utils.showPane("The program is already running. The program will exit.", "Already running", JOptionPane.WARNING_MESSAGE, false);
				}catch(UnsupportedFlavorException e){
					utils.showPane("The data in the clipboard is not a string. The program will exit.", "Not a string", JOptionPane.WARNING_MESSAGE, false);
				}catch(IOException|AWTException e){
					utils.showDebugPane("An odd exception as occured please copy the error trace into yout clipboard and send it to the developer email. The program will exit.", "Error", utils.getStackTrace(e), JOptionPane.ERROR_MESSAGE);
				}catch(Exception e){
					utils.showDebugPane("An unexpected exception as occured please copy the error trace into yout clipboard and send it to the developer email. The program will exit.", "Error", utils.getStackTrace(e), JOptionPane.ERROR_MESSAGE);
				}
			    
	    	}catch(ExceptionProgramArguments e){
	    		utils.showPane(e.getMessage(), "Arguments not complient", JOptionPane.INFORMATION_MESSAGE, false);
	    	}
	    	
	    	if(dialog!=null){
	    		Toolkit toolkit = Toolkit.getDefaultToolkit();
				int height = 0;
				while(height!=dialog.getHeight()){
					height++;
					dialog.setLocation(dialog.getLocation().x, toolkit.getScreenSize().height-(dialog.getHeight()-height));
					try {
						Thread.sleep(1);
					} catch (InterruptedException e) {}
				}
	    	}
	    	
			System.exit(0);
		
    	}catch(Exception e){
    		System.out.println("Some bad ass exception as occoured. Details bellow.\n");
    		e.printStackTrace();
    	}
    }
    
    
    
    
    
	@Override
	public synchronized void keyPressed(NativeKeyEvent arg) {
		
		switch(arg.getKeyCode()){
			case NativeKeyEvent.VK_CONTROL: ctrlPressed=true; break;
			case NativeKeyEvent.VK_V: vPressed=true; break;
			case NativeKeyEvent.VK_C: cPressed=true; break;
		}
		
		if(ctrlPressed && cPressed && !vPressed){
			command = Message.REFRESH;
			this.notify();	
		}else if(ctrlPressed && vPressed && !cPressed){
			this.notify();
		}
		
	}
	
	@Override
	public synchronized void keyReleased(NativeKeyEvent arg) {
		
		switch(arg.getKeyCode()){
			case NativeKeyEvent.VK_CONTROL: ctrlPressed=false;	break;
			case NativeKeyEvent.VK_V: 		vPressed=false;		break;
			case NativeKeyEvent.VK_C: 		cPressed=false;		break;
		}
		
	}
	    
}