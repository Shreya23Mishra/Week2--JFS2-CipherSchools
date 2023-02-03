
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class Test2 {

	public static <E> void main(String[] args) throws Exception {
		
		FileReader fr = new FileReader("f:\\TestFile.txt\\Pokemon.csv");
		
		BufferedReader br = new BufferedReader(fr);
		
		String line;
		
		ArrayList<String> Pokemons = new ArrayList<String>();
		
		
		
		while((line = br.readLine()) !=null) {
			Pokemons.add(line);
		}
		
		Scanner sc = new Scanner(System.in);
		
		String type = sc.next();
		
		HashSet<E> ptypes = new HashSet<E>();
		
		if(!ptypes.contains(type)) {
			System.out.println("Invalid Pokemon Type");
			return;
		}
		
		
		for (String pok : Pokemons) {
			String ptype = pok.split(",")[1];
			
			if(ptype.equals(type)) {
				System.out.println(pok);
			}
		}
		
		br.close();
		fr.close();
		
		
	}
}