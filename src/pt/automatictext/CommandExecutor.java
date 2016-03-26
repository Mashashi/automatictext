package pt.automatictext;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.HashMap;

import javax.swing.JOptionPane;


/**
 * @author Rafael Campos
 *
 */
public class CommandExecutor {
	
	private static HashMap<Character, Command> commandMap;
	
	private static StatusCommandExecutor status = StatusCommandExecutor.UNINITIALIZED;
	
	public enum StatusCommandExecutor{UNINITIALIZED,INITIALIZED,FINISHED}
	
	//Unregistered configuration
	private final static byte		UNREGISTERED_MAX_WRITTEN_CHARS 			= 15;
	
	public static void initialize(){
		commandMap = new HashMap<>();
		status = StatusCommandExecutor.INITIALIZED;
		commandMap.put('a', new Command(){
			@Override
			public void executeCommand(Robot robot) {
				robot.keyPress(KeyEvent.VK_A);
				robot.keyRelease(KeyEvent.VK_A);
			}
		});
		commandMap.put('b', new Command(){
			@Override
			public void executeCommand(Robot robot) {
				robot.keyPress(KeyEvent.VK_B);
				robot.keyRelease(KeyEvent.VK_B);
			}
		});
		commandMap.put('c', new Command(){
			@Override
			public void executeCommand(Robot robot) {
				robot.keyPress(KeyEvent.VK_C);
				robot.keyRelease(KeyEvent.VK_C);
			}
		});
		commandMap.put('d', new Command(){
			@Override
			public void executeCommand(Robot robot) {
				robot.keyPress(KeyEvent.VK_D);
				robot.keyRelease(KeyEvent.VK_D);
			}
		});
		commandMap.put('e', new Command(){
			@Override
			public void executeCommand(Robot robot) {
				robot.keyPress(KeyEvent.VK_E);
				robot.keyRelease(KeyEvent.VK_E);
			}
		});
		commandMap.put('f', new Command(){
			@Override
			public void executeCommand(Robot robot) {
				robot.keyPress(KeyEvent.VK_F);
				robot.keyRelease(KeyEvent.VK_F);
			}
		});
		commandMap.put('g', new Command(){
			@Override
			public void executeCommand(Robot robot) {
				robot.keyPress(KeyEvent.VK_G);
				robot.keyRelease(KeyEvent.VK_G);
			}
		});
		commandMap.put('h', new Command(){
			@Override
			public void executeCommand(Robot robot) {
				robot.keyPress(KeyEvent.VK_H);
				robot.keyRelease(KeyEvent.VK_H);
			}
		});
		commandMap.put('i', new Command(){
			@Override
			public void executeCommand(Robot robot) {
				robot.keyPress(KeyEvent.VK_I);
				robot.keyRelease(KeyEvent.VK_I);
			}
		});
		commandMap.put('j', new Command(){
			@Override
			public void executeCommand(Robot robot) {
				robot.keyPress(KeyEvent.VK_J);
				robot.keyRelease(KeyEvent.VK_J);
			}
		});
		commandMap.put('k', new Command(){
			@Override
			public void executeCommand(Robot robot) {
				robot.keyPress(KeyEvent.VK_K);
				robot.keyRelease(KeyEvent.VK_K);
			}
		});
		commandMap.put('l', new Command(){
			@Override
			public void executeCommand(Robot robot) {
				robot.keyPress(KeyEvent.VK_L);
				robot.keyRelease(KeyEvent.VK_L);
			}
		});
		commandMap.put('m', new Command(){
			@Override
			public void executeCommand(Robot robot) {
				robot.keyPress(KeyEvent.VK_M);
				robot.keyRelease(KeyEvent.VK_M);
			}
		});
		commandMap.put('n', new Command(){
			@Override
			public void executeCommand(Robot robot) {
				robot.keyPress(KeyEvent.VK_N);
				robot.keyRelease(KeyEvent.VK_N);
			}
		});
		commandMap.put('o', new Command(){
			@Override
			public void executeCommand(Robot robot) {
				robot.keyPress(KeyEvent.VK_O);
				robot.keyRelease(KeyEvent.VK_O);
			}
		});
		commandMap.put('p', new Command(){
			@Override
			public void executeCommand(Robot robot) {
				robot.keyPress(KeyEvent.VK_P);
				robot.keyRelease(KeyEvent.VK_P);
			}
		});
		commandMap.put('q', new Command(){
			@Override
			public void executeCommand(Robot robot) {
				robot.keyPress(KeyEvent.VK_Q);
				robot.keyRelease(KeyEvent.VK_Q);
			}
		});
		commandMap.put('r', new Command(){
			@Override
			public void executeCommand(Robot robot) {
				robot.keyPress(KeyEvent.VK_R);
				robot.keyRelease(KeyEvent.VK_R);
			}
		});
		commandMap.put('s', new Command(){
			@Override
			public void executeCommand(Robot robot) {
				robot.keyPress(KeyEvent.VK_S);
				robot.keyRelease(KeyEvent.VK_S);
			}
		});
		commandMap.put('t', new Command(){
			@Override
			public void executeCommand(Robot robot) {
				robot.keyPress(KeyEvent.VK_T);
				robot.keyRelease(KeyEvent.VK_T);
			}
		});
		commandMap.put('u', new Command(){
			@Override
			public void executeCommand(Robot robot) {
				robot.keyPress(KeyEvent.VK_U);
				robot.keyRelease(KeyEvent.VK_U);
			}
		});
		commandMap.put('v', new Command(){
			@Override
			public void executeCommand(Robot robot) {
				robot.keyPress(KeyEvent.VK_V);
				robot.keyRelease(KeyEvent.VK_V);
			}
		});
		commandMap.put('x', new Command(){
			@Override
			public void executeCommand(Robot robot) {
				robot.keyPress(KeyEvent.VK_X);
				robot.keyRelease(KeyEvent.VK_X);
			}
		});
		commandMap.put('y', new Command(){
			@Override
			public void executeCommand(Robot robot) {
				robot.keyPress(KeyEvent.VK_Y);
				robot.keyRelease(KeyEvent.VK_Y);
			}
		});
		commandMap.put('w', new Command(){
			@Override
			public void executeCommand(Robot robot) {
				robot.keyPress(KeyEvent.VK_W);
				robot.keyRelease(KeyEvent.VK_W);
			}
		});
		commandMap.put('z', new Command(){
			@Override
			public void executeCommand(Robot robot) {
				robot.keyPress(KeyEvent.VK_Z);
				robot.keyRelease(KeyEvent.VK_Z);
			}
		});
//		commandMap.put('ç', new Command(){
//			@Override
//			public void executeCommand(Robot robot) {
//		        robot.keyPress(KeyEvent.VK_SEMICOLON);  
//		        robot.keyRelease(KeyEvent.VK_SEMICOLON);  
//			}
//		});
		
		commandMap.put('A', new Command(){
			@Override
			public void executeCommand(Robot robot) {
				robot.keyPress(KeyEvent.VK_SHIFT);
				robot.keyPress(KeyEvent.VK_A);
				robot.keyRelease(KeyEvent.VK_SHIFT);
			}
		});
		commandMap.put('B', new Command(){
			@Override
			public void executeCommand(Robot robot) {
				robot.keyPress(KeyEvent.VK_SHIFT);
				robot.keyPress(KeyEvent.VK_B);
				robot.keyRelease(KeyEvent.VK_SHIFT);
			}
		});
		commandMap.put('C', new Command(){
			@Override
			public void executeCommand(Robot robot) {
				robot.keyPress(KeyEvent.VK_SHIFT);
				robot.keyPress(KeyEvent.VK_C);
				robot.keyRelease(KeyEvent.VK_SHIFT);
			}
		});
		commandMap.put('D', new Command(){
			@Override
			public void executeCommand(Robot robot) {
				robot.keyPress(KeyEvent.VK_SHIFT);
				robot.keyPress(KeyEvent.VK_D);
				robot.keyRelease(KeyEvent.VK_SHIFT);
			}
		});
		commandMap.put('E', new Command(){
			@Override
			public void executeCommand(Robot robot) {
				robot.keyPress(KeyEvent.VK_SHIFT);
				robot.keyPress(KeyEvent.VK_E);
				robot.keyRelease(KeyEvent.VK_SHIFT);
			}
		});
		commandMap.put('F', new Command(){
			@Override
			public void executeCommand(Robot robot) {
				robot.keyPress(KeyEvent.VK_SHIFT);
				robot.keyPress(KeyEvent.VK_F);
				robot.keyRelease(KeyEvent.VK_SHIFT);
			}
		});
		commandMap.put('G', new Command(){
			@Override
			public void executeCommand(Robot robot) {
				robot.keyPress(KeyEvent.VK_SHIFT);
				robot.keyPress(KeyEvent.VK_G);
				robot.keyRelease(KeyEvent.VK_SHIFT);
			}
		});
		commandMap.put('H', new Command(){
			@Override
			public void executeCommand(Robot robot) {
				robot.keyPress(KeyEvent.VK_SHIFT);
				robot.keyPress(KeyEvent.VK_H);
				robot.keyRelease(KeyEvent.VK_SHIFT);
			}
		});
		commandMap.put('I', new Command(){
			@Override
			public void executeCommand(Robot robot) {
				robot.keyPress(KeyEvent.VK_SHIFT);
				robot.keyPress(KeyEvent.VK_I);
				robot.keyRelease(KeyEvent.VK_SHIFT);
			}
		});
		commandMap.put('J', new Command(){
			@Override
			public void executeCommand(Robot robot) {
				robot.keyPress(KeyEvent.VK_SHIFT);
				robot.keyPress(KeyEvent.VK_J);
				robot.keyRelease(KeyEvent.VK_SHIFT);
			}
		});
		commandMap.put('K', new Command(){
			@Override
			public void executeCommand(Robot robot) {
				robot.keyPress(KeyEvent.VK_SHIFT);
				robot.keyPress(KeyEvent.VK_K);
				robot.keyRelease(KeyEvent.VK_SHIFT);
			}
		});
		commandMap.put('L', new Command(){
			@Override
			public void executeCommand(Robot robot) {
				robot.keyPress(KeyEvent.VK_SHIFT);
				robot.keyPress(KeyEvent.VK_L);
				robot.keyRelease(KeyEvent.VK_SHIFT);
			}
		});
		commandMap.put('M', new Command(){
			@Override
			public void executeCommand(Robot robot) {
				robot.keyPress(KeyEvent.VK_SHIFT);
				robot.keyPress(KeyEvent.VK_M);
				robot.keyRelease(KeyEvent.VK_SHIFT);
			}
		});
		commandMap.put('N', new Command(){
			@Override
			public void executeCommand(Robot robot) {
				robot.keyPress(KeyEvent.VK_SHIFT);
				robot.keyPress(KeyEvent.VK_N);
				robot.keyRelease(KeyEvent.VK_SHIFT);
			}
		});
		commandMap.put('O', new Command(){
			@Override
			public void executeCommand(Robot robot) {
				robot.keyPress(KeyEvent.VK_SHIFT);
				robot.keyPress(KeyEvent.VK_O);
				robot.keyRelease(KeyEvent.VK_SHIFT);
			}
		});
		commandMap.put('P', new Command(){
			@Override
			public void executeCommand(Robot robot) {
				robot.keyPress(KeyEvent.VK_SHIFT);
				robot.keyPress(KeyEvent.VK_P);
				robot.keyRelease(KeyEvent.VK_SHIFT);
			}
		});
		commandMap.put('Q', new Command(){
			@Override
			public void executeCommand(Robot robot) {
				robot.keyPress(KeyEvent.VK_SHIFT);
				robot.keyPress(KeyEvent.VK_Q);
				robot.keyRelease(KeyEvent.VK_SHIFT);
			}
		});
		commandMap.put('R', new Command(){
			@Override
			public void executeCommand(Robot robot) {
				robot.keyPress(KeyEvent.VK_SHIFT);
				robot.keyPress(KeyEvent.VK_R);
				robot.keyRelease(KeyEvent.VK_SHIFT);
			}
		});
		commandMap.put('S', new Command(){
			@Override
			public void executeCommand(Robot robot) {
				robot.keyPress(KeyEvent.VK_SHIFT);
				robot.keyPress(KeyEvent.VK_S);
				robot.keyRelease(KeyEvent.VK_SHIFT);
			}
		});
		commandMap.put('T', new Command(){
			@Override
			public void executeCommand(Robot robot) {
				robot.keyPress(KeyEvent.VK_SHIFT);
				robot.keyPress(KeyEvent.VK_T);
				robot.keyRelease(KeyEvent.VK_SHIFT);
			}
		});
		commandMap.put('U', new Command(){
			@Override
			public void executeCommand(Robot robot) {
				robot.keyPress(KeyEvent.VK_SHIFT);
				robot.keyPress(KeyEvent.VK_U);
				robot.keyRelease(KeyEvent.VK_SHIFT);
			}
		});
		commandMap.put('V', new Command(){
			@Override
			public void executeCommand(Robot robot) {
				robot.keyPress(KeyEvent.VK_SHIFT);
				robot.keyPress(KeyEvent.VK_V);
				robot.keyRelease(KeyEvent.VK_SHIFT);
			}
		});
		commandMap.put('X', new Command(){
			@Override
			public void executeCommand(Robot robot) {
				robot.keyPress(KeyEvent.VK_SHIFT);
				robot.keyPress(KeyEvent.VK_X);
				robot.keyRelease(KeyEvent.VK_SHIFT);
			}
		});
		commandMap.put('Y', new Command(){
			@Override
			public void executeCommand(Robot robot) {
				robot.keyPress(KeyEvent.VK_SHIFT);
				robot.keyPress(KeyEvent.VK_Y);
				robot.keyRelease(KeyEvent.VK_SHIFT);
			}
		});
		commandMap.put('W', new Command(){
			@Override
			public void executeCommand(Robot robot) {
				robot.keyPress(KeyEvent.VK_SHIFT);
				robot.keyPress(KeyEvent.VK_W);
				robot.keyRelease(KeyEvent.VK_SHIFT);
			}
		});
		commandMap.put('Z', new Command(){
			@Override
			public void executeCommand(Robot robot) {
				robot.keyPress(KeyEvent.VK_SHIFT);
				robot.keyPress(KeyEvent.VK_Z);
				robot.keyRelease(KeyEvent.VK_SHIFT);
			}
		});
//		commandMap.put('Ç', new Command(){
//			@Override
//			public void executeCommand(Robot robot) {
//		        robot.keyPress(KeyEvent.VK_SEMICOLON);  
//		        robot.keyRelease(KeyEvent.VK_SEMICOLON);  
//			}
//		});
		
		commandMap.put('é', new Command(){
			@Override
			public void executeCommand(Robot robot) {
				robot.keyRelease(KeyEvent.VK_DEAD_ACUTE);  
			    robot.keyPress(KeyEvent.VK_DEAD_ACUTE);
			    robot.keyPress(KeyEvent.VK_E);
			    robot.keyRelease(KeyEvent.VK_E);
			}
		});
		commandMap.put('è', new Command(){
			@Override
			public void executeCommand(Robot robot) {
				robot.keyPress(KeyEvent.VK_SHIFT);
				robot.keyRelease(KeyEvent.VK_DEAD_ACUTE);  
			    robot.keyPress(KeyEvent.VK_DEAD_ACUTE);
			    robot.keyRelease(KeyEvent.VK_SHIFT);
			    robot.keyPress(KeyEvent.VK_E);
			    robot.keyRelease(KeyEvent.VK_E);
			}
		});
		commandMap.put('ê', new Command(){
			@Override
			public void executeCommand(Robot robot) {
				robot.keyPress(KeyEvent.VK_SHIFT);  
	    		robot.keyPress(KeyEvent.VK_DEAD_TILDE);
		        robot.keyRelease(KeyEvent.VK_DEAD_TILDE);  
		        robot.keyRelease(KeyEvent.VK_SHIFT);
				robot.keyPress(KeyEvent.VK_E);
		        robot.keyRelease(KeyEvent.VK_E);
			}
		});
		commandMap.put('ë', new Command(){
			@Override
			public void executeCommand(Robot robot) {
				robot.keyPress(KeyEvent.VK_ALT);  
	    		robot.keyPress(KeyEvent.VK_CONTROL);
	    		robot.keyPress(KeyEvent.VK_PLUS);
	    		robot.keyRelease(KeyEvent.VK_PLUS);
	    		robot.keyRelease(KeyEvent.VK_CONTROL);
	    		robot.keyRelease(KeyEvent.VK_ALT); 
	    		robot.keyPress(KeyEvent.VK_E);
		        robot.keyRelease(KeyEvent.VK_E);
			}
		});
		commandMap.put('ý', new Command(){
			@Override
			public void executeCommand(Robot robot) {
				robot.keyRelease(KeyEvent.VK_DEAD_ACUTE);  
			    robot.keyPress(KeyEvent.VK_DEAD_ACUTE);
			    robot.keyPress(KeyEvent.VK_Y);
			    robot.keyRelease(KeyEvent.VK_Y);
			}
		});
		commandMap.put('ÿ', new Command(){
			@Override
			public void executeCommand(Robot robot) {
				robot.keyPress(KeyEvent.VK_ALT);  
	    		robot.keyPress(KeyEvent.VK_CONTROL);
	    		robot.keyPress(KeyEvent.VK_PLUS);
	    		robot.keyRelease(KeyEvent.VK_PLUS);
	    		robot.keyRelease(KeyEvent.VK_CONTROL);
	    		robot.keyRelease(KeyEvent.VK_ALT); 
	    		robot.keyPress(KeyEvent.VK_Y);
		        robot.keyRelease(KeyEvent.VK_Y);
			}
		});
		commandMap.put('ú', new Command(){
			@Override
			public void executeCommand(Robot robot) {
				robot.keyRelease(KeyEvent.VK_DEAD_ACUTE);  
			    robot.keyPress(KeyEvent.VK_DEAD_ACUTE);
			    robot.keyPress(KeyEvent.VK_U);
			    robot.keyRelease(KeyEvent.VK_U);
			}
		});
		commandMap.put('ù', new Command(){
			@Override
			public void executeCommand(Robot robot) {
				robot.keyPress(KeyEvent.VK_SHIFT);
				robot.keyRelease(KeyEvent.VK_DEAD_ACUTE);  
			    robot.keyPress(KeyEvent.VK_DEAD_ACUTE);
			    robot.keyRelease(KeyEvent.VK_SHIFT);
			    robot.keyPress(KeyEvent.VK_U);
			    robot.keyRelease(KeyEvent.VK_U);
			}
		});
		commandMap.put('û', new Command(){
			@Override
			public void executeCommand(Robot robot) {
				robot.keyPress(KeyEvent.VK_SHIFT);  
	    		robot.keyPress(KeyEvent.VK_DEAD_TILDE);
		        robot.keyRelease(KeyEvent.VK_DEAD_TILDE);  
		        robot.keyRelease(KeyEvent.VK_SHIFT);
		        robot.keyPress(KeyEvent.VK_U);
		        robot.keyRelease(KeyEvent.VK_U);
			}
		});
		commandMap.put('ü', new Command(){
			@Override
			public void executeCommand(Robot robot) {
				robot.keyPress(KeyEvent.VK_ALT);  
	    		robot.keyPress(KeyEvent.VK_CONTROL);
	    		robot.keyPress(KeyEvent.VK_PLUS);
	    		robot.keyRelease(KeyEvent.VK_PLUS);
	    		robot.keyRelease(KeyEvent.VK_CONTROL);
	    		robot.keyRelease(KeyEvent.VK_ALT); 
	    		robot.keyPress(KeyEvent.VK_U);
		        robot.keyRelease(KeyEvent.VK_U);
			}
		});
		commandMap.put('í', new Command(){
			@Override
			public void executeCommand(Robot robot) {
				robot.keyRelease(KeyEvent.VK_DEAD_ACUTE);  
			    robot.keyPress(KeyEvent.VK_DEAD_ACUTE);
			    robot.keyPress(KeyEvent.VK_I);
			    robot.keyRelease(KeyEvent.VK_I);
			}
		});
		commandMap.put('ì', new Command(){
			@Override
			public void executeCommand(Robot robot) {
				robot.keyPress(KeyEvent.VK_SHIFT);
				robot.keyRelease(KeyEvent.VK_DEAD_ACUTE);  
			    robot.keyPress(KeyEvent.VK_DEAD_ACUTE);
			    robot.keyRelease(KeyEvent.VK_SHIFT);
			    robot.keyPress(KeyEvent.VK_I);
			    robot.keyRelease(KeyEvent.VK_I);
			}
		});
		commandMap.put('î', new Command(){
			@Override
			public void executeCommand(Robot robot) {
				robot.keyPress(KeyEvent.VK_SHIFT);  
	    		robot.keyPress(KeyEvent.VK_DEAD_TILDE);
		        robot.keyRelease(KeyEvent.VK_DEAD_TILDE);  
		        robot.keyRelease(KeyEvent.VK_SHIFT);
		        robot.keyPress(KeyEvent.VK_I);
		        robot.keyRelease(KeyEvent.VK_I);
			}
		});
		commandMap.put('ï', new Command(){
			@Override
			public void executeCommand(Robot robot) {
				robot.keyPress(KeyEvent.VK_ALT);  
	    		robot.keyPress(KeyEvent.VK_CONTROL);
	    		robot.keyPress(KeyEvent.VK_PLUS);
	    		robot.keyRelease(KeyEvent.VK_PLUS);
	    		robot.keyRelease(KeyEvent.VK_CONTROL);
	    		robot.keyRelease(KeyEvent.VK_ALT); 
	    		robot.keyPress(KeyEvent.VK_I);
		        robot.keyRelease(KeyEvent.VK_I);
			}
		});
		commandMap.put('ó', new Command(){
			@Override
			public void executeCommand(Robot robot) {
				robot.keyRelease(KeyEvent.VK_DEAD_ACUTE);  
			    robot.keyPress(KeyEvent.VK_DEAD_ACUTE);
			    robot.keyPress(KeyEvent.VK_O);
			    robot.keyRelease(KeyEvent.VK_O);
			}
		});
		commandMap.put('ò', new Command(){
			@Override
			public void executeCommand(Robot robot) {
				robot.keyPress(KeyEvent.VK_SHIFT);
				robot.keyRelease(KeyEvent.VK_DEAD_ACUTE);  
			    robot.keyPress(KeyEvent.VK_DEAD_ACUTE);
			    robot.keyRelease(KeyEvent.VK_SHIFT);
			    robot.keyPress(KeyEvent.VK_O);
			    robot.keyRelease(KeyEvent.VK_O);
			}
		});
		commandMap.put('ô', new Command(){
			@Override
			public void executeCommand(Robot robot) {
				robot.keyPress(KeyEvent.VK_SHIFT);  
	    		robot.keyPress(KeyEvent.VK_DEAD_TILDE);
		        robot.keyRelease(KeyEvent.VK_DEAD_TILDE);  
		        robot.keyRelease(KeyEvent.VK_SHIFT);
		        robot.keyPress(KeyEvent.VK_O);
		        robot.keyRelease(KeyEvent.VK_O);	
			}
		});
		commandMap.put('õ', new Command(){
			@Override
			public void executeCommand(Robot robot) {
				robot.keyPress(KeyEvent.VK_DEAD_TILDE);
		        robot.keyRelease(KeyEvent.VK_DEAD_TILDE); 
		        robot.keyPress(KeyEvent.VK_O);
		        robot.keyRelease(KeyEvent.VK_O);
			}
		});
		commandMap.put('ö', new Command(){
			@Override
			public void executeCommand(Robot robot) {
				robot.keyPress(KeyEvent.VK_ALT);  
	    		robot.keyPress(KeyEvent.VK_CONTROL);
	    		robot.keyPress(KeyEvent.VK_PLUS);
	    		robot.keyRelease(KeyEvent.VK_PLUS);
	    		robot.keyRelease(KeyEvent.VK_CONTROL);
	    		robot.keyRelease(KeyEvent.VK_ALT); 
	    		robot.keyPress(KeyEvent.VK_O);
		        robot.keyRelease(KeyEvent.VK_O);
			}
		});
		commandMap.put('á', new Command(){
			@Override
			public void executeCommand(Robot robot) {
				robot.keyRelease(KeyEvent.VK_DEAD_ACUTE);  
			    robot.keyPress(KeyEvent.VK_DEAD_ACUTE);
			    robot.keyPress(KeyEvent.VK_A);
			    robot.keyRelease(KeyEvent.VK_A);
			}
		});
		commandMap.put('à', new Command(){
			@Override
			public void executeCommand(Robot robot) {
				robot.keyPress(KeyEvent.VK_SHIFT);
				robot.keyRelease(KeyEvent.VK_DEAD_ACUTE);  
			    robot.keyPress(KeyEvent.VK_DEAD_ACUTE);
			    robot.keyRelease(KeyEvent.VK_SHIFT);
			    robot.keyPress(KeyEvent.VK_A);
			    robot.keyRelease(KeyEvent.VK_A);
			}
		});
		commandMap.put('â', new Command(){
			@Override
			public void executeCommand(Robot robot) {
				robot.keyPress(KeyEvent.VK_SHIFT);  
	    		robot.keyPress(KeyEvent.VK_DEAD_TILDE);
		        robot.keyRelease(KeyEvent.VK_DEAD_TILDE);  
		        robot.keyRelease(KeyEvent.VK_SHIFT);
		        robot.keyPress(KeyEvent.VK_A);
		        robot.keyRelease(KeyEvent.VK_A);
			}
		});
		commandMap.put('ã', new Command(){
			@Override
			public void executeCommand(Robot robot) {
				robot.keyPress(KeyEvent.VK_DEAD_TILDE);
		        robot.keyRelease(KeyEvent.VK_DEAD_TILDE); 
		        robot.keyPress(KeyEvent.VK_A);
		        robot.keyRelease(KeyEvent.VK_A);
			}
		});
		commandMap.put('ä', new Command(){
			@Override
			public void executeCommand(Robot robot) {
				robot.keyPress(KeyEvent.VK_ALT);  
	    		robot.keyPress(KeyEvent.VK_CONTROL);
	    		robot.keyPress(KeyEvent.VK_PLUS);
	    		robot.keyRelease(KeyEvent.VK_PLUS);
	    		robot.keyRelease(KeyEvent.VK_CONTROL);
	    		robot.keyRelease(KeyEvent.VK_ALT); 
	    		robot.keyPress(KeyEvent.VK_A);
		        robot.keyRelease(KeyEvent.VK_A);
			}
		});
		
		commandMap.put('É', new Command(){
			@Override
			public void executeCommand(Robot robot) {
				robot.keyRelease(KeyEvent.VK_DEAD_ACUTE);  
			    robot.keyPress(KeyEvent.VK_DEAD_ACUTE);
			    robot.keyPress(KeyEvent.VK_SHIFT);
			    robot.keyPress(KeyEvent.VK_E);
			    robot.keyRelease(KeyEvent.VK_E);
			    robot.keyRelease(KeyEvent.VK_SHIFT);
			}
		});
		commandMap.put('È', new Command(){
			@Override
			public void executeCommand(Robot robot) {
				robot.keyPress(KeyEvent.VK_SHIFT);
				robot.keyRelease(KeyEvent.VK_DEAD_ACUTE);  
			    robot.keyPress(KeyEvent.VK_DEAD_ACUTE);
			    robot.keyPress(KeyEvent.VK_E);
			    robot.keyRelease(KeyEvent.VK_E);
			    robot.keyRelease(KeyEvent.VK_SHIFT);
			}
		});
		commandMap.put('Ê', new Command(){
			@Override
			public void executeCommand(Robot robot) {
				robot.keyPress(KeyEvent.VK_SHIFT);  
	    		robot.keyPress(KeyEvent.VK_DEAD_TILDE);
		        robot.keyRelease(KeyEvent.VK_DEAD_TILDE);
		        robot.keyPress(KeyEvent.VK_E);
		        robot.keyRelease(KeyEvent.VK_E);
		        robot.keyRelease(KeyEvent.VK_SHIFT);
			}
		});
		commandMap.put('Ë', new Command(){
			@Override
			public void executeCommand(Robot robot) {
				
				robot.keyPress(KeyEvent.VK_ALT);  
	    		robot.keyPress(KeyEvent.VK_CONTROL);
	    		robot.keyPress(KeyEvent.VK_PLUS);
	    		robot.keyRelease(KeyEvent.VK_PLUS);
	    		robot.keyRelease(KeyEvent.VK_CONTROL);
	    		robot.keyRelease(KeyEvent.VK_ALT); 
	    		robot.keyPress(KeyEvent.VK_SHIFT); 
	    		robot.keyPress(KeyEvent.VK_E);
		        robot.keyRelease(KeyEvent.VK_E);
		        robot.keyRelease(KeyEvent.VK_SHIFT);
			}
		});
		commandMap.put('Ý', new Command(){
			@Override
			public void executeCommand(Robot robot) {
				robot.keyRelease(KeyEvent.VK_DEAD_ACUTE);  
			    robot.keyPress(KeyEvent.VK_DEAD_ACUTE);
			    robot.keyPress(KeyEvent.VK_SHIFT);
			    robot.keyPress(KeyEvent.VK_Y);
			    robot.keyRelease(KeyEvent.VK_Y);
			    robot.keyRelease(KeyEvent.VK_SHIFT);
			}
		});
		commandMap.put('Ú', new Command(){
			@Override
			public void executeCommand(Robot robot) {
				robot.keyRelease(KeyEvent.VK_DEAD_ACUTE);  
			    robot.keyPress(KeyEvent.VK_DEAD_ACUTE);
			    robot.keyPress(KeyEvent.VK_SHIFT);
			    robot.keyPress(KeyEvent.VK_U);
			    robot.keyRelease(KeyEvent.VK_U);
			    robot.keyRelease(KeyEvent.VK_SHIFT);
			}
		});
		commandMap.put('Ù', new Command(){
			@Override
			public void executeCommand(Robot robot) {
				robot.keyPress(KeyEvent.VK_SHIFT);
				robot.keyRelease(KeyEvent.VK_DEAD_ACUTE);  
			    robot.keyPress(KeyEvent.VK_DEAD_ACUTE);
			    robot.keyPress(KeyEvent.VK_U);
			    robot.keyRelease(KeyEvent.VK_U);
			    robot.keyRelease(KeyEvent.VK_SHIFT);
			}
		});
		commandMap.put('Û', new Command(){
			@Override
			public void executeCommand(Robot robot) {
				robot.keyPress(KeyEvent.VK_SHIFT);  
	    		robot.keyPress(KeyEvent.VK_DEAD_TILDE);
		        robot.keyRelease(KeyEvent.VK_DEAD_TILDE);
		        robot.keyPress(KeyEvent.VK_U);
		        robot.keyRelease(KeyEvent.VK_U);
		        robot.keyRelease(KeyEvent.VK_SHIFT);
			}
		});
		commandMap.put('Ü', new Command(){
			@Override
			public void executeCommand(Robot robot) {
				robot.keyPress(KeyEvent.VK_ALT);  
	    		robot.keyPress(KeyEvent.VK_CONTROL);
	    		robot.keyPress(KeyEvent.VK_PLUS);
	    		robot.keyRelease(KeyEvent.VK_PLUS);
	    		robot.keyRelease(KeyEvent.VK_CONTROL);
	    		robot.keyRelease(KeyEvent.VK_ALT);
	    		robot.keyPress(KeyEvent.VK_SHIFT); 
	    		robot.keyPress(KeyEvent.VK_U);
		        robot.keyRelease(KeyEvent.VK_U);
		        robot.keyRelease(KeyEvent.VK_SHIFT);
			}
		});
		commandMap.put('Í', new Command(){
			@Override
			public void executeCommand(Robot robot) {
				robot.keyRelease(KeyEvent.VK_DEAD_ACUTE);  
			    robot.keyPress(KeyEvent.VK_DEAD_ACUTE);
			    robot.keyPress(KeyEvent.VK_SHIFT);
			    robot.keyPress(KeyEvent.VK_I);
			    robot.keyRelease(KeyEvent.VK_I);
			    robot.keyRelease(KeyEvent.VK_SHIFT);
			}
		});
		commandMap.put('Ì', new Command(){
			@Override
			public void executeCommand(Robot robot) {
				robot.keyPress(KeyEvent.VK_SHIFT);
				robot.keyRelease(KeyEvent.VK_DEAD_ACUTE);  
			    robot.keyPress(KeyEvent.VK_DEAD_ACUTE);
			    robot.keyPress(KeyEvent.VK_I);
			    robot.keyRelease(KeyEvent.VK_I);
			    robot.keyRelease(KeyEvent.VK_SHIFT);
			}
		});
		commandMap.put('Î', new Command(){
			@Override
			public void executeCommand(Robot robot) {
				robot.keyPress(KeyEvent.VK_SHIFT);  
	    		robot.keyPress(KeyEvent.VK_DEAD_TILDE);
		        robot.keyRelease(KeyEvent.VK_DEAD_TILDE);
		        robot.keyPress(KeyEvent.VK_I);
		        robot.keyRelease(KeyEvent.VK_I);
		        robot.keyRelease(KeyEvent.VK_SHIFT);
			}
		});
		commandMap.put('Ï', new Command(){
			@Override
			public void executeCommand(Robot robot) {
				robot.keyPress(KeyEvent.VK_ALT);  
	    		robot.keyPress(KeyEvent.VK_CONTROL);
	    		robot.keyPress(KeyEvent.VK_PLUS);
	    		robot.keyRelease(KeyEvent.VK_PLUS);
	    		robot.keyRelease(KeyEvent.VK_CONTROL);
	    		robot.keyRelease(KeyEvent.VK_ALT); 
	    		robot.keyPress(KeyEvent.VK_SHIFT); 
	    		robot.keyPress(KeyEvent.VK_I);
		        robot.keyRelease(KeyEvent.VK_I);
		        robot.keyRelease(KeyEvent.VK_SHIFT);
			}
		});
		commandMap.put('Ó', new Command(){
			@Override
			public void executeCommand(Robot robot) {
				robot.keyRelease(KeyEvent.VK_DEAD_ACUTE);  
			    robot.keyPress(KeyEvent.VK_DEAD_ACUTE);
			    robot.keyPress(KeyEvent.VK_SHIFT);
			    robot.keyPress(KeyEvent.VK_O);
			    robot.keyRelease(KeyEvent.VK_O);
			    robot.keyRelease(KeyEvent.VK_SHIFT);
			}
		});
		commandMap.put('Ò', new Command(){
			@Override
			public void executeCommand(Robot robot) {
				robot.keyPress(KeyEvent.VK_SHIFT);
				robot.keyRelease(KeyEvent.VK_DEAD_ACUTE);  
			    robot.keyPress(KeyEvent.VK_DEAD_ACUTE);
			    robot.keyPress(KeyEvent.VK_O);
			    robot.keyRelease(KeyEvent.VK_O);
			    robot.keyRelease(KeyEvent.VK_SHIFT);
			}
		});
		commandMap.put('Ô', new Command(){
			@Override
			public void executeCommand(Robot robot) {
				robot.keyPress(KeyEvent.VK_SHIFT);  
	    		robot.keyPress(KeyEvent.VK_DEAD_TILDE);
		        robot.keyRelease(KeyEvent.VK_DEAD_TILDE);
		        robot.keyPress(KeyEvent.VK_O);
		        robot.keyRelease(KeyEvent.VK_O);
		        robot.keyRelease(KeyEvent.VK_SHIFT);
			}
		});
		commandMap.put('Õ', new Command(){
			@Override
			public void executeCommand(Robot robot) {
				robot.keyPress(KeyEvent.VK_DEAD_TILDE);
		        robot.keyRelease(KeyEvent.VK_DEAD_TILDE); 
		        robot.keyPress(KeyEvent.VK_SHIFT);
		        robot.keyPress(KeyEvent.VK_O);
		        robot.keyRelease(KeyEvent.VK_O);
		        robot.keyRelease(KeyEvent.VK_SHIFT);
			}
		});
		commandMap.put('Ö', new Command(){
			@Override
			public void executeCommand(Robot robot) {
				robot.keyPress(KeyEvent.VK_ALT);  
	    		robot.keyPress(KeyEvent.VK_CONTROL);
	    		robot.keyPress(KeyEvent.VK_PLUS);
	    		robot.keyRelease(KeyEvent.VK_PLUS);
	    		robot.keyRelease(KeyEvent.VK_CONTROL);
	    		robot.keyRelease(KeyEvent.VK_ALT); 
	    		robot.keyPress(KeyEvent.VK_SHIFT); 
	    		robot.keyPress(KeyEvent.VK_O);
		        robot.keyRelease(KeyEvent.VK_O);
		        robot.keyRelease(KeyEvent.VK_SHIFT);
			}
		});
		commandMap.put('Á', new Command(){
			@Override
			public void executeCommand(Robot robot) {
				robot.keyRelease(KeyEvent.VK_DEAD_ACUTE);  
			    robot.keyPress(KeyEvent.VK_DEAD_ACUTE);
			    robot.keyPress(KeyEvent.VK_SHIFT);
			    robot.keyPress(KeyEvent.VK_A);
			    robot.keyRelease(KeyEvent.VK_A);
			    robot.keyRelease(KeyEvent.VK_SHIFT);
			}
		});
		commandMap.put('À', new Command(){
			@Override
			public void executeCommand(Robot robot) {
				robot.keyPress(KeyEvent.VK_SHIFT);
				robot.keyRelease(KeyEvent.VK_DEAD_ACUTE);  
			    robot.keyPress(KeyEvent.VK_DEAD_ACUTE);
			    robot.keyPress(KeyEvent.VK_A);
			    robot.keyRelease(KeyEvent.VK_A);
			    robot.keyRelease(KeyEvent.VK_SHIFT);
			}
		});
		commandMap.put('Â', new Command(){
			@Override
			public void executeCommand(Robot robot) {
				robot.keyPress(KeyEvent.VK_SHIFT);  
	    		robot.keyPress(KeyEvent.VK_DEAD_TILDE);
		        robot.keyRelease(KeyEvent.VK_DEAD_TILDE);
		        robot.keyPress(KeyEvent.VK_A);
		        robot.keyRelease(KeyEvent.VK_A);
		        robot.keyRelease(KeyEvent.VK_SHIFT);
			}
		});
		commandMap.put('Ã', new Command(){
			@Override
			public void executeCommand(Robot robot) {
				robot.keyPress(KeyEvent.VK_DEAD_TILDE);
		        robot.keyRelease(KeyEvent.VK_DEAD_TILDE); 
		        robot.keyPress(KeyEvent.VK_SHIFT);
		        robot.keyPress(KeyEvent.VK_A);
		        robot.keyRelease(KeyEvent.VK_A);
		        robot.keyRelease(KeyEvent.VK_SHIFT);
			}
		});
		commandMap.put('Ä', new Command(){
			@Override
			public void executeCommand(Robot robot) {
				robot.keyPress(KeyEvent.VK_ALT);  
	    		robot.keyPress(KeyEvent.VK_CONTROL);
	    		robot.keyPress(KeyEvent.VK_PLUS);
	    		robot.keyRelease(KeyEvent.VK_PLUS);
	    		robot.keyRelease(KeyEvent.VK_CONTROL);
	    		robot.keyRelease(KeyEvent.VK_ALT); 
	    		robot.keyPress(KeyEvent.VK_SHIFT);
	    		robot.keyPress(KeyEvent.VK_A);
		        robot.keyRelease(KeyEvent.VK_A);
		        robot.keyRelease(KeyEvent.VK_SHIFT);
			}
		});
		
		commandMap.put('\\', new Command(){
			@Override
			public void executeCommand(Robot robot) {
				robot.keyRelease(KeyEvent.VK_BACK_SLASH);
		        robot.keyPress(KeyEvent.VK_BACK_SLASH);
			}
		});
		commandMap.put('0', new Command(){
			@Override
			public void executeCommand(Robot robot) {
				robot.keyPress(KeyEvent.VK_0);
			}
		});
		commandMap.put('1', new Command(){
			@Override
			public void executeCommand(Robot robot) {
				robot.keyPress(KeyEvent.VK_1);
			}
		});
		commandMap.put('2', new Command(){
			@Override
			public void executeCommand(Robot robot) {
				robot.keyPress(KeyEvent.VK_2);
			}
		});
		commandMap.put('3', new Command(){
			@Override
			public void executeCommand(Robot robot) {
				robot.keyPress(KeyEvent.VK_3);
			}
		});
		commandMap.put('4', new Command(){
			@Override
			public void executeCommand(Robot robot) {
				robot.keyPress(KeyEvent.VK_4);
			}
		});
		commandMap.put('5', new Command(){
			@Override
			public void executeCommand(Robot robot) {
				robot.keyPress(KeyEvent.VK_5);
			}
		});
		commandMap.put('6', new Command(){
			@Override
			public void executeCommand(Robot robot) {
				robot.keyPress(KeyEvent.VK_6);
			}
		});
		commandMap.put('7', new Command(){
			@Override
			public void executeCommand(Robot robot) {
				robot.keyPress(KeyEvent.VK_7);
			}
		});
		commandMap.put('8', new Command(){
			@Override
			public void executeCommand(Robot robot) {
				robot.keyPress(KeyEvent.VK_8);
			}
		});
		commandMap.put('9', new Command(){
			@Override
			public void executeCommand(Robot robot) {
				robot.keyPress(KeyEvent.VK_9);
			}
		});
		commandMap.put('\'', new Command(){
			@Override
			public void executeCommand(Robot robot) {
				robot.keyPress(KeyEvent.VK_QUOTE);
		        robot.keyRelease(KeyEvent.VK_QUOTE);
			}
		});
//		commandMap.put('«', new Command(){
//			@Override
//			public void executeCommand(Robot robot) {
//			}
//		});
		
		commandMap.put('|', new Command(){
			@Override
			public void executeCommand(Robot robot) {
				robot.keyPress(KeyEvent.VK_SHIFT);  
				robot.keyRelease(KeyEvent.VK_BACK_SLASH);
		        robot.keyPress(KeyEvent.VK_BACK_SLASH);
		        robot.keyRelease(KeyEvent.VK_SHIFT);
			}
		});
		commandMap.put('!', new Command(){
			@Override
			public void executeCommand(Robot robot) {
				robot.keyPress(KeyEvent.VK_SHIFT);  
	            robot.keyPress(KeyEvent.VK_1);
	            robot.keyRelease(KeyEvent.VK_1 );  
	            robot.keyRelease(KeyEvent.VK_SHIFT);
			}
		});
		commandMap.put('"', new Command(){
			@Override
			public void executeCommand(Robot robot) {
				robot.keyPress(KeyEvent.VK_SHIFT);  
	            robot.keyPress(KeyEvent.VK_2);
	            robot.keyRelease(KeyEvent.VK_2);  
	            robot.keyRelease(KeyEvent.VK_SHIFT);
			}
		});
		commandMap.put('#', new Command(){
			@Override
			public void executeCommand(Robot robot) {
				robot.keyPress(KeyEvent.VK_SHIFT);  
	            robot.keyPress(KeyEvent.VK_3);
	            robot.keyRelease(KeyEvent.VK_3);  
	            robot.keyRelease(KeyEvent.VK_SHIFT);
			}
		});
		commandMap.put('$', new Command(){
			@Override
			public void executeCommand(Robot robot) {
				robot.keyPress(KeyEvent.VK_SHIFT);  
	            robot.keyPress(KeyEvent.VK_4);
	            robot.keyRelease(KeyEvent.VK_4);  
	            robot.keyRelease(KeyEvent.VK_SHIFT);
			}
		});
		
		commandMap.put('%', new Command(){
			@Override
			public void executeCommand(Robot robot) {
				robot.keyPress(KeyEvent.VK_SHIFT);  
	            robot.keyPress(KeyEvent.VK_5);
	            robot.keyRelease(KeyEvent.VK_5);  
	            robot.keyRelease(KeyEvent.VK_SHIFT);
			}
		});
		commandMap.put('&', new Command(){
			@Override
			public void executeCommand(Robot robot) {
				robot.keyPress(KeyEvent.VK_SHIFT);  
	            robot.keyPress(KeyEvent.VK_6);
	            robot.keyRelease(KeyEvent.VK_6);  
	            robot.keyRelease(KeyEvent.VK_SHIFT);
			}
		});
		commandMap.put('/', new Command(){
			@Override
			public void executeCommand(Robot robot) {
				robot.keyPress(KeyEvent.VK_SHIFT);  
	            robot.keyPress(KeyEvent.VK_7);
	            robot.keyRelease(KeyEvent.VK_7);  
	            robot.keyRelease(KeyEvent.VK_SHIFT);
			}
		});
		commandMap.put('(', new Command(){
			@Override
			public void executeCommand(Robot robot) {
				robot.keyPress(KeyEvent.VK_SHIFT);  
	            robot.keyPress(KeyEvent.VK_8);
	            robot.keyRelease(KeyEvent.VK_8);  
	            robot.keyRelease(KeyEvent.VK_SHIFT);
			}
		});
		commandMap.put(')', new Command(){
			@Override
			public void executeCommand(Robot robot) {
				robot.keyPress(KeyEvent.VK_SHIFT);  
	            robot.keyPress(KeyEvent.VK_9);
	            robot.keyRelease(KeyEvent.VK_9);  
	            robot.keyRelease(KeyEvent.VK_SHIFT);
			}
		});
		commandMap.put('=', new Command(){
			@Override
			public void executeCommand(Robot robot) {
				robot.keyPress(KeyEvent.VK_SHIFT);  
	            robot.keyPress(KeyEvent.VK_0);
	            robot.keyRelease(KeyEvent.VK_0);  
	            robot.keyRelease(KeyEvent.VK_SHIFT);
			}
		});
		commandMap.put('?', new Command(){
			@Override
			public void executeCommand(Robot robot) {
				robot.keyPress(KeyEvent.VK_SHIFT);  
		    	robot.keyPress(KeyEvent.VK_QUOTE);
		        robot.keyRelease(KeyEvent.VK_QUOTE);  
	            robot.keyRelease(KeyEvent.VK_SHIFT);
			}
		});
//		commandMap.put('»', new Command(){
//			@Override
//			public void executeCommand(Robot robot) {
//			}
//		});
		
		commandMap.put('@', new Command(){
			@Override
			public void executeCommand(Robot robot) {
				robot.keyPress(KeyEvent.VK_ALT);  
	    		robot.keyPress(KeyEvent.VK_CONTROL);
	    		robot.keyRelease(KeyEvent.VK_2 );
		        robot.keyPress(KeyEvent.VK_2 );
	    		robot.keyRelease(KeyEvent.VK_ALT);
	    		robot.keyRelease(KeyEvent.VK_CONTROL);
			}
		});
		commandMap.put('£', new Command(){
			@Override
			public void executeCommand(Robot robot) {
				robot.keyPress(KeyEvent.VK_ALT);  
	    		robot.keyPress(KeyEvent.VK_CONTROL);
	    		robot.keyRelease(KeyEvent.VK_2 );
		        robot.keyPress(KeyEvent.VK_2 );
	    		robot.keyRelease(KeyEvent.VK_ALT);
	    		robot.keyRelease(KeyEvent.VK_CONTROL);
			}
		});
		commandMap.put('§', new Command(){
			@Override
			public void executeCommand(Robot robot) {
				robot.keyPress(KeyEvent.VK_ALT);  
	    		robot.keyPress(KeyEvent.VK_CONTROL);
	    		robot.keyRelease(KeyEvent.VK_4 );
		        robot.keyPress(KeyEvent.VK_4 );
	    		robot.keyRelease(KeyEvent.VK_CONTROL);
	    		robot.keyRelease(KeyEvent.VK_ALT);
			}
		});
		commandMap.put('{', new Command(){
			@Override
			public void executeCommand(Robot robot) {
				robot.keyPress(KeyEvent.VK_ALT);  
	    		robot.keyPress(KeyEvent.VK_CONTROL);
	    		robot.keyRelease(KeyEvent.VK_7 );
		        robot.keyPress(KeyEvent.VK_7 );
	    		robot.keyRelease(KeyEvent.VK_CONTROL);
	    		robot.keyRelease(KeyEvent.VK_ALT);
			}
		});
		commandMap.put('[', new Command(){
			@Override
			public void executeCommand(Robot robot) {
				robot.keyPress(KeyEvent.VK_ALT);  
	    		robot.keyPress(KeyEvent.VK_CONTROL);
	    		robot.keyRelease(KeyEvent.VK_8 );
		        robot.keyPress(KeyEvent.VK_8 );
	    		robot.keyRelease(KeyEvent.VK_CONTROL);
	    		robot.keyRelease(KeyEvent.VK_ALT);
			}
		});
		commandMap.put(']', new Command(){
			@Override
			public void executeCommand(Robot robot) {
				robot.keyPress(KeyEvent.VK_ALT);  
	    		robot.keyPress(KeyEvent.VK_CONTROL);
	    		robot.keyRelease(KeyEvent.VK_9 );
		        robot.keyPress(KeyEvent.VK_9 );
	    		robot.keyRelease(KeyEvent.VK_CONTROL);
	    		robot.keyRelease(KeyEvent.VK_ALT);
			}
		});
		commandMap.put('}', new Command(){
			@Override
			public void executeCommand(Robot robot) {
				robot.keyPress(KeyEvent.VK_ALT);  
	    		robot.keyPress(KeyEvent.VK_CONTROL);
	    		robot.keyRelease(KeyEvent.VK_0 );
		        robot.keyPress(KeyEvent.VK_0 );
	    		robot.keyRelease(KeyEvent.VK_CONTROL);
	    		robot.keyRelease(KeyEvent.VK_ALT);
			}
		});
		commandMap.put('¨', new Command(){
			@Override
			public void executeCommand(Robot robot) {
				robot.keyPress(KeyEvent.VK_ALT);  
	    		robot.keyPress(KeyEvent.VK_CONTROL);
	    		robot.keyPress(KeyEvent.VK_PLUS);
	    		robot.keyRelease(KeyEvent.VK_PLUS);
	    		robot.keyPress(KeyEvent.VK_PLUS);
	    		robot.keyRelease(KeyEvent.VK_PLUS);
	    		
	    		robot.keyPress(KeyEvent.VK_BACK_SPACE);
	    		robot.keyRelease(KeyEvent.VK_BACK_SPACE);
	    		robot.keyPress(KeyEvent.VK_BACK_SPACE);
	    		robot.keyRelease(KeyEvent.VK_BACK_SPACE);
	    		
	    		robot.keyRelease(KeyEvent.VK_CONTROL);
	    		robot.keyRelease(KeyEvent.VK_ALT); 
			}
		});
		
		commandMap.put('+', new Command(){
			@Override
			public void executeCommand(Robot robot) {
				robot.keyPress(KeyEvent.VK_ADD);
			}
		});
		commandMap.put('´', new Command(){
			@Override
			public void executeCommand(Robot robot) {
	    		robot.keyPress(KeyEvent.VK_DEAD_ACUTE);
		        robot.keyRelease(KeyEvent.VK_DEAD_ACUTE);  
		        robot.keyPress(KeyEvent.VK_DEAD_ACUTE);
		        robot.keyRelease(KeyEvent.VK_DEAD_ACUTE);
	            robot.keyRelease(KeyEvent.VK_BACK_SPACE);
		        robot.keyPress(KeyEvent.VK_BACK_SPACE);
			}
		});
//		commandMap.put('º', new Command(){
//			@Override
//			public void executeCommand(Robot robot) {
//			}
//		});
		commandMap.put('~', new Command(){
			@Override
			public void executeCommand(Robot robot) {
				robot.keyPress(KeyEvent.VK_DEAD_TILDE);
		        robot.keyRelease(KeyEvent.VK_DEAD_TILDE);  
		        robot.keyPress(KeyEvent.VK_DEAD_TILDE);
		        robot.keyRelease(KeyEvent.VK_DEAD_TILDE);  
		        robot.keyRelease(KeyEvent.VK_BACK_SPACE);
		        robot.keyPress(KeyEvent.VK_BACK_SPACE);
			}
		});
		commandMap.put(',', new Command(){
			@Override
			public void executeCommand(Robot robot) {
				robot.keyPress(KeyEvent.VK_COMMA);
			}
		});
		commandMap.put('.', new Command(){
			@Override
			public void executeCommand(Robot robot) {
				robot.keyPress(KeyEvent.VK_PERIOD);
			}
		});
		commandMap.put('-', new Command(){
			@Override
			public void executeCommand(Robot robot) {
				robot.keyPress(KeyEvent.VK_SUBTRACT);
			}
		});
		
		commandMap.put('*', new Command(){
			@Override
			public void executeCommand(Robot robot) {
				robot.keyPress(KeyEvent.VK_MULTIPLY);
			}
		});
		commandMap.put('`', new Command(){
			@Override
			public void executeCommand(Robot robot) {
				robot.keyPress(KeyEvent.VK_SHIFT);  
	    		robot.keyPress(KeyEvent.VK_DEAD_ACUTE);
		        robot.keyRelease(KeyEvent.VK_DEAD_ACUTE);  
		        robot.keyPress(KeyEvent.VK_DEAD_ACUTE);
		        robot.keyRelease(KeyEvent.VK_DEAD_ACUTE);  
	            robot.keyRelease(KeyEvent.VK_SHIFT);
	            robot.keyRelease(KeyEvent.VK_BACK_SPACE);
		        robot.keyPress(KeyEvent.VK_BACK_SPACE);
			}
		});
//		commandMap.put('ª', new Command(){
//			@Override
//			public void executeCommand(Robot robot) {
//			}
//		});
		commandMap.put('^', new Command(){
			@Override
			public void executeCommand(Robot robot) {
				robot.keyPress(KeyEvent.VK_SHIFT);  
	    		robot.keyPress(KeyEvent.VK_DEAD_TILDE);
		        robot.keyRelease(KeyEvent.VK_DEAD_TILDE);  
		        robot.keyPress(KeyEvent.VK_DEAD_TILDE);
		        robot.keyRelease(KeyEvent.VK_DEAD_TILDE);  
	            robot.keyRelease(KeyEvent.VK_SHIFT);
	            robot.keyRelease(KeyEvent.VK_BACK_SPACE);
		        robot.keyPress(KeyEvent.VK_BACK_SPACE);
			}
		});
		commandMap.put(';', new Command(){
			@Override
			public void executeCommand(Robot robot) {
				robot.keyPress(KeyEvent.VK_SHIFT);  
	            robot.keyPress(KeyEvent.VK_COMMA);
	            robot.keyRelease(KeyEvent.VK_COMMA);  
	            robot.keyRelease(KeyEvent.VK_SHIFT);
			}
		});
		commandMap.put(':', new Command(){
			@Override
			public void executeCommand(Robot robot) {
				robot.keyPress(KeyEvent.VK_SHIFT);  
	            robot.keyPress(KeyEvent.VK_PERIOD);
	            robot.keyRelease(KeyEvent.VK_PERIOD);  
	            robot.keyRelease(KeyEvent.VK_SHIFT);
			}
		});
		commandMap.put('_', new Command(){
			@Override
			public void executeCommand(Robot robot) {
				robot.keyPress(KeyEvent.VK_SHIFT);
				robot.keyPress(KeyEvent.VK_MINUS);
				robot.keyRelease(KeyEvent.VK_MINUS);
				robot.keyRelease(KeyEvent.VK_MINUS);
	            robot.keyRelease(KeyEvent.VK_SHIFT);
			}
		});
		commandMap.put(' ', new Command(){
			@Override
			public void executeCommand(Robot robot) {
				robot.keyPress(KeyEvent.VK_SPACE);
				robot.keyRelease(KeyEvent.VK_SPACE);
			}
		});
		commandMap.put('<', new Command(){
			@Override
			public void executeCommand(Robot robot) {
				robot.keyPress(KeyEvent.VK_LESS);
				robot.keyRelease(KeyEvent.VK_LESS);
			}
		});
		commandMap.put('>', new Command(){
			@Override
			public void executeCommand(Robot robot) {
				robot.keyPress(KeyEvent.VK_SHIFT);
				robot.keyPress(KeyEvent.VK_LESS);
				robot.keyRelease(KeyEvent.VK_LESS);
				robot.keyRelease(KeyEvent.VK_SHIFT);
			}
		});
		
		commandMap.put('\n', new Command(){
			@Override
			public void executeCommand(Robot robot) {
				robot.keyPress(KeyEvent.VK_ENTER);
				robot.keyRelease(KeyEvent.VK_ENTER);
			}
		});
		commandMap.put('\t', new Command(){
			@Override
			public void executeCommand(Robot robot) {
				robot.keyPress(KeyEvent.VK_TAB);
				robot.keyRelease(KeyEvent.VK_TAB);
			}
		});
	}
	
	
	
	public static void writeText(String text,Robot robot, boolean registered){
		byte chars_written = 0;
		while(text.length()!=0 && (registered || chars_written<UNREGISTERED_MAX_WRITTEN_CHARS)){
			char character = text.charAt(0);
			text = text.substring(1);
			try {
				writeCharacter(character, robot);
			} catch (ExceptionNotRecognizedCharacter e) {
				new Utilities().showPane(e.getMessage(), "Character not recognized", JOptionPane.WARNING_MESSAGE, true);
			}
			chars_written++;
		}
		
	}
	
	public static synchronized void stopWriting(){
		status = StatusCommandExecutor.FINISHED;
	}
	
	public static synchronized StatusCommandExecutor getStateWriting(){
		return status;
	}
	
	private static synchronized void writeCharacter(char character, Robot robot) throws ExceptionNotRecognizedCharacter{
		
		if(status.equals(StatusCommandExecutor.INITIALIZED)){
			Command command = commandMap.get(character);
			if(command==null){
				throw new ExceptionNotRecognizedCharacter(character);
			}
			command.executeCommand(robot);
		}
		
	}
	
}
