

public class Test {
	
	public static void main(String[] args) {
	Article a = new Article("sucre", 200, false);	
	//a.affiche();
	Article b = new Article("lait", 100, true);
	Article dd = new Article("sous", 100, true);
	//b.affiche();
	Achat prd1= new Achat(b, 9);
	Achat prd2= new Achat(a, 3);
	Achat prd3 = new Achat(dd, 2);
	//prd1.calc();
	
	Chariot cc = new  Chariot();
	cc.addAchat(prd1);
	cc.addAchat(prd2);
	cc.addAchat(prd3);
	Caisse bb = new Caisse(cc);
	bb.montantTotal();
	
	}
	
	
}
