package projet_tp;

public class livres extends medias {
	private String categorie;
	public void x (String categorie) {
		this.categorie=categorie;
	}
	public livres (String nom,String quota,int nombre) {
		this.nom=nom;
		this.quota=quota;
		nombre++;
	}

}
