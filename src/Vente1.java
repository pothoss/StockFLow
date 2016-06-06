import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;

public class Vente1{
	
	private Client client;
	private static int ref=0; 
	static ArrayList<Vente> listeArticles;
	private Date date;
	private double total;
	
	
	public Vente1(Client c){
		
		this.client=c;
		ref++;
		this.date = new Date(); 
		Ventes.ajoutVente(this);
		this.listeArticles =new ArrayList<Vente>();
		total=0;
	}
	
	// --------------GETTER ET SETTER-------------------
	

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public int getRef() {
		return ref;
	}

	public void setRef(int ref) {
		Vente1.ref = ref;
	}
	
	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}	
	
	@Override
	public String toString() {
		return "Vente1 [client=" + client + ", listeArticles=" + listeArticles + ", date=" + date + "]";
	}

	
	
	//--------------------Methodes d'ajout d'articles ----------------------

	public void ajoutVente1(String n, int q) throws IOException{
		System.out.println("Entrez le nom de l'article , '*' POUR ARRETER");
		String nom = n;
		while(!nom.equals("*")){
			System.out.println("Entrez la quantite de l'article");
			int quantite=q;
			if (nom!=null && quantite>0){
				if(Stock.existeArticleNom(nom)){
					if( Stock.verificationQuantite(nom, quantite)){
						Vente v = new Vente(nom,quantite);
						listeArticles.add(v);
					}
				}else{
					System.out.println("Cette article n'existe pas");
				}
			}
			System.out.println("Entrez le nom de l'article , '*' POUR ARRETER");
			nom = n;
		}
	}
	public void ajoutVente(String nom,int quantite) throws IOException{
		if (nom!=null && quantite>0){
			if(Stock.existeArticleNom(nom)){
				Vente v = new Vente(nom,quantite);
				listeArticles.add(v);
			}
		}
	}
	
	public void afficherTotal(){
		for (int i=0;i<this.listeArticles.size();i++){
			this.total=total+this.listeArticles.get(i).getPrixR();
		}
		System.out.println("Le prix total est de: "+total+" euros");
	}

//	public void ajouterArticle(Article a,int quantite){
//		if (a!=null && quantite>0){
//			if(!this.recapVente.containsKey(a)){
//				ajoutVente(a,quantite);
//			}
//		}		
//	}

	//-----------------Lister les article vendu ----------
	
	public void listerArtVendu(){
		for(int i=0;i<listeArticles.size();i++){
			System.out.println((i+1)+" "+this.listeArticles.get(i));
		}
	}

	
	
//	// programme
//	public static void main(String [] args) throws IOException{
//		Date date = new Date();
//		formater = new SimpleDateFormat("'le' dd/MM/yyyy '�' HH:mm:ss");
//		Article a1 = new Article("tomates","type",10,0.55,0,70);
//		Article a2 = new Article("Play 4s",1111,299.99);
//		Article a3 = new Article("Xbox  3",1112,399.99);
//		Client c1 = new Client("AMICEL","Yoann");		
//		Vente v1 = new Vente(a1,c1);
//		v1.saisir_Article(a1,10);
//		Vente v2 = new Vente(a2,c1);
//		v2.saisir_Article(a2,1);
//		Vente v3 = new Vente(a3,c1);
//		v3.saisir_Article(a3,1);
//		v1.aff(c1, date, formater );
//		v1.affiche(a1,v1);
//		v2.affiche(a2,v2);
//		v3.affiche(a3,v3);	
//	}
}
