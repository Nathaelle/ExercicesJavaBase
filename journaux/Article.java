package journaux;

import java.util.Date;

public class Article {

	private Date date;
	private String titre;
	private String sujet;
	private String contenu;
	
	public Article(String titre, String sujet, String contenu) {
		super();
		this.date = new Date();
		this.titre = titre;
		this.sujet = sujet;
		this.contenu = contenu;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getSujet() {
		return sujet;
	}

	public void setSujet(String sujet) {
		this.sujet = sujet;
	}

	public String getContenu() {
		return contenu;
	}

	public void setContenu(String contenu) {
		this.contenu = contenu;
	}

	@Override
	public String toString() {
		return "Article [date=" + date.getDate() + "/" + date.getMonth() + "/" + date.getYear() + ", titre=" + titre + ", sujet=" + sujet + ", contenu=" + contenu + "]";
	}
	
	
	
}
