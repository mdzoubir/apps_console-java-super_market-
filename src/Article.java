public class Article {
	private String nom;
	private double prix;
	private boolean solde;
	public Article(String nom, double prix, boolean solde) {
		super();
		this.nom = nom;
		this.prix = prix;
		this.solde = solde;
	}
//	public Article(String nom, double prix){
//		super();
//		this.nom = nom;
//		this.prix = prix;
//	}
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
	public boolean getSolde() {
		return solde;
	}
	public void setSolde(Boolean solde) {
		this.solde = solde;
	}
	
	
}
