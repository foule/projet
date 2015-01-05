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
	
	public float calculeMoyenne(){
		int i = 0;
		float s = 0 ;
		while(i<this.getNotes().size()){
			s = s +( this.getNotes().get(i).getValeur()*this.getNotes().get(i).getCoeff());
			i = i + 1;
		}
		s = s / this.getNotes().size();
		return s;
	}
	
	public Note noteMin(){
		int i = 0;
		Note min = this.getNotes().get(i) ;
		while(i<this.getNotes().size()){
			if(this.getNotes().get(i).getValeur() < min.getValeur()){
				min = this.getNotes().get(i);
			}
			i = i + 1;
		}
		return min;
	}
	
	public Note noteMax(){
		int i = 0;
		Note max = this.getNote().get(i);
		while(i<this.getNotes().size()){
			if(this.getNotes().get(i).getValeur() > max.getValeur()){
				max.setValeur((float)this.getNotes().get(i).getValeur());
			}
			i = i + 1;
		}
		return max;
	}
	
	
	
	public float variance(){
		
		float variance = 0;
		int i = 0;
		while(i<this.getNotes().size()){
			variance = variance + (this.getNotes().get(i)*this.getNotes().get(i));
			i = i + 1;
		}
		variance = variance/this.getNotes().size();
		
		return variance;
	}
	
	public float ecartType(){
		float ecart = 0;
		int i = 0;
		while(i<this.getNotes().size()){
			ecart = ecart + (this.getNotes().get(i)*this.getNotes().get(i));
			i = i + 1;
		}
		ecart = ecart/this.getNotes().size();
		ecart = (float) Math.sqrt(ecart);
		
		return ecart;
		
	}
	
	
	public ArrayList<Note> getNote(){
		return this.notes;
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
