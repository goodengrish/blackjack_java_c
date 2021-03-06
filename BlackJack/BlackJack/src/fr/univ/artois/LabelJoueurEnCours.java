package fr.univ.artois;

import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * Uné réimpression devra être faite à chaque tour
 * @author Browarr
 *
 */
public class LabelJoueurEnCours extends JPanel{
	
	private JLabel joueurEnCours = new JLabel("Tour du joueur: "+FenetrePrincipale.joueurEnCours);
	
	public LabelJoueurEnCours(){
		this.setBackground(Color.BLACK);
		this.joueurEnCours.setForeground(Color.WHITE);
		this.add(this.joueurEnCours);
	}

	public JLabel getJoueurEnCours() {
		return joueurEnCours;
	}

	public void setJoueurEnCours(JLabel joueurEnCours) {
		this.joueurEnCours = joueurEnCours;
	}

}
