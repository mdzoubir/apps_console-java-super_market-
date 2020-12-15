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
			
			if(n.getArticle().getSolde()){
				Scanner scanner = new Scanner(System.in);
				System.out.println("le porsentage de solde : ");
				double solde = scanner.nextDouble();
				double soldeFinal = solde /	100;
				//double solde = n.getArticle().getSolde()/100;
				double prix = n.getArticle().getPrix() * n.getQt();
				prixTotalProduit= prix - (prix*soldeFinal);
				total += prixTotalProduit;
			}
			
			else{
				prixTotalProduit=n.getArticle().getPrix() * n.getQt();
				total += n.getQt() * n.getArticle().getPrix();
			}
			
			
			System.out.println(n.getArticle().getNom()+ " : " + n.getQt()+ " x "  + n.getArticle().getPrix() 
			+ " = "+ (prixTotalProduit)+ " dh " +(n.getArticle().getSolde() ?"(en solde)": ""));
			
			
			
		}
		System.out.println("le prix total = " + total + "dh");
		return total;
		
	}
	
}

