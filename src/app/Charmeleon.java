package app;

public class Charmeleon extends PokemonTila{
	private static Charmeleon instanssi;
	private int tehdytTemput;
	private String nimi;
	
	private Charmeleon() {
		tehdytTemput = 0;
		nimi = "Charmeleon";
		System.out.println("Pokemonisi on nyt " + nimi + "!");
	}
	
	public static Charmeleon getInstance() {
		if(instanssi == null) {
			instanssi = new Charmeleon();
		}
		return instanssi;
	}
	
	void hyppaa(Pokemon p) {
		System.out.println(nimi + " hyppäsi!");
		tehdytTemput++;
		System.out.println(nimi + " tekemät temput: " + tehdytTemput);
		if(tehdytTemput == 3) {
			System.out.println(nimi + " kehittyy!");
			kehity(p, Charizard.getInstance());
		}
	}
	void lyo(Pokemon p) {
		System.out.println(nimi + " löi!");
		tehdytTemput++;
		System.out.println(nimi + " tekemät temput: " + tehdytTemput);
		if(tehdytTemput == 3) {
			System.out.println(nimi + " kehittyy!");
			kehity(p, Charizard.getInstance());
		}
	}
	void syokseTulta(Pokemon p) {
		System.out.println(nimi + " Syöksi tulta!");
		tehdytTemput++;
		System.out.println(nimi + " tekemät temput: " + tehdytTemput);
		if(tehdytTemput == 3) {
			System.out.println(nimi + " kehittyy!");
			kehity(p, Charizard.getInstance());
		}
	}
	
}
