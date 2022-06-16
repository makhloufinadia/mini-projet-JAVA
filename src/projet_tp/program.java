package projet_tp;

import java.util.Scanner;
public class program {

	public static void main(String[] args) {
		
		
		
		int number =1;
		
		while (number>0 && number<8) {
			
			System.out.println("bonjour!!vous voulez faire quoi exactement?");
			System.out.println("1-ajouter une medias\n");
			System.out.println("2-modifier medias\n");
			System.out.println("3-supprimer mediass\n");
			System.out.println("4-ajouter un adherant\n");
			System.out.println("5-modifier un adherant\n");
			System.out.println("entrez le numero de votre choix:\n");
			
			Scanner sc = new Scanner(System.in);
				number = sc.nextInt();
				
				
		switch  (number) {
		 case 1:
		 	
		System.out.println("donner le nom du medias");
		Scanner s = new Scanner (System.in);
		String nom = s.nextLine();
		System.out.println("donner la quota du media:");
	    Scanner c=new Scanner(System.in);
		String quota = c.nextLine();
		System.out.println("donner le nombre des ouvrages:");
		Scanner n = new Scanner (System.in);
		int nombre = n.nextInt();
		  medias media = new medias( nom, quota);
		 media.ajoutermedias();
		 break;
		 case 2:
			 medias m = new medias();
		  m.modifiermedias();
		 break;
		 
		 case 3: 
			 medias me = new medias();
			 System.out.println("donner le nom du livre");
			 nom = sc.nextLine();
			 me.supprimermedias(nom);
		 break;
		 /*case 4: ajouter adherant;
		 break;
		 case 5: supprimer adherant;

		 break;
		 case 6:modifier adherant;
		 break;
		 case 7: liste noir;
		 break;
		 
		 case 8: exit();*/
		}
		} 
		
		// TODO Auto-generated method stub
		
		
		
		
		
		
		

	}

}
