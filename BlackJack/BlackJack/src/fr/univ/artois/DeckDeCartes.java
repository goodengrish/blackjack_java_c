package fr.univ.artois;

import java.util.ArrayList;
import java.util.Random;

/**
 * Classe où l'on stocke 52 cartes générées de manière aléatoire et qui seront utilisées pour une partie
 * @author Browarr
 *
 */
public class DeckDeCartes {
	
	private ArrayList<Carte> deck = new ArrayList<Carte>();
	private Random r = new Random();
	private int borne_inf = 2;
	private int borne_sup = 15;
	private int valeur_aleatoire;
	
	public DeckDeCartes(){
		for(int i = 0; i < 52; ++i){
			valeur_aleatoire = r.nextInt(borne_sup-borne_inf) + borne_inf;
			this.deck.add(new Carte(valeur_aleatoire));
		}
	}
	
	public ArrayList<Carte> getDeck(){
		return this.deck;
	}

}
