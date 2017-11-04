package fr.univ.artois;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * Fenêtre principale où se trouveront les panels de connexion et de lobby d'attente
 * @author Browarr
 *
 */
public class FenetrePrincipale extends JFrame{
	
	private JPanel conteneurPrincipal = new JPanel(new CardLayout());
	private FenetreDeLobby fenetreDeLobby = new FenetreDeLobby();
	private FenetreDeConnexion fenetreDeConnexion = new FenetreDeConnexion();
	private FenetreAttenteDeLancementDePartie fenetreAttenteDeLancementDePartie = new FenetreAttenteDeLancementDePartie();
	private FenetreEjection fenetreEjection = new FenetreEjection();
	private FenetreDeJeu fenetreDeJeu = new FenetreDeJeu();
	
	private final String FENETREDELOBBY = new String("FENETREDELOBBY");
	private final String FENETREDECONNEXION = new String("FENETREDECONNEXION");
	private final String FENETREATTENTEDELANCEMENTDEPARTIE = new String("FENETREATTENTEDELANCEMENTDEPARTIE");
	private final String FENETREEJECTION = new String("FENETREEJECTION");
	private final String FENETREDEJEU = new String("FENETREDEJEU");
	
	/*
	 *  Variable qui indique quel joueur doit jouer
	 *  Valeurs 1 -> 7 inclus, joueurs
	 *  8 -> croupier
	 */
	public static int joueurEnCours = 1;
	
	public FenetrePrincipale(){
		this.setTitle("BlackJack");
		this.setSize(1000, 1000);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ajoutEcouteurBoutonValidation();
		remplissageConteneurPrincipal();
		ajoutEcouteursBoutonsActionsJoueurs();
		this.setContentPane(this.conteneurPrincipal);
		this.setVisible(true);
	}
	
	/**
	 * On remplit le conteneur principal avec les autres panels
	 */
	public void remplissageConteneurPrincipal(){
		
		this.conteneurPrincipal.add(fenetreDeLobby, FENETREDELOBBY);
		this.conteneurPrincipal.add(fenetreDeConnexion, FENETREDECONNEXION);
		this.conteneurPrincipal.add(fenetreAttenteDeLancementDePartie, FENETREATTENTEDELANCEMENTDEPARTIE);
		this.conteneurPrincipal.add(fenetreEjection, FENETREEJECTION);
		this.conteneurPrincipal.add(fenetreDeJeu, FENETREDEJEU);
		
		
		CardLayout cl = (CardLayout)this.conteneurPrincipal.getLayout();
		cl.show(this.conteneurPrincipal, FENETREDEJEU);
		
	}
	
	/**
	 * Lors d'une pression sur le bouton de connexion,
	 * on récupére les informations enregistrées dans les champs de texte,
	 * on essaie de se connecter au serveur via l'adresse et le port indiqués par l'utilisateur
	 */
	public void ajoutEcouteurBoutonValidation(){
		
		this.fenetreDeConnexion.getBoutonValidation().addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				recuperationDonnees();
			}
		});
	}
	
	/**
	 * Méthode qui permet de se connecter à un serveur C
	 * à faire: la partie réseau en Java et la connecter au serveur C
	 */
	public void recuperationDonnees(){
		String adresse = new String();
		String port = new String();
		
		adresse = this.fenetreDeConnexion.getAdresseServeur().getAdresseServeur().substring(17);
		port = this.fenetreDeConnexion.getPortServeur().getPort().substring(6);
		
		/*
		 * Plutôt qu'afficher simplement les données,
		 * on les placera dans un socket java qu'on enverra au serveur C qui filtrera ces infos
		 */
		System.out.println(adresse);
		System.out.println(port);
		
	}
	
	/**
	 * Méthode qui prend en compte les actions d'un joueur
	 * à faire: transformer les pressions des boutons en infos transferables sur le réseau
	 */
	public void ajoutEcouteursBoutonsActionsJoueurs(){
		this.fenetreDeJeu.getRangeeActionsJoueurs().getActionHit().addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("ActionHit a été préssé");
			}
			
		});
		
		this.fenetreDeJeu.getRangeeActionsJoueurs().getActionDouble().addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("ActionDouble a été préssé");
			}
			
		});
		
		this.fenetreDeJeu.getRangeeActionsJoueurs().getActionStand().addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("ActionStand a été préssé");
			}
			
		});
		
		this.fenetreDeJeu.getRangeeActionsJoueurs().getActionSurrender().addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("ActionSurrender a été préssé");
			}
			
		});
		
		this.fenetreDeJeu.getRangeeActionsJoueurs().getActionSplit().addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("ActionSplit a été préssé");
			}
			
		});
		
	}

	/*
	 * Getters && setters
	 */
	public JPanel getConteneurPrincipal() {
		return conteneurPrincipal;
	}

	public void setConteneurPrincipal(JPanel conteneurPrincipal) {
		this.conteneurPrincipal = conteneurPrincipal;
	}

	public FenetreDeLobby getFenetreDeLobby() {
		return fenetreDeLobby;
	}

	public void setFenetreDeLobby(FenetreDeLobby fenetreDeLobby) {
		this.fenetreDeLobby = fenetreDeLobby;
	}

	public FenetreDeConnexion getFenetreDeConnexion() {
		return fenetreDeConnexion;
	}

	public void setFenetreDeConnexion(FenetreDeConnexion fenetreDeConnexion) {
		this.fenetreDeConnexion = fenetreDeConnexion;
	}

	public FenetreAttenteDeLancementDePartie getFenetreAttenteDeLancementDePartie() {
		return fenetreAttenteDeLancementDePartie;
	}

	public void setFenetreAttenteDeLancementDePartie(FenetreAttenteDeLancementDePartie fenetreAttenteDeLancementDePartie) {
		this.fenetreAttenteDeLancementDePartie = fenetreAttenteDeLancementDePartie;
	}

	public String getFENETREDELOBBY() {
		return FENETREDELOBBY;
	}

	public String getFENETREDECONNEXION() {
		return FENETREDECONNEXION;
	}

	public String getFENETREATTENTEDELANCEMENTDEPARTIE() {
		return FENETREATTENTEDELANCEMENTDEPARTIE;
	}

	public FenetreEjection getFenetreEjection() {
		return fenetreEjection;
	}

	public void setFenetreEjection(FenetreEjection fenetreEjection) {
		this.fenetreEjection = fenetreEjection;
	}

	public FenetreDeJeu getFenetreDeJeu() {
		return fenetreDeJeu;
	}

	public void setFenetreDeJeu(FenetreDeJeu fenetreDeJeu) {
		this.fenetreDeJeu = fenetreDeJeu;
	}

	public String getFENETREEJECTION() {
		return FENETREEJECTION;
	}

	public String getFENETREDEJEU() {
		return FENETREDEJEU;
	}
	
}
