
public class UserAccount {
	public static String username, language, country, timezone;
	
	public UserAccount() {
		username = "Guest";
		language = "English";
		country = "Philippines";
		timezone = "(GMT + 8:00 hours) Hong Kong, Perth, Singapore, Taipei";
	}
	
	public void setName (String a) {
		username = a;
	}
	
	public void setLang (String b) {
		language = b;
	}
	
	public void setCountry (String c) {
		country = c;
	}
	
	public void setTime (String d) {
		timezone = d;
	}
}
