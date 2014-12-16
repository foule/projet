
public class Test {

	public static void main(String[] args) {
		Candidat Din = new Candidat("Din");
		Professeur Amine = new Professeur("Amine");
		Amine.ajouterNote((float)15, Din);
		Amine.ajouterNote((float)10, Din);
		Amine.ajouterNote((float)8, Din);
		Amine.ajouterNote((float)20, Din);
		System.out.println(Din.noteMax());
		System.out.println(Din.noteMin());
		System.out.println(Din.calculeMoyenne());
		System.out.println(Din.toString());
		Candidat Aissa = new Candidat("Aissa");
		Amine.ajouterNote((float)10, Aissa);
		Amine.ajouterNote((float)0, Aissa);
		Amine.ajouterNote((float)15, Aissa);
		Amine.ajouterNote((float)17, Aissa);
		Amine.ajouterNote((float)16, Aissa);
		Amine.ajouterNote((float)2, Aissa);
		Amine.ajouterNote((float)6, Aissa);
		Amine.ajouterNote((float)1, Aissa);
		System.out.println(Aissa.calculeMoyenne());
		
	}

}
