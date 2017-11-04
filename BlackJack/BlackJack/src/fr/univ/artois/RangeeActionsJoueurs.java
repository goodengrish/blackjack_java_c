package fr.univ.artois;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

/**
 * Rangée de boutons représentant les actions possibles pour un joueur
 * @author Browarr
 *
 */
public class RangeeActionsJoueurs extends JPanel{
	
	private JButton actionHit = new JButton("Hit");
	private JButton actionStand = new JButton("Stand");
	private JButton actionDouble = new JButton("Double");
	private JButton actionSurrender = new JButton("Surrender");
	private JButton actionSplit = new JButton("Split");
	
	public RangeeActionsJoueurs(){
		this.setLayout(new GridLayout(1, 5));
		this.add(this.actionHit);
		this.add(this.actionStand);
		this.add(this.actionDouble);
		this.add(this.actionSurrender);
		this.add(this.actionSplit);
	}

	public JButton getActionHit() {
		return actionHit;
	}

	public void setActionHit(JButton actionHit) {
		this.actionHit = actionHit;
	}

	public JButton getActionStand() {
		return actionStand;
	}

	public void setActionStand(JButton actionStand) {
		this.actionStand = actionStand;
	}

	public JButton getActionDouble() {
		return actionDouble;
	}

	public void setActionDouble(JButton actionDouble) {
		this.actionDouble = actionDouble;
	}

	public JButton getActionSurrender() {
		return actionSurrender;
	}

	public void setActionSurrender(JButton actionSurrender) {
		this.actionSurrender = actionSurrender;
	}

	public JButton getActionSplit() {
		return actionSplit;
	}

	public void setActionSplit(JButton actionSplit) {
		this.actionSplit = actionSplit;
	}

}
