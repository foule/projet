
public class Din {
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
}
