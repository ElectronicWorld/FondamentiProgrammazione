package Tamagotchi;

/**
 * 
 * @author Gruppo AZ Taddei Bodei
 *
 */

public class Tamagotchi {
	
	private String nome;
	private float soddisfazione;
	private float sazieta;
	
	private boolean vivo = true;
	
	private final static int MIN_SODDISFAZIONE = 20;
	private final static int MIN_SAZIETA = 30;
	private final static int MAX_SAZIETA = 90;
	
	
	public Tamagotchi() {
		this.nome="MioTamagotchi";
		this.soddisfazione=50;
		this.sazieta=50;
	}
	
	/**
	 * 
	 * @param nome
	 * @param soddisfazione
	 * @param sazieta
	 */
	public Tamagotchi(String nome, float soddisfazione, float sazieta) {
		this.soddisfazione = soddisfazione;
		this.sazieta = sazieta;
		this.nome = nome;
		controllaVita();
	}

	/**
	 * Tamagotchi riceve n carezze
	 * @param n "numero di carezze che riceve il Tamagotchi"
	 */
	public void carezze(int n)
	{
		soddisfazione+=n;
		sazieta-=n/2;
		controllaVita();
	}
	
	/**
	 * Tamagotchi riceve n biscotti
	 * @param n "numero di biscotti che riceve il Tamagotchi"
	 */
	public void biscotti(int n)
	{
		sazieta=sazieta+n*10/sazieta;
		soddisfazione-=n/4; // diminuire soddisfazione di 1/4 dei biscotti ricevuti
		controllaVita();
	}
	
	/**
	 * Controlla se Tamagotchi è vivo
	 * @return true "Tamagotchi vivo"
	 * @return false "Tamagotchi morto"
	 */
	public boolean controllaVita()
	{
		if(sazieta>100 || soddisfazione==0 || sazieta==0)
		{
			vivo=false;
			return false;
		}
		return true;
	}
	/**
	 * Controlla se Tamagotchi è felice
	 * @return
	 */
	public boolean felice()
	{
		if(soddisfazione<MIN_SODDISFAZIONE || sazieta<MIN_SAZIETA || sazieta>MAX_SAZIETA)
			return false;
		
		return true;
	}

	/**
	 * Ritorna lo stato di vita del Tamagotchi
	 * @return vivo
	 */
	public boolean vivo() {
		return vivo;
	}

	public float getSoddisfazione() {
		return soddisfazione;
	}

	public void setSoddisfazione(float soddisfazione) {
		this.soddisfazione = soddisfazione;
	}

	public float getSazieta() {
		return sazieta;
	}

	public void setSazieta(float sazieta) {
		this.sazieta = sazieta;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
