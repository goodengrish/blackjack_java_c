package fr.univ.artois;

import javax.swing.JPanel;

/**
 * Fenêtre de jeu où se déroulera la partie
 * @author Browarr
 *
 */
public class FenetreDeJeu extends JPanel{
	
	private Croupier croupier = new Croupier();
	private LabelJoueurEnCours tourJoueur = new LabelJoueurEnCours();
	private RangeeJoueurs rangeeJoueurs = new RangeeJoueurs();
	private RangeeActionsJoueurs rangeeActionsJoueurs = new RangeeActionsJoueurs();
	
	public FenetreDeJeu(){
		this.setLayout(null);
		this.croupier.setBounds(470, 10, 60, 25);
		this.add(this.croupier);
		this.tourJoueur.setBounds(850, 650, 125, 25);
		this.add(this.tourJoueur);
		this.rangeeJoueurs.setBounds(100, 675, 600, 25);
		this.add(this.rangeeJoueurs);
		this.rangeeActionsJoueurs.setBounds(100, 725, 600, 25);
		this.add(this.rangeeActionsJoueurs);
	}

	public Croupier getCroupier() {
		return croupier;
	}

	public void setCroupier(Croupier croupier) {
		this.croupier = croupier;
	}

	public LabelJoueurEnCours getTourJoueur() {
		return tourJoueur;
	}

	public void setTourJoueur(LabelJoueurEnCours tourJoueur) {
		this.tourJoueur = tourJoueur;
	}

	public RangeeJoueurs getRangeeJoueurs() {
		return rangeeJoueurs;
	}

	public void setRangeeJoueurs(RangeeJoueurs rangeeJoueurs) {
		this.rangeeJoueurs = rangeeJoueurs;
	}

	public RangeeActionsJoueurs getRangeeActionsJoueurs() {
		return rangeeActionsJoueurs;
	}

	public void setRangeeActionsJoueurs(RangeeActionsJoueurs rangeeActionsJoueurs) {
		this.rangeeActionsJoueurs = rangeeActionsJoueurs;
	}

}
