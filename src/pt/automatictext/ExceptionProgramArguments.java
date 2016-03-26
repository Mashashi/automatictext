package pt.automatictext;

import java.util.HashMap;

/**
 * @author Rafael Campos
 *
 */
@SuppressWarnings("serial")
public class ExceptionProgramArguments extends Exception{
	
	public ExceptionProgramArguments(String msg, HashMap<EnumArguments, String> arguments) {
		super(formatMessage(msg, arguments));
	}
	
	private static String formatMessage(String msg, HashMap<EnumArguments, String> arguments){
		StringBuffer msgBuffer = new StringBuffer(msg+(msg!=""?"\n\n":"")+(arguments.size()!=0?"You have an error in the following arguments":""));
		int err_number = 0;
		for(EnumArguments argument: EnumArguments.values()){
			err_number++;
			String value = arguments.get(argument);
			if(value!=null && !value.equals("")){
				msgBuffer.append("\n   "+err_number+". The argument "+argument.getName().toLowerCase()+" that, "+argument.getDescription()+", has the value \""+value+"\" which isn't in complience with the definition "+argument.getFormat_description());
			}else if(value.equals("")){
				msgBuffer.append("\n   "+err_number+". The argument "+argument.getName().toLowerCase()+" was not given. This argument "+argument.getDescription()+" and should be complient with the definition of "+argument.getFormat_description() );
			}
		}
		return msgBuffer.toString();
	}
	
	public static void checkArguments(String... arguments) throws ExceptionProgramArguments{
		
		HashMap<EnumArguments, String> malformed_parameters = new HashMap<>();
		boolean not_enough_args = arguments.length==0;
		EnumArguments[] enumArgs = EnumArguments.values();
		
		if(not_enough_args){
			
			for(int argEnumIndex=0; argEnumIndex < enumArgs.length;argEnumIndex++){
				
					if(!not_enough_args && !arguments[argEnumIndex].matches(enumArgs[argEnumIndex].getPattern())){
						malformed_parameters.put(enumArgs[argEnumIndex], arguments[argEnumIndex]);
					}else if(not_enough_args){
						malformed_parameters.put(enumArgs[argEnumIndex], "");
					}
					
					if(!not_enough_args && argEnumIndex>=arguments.length-1 && argEnumIndex<enumArgs.length-1){
						not_enough_args = true;
					}
				
			}
		
		}
		
		if(malformed_parameters.size()!=0 || not_enough_args){
			throw new ExceptionProgramArguments(not_enough_args?"You need at least "+EnumArguments.values().length+" arguments":"", malformed_parameters);
		}
		
	}
	
}
