package pt.automatictext;

import java.awt.Image;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JRootPane;

/**
 * @author Rafael Campos
 *
 */
public class Utilities {
	
	public final Clipboard clipboard;
	
	public Utilities() {
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
	}
	
	public ImageIcon createImageIcon(String path, String description) {
		URL imgURL = getClass().getResource(path);
		if (imgURL != null) {
			return new ImageIcon(imgURL, description);
		}
		return null;
	}
	public Image getImage(ImageIcon imageIcon) {
		if(imageIcon==null)
			return null;
		return imageIcon.getImage();
	}
	public void showPane(String message, String title, int message_type, boolean always_on_top) {
	   JOptionPane pane = new JOptionPane(message, message_type);
	   JDialog dialog = pane.createDialog(title);
	   dialog.add(pane);
	   Utilities utilities = new Utilities();
	   dialog.setIconImage(utilities.getImage(utilities.createImageIcon("images/at.png", "")));
	   dialog.setAlwaysOnTop(always_on_top);
	   dialog.setVisible(true);
	}
	public void showDebugPane(String message, String title, String debug_info, int message_type){
		System.out.println(debug_info);
		if(JOptionPane.showConfirmDialog(null, message, title, JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION){
			pasteOnClipboard(debug_info);
		}
	}
	public void pasteOnClipboard(String text){
		clipboard.setContents(new StringSelection(text), null);
	}
	public String getTextFromClipboard() throws UnsupportedFlavorException, IOException{
		Transferable clipData = clipboard.getContents(clipboard);
		return ((String)clipData.getTransferData(DataFlavor.stringFlavor));
	}
	public String getStackTrace(Exception e){
		StringBuilder strBuilder = new StringBuilder("Exception from "+Launcher.APP_NAME_VERSION+"\n\n"+e.toString()+"\n");
		for(StackTraceElement stackTraceElement :e.getStackTrace()){
			strBuilder.append("\t"+stackTraceElement.toString());
		}
		return strBuilder.toString();
	}
	public JDialog showProcessWindow(final Launcher launcher){
		JOptionPane pane = new JOptionPane(Launcher.APP_NAME+" is running. To close the program press ok.", JOptionPane.INFORMATION_MESSAGE, JOptionPane.DEFAULT_OPTION, null, new String[]{});
		
		final Toolkit toolkit = Toolkit.getDefaultToolkit();
		
		@SuppressWarnings("serial")
		class UndecoratedDialog extends JDialog{
			public UndecoratedDialog(String title) {
				super(((JDialog)null), title, true);
				setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
				setUndecorated(true);
				getRootPane().setWindowDecorationStyle(JRootPane.PLAIN_DIALOG);
			}
		}
		
		final JDialog dialog = new UndecoratedDialog("Running...");
		
		JButton close = new  JButton("Ok");
		close.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				CommandExecutor.stopWriting();
				synchronized(launcher){
					launcher.notify();	
				}
			}
		});
		pane.add(close);
		
		dialog.add(pane);
		dialog.pack();
		
		Utilities utilities = new Utilities();
		dialog.setIconImage(utilities.getImage(utilities.createImageIcon("images/at.png", "")));
		dialog.setAlwaysOnTop(true);
		
		dialog.setLocation( toolkit.getScreenSize().width-dialog.getWidth(),toolkit.getScreenSize().height);
		
		new Thread(new Runnable(){
			@Override
			public void run() {
				int height = dialog.getHeight();
				while(height!=0){
					height--;
					dialog.setLocation(dialog.getLocation().x, toolkit.getScreenSize().height-(dialog.getHeight()-height));
					
					try {
						Thread.sleep(1);
					} catch (InterruptedException e) {}
				}
				
			}
		}).start();
		
		new Thread(new Runnable(){
			@Override
			public void run() {
				dialog.setVisible(true);
			}
		}).start();
		
		return dialog;
		
	} 
}
