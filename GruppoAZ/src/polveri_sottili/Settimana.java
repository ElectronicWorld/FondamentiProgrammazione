package polveri_sottili;

import IOUtils.IOUtils;;

public class Settimana {
	
	IOUtils io= new IOUtils();
	
	private int anno;
	private int nr_settimana;
	private float [] polveri_sottili= new float[7];
	private float val_max=0;
	private float soglia_giornaliera=75;
	private float soglia_media=50;
	
	public void add_value(float polveri, int n)
	{
		this.polveri_sottili[n]=polveri;
	}
	
	public float media_polveri()
	{
		return io.media(polveri_sottili, 7);
	}
	
	//controlla che la media sia sotto la soglia
	public float verifica_media()
	{
		if(media_polveri()<=soglia_media)
			return 0;
		return media_polveri()-soglia_media;
	}
	
	//controlla i dati di un giorno siano sotto la soglia
	public float verifica_soglia_giornaliera(int n)
	{
		if(polveri_sottili[n]<=soglia_giornaliera)
			return 0;
		return polveri_sottili[n]-soglia_giornaliera;
	}
	
}
