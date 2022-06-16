package projet_tp;
import java.util.ArrayList;
import java.util.Scanner;

 public class medias {
	protected String nom;
	
	protected String quota;
	protected static int nombre;
	public medias () {
	}
	public medias(String nom,String quota) {
		this.nom=nom;
		this.quota=quota;
		nombre++;
	}
	
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public String getQuota() {
		return quota;
	}
	public void setQuota(String quota) {
		this.quota = quota;
	}
	public static int getNombre() {
		return nombre;
	}
	
	static ArrayList<medias> medias = new ArrayList<medias>();
	
	
	public void ajoutermedias () {
	
		medias.add(this);
		System.out.println(medias);
	  }
		
	
	public void modifiermedias() {
		System.out.println("Quel est l'element que vous voulez modifier");
		System.out.println("donner le nom du media");
		
		Scanner sc = new Scanner(System.in);
		String nom = sc.nextLine();
		int i = -1;
		for(medias m : medias) {
			if(nom.equals(m.getNom())) {
				i = medias.indexOf(m);
			}
		}
		
		if (i == -1 ) {
			System.out.println("Element n'existe pas !");
		}else {
			System.out.println("Entrz la nouvelle quota :");
			String quota = sc.nextLine();
			
			this.setNom(nom);
			this.setQuota(quota);
			
			medias.set(i, this);
			System.out.println("Modification effectuée!!");
		}
	}
	public void supprimermedias(String nom) {
		
		medias m = new medias();
		m.loadmedia(nom);

		medias.remove(m);
	     System.out.println("la liste des medias après suppression: ");
	     
	    
	}
	
	public void loadmedia(String nom ) {
		int i = -1 ;
		for(medias m : medias) {
			if(nom.equals(m.getNom())) {
				i = medias.indexOf(m);
			}
			
			if(i == -1) {
				System.out.println("Element n'existe pas !");
			}else {
			  m = medias.get(i);
			  this.setNom(m.getNom());
			  this.setQuota(m.getQuota());
			  
			}
		}
	}
	

}

