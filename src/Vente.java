public class Vente {
	private Article article;
	private int quantite;
	private float prixR;

	public Vente(String nom, int q) {
		this.article = Stock.trouverArticleNom(nom);
		this.quantite = q;
		this.prixR = this.quantite * this.article.getPrixV();
	}

	public Article getArticle() {
		return article;
	}

	public void setArticle(Article article) {
		this.article = article;
	}
	
	public int getQuantite() {
		return quantite;
	}

	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}

	public float getPrixR() {
		return prixR;
	}

	public void setPrixR(float prixR) {
		this.prixR = prixR;
	}

	@Override
	public String toString() {
		return "Vente [article=" + article + ", quantite=" + quantite + ", prixR=" + prixR + "]";
	}

	// private HashMap<Article,Integer> article; //mettre en HashMap
	// private Article a;
	// private Client c;
	// private static int ref=0;
	//
	//
	// public Vente(Article a1, Client c1){
	// this.article = new HashMap<Article, Integer>();
	// this.a=a1;
	// this.c=c1;
	// Vente.ref++;
	// }
	//
	// // get set
	// public Article getA() {
	// return a;
	// }
	//
	// public void setA(Article a) {
	// this.a = a;
	// }
	//
	// public Client getC() {
	// return c;
	// }
	//
	// public void setC(Client c) {
	// this.c = c;
	// }
	//
	// public static int getRef() {
	// return ref;
	// }
	//
	// public static void setRef(int ref) {
	// Vente.ref = ref;
	// }
	//
	// public HashMap<Article,Integer> getArticle() {
	// return article;
	// }
	//
	// public void setArticle(HashMap<Article,Integer> article) {
	// this.article = article;
	// }
	//
	//
	// //methode
	// public void saisir_Article(Article a, int quantite)
	// {
	// this.article.put(a, quantite);
	// }
	//
	// public void modifier_quantite(Article a,int quantite){
	//
	//
	// }
	//
	// public int recuperer_article( a)
	// {
	// return this.article.get(a);
	// }
	// public void ajoutArticle(Article art, int quantite){
	//
	// if (art!=null && quantite>0){
	// article.put(art,quantite);
	// }
	//
	// }
	//
	// public void ajouterArticle(String nom, int quantite){
	// if (nom!=null && quantite>0){
	// if (Stock.existeArticleNom(nom)){
	// System.out.println("L'article existe deja");
	// if (enleverQuantite(nom,quantite)>0){
	// ajoutArticle(Stock.trouverArticleNom(nom),quantite);
	// }else{
	// System.out.println("Il n'y a pas assez d'article dans le stock");
	// }
	// }
	// }
	// }
	//
	// public int enleverQuantite(String nom,int nombre){
	// int b=-1;
	// if (nombre>0){
	// if(Stock.existeArticleNom(nom)){
	// int a= Stock.trouverArticleNom(nom).getQuantite();
	// b=a-nombre;
	// }
	// }
	// return b;
	// }
	//
	// public void supprimer_Article(Article a)
	// {
	// this.article.remove(a);
	// }
	//
	//
	// //AFFICHE
	// public void aff(Client c, Date date, SimpleDateFormat formater){
	// System.out.println("--- VENTE DU CLIENT: Mme/Mr "+c+"
	// "+formater.format(date)+" ---\n"); //voir le type date
	// System.out.println("Article"+" | "+"r�f�rence"+" | "+"prix � l'unit� en
	// euros"+" | "+"quantite");
	// System.out.println("-------------------------------------------------------------");
	// }
	//
	// public void affiche(Article a,Vente v){
	// System.out.println(a+" "+v.recuperer_article(a));
	// }
	//
	// // programme
	// public static void main(String [] args) throws IOException{
	// SimpleDateFormat formater = null;
	// Date date = new Date();
	// formater = new SimpleDateFormat("'le' dd/MM/yyyy '�' HH:mm:ss");
	// Article a1 = new Article("tomates",1110,0.55);
	// Article a2 = new Article("Play 4s",1111,299.99);
	// Article a3 = new Article("Xbox 3",1112,399.99);
	// Client c1 = new Client("AMICEL","Yoann");
	// Vente v1 = new Vente(a1,c1);
	// v1.saisir_Article(a1,10);
	// Vente v2 = new Vente(a2,c1);
	// v2.saisir_Article(a2,1);
	// Vente v3 = new Vente(a3,c1);
	// v3.saisir_Article(a3,1);
	// v1.aff(c1, date, formater );
	// v1.affiche(a1,v1);
	// v2.affiche(a2,v2);
	// v3.affiche(a3,v3);
	// }
}