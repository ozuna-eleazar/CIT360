package json;

import org.json.simple.JSONObject;

public class Json{

@SuppressWarnings("unchecked")
public static void main(String[] args) {
	
	JSONObject baseball = new JSONObject();
	
	baseball.put("Player","Craig Biggio");
	baseball.put("Jersy Number","7");
	baseball.put("Position","Second Base");
	baseball.put("Team","Houston Astros");
	
	System.out.println(baseball);
}

}