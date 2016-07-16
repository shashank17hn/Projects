package messageXML;

import java.util.HashMap;
import java.util.Map;

public class DataBase {

	private static Map<Long, MessageModel> message = new HashMap<Long,MessageModel>();
	private static Map<String, Profile> profile = new HashMap<String,Profile>();
	
	
	
	
	
	public static Map<Long, MessageModel> getMessage() {
		return message;
	}
	
	public static Map<String, Profile> getProfile() {
		return profile;
	}
	
	
	
}
