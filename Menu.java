import java.util.Scanner;


public class Menu {
	
	static Candidat Din = new Candidat("Din");
	static Professeur Amine = new Professeur("Amine");
	static Matiere java = new Matiere("Java",(float)2.5);
	static Matiere uml = new Matiere("UMl",(float)1.5);
	/*Note n1 = new Note(java,(float)20,(float)3);
	Note n2 = new Note(java,(float)15,(float)1.5);
	Note n3 = new Note(java,(float)10,(float)1.5);
	Note n4 = new Note(uml,(float)18,(float)3);
	Note n5 = new Note(uml,(float)15,(float)1.5);
	Note n6 = new Note(uml,(float)12.5,(float)1.5);
	Amine.ajouterNote(n1,Din);
	Amine.ajouterNote(n2,Din);
	Amine.ajouterNote(n3,Din);
	Amine.ajouterNote(n4,Din);
	Amine.ajouterNote(n5,Din);
	Amine.ajouterNote(n6,Din);*/

	public static void main(String[] args) {
		Scanner rep = new Scanner(System.in);
		String status,choixC,choixP,choixC2, choixP2, nomC;
		float choixPC,choixPV;
		do{
			System.out.println("Quel est votre status ? \n 1-Professeur \n 2-Candidat\n");
			status = rep.nextLine();
		}while(status.equals("1") && status.equals("2"));
		
		if(status.equals("2")){
			do{
				System.out.println(" Que voulez-vous faire ? \n1-consulter note Max\n 2-consulter note Min\n 3-consulter Moyenne\n");
				choixC = rep.nextLine();
			}while(choixC.equals("1") && choixC.equals("2") && choixC.equals("3"));
			
			if(choixC.equals("1")){
				do{
					System.out.println("Quelle matière ? \n 1- JAVA \n 2- UML\n");
					choixC2 = rep.nextLine();
				}while(!(choixC2.equals("1")) && !(choixC2.equals("2")));
				if(choixC2.equals("1")){
					if(Din.getNotes().size() != 0){
					System.out.println(Din.noteMax(java));}
					else{
						System.out.println("Pas de notes");
					}
			
				}
				else { 
					if(Din.getNotes().size() != 0){
					System.out.println(Din.noteMax(uml));}
					else{
						System.out.println("Pas de notes");
					}
				}
			}
			else if(choixC == "2"){
				do{
					System.out.println("Quelle matière ? \n 1- JAVA \n 2- UML\n");
					choixC2 = rep.nextLine();
				}while(choixC2.equals("1") && choixC2.equals("2"));
				if(choixC2.equals("1")){
					if(Din.getNotes().size() != 0){
					System.out.println(Din.noteMin(java));}
					else{
						System.out.println("Pas de notes");
					}
			
				}
				else { 
					if(Din.getNotes().size() != 0){
						System.out.println(Din.noteMin(uml));}
						else{
							System.out.println("Pas de notes");
						}
					
				}
			}
			else{
				do{
					System.out.println("Quelle matière ? \n 1- JAVA \n 2- UML\n");
					choixC2 = rep.nextLine();
				}while(choixC2.equals("1") && choixC2.equals("2"));
				if(choixC2.equals("1")){
					if(Din.getNotes().size() != 0){
						System.out.println(Din.calculeMoyenne(java));}
						else{
							System.out.println("Pas de notes");
						}
				}
				else { 
					if(Din.getNotes().size() != 0){
					System.out.println(Din.calculeMoyenne(uml));}
					else{
						System.out.println("Pas de notes");
					}
					
				}
			}
		}
		//début de prof
		else{
			do{
				System.out.println(" Que voulez-vous faire ? \n1-Ajouter une note\n 2-consulter les notes\n");
				choixP = rep.nextLine();
			}while(!(choixP.equals("1")) && !(choixP.equals("2")));
			if(choixP.equals("2")){
				do{
					System.out.println("1-consulter note Max\n 2-consulter note Min\n 3-consulter Moyenne\n");
					choixP = rep.nextLine();
				}while(!(choixP.equals("1")) && !(choixP.equals("2")) && !(choixP.equals("3")));
				
				if(choixP.equals("1")){
					do{
						System.out.println("Quelle matière ? \n 1- JAVA \n 2- UML\n");
						choixP2 = rep.nextLine();
					}while(!(choixP2.equals("1")) && !(choixP2.equals("2")));
					if(choixP2.equals("1")){
						if(Din.getNote().size() != 0){
							System.out.println(Amine.noteMax(Din, java));
						}
						else{
							System.out.println("Pas de note");
						}
					}
					else { 
						if(Din.getNote().size() != 0){
							System.out.println(Amine.noteMax(Din, uml));
						}
						else{
							System.out.println("Pas de note");
						}
						
					}
				}
				//fin du "1"
				else if(choixP.equals("2")){
					do{
						System.out.println("Quelle matière ? \n 1- JAVA \n 2- UML\n");
						choixP2 = rep.nextLine();
					}while(!(choixP2.equals("1")) && !(choixP2.equals("2")));
					if(choixP2.equals("1")){
						if(Din.getNote().size() != 0){
							System.out.println(Amine.noteMin(Din, java));
						}
						else{
							System.out.println("Pas de note");
						}
					}
					else { 
						if(Din.getNote().size() != 0){
						System.out.println(Amine.noteMin(Din, uml));
					}
					else{
						System.out.println("Pas de note");
					}
				}
					if(choixP.equals("1")){
						do{
						System.out.println("Dans quelle matière ?\n 1-JAVA \n UML\n");
						choixP2 = rep.nextLine();
						}while(!(choixP2.equals("1")) && !(choixP2.equals("2")));
						if(choixP2.equals("1")){
							System.out.println("Valeur de la note ?");
							choixPV = rep.nextFloat();
							System.out.println("Coeff de la note ?");
							choixPC = rep.nextFloat();
							Note n = new Note(java,choixPV,choixPC);
							Amine.ajouterNote(n, Din);
						}
					}
					
			}
		}
		}}
} /* fin main */