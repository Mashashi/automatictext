package pt.automatictext.registration;
/**
 * @author Rafael Campos
 *
 */
public class License {
	
	public String readLicense(){ return null; }
	
	public String writeLicense(String licence){ return null; }
	
	public RegistrationState checkLicense(String license){
		return RegistrationState.UNREGISTERED;
	}
	
}
