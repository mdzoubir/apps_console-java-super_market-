public class Achat {
	private Article article;
	private int qt;
	
	
	public Achat(Article article, int qt) {
		this.article = article;
		this.qt = qt;
	}
	
	
	public Article getArticle() {
		return article;
	}
	public void setArticle(Article article) {
		this.article = article;
	}
	public int getQt() {
		return qt;
	}
	public void setQt(int qt) {
		this.qt = qt;
	}
	
	
	
}
