
import java.io.IOException;
import java.io.Serializable;

public class Article implements Serializable {

	private static final long serialVersionUID = 1L;//-
	private String nom;
	private int maReference;
	static private int ref;
	private String type;
	private int quantite;
	private float prixV, prixA;

	public Article(String nom, int quantite, float prixA, float prixV) throws IOException {
		super();
		this.nom = nom;
		ref = Stock.mesArticle.size();
		Article.ref++;
		this.maReference = ref;
		this.quantite = quantite;
		this.prixA = prixA;
		this.prixV = prixV;
	}

	/*--------------------Getter et setter-----------------*/
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getReference() {
		return maReference;
	}
	public static int getRef() {
		return ref;
	}

	public void setReference(int reference) {
		this.maReference = reference;
	}

	public int getQuantite() {
		return quantite;
	}

	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}

	public float getPrixA() {
		return prixA;
	}

	public void setPrix(float prixA) {
		this.prixA = prixA;
	}

	public float getPrixV() {
		return prixV;
	}

	public void setPrixV(float prixV) {
		this.prixV = prixV;
	}

	/*-------------------Ajout et enleve article -----------------------*/

	@Override
	public String toString() {
		return "Article [nom=" + nom + ", maReference=" + maReference + ", type=" + type + ", quantite=" + quantite
				+ ", prixA=" + prixA + ", prixV=" + prixV + "]";
	}

	public void ajouterQuantiteStock(int nombre) {
		this.quantite = this.quantite + nombre;
	}

	public void enleverQuantite(int nombre) {
		if (this.quantite - nombre > 0) {
			this.quantite = this.quantite - nombre;
		} else if (this.quantite - nombre == 0) {
			this.quantite = this.quantite - nombre;

			System.out.println("Desormais il n'y a plus de " + this.nom + ". Pensez a reaprovisionner le stock");
		} else {
			System.out
					.println("Impossible d'enlever " + nombre + " " + this.nom + "il n'y a que " + this.getQuantite());
		}
	}
}