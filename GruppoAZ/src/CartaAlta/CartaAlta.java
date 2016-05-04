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
			
			controlla_vincita();
			
			System.out.println("\nIL TUO BUDGET E': "+String.valueOf(budget));
			
			if(budget>0)
				continua=IOUtils.menu(new String[]{"Scommetti ancora","Esci"})-1;
			else
				System.out.println("HAI ESAURITO IL TUO BUDGET!");
		}
	}

	private void controlla_vincita()
	{
		if(carta_estratta[1].getValore()<carta_estratta[0].getValore())
		{
			budget-=puntata;
			System.out.println("hai perso!");
		}
		else if(carta_estratta[1].getValore()>carta_estratta[0].getValore())
		{
			budget+=puntata;
			System.out.println("hai vinto!");
		}
		else
			System.out.println("pareggio!");
	}
	
	private void puntata()
	{
		do{
			puntata=IOUtils.leggiIntero("quanto vuoi puntare?");
			
		}while(puntata>budget);
		//budget=budget-puntata;
	}

	
}
