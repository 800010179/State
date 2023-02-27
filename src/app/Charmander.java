package app;

public final class Charmander extends PokemonTila{
	private static Charmander instanssi;
	private int tehdytTemput;
	private String nimi;
	
	private Charmander() {
		tehdytTemput = 0;
		nimi = "Charmander";
		System.out.println("Pokemonisi on nyt " + nimi + "!");
	}
	public static Charmander getInstance() {
		if(instanssi == null) {
			instanssi = new Charmander();
		}
		return instanssi;
	}
	
	void hyppaa(Pokemon p) {
		System.out.println(nimi + " hyppäsi!");
		tehdytTemput++;
		System.out.println(nimi + " tekemät temput: " + tehdytTemput);
		if(tehdytTemput == 3) {
			System.out.println(nimi + " kehittyy!");
			kehity(p, Charmeleon.getInstance());
		}
	}
	void lyo(Pokemon p) {
		System.out.println(nimi + " löi!");
		tehdytTemput++;
		System.out.println(nimi + " tekemät temput: " + tehdytTemput);
		if(tehdytTemput == 3) {
			System.out.println(nimi + " kehittyy!");
			kehity(p, Charmeleon.getInstance());
		}
	}
	void syokseTulta(Pokemon p) {
		System.out.println(nimi + " Syöksi tulta!");
		tehdytTemput++;
		System.out.println(nimi + " tekemät temput: " + tehdytTemput);
		if(tehdytTemput == 3) {
			System.out.println(nimi + " kehittyy!");
			kehity(p, Charmeleon.getInstance());
		}
	}
	
}
