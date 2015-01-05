
public class Professeur {

	private String nom;
	

	public void ajouterNote(Note note, Candidat c){
		c.getNotes().add(note);
	}
	
	public float calculeMoyenne(Candidat c,Matiere m){
		int i = 0;
		float s = 0;
		float sc = 0;
		while(i<c.getNotes().size()){
			if(c.getNotes().get(i).getMatiere().getNom() == m.getNom()){
				s = s+(c.getNotes().get(i).getValeur()*c.getNotes().get(i).getCoeff());
				sc = sc+c.getNotes().get(i).getCoeff();
			}
			i = i + 1;
		}
		s= s / sc;
		return s;
	}
	
	public Note noteMin(Candidat c,Matiere m){
		int i = 0;
		Note min = c.getNote().get(i);
		while(i<c.getNotes().size()){
			if(c.getNotes().get(i).getValeur() < min.getValeur() && c.getNote().get(i).getMatiere().getNom() == m.getNom()){
				min = c.getNotes().get(i);
			}
			i = i + 1;
		}
		return min;
	}
	
	public Note noteMax(Candidat c,Matiere m){
		int i = 0;
		Note max = c.getNote().get(i);
		while(i<c.getNotes().size()){
			if(c.getNotes().get(i).getValeur() > max.getValeur() && c.getNote().get(i).getMatiere().getNom() == m.getNom()){
				max = c.getNotes().get(i);
			}
			i = i + 1;
		}
		return max;
	}
	
	public Professeur(){
		this.nom = "Default";
	}
	
	public Professeur(String s){
		this.nom = s;
	}
	
	public void setNom(String s){
		this.nom =s;
	}
	
	public String getNom(){
		return this.nom;
	}
	
	public String toString(){
		return "Nom :"+this.getNom();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
