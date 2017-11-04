package fr.univ.artois;

import javax.swing.JPanel;
import javax.swing.BoxLayout;
import javax.swing.JLabel;

public class FenetreDeConnexion extends JPanel{
	
	private JLabel messageDeBienvenue = new JLabel("Bienvenue au BlackJack. Veuillez vous connecter.");
	private ZoneDeSaisieServeur adresseServeur = new ZoneDeSaisieServeur();
	private ZoneDeSaisieServeurPort portServeur = new ZoneDeSaisieServeurPort();
	private BoutonValidationServeur boutonValidation = new BoutonValidationServeur();
	
	public FenetreDeConnexion(){
		this.setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
		this.add(this.messageDeBienvenue);
		this.add(this.adresseServeur);
		this.add(this.portServeur);
		this.add(this.boutonValidation);
	}

	public JLabel getMessageDeBienvenue() {
		return messageDeBienvenue;
	}

	public void setMessageDeBienvenue(JLabel messageDeBienvenue) {
		this.messageDeBienvenue = messageDeBienvenue;
	}

	public ZoneDeSaisieServeur getAdresseServeur() {
		return adresseServeur;
	}

	public void setAdresseServeur(ZoneDeSaisieServeur adresseServeur) {
		this.adresseServeur = adresseServeur;
	}

	public ZoneDeSaisieServeurPort getPortServeur() {
		return portServeur;
	}

	public void setPortServeur(ZoneDeSaisieServeurPort portServeur) {
		this.portServeur = portServeur;
	}

	public BoutonValidationServeur getBoutonValidation() {
		return boutonValidation;
	}

	public void setBoutonValidation(BoutonValidationServeur boutonValidation) {
		this.boutonValidation = boutonValidation;
	}
	
}
