package fr.univ.artois;

import javax.swing.JTextField;

public class ZoneDeSaisieServeur extends JTextField{
	
	public ZoneDeSaisieServeur(){
		this.setText("Entrez l'adresse:");
	}
	
	public String getAdresseServeur(){
		return this.getText();
	}

}
