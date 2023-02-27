package app;

public class Charizard extends PokemonTila{
	private static Charizard instanssi;
	private int tehdytTemput;
	private String nimi;
	
	private Charizard() {
		tehdytTemput = 0;
		nimi = "Charizard";
		System.out.println("Pokemonisi on nyt " + nimi + "!");
	}
	
	public static Charizard getInstance() {
		if(instanssi == null) {
			instanssi = new Charizard();
		}
		return instanssi;
	}
	
	void hyppaa(Pokemon p) {
		System.out.println(nimi + " hyppäsi!");
		tehdytTemput++;
		System.out.println(nimi + " tekemät temput: " + tehdytTemput);
		
	}
	void lyo(Pokemon p) {
		System.out.println(nimi + " löi!");
		tehdytTemput++;
		System.out.println(nimi + " tekemät temput: " + tehdytTemput);
		
	}
	void syokseTulta(Pokemon p) {
		System.out.println(nimi + " Syöksi tulta!");
		tehdytTemput++;
		System.out.println(nimi + " tekemät temput: " + tehdytTemput);
		
	}
}
