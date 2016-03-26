package pt.automatictext;

/**
 * @author Rafael Campos
 *
 */
public enum EnumArguments {
	
	SLEEP_TIME("sleep time", 			"defines the time that the program awaits until it starts to write the clipboard text.\n It comes in microseconds", 		"an integer value greater or equal to 0", "^\\d+$"), 
	CLEAR_CLIPBOARD("clear clipboard", 	"tells the program if the clipboard should be cleared after the written text",	"being true or false", "^(true|false)$"),
	ABOUT("about",						"gives information about the program, like author, version, etc.",				"being true or false", "^(true|false)$"),
	START_SOUND("start sound",			"makes the program play a beep at the begin of the writing",					"being true or false", "^(true|false)$"),
	STOP_SOUND("stop sound",			"makes the program play a beep at the end of the writing",						"being true or false", "^(true|false)$"),
	DELAY_TIME_BETWEEN_CHARS("delay time between chars",	"makes the program wait this time until another character is written.\n It comes in microseconds",	"an integer value greater or equal to 0", "^\\d+$");
	
	private String name;
	private String description;
	private String format_description;
	private String pattern;
	
	
	private EnumArguments(String name, String description, String format_description, String pattern){
		this.name = name;
		this.description = description;
		this.format_description = format_description;
		this.pattern = pattern;
	}
	
	public String getName()					{ return name; }
	public String getDescription() 			{ return description; }
	public String getFormat_description() 	{ return format_description; }
	public String getPattern() 				{ return pattern; }
	
}
