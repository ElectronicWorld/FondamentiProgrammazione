package CartaAlta;

import IOUtils.IOUtils;

public class CartaAlta {

	Mazzo mazzo=new Mazzo();
	int budget;
	int continua=0;
	Carta carta_estratta[]=new Carta[2];
	int puntata;
	
	public void inizio()
	{
		
		budget=IOUtils.leggiInteroConMinimo("\nBENVENUTO!\n\nInserire il budget disponibile: ", 1);
		
		while(continua==0 && budget>0){
			
			carta_estratta[0]=mazzo.cartaCasuale();
			System.out.println("\nla carta estratta è: "+carta_estratta[0].toString());
			puntata();
			carta_estratta[1]=mazzo.cartaCasuale();
			
			System.out.println("\nla seconda carta estratta è: "+carta_estratta[1].toString());
			
			
			stampa_stato(modifica_budget(controlla_vincita()));
			
			System.out.println("\nIL TUO BUDGET E': "+String.valueOf(budget));
			
			if(budget>0)
				continua=IOUtils.menu(new String[]{"Scommetti ancora","Esci"})-1;
			else
				System.out.println("HAI ESAURITO IL TUO BUDGET!");
		}
	}
	
	private void stampa_stato(int stato)
	{
		if(stato==0)
			System.out.println("hai perso!");
		else if(stato==1)
			System.out.println("hai vinto!");
		else 
			System.out.println("pareggio!");
	}
	
	private int modifica_budget(int stato)
	{
		if(stato==0)
			budget-=puntata;
			
		else if(stato==1)
			budget+=puntata;
		return stato;
	}
	
	private int controlla_vincita()
	{
		if(carta_estratta[1].getValore()<carta_estratta[0].getValore())
			return 0;
		else if(carta_estratta[1].getValore()>carta_estratta[0].getValore())
			return 1;
		else
			return -1;
	}
	
	private void puntata()
	{
		do{
			puntata=IOUtils.leggiIntero("quanto vuoi puntare?");
			
		}while(puntata>budget);
		//budget=budget-puntata;
	}

	
}
