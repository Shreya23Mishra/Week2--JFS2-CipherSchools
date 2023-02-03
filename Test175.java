import java.util.HashMap;
import java.util.Map.Entry;

public class Test175 {
	public static void main(String[] args) {
		
		HashMap<String, String> states = new HashMap<String, String>();
		
		//put(1) method
		
		states.put("Tx", "Texas");
		states.put("Al", "Albama");
		states.put("Ar", "Arizona");
		states.put("Ca", "California");
		
		System.out.println(states);
		for(Entry<String, String> e : states.entrySet()) {
		System.out.println(e.getKey()+" --- "+e.getValue());
		
		
		}	
	}	
}