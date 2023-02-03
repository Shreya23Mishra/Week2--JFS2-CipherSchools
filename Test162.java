import java.util.Iterator;
import java.util.Vector;

public class Test162 {
	
	public static void main(String[]  args) {
		
		Vector vec = new Vector();
		
		vec.add("Texas");
		vec.add("Zurich");
		vec.add("NewYork");
		
		
		Iterator pointer = vec.iterator();
		
		while(pointer.hasNext()) {
			
			System.out.println(pointer.next());
			
		}
	}
}