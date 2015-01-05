
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
	
	public Note(Matiere m, float v, float coef){
		this.m = m;
		this.valeur = v;
		this.coeff = coef;
	}
	
	public String toString(){
		return " Matiere :"+this.getMatiere().toString() +" valeur de la note :" + this.getValeur()+" coeff de la note :"+this.getCoeff();
	}
	
	
	
	
	
	
	
	
	
}
