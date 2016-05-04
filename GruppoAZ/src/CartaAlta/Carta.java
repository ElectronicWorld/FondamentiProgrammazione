package CartaAlta;

public class Carta {
	
	String seme; //seme della carta
	int valore;	//valore della carta
	//String tipo; //tipo di carta se figura(re regina ecc..) oppure carta normale.
	
	public Carta(String seme,int valore)
	{
		this.seme=seme;
		this.valore=valore;
	}
	
	
	@Override
	public String toString() {
		
		switch(valore)
		{
			case 1:
				return "asso di "+seme;
			case 11:
				return "jack di "+seme;
			case 12:
				return "donna di "+seme;
			case 13:
				return "re di "+seme;
			default:
				return " "+valore+" di "+seme;
				
		}
	}
	
	
	public int getValore() {
		return valore;
	}
	
	
	
}
