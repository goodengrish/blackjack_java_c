package fr.univ.artois;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class RangeeJoueurs extends JPanel{

	public RangeeJoueurs(){
		JLabel tmp = null;
		this.setLayout(new GridLayout(1, 7));
		for (int i = 0; i < 7; ++i){
			tmp = new JLabel("Joueur "+(i+1));
			tmp.setForeground(Color.BLACK);
			this.add(tmp);
		}
	}
	
}
