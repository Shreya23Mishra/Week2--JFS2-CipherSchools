import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;
public class Test174 {
	public static void main(String[] args) {
		// HashSet
		HashSet myset = new HashSet();
		myset.add("Green");
		myset.add("Red");
		myset.add("Orange");
		myset.add("Red");
		myset.add("Orange");
		
		
		System.out.println(myset);
		LinkedHashSet lhs = new LinkedHashSet();
		
		lhs.add("Green");
		lhs.add("Red");
		lhs.add("Orange");
		lhs.add("Red");
		lhs.add("Orange");
		System.out.println(lhs);
		
		TreeSet ts = new TreeSet();
		ts.add("cat");
		ts.add("Apple");
		ts.add("Ball");
		System.out.println(ts);
		
		
		
	}

}