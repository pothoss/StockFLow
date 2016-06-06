import java.util.ArrayList;

public class Ventes {
	
	static public ArrayList<Vente1> ventes=new ArrayList<Vente1>();
	
	static public void ajoutVente(Vente1 v){
		if(v!=null){
			ventes.add(v);
		}
		
	}
		
	static public void ajouterVente(Vente1 v){
		ajoutVente(v);
	}
	
	static public void listerVente(){
		for (int i=0;i<ventes.size();i++){
			System.out.println(ventes.get(i));
		}
	}
	
	static public void listerVenteClient(Client c){
		for (int i=0;i<ventes.size();i++){
			if (ventes.get(i).getClient().getMaReference()==c.getMaReference()){
				System.out.println(ventes.get(i));
			}
		}
	}
}
