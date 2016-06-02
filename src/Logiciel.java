import java.awt.Image;
import java.awt.Window;
import java.awt.image.BufferedImage;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.swing.JFrame;

public class Logiciel {
	private static String title = "StockFlow -";
	private static String companyname;
	private static String name;
	private static String surname;
	private static Image logo;
	private static Image user;
	private static Intro fen1 = new Intro(title + " " + "Première connexion : Etape 1 - Création de l'entreprise");
	private static IntroNext fen2 = new IntroNext(
			title + " " + "Première connexion : Etape 2 - Création de l'utilisateur");
	private static IntroFinal fen3 = new IntroFinal(
			title + " " + "Première connexion : Etape 3 - Résumé de la configuration");
	private static Tableaudebord fen4 = new Tableaudebord(
			title + " Entreprise" + Logiciel.getCompanyname() + " - Tableau de Bord");
	private static Parametres fen5 = new Parametres(
			title + " Entreprise" + Logiciel.getCompanyname() + " - Paramètres");
	private static ClientsW fen6 = new ClientsW(
			title + " Entreprise" + Logiciel.getCompanyname() + " - Gestion des Clients");
	private static StockW fen7 = new StockW(title + " Entreprise" + Logiciel.getCompanyname() + " - Gestion du Stock");
	private static VentesW fen8 = new VentesW(
			title + " Entreprise" + Logiciel.getCompanyname() + " - Gestion des ventes");

	public static Image getLogo() {
		return logo;
	}

	public static Image getUser() {
		return user;
	}

	public static String getCompanyname() {
		return companyname;
	}

	public static String getName() {
		return name;

	}

	public static String getSurname() {
		return surname;

	}

	public static void setLogo(BufferedImage logo) {
		Logiciel.logo = logo;
	}

	public static void setUser(BufferedImage user) {
		Logiciel.user = user;
	}

	public static void setName(String n) {
		Logiciel.name = n;

	}

	public static void setSurname(String n) {
		Logiciel.surname = n;

	}

	public static void setCompanyname(String companyname) {
		Logiciel.companyname = companyname;
	}

	// Méthodes pour les fenêtres
	public static void show(JFrame j, boolean g) {
		j.setVisible(g);
	}

	public static Intro getFen1() {
		return fen1;
	}

	public static IntroNext getFen2() {
		return fen2;
	}

	public static IntroFinal getFen3() {
		return fen3;
	}

	public static Tableaudebord getFen4() {
		return fen4;
	}

	public static Parametres getFen5() {
		return fen5;
	}

	public static ClientsW getFen6() {
		return fen6;
	}

	public static StockW getFen7() {
		return fen7;
	}

	public static VentesW getFen8() {
		return fen8;
	}

	public static void Show(Intro j) {
		j.setLocationRelativeTo(null);
		j.createWindow();
		j.setVisible(true);
		Window[] listefenetres = Window.getWindows();
		for (int i = 0; i < listefenetres.length; i++) {
			if (listefenetres[i].isVisible() && (!listefenetres[i].equals(j))) {
				listefenetres[i].setVisible(false);
			}

		}
	}

	public static void Show(IntroNext j) {
		j.setLocationRelativeTo(null);
		j.createWindow();
		j.setVisible(true);
		Window[] listefenetres = Window.getWindows();
		for (int i = 0; i < listefenetres.length; i++) {
			if (listefenetres[i].isVisible() && (!listefenetres[i].equals(j))) {
				listefenetres[i].setVisible(false);
			}

		}
	}

	public static void Show(IntroFinal j) {
		j.setLocationRelativeTo(null);
		j.createWindow();
		j.setVisible(true);
		Window[] listefenetres = Window.getWindows();
		for (int i = 0; i < listefenetres.length; i++) {
			if (listefenetres[i].isVisible() && (!listefenetres[i].equals(j))) {
				listefenetres[i].setVisible(false);
			}

		}
	}

	public static void Show(Tableaudebord j) {
		j.setTitle(title + " Entreprise" + Logiciel.getCompanyname() + " - Tableau de Bord");
		j.setLocationRelativeTo(null);
		j.createWindow();
		j.setVisible(true);
		Window[] listefenetres = Window.getWindows();
		for (int i = 0; i < listefenetres.length; i++) {
			if (listefenetres[i].isVisible() && (!listefenetres[i].equals(j))) {
				listefenetres[i].setVisible(false);
			}

		}
	}

	public static void Show(StockW j) {
		j.setTitle(title + " Entreprise" + Logiciel.getCompanyname() + " - Gestion du stock");
		j.setLocationRelativeTo(null);
		j.createWindow();
		j.setVisible(true);
		Window[] listefenetres = Window.getWindows();
		for (int i = 0; i < listefenetres.length; i++) {
			if (listefenetres[i].isVisible() && (!listefenetres[i].equals(j))) {
				listefenetres[i].setVisible(false);
			}

		}
	}
	
	public static void Show2(StockW j) {
		j.setTitle(title + " Entreprise" + Logiciel.getCompanyname() + " - Gestion du stock");
		j.setLocationRelativeTo(null);
		j.createWindow();
		j.setVisible(true);
		Window[] listefenetres = Window.getWindows();
		for (int i = 0; i < listefenetres.length; i++) {
			if (listefenetres[i].isVisible()){
				listefenetres[i].setVisible(false);
			}

		}
		j.setVisible(true);
	}
	
	public static void Show(ClientsW j) {
		j.setTitle(title + " Entreprise" + Logiciel.getCompanyname() + " - Gestion des clients");
		j.setLocationRelativeTo(null);
		j.createWindow();
		j.setVisible(true);
		Window[] listefenetres = Window.getWindows();
		for (int i = 0; i < listefenetres.length; i++) {
			if (listefenetres[i].isVisible() && (!listefenetres[i].equals(j))) {
				listefenetres[i].setVisible(false);
			}

		}
	}

	public static void Show(VentesW j) {
		j.setTitle(title + " Entreprise" + Logiciel.getCompanyname() + " - Gestion des ventes");
		j.setLocationRelativeTo(null);
		j.createWindow();
		j.setVisible(true);
		Window[] listefenetres = Window.getWindows();
		for (int i = 0; i < listefenetres.length; i++) {
			if (listefenetres[i].isVisible() && (!listefenetres[i].equals(j))) {
				listefenetres[i].setVisible(false);
			}

		}
	}

	public static void Show(Parametres j) {
		j.setTitle(title + " Entreprise" + Logiciel.getCompanyname() + " - Paramètres");
		j.setLocationRelativeTo(null);
		j.createWindow();
		j.setVisible(true);
		Window[] listefenetres = Window.getWindows();
		for (int i = 0; i < listefenetres.length; i++) {
			if (listefenetres[i].isVisible() && (!listefenetres[i].equals(j))) {
				listefenetres[i].setVisible(false);
			}

		}
	}

	



		//Stock.ouvrirFichier();

	public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException, IOException {
		// //Lors d'une première connexion




		//
//		Article ps4=new Article("ps4",10,270,300);
//		Stock.ajouterArticle(ps4);
//		Article xbox=new Article("xbox",18,350,400);
//		Stock.ajouterArticle(xbox);
//		Article pomme=new Article("pomme",124,3,7);
//		Stock.ajouterArticle(pomme);
//		Article ordinateur=new Article("ordinateur",5,750,1000);
//		Stock.ajouterArticle(ordinateur);
//		Article iphone=new Article("iphone",50,600,620);
//		Stock.ajouterArticle(iphone);
////		
//	Stock.enregistrer();
		
//		
//		Stock.ouvrirFichier();
		
		
		
		
		
		Stock.ouvrirFichier();
		Stock.listerArticle();
		
		Logiciel.Show(fen7);

		//
		// // Pour le test du tableau de bord
		//
		// Logiciel.setCompanyname(" Apple");
		// Logiciel.setName("Steve");
		// try {
		// UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
		// BufferedImage img1 = ImageIO.read(new
		// File("/Users/atouine/Desktop/Unknown.jpeg"));
		// BufferedImage img = ImageIO.read(new
		// File("/Users/atouine/Desktop/logo.png"));
		// Logiciel.setLogo(img);
		// Logiciel.setUser(img1);
		// } catch (Exception e) {
		// System.err.println("Logo introuvable");
		// }
		// Logiciel.Show(fen4);
	}
}