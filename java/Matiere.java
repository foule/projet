
public class Matiere {

	private String nom;
	private float coeff;
	
	public void setNom(String s){
		this.nom = s;
	}
	
	public void setCoeff(float s){
		this.coeff = s;
	}
	
	public String getNom(){
		return this.nom;
	}
	
	public float getCoeff(){
		return this.coeff;
	}
	
	public Matiere(String s, float c){
		this.nom = s;
		this.coeff = c;
	}
	
	public String toString(){
		return " Nom:"+this.getNom()+" coeff:"+this.getCoeff();
	}

}
