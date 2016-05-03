package polveri_sottili;

import IOUtils.IOUtils;

public class Polveri_sottili {

	public void inserisci_settimana()
	{
		
		IOUtils io= new IOUtils();
		Settimana [] settimane= new Settimana[53];
		int settimana_scelta=0;
		
		
		//richiedo di scegliere una settimana della quale inserire i dati
		do{
			System.out.println("\n\ninserisci il numero di settimana di cui vuoi inserire i dati: ");
			settimana_scelta=io.GetInt();
		}while(settimana_scelta<1 || settimana_scelta>53);
		
		
		//decremento la settimana scelta in quanto gli indici dei vettori partono da zero mentre la prima settimana che l'utente puo scegliere parte da 1
		settimana_scelta--;
		
		//instanzio la settimana che è stata scelta dall' utente
		settimane[settimana_scelta]=new Settimana();
		
		
		//richiedo di inserire i dati delle polveri sottili riguardo alla settimana scelta
		for(int i=0;i<7;i++)
		{
			System.out.println("inserisci i valori di inquinamento del "+(i+1)+" giorno:");
			
			settimane[settimana_scelta].add_value(io.GetInt(), i);
			
			if(settimane[settimana_scelta].verifica_soglia_giornaliera(i)!=0)
				System.out.println("\n*** la media giornaliera ha superato la soglia massima impostata a 75μg/m3 di "+settimane[settimana_scelta].verifica_soglia_giornaliera(i)+"μg/m3 ***\n");
				
			
		}
		
		// controllo che la media delle polveri sottili di quella settimana non superi il valore max prestabilito
		
		if(settimane[settimana_scelta].verifica_media()!=0)
			System.out.println("\n***la media di questa settimana ha superato la soglia massima impostata a 50μg/m3 di "+settimane[settimana_scelta].verifica_media()+"μg/m3 ***\n");
	}
}
