import java.util.ArrayList;


public class Candidat {
	
	private String nom;

	private ArrayList<Note> notes;
	

	public ArrayList<Note> getNotes(){
		return this.notes;
	}
	
	public void setNotes(ArrayList<Note> c){
		this.notes = c;
	}
	
	public float calculeMoyenne(Matiere m){
		int i = 0;
		float s = 0;
		float sc = 0;
		while(i<this.getNotes().size()){
			if(this.getNotes().get(i).getMatiere().getNom() == m.getNom()){
				s = s+(this.getNotes().get(i).getValeur()*this.getNotes().get(i).getCoeff());
				sc = sc+this.getNotes().get(i).getCoeff();
			}
			i = i + 1;
		}
		s= s / sc;
		return s;
	}
	
	public Note noteMin(Matiere m){
		int i = 0;
		Note min = this.getNotes().get(i) ;
		while(i<this.getNotes().size()){
			if(this.getNotes().get(i).getValeur() < min.getValeur() && this.getNotes().get(i).getMatiere().getNom() == m.getNom()){
				min = this.getNotes().get(i);
			}
			i = i + 1;
		}
		return min;
	}
	
	public Note noteMax(Matiere m){
		int i = 0;
		Note max = this.getNotes().get(i) ;
		while(i<this.getNotes().size()){
			if(this.getNotes().get(i).getValeur() > max.getValeur() && this.getNotes().get(i).getMatiere().getNom() == m.getNom()){
				max = this.getNotes().get(i);
			}
			i = i + 1;
		}
		return max;
	}
	
	public ArrayList<Note> getNote(){
		return this.notes;
	}
	
	public Candidat(){
		this.notes = new ArrayList<Note>();
		this.nom = "Default";
	}
	
	public Candidat(String s){
		this.notes = new ArrayList<Note>();
		this.nom = s;
	}
	
	public void setNom(String s){
		this.nom =s;
	}
	
	public String getNom(){
		return this.nom;
	}
	
	public String toString(){
		String s = this.getNom();
		int i = 0;
		while(i<this.getNotes().size()){
			s = s +" "+ this.getNotes().get(i);
			i=i+1;
		}
		return s;
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
