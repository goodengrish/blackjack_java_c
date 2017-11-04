package fr.univ.artois;

import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * Simple fenêtre qui s'affiche lorsqu'un joueur atteint une mise égale à 0
 * @author Browarr
 *
 */
public class FenetreEjection extends JPanel{
	
	private JLabel msg = new JLabel("Votre mise a atteint 0. Vous avez perdu.");
	
	public FenetreEjection(){
		this.add(this.msg);
	}

	public JLabel getMsg() {
		return msg;
	}

	public void setMsg(JLabel msg) {
		this.msg = msg;
	}

}
