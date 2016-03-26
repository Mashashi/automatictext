package pt.automatictext;

/**
 * @author Rafael Campos
 * 
 */
@SuppressWarnings("serial")
public class ExceptionNotRecognizedCharacter extends Exception {
	
	private char notRecognized;
	
	public ExceptionNotRecognizedCharacter(final char c) {
		super("The character "+c+" could not be recognized\nPlease write the correct character and press ok not continue");
		notRecognized = c;
	}
	
	public char getNotRecognized(){
		return notRecognized;
	}
	
}
