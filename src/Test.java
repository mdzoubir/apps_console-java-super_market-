

public class Test {
	
	public static void main(String[] args) {
	Article a = new Article("sucre", 200, 20);	
	//a.affiche();
	Article b = new Article("lait", 100);
	//b.affiche();
	
	Achat prd1= new Achat(b, 9);
	Achat prd2= new Achat(a, 3);
	//prd1.calc();
	
	Chariot cc = new  Chariot();
	cc.addAchat(prd1);
	cc.addAchat(prd2);
	Caisse bb = new Caisse(cc);
	bb.montantTotal();
	
	}
	
	
}
