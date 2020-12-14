
import java.util.*;
public class Caisse {
	private Chariot finalAchat;
	private String numeroDeCaisse = UUID.randomUUID().toString();
	String d;
	
	public Caisse(Chariot achats) {
		this.finalAchat = achats;
		Date date = new Date();
		this.d = date.toString();
	}
	
	
	public double montantTotal(){
		double total = 0;
		System.out.println(numeroDeCaisse);
		System.out.println(d);
		for(Achat n : finalAchat.chario){
			double prixTotalProduit;
			
			if(n.getArticle().getSolde()>0){
				double solde = n.getArticle().getSolde()/100;
				double prix = n.getArticle().getPrix() * n.getQt();
				prixTotalProduit= prix - (prix*solde);
			}else{
				prixTotalProduit=n.getArticle().getPrix() * n.getQt();
			}
			
			
			System.out.println(n.getArticle().getNom()+ " : " + n.getQt()+ " x "  + n.getArticle().getPrix() 
			+ " = "+ (prixTotalProduit)+ " dh " +(n.getArticle().getSolde() > 0?"(en solde)": ""));
			total += n.getQt() * n.getArticle().getPrix();
			
			
		}
		System.out.println("total = " + total + "dh");
		return total;
		
	}
	
}

