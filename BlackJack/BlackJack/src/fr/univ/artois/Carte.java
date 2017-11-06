package fr.univ.artois;

import java.awt.Color;

import javax.swing.JLabel;

/**
 * Toutes les cartes qui seront utilisés par le jeu
 * Attention toutefois à l'as: il peut soit avoir une valeur de 1 soit une valeur de 10, au gré du joueur
 * @author Browarr
 *
 */
public class Carte extends JLabel{

	private int indice = 0;
	private int valeur = 0;
	
	public Carte(int indice){
		this.indice = indice;
		this.setForeground(Color.WHITE);
		this.setBackground(Color.RED);
		
		switch (this.indice){
		case 2:
			this.setText("2");
			this.valeur = 2;
			break;
		case 3:
			this.setText("3");
			this.valeur = 3;
			break;
		case 4:
			this.setText("4");
			this.valeur = 4;
			break;
		case 5:
			this.setText("5");
			this.valeur = 5;
			break;
		case 6:
			this.setText("6");
			this.valeur = 6;
			break;
		case 7:
			this.setText("7");
			this.valeur = 7;
			break;
		case 8:
			this.setText("8");
			this.valeur = 8;
			break;
		case 9:
			this.setText("9");
			this.valeur = 9;
			break;
		case 10:
			this.setText("10");
			this.valeur = 10;
			break;
		case 11:
			this.setText("Valet");
			this.valeur = 10;
			break;
		case 12:
			this.setText("Dame");
			this.valeur = 10;
			break;
		case 13:
			this.setText("Roi");
			this.valeur = 10;
			break;
		case 14:
			this.setText("As");
			this.valeur = 10;
			break;
		}
		
	}
	
	public int getValeur(){
		return this.valeur;
	}
	
	public int getIndice(){
		return this.indice;
	}
	
	// On appelera cette méthode pour l'as
	public void switchValeurAs(int v) throws CarteNonAsException{
		if (this.indice == 14){
			if (this.valeur == 1) this.valeur = 10;
			else this.valeur = 1;
		}
		else throw new CarteNonAsException("Modification de valeur impossible: Cette carte n'est pas un as.");
	}
	
}
