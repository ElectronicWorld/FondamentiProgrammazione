package CartaAlta;

public class Carta {
	
	String seme; //seme della carta
	int valore;	//valore della carta
	String tipo; //tipo di carta se figura(re regina ecc..) oppure carta normale.
	
	public Carta(String seme,int valore)
	{
		this.seme=seme;
		this.valore=valore;
	}
	public Carta(String seme,int valore,String tipo)
	{
		this.seme=seme;
		this.valore=valore;
	}
	
}
