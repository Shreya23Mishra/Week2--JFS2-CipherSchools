import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;

public class Test192 {

	public static void main(String[] args) throws Exception {
		
		FileReader fr = new FileReader("f:\\TestFile.txt\\Pokemon.csv");
		
		BufferedReader br = new BufferedReader(fr);
		
		String line;
		
		ArrayList<String> Pokemons = new ArrayList<String>();
		
		br.readLine();
		
		while((line = br.readLine()) !=null) {
			Pokemons.add(line);
		}
		
		System.out.println("Total Pokemons "+ Pokemons.size());
		
		ArrayList<String> PokemonTitles = new ArrayList<String>();
		
		for (String pok : Pokemons) {
			String title = pok.split(",")[0];
			PokemonTitles.add(title);
		}
		
	    System.out.println(PokemonTitles);
		br.close();
		fr.close();
		
	}
}