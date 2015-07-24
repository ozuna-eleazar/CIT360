package json;

import org.json.simple.JSONObject;


public class Json{

@SuppressWarnings("unchecked")
public static void main(String[] args) {
	
	JSONObject baseball = new JSONObject();
	
	baseball.put("Player","Craig Biggio");
	baseball.put("Jersy Number","7");
	baseball.put("Position","Second Base");
	baseball.put("Team","Astros");
	baseball.put("City", "Houston");

	System.out.println(baseball);
	System.out.println(baseball.size());
	//Looking for the key "City" 
	System.out.println(baseball.containsKey("City"));
	//Since the Key is the left one it does not find Houston because Houston is a value.
	System.out.println(baseball.containsKey("Houston"));
	System.out.println();
	
	JSONObject football = new JSONObject();
	football.put("Team", "Texans");
	football.put("City","Houston");
	football.put("Division", "AFC South");
	
	System.out.println(football);
	
	System.out.println(football.size());
			
	
	
	
}

}