
public class Article {
	private String nom;
	private double prix;
	private double solde;
	public Article(String nom, double prix, double solde) {
		super();
		this.nom = nom;
		this.prix = prix;
		this.solde = solde;
	}
	public Article(String nom, double prix){
		super();
		this.nom = nom;
		this.prix = prix;
		this.solde = 0;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}
	public double getSolde() {
		return solde;
	}
	public void setSolde(int solde) {
		this.solde = solde;
	}
	
	public void affiche(){
		System.out.println(nom+" "+ prix+" " +(this.solde > 0?"en solde": ""));
	}
	//calculer solde
	
}
