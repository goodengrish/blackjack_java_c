package fr.univ.artois;

import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JLabel;

/**
 * Panel où le joueur sera mis en attente en cas de serveur plein
 * @author Browarr
 *
 */
public class FenetreDeLobby extends JPanel{
	
	private JLabel messageDAttente = new JLabel("Serveur plein. En attendre d'une libération de place...");
	
	/*
	 * Constructeur par défaut
	 */
	public FenetreDeLobby(){
		this.add(this.messageDAttente);
	}

	public JLabel getMessageDAttente() {
		return messageDAttente;
	}

	public void setMessageDAttente(JLabel messageDAttente) {
		this.messageDAttente = messageDAttente;
	}

}
