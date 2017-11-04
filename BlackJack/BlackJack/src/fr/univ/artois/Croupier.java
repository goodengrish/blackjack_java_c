package fr.univ.artois;

import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * JPanel représentant le croupier sur le plateau de jeu
 * @author Browarr
 *
 */
public class Croupier extends JPanel{
	
	private JLabel croupier = new JLabel("Croupier");
	
	public Croupier(){
		this.setBackground(Color.BLACK);
		this.croupier.setForeground(Color.WHITE);
		this.add(croupier);
	}

}
