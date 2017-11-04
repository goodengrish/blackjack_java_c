package fr.univ.artois;

import javax.swing.JTextField;

public class ZoneDeSaisieServeurPort extends JTextField{
	
	public ZoneDeSaisieServeurPort(){
		this.setText("Port: ");
	}
	
	public String getPort(){
		return this.getText();
	}
	
}
