
public class Note {

	private Matiere m;
	private float valeur;
	private float coeff;
	
	public void setValeur(float v){
		this.valeur = v;
	}
	
	public void setCoeff(float s){
		this.coeff = s;
	}
	
	public float getCoeff(){
		return this.coeff;
	}
	
	public void setMatiere(Matiere m){
		this.m = m;
	}
	
	public float getValeur(){
		return this.valeur;
	}
	
	public Matiere getMatiere(){
		return this.m;
	}
	
	public Note(Matiere m, float v){
		this.m = m;
		this.valeur = v;
	}
	
	public String toString(){
		return " matiere"+this.getMatiere().toString() +" valeur:" + this.getValeur()+" coeff:"+this.getCoeff();
	}
	
	
	
	
	
	
	
	
	
}
