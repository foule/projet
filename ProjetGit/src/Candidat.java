import java.util.ArrayList;


public class Candidat {
	
	private String nom;

	private ArrayList<Float> notes;

	public ArrayList<Float> getNotes(){
		return this.notes;
	}
	
	public void setNotes(ArrayList<Float> c){
		this.notes = c;
	}
	
	public float calculeMoyenne(){
		int i = 0;
		float s = 0 ;
		while(i<this.getNotes().size()){
			s = s + this.getNotes().get(i);
			i = i + 1;
		}
		s = s / this.getNotes().size();
		return s;
	}
	
	public float noteMin(){
		int i = 0;
		float min = this.getNotes().get(i) ;
		while(i<this.getNotes().size()){
			if(this.getNotes().get(i) < min){
				min = this.getNotes().get(i);
			}
			i = i + 1;
		}
		return min;
	}
	
	public float noteMax(){
		int i = 0;
		float max = this.getNotes().get(i) ;
		while(i<this.getNotes().size()){
			if(this.getNotes().get(i) > max){
				max = this.getNotes().get(i);
			}
			i = i + 1;
		}
		return max;
	}
	
	public Candidat(){
		this.notes = new ArrayList<Float>();
		this.nom = "Default";
	}
	
	public Candidat(String s){
		this.notes = new ArrayList<Float>();
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
