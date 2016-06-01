import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Stock {
	static public ArrayList<Article> mesArticle = new ArrayList<Article>();

	public Stock() {

	}

	// -----------------------Creer un Article---------------------------

	// TODO Dépendance avec la classe saisir
	// static public void creerUnArticle() throws IOException{
	// Article a;
	// System.out.println("Entrez le nom de L'article");
	// String nom = Saisir.chaine();
	// if (!Stock.existeArticleNom(nom)){
	// a = new Article(nom);
	// Stock.ajouterArticle(a);
	// System.out.println("L'article a �t� cr�� ");
	// }else{
	// System.out.println("Cette article existe deja!");
	// }
	// }

	/*---------------Ajouter Article---------------*/

	static public void ajoutArticle(Article a) {
		if (a != null) {
			mesArticle.add(a);
		}
	}

	/*------------------enlever article--------------------*/

	static public void enleveArticle(Article a) {
		if (a != null) {
			mesArticle.remove(a);
		}
	}

	// ajouter un article
	// TODO dépendance avec la classe saisir
	 static public void ajouterArticle(Article a){
		 if (!existeArticle(a)){
		 ajoutArticle(a);
		 }else{
		 System.out.println("le Stock contient deja cette article combien voulez vous en rajouter");
		 }
	 }

	// enlever un article

	static public void enleverArticle(Article a) {
		if (a != null) {
			if (existeArticle(a)) {
				enleveArticle(a);
			} else {
				System.out.println("Le Stock ne contient pas cette d'article");
			}
		}
	}
	static  List<Article> trisurNOM(){
		List<Article> tmp= Stock.mesArticle; 
		Collections.sort(tmp, new Comparator<Article>() {
	@Override
			public int compare(Article p1,  Article p2) {
			if ( p1==null){
			  if(p2!=null) return -1;
		        }
		        if (p2==null) return 1;
			int result= p1.getNom().compareTo(p2.getNom());
			return result;
		 }
		});	
		
		for (int i=0;i< tmp.size();i++){
			System.out.println(tmp.get(i));
		}
		return tmp;
	}
	
	static  List<Article> trisurRef(){
		List<Article> tmp= Stock.mesArticle; 
		Collections.sort(tmp, new Comparator<Article>() {
	@Override
			public int compare(Article p1,  Article p2) {
			if ( p1==null){
			  if(p2!=null) return -1;
		        }
		        if (p2==null) return 1;
			int result= p1.getReference() - p2.getReference();
			return result;
		 }
		});	
		
		for (int i=0;i< tmp.size();i++){
			System.out.println(tmp.get(i));
		}
		return tmp;
	}


	/**
	 * ----------algo de recherche pour remplacer le mesArticle.contains(a)
	 * -----------
	 */

	static public boolean existeArticle(Article a) {
		int i = 0;
		boolean trouve = false;
		if (a != null) {
			while (i < mesArticle.size() && !trouve) {
				if (a.getNom().equals(mesArticle.get(i).getNom())) {
					trouve = true;
				}
				i++;
			}
		}
		return trouve;
	}

	/*---------------Algo de recherche qui retourne un article ------------*/
	static public Article rechercherArticle2(Article a) {
		int i = 0;
		boolean trouve = false;
		Article art;
		art = null;
		while (i < mesArticle.size() && !trouve) {
			if (a.equals(mesArticle.get(i))) {
				trouve = true;
				art = mesArticle.get(i);
			}
			i++;
		}
		return art;
	}

	/**
	 * ----------rechercher si un article existe ou pas en focntion du nom
	 * -----------
	 */

	static public boolean existeArticleNom(String nom) {
		int i = 0;
		boolean trouve = false;
		while (i < mesArticle.size() && !trouve) {
			if (nom.equals(mesArticle.get(i).getNom())) {
				trouve = true;
			}
			i++;
		}
		return trouve;
	}

	/* ----------trouver un article en fonction du nom ------------ */

	static public Article trouverArticleNom(String nom) {
		int i = 0;
		boolean trouve = false;
		Article art = null;
		while (i < mesArticle.size() && !trouve) {
			if (nom.equals(mesArticle.get(i).getNom())) {
				trouve = true;
				art = mesArticle.get(i);
			}
			i++;
		}
		return art;
	}

	/**
	 * ---------------Trouver un article en fonction de la
	 * reference-----------------
	 */

	static public Article trouverArticleRef(int r) {
		int i = 0;
		boolean trouve = false;
		Article art = null;
		while (i < mesArticle.size() && !trouve) {
			if (r == mesArticle.get(i).getReference()) {
				trouve = true;
				art = mesArticle.get(i);
			}
			i++;
		}
		return art;
	}

	// ---------------------Verification de la quantite dans le stock d'article
	// correspondant : EXEMPLE si on veut acheter 140 pomme alors qu'il y en a
	// que 100 c'est inpossible --------------

	static public boolean verificationQuantite(String nom, int nombre) {
		boolean trouve = false;
		if (Stock.existeArticleNom(nom)) {
			Article art = Stock.trouverArticleNom(nom);
			if (art.getQuantite() - nombre >= 0) {
				trouve = true;
			} else {
				System.out.println("il n'y a pas assez de " + nom + " dans le stock");
			}
		}
		return trouve;
	}

	/*** ---------tu sais lire !!! ------------ */
	static public void listerArticle() {
		for (int i = 0; i < mesArticle.size(); i++) {
			System.out.println(mesArticle.get(i));
		}
	}

	// ---------------Trouver la reference ------------------

	static public int trouverReference() {
		int x = 0;
		for (int i = 0; i < mesArticle.size(); i++) {
			if (mesArticle.get(i).getReference() > x) {
				x = mesArticle.get(i).getReference();
			}
		}
		return x;
	}
	
	static public void ouvrirFichier() throws FileNotFoundException, IOException, ClassNotFoundException{
		File fichierArticle = new File("article.txt");

		ObjectInputStream ouverture = new ObjectInputStream(new FileInputStream(fichierArticle)); // attention, tu peux avoir des erreurs s'il ne trouve pas le fichier,
	 //donc fais attention au nom que tu lui donne et le chemin aussi, si tu vas dans 
	 // d'autres dossier. 
		@SuppressWarnings("unchecked")
		ArrayList<Article> tabFichier= (ArrayList<Article>) ouverture.readObject(); // On est oblig� de caster ce qu'il retourne
		Stock.mesArticle=tabFichier;	// 	Je sais pas pourquoi mais c'est comme �a ;)
		ouverture.close();
	}

	
	static public void enregistrer() throws FileNotFoundException, IOException, ClassNotFoundException{
		
		File fichierArticle = new File("article.txt");
		ObjectOutputStream enregistreArticle = new ObjectOutputStream(new FileOutputStream(fichierArticle));
		ArrayList<Article> tabFichier = Stock.mesArticle;
		enregistreArticle.writeObject(tabFichier);
		enregistreArticle.close();
	}
	public class Erreur extends Exception {
		/**
		 *
		 */
		private static final long serialVersionUID = 1L;

		public Erreur() {
			super();
		}
	}

}
