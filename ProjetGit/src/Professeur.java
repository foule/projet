
public class Professeur {

	private String nom;
	

	public void ajouterNote(Float note, Candidat c){
		c.getNotes().add(note);
	}
	
	public float calculeMoyenne(Candidat c){
		int i = 0;
		float s = 0 ;
		while(i<c.getNotes().size()){
			s = s+c.getNotes().get(i);
			i = i + 1;
		}
		s= s / c.getNotes().size();
		return s;
	}
	
	public float noteMin(Candidat c){
		int i = 0;
		float min = c.getNotes().get(i) ;
		while(i<c.getNotes().size()){
			if(c.getNotes().get(i) < min){
				min = c.getNotes().get(i);
			}
			i = i + 1;
		}
		return min;
	}
	
	public float noteMax(Candidat c){
		int i = 0;
		float max = c.getNotes().get(i) ;
		while(i<c.getNotes().size()){
			if(c.getNotes().get(i) > max){
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
		return this.getNom();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
