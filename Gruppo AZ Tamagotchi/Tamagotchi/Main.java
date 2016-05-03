package Tamagotchi;
import IOUtils.*;

/**
 * 
 * @author Gruppo AZ Taddei Bodei
 *
 */

public class Main {

	private final static String SALUTO_INIZIALE = "CIAO!";
	private final static String INSERIMENTO_NOME = "Inserire un nome: ";
	private final static String TAMAGOTCHI_FELICE = "\n*** IL TAMAGOTCHI E' FELICE! ***";
	private final static String TAMAGOTCHI_TRISTE = "\n*** IL TAMAGOTCHI E'TRISTE! ***";
	private final static String TAMAGOTCHI_MORTO = "\n*** IL TAMAGOTCHI MORTO! ***";
	private final static String SALUTO_FINALE = "\n*** CIAO, A PRESTO! ***";	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		inizio();	
	}
	
	public static void inizio()
	{	
		String scelte[] = {"Dare carezze", "Dare biscotti", "Quit"};
		Tamagotchi tama = new Tamagotchi();
		boolean continua = true;
		int scelta;
		
		System.out.println(SALUTO_INIZIALE);
		// inserimento nome
		tama.setNome(IOUtils.leggiStringa(INSERIMENTO_NOME));
		
		while(continua)
		{
			if(tama.vivo())
			{	
				if(tama.felice())
					System.out.println(TAMAGOTCHI_FELICE);		
				else
					System.out.println(TAMAGOTCHI_TRISTE);
				
				System.out.println("\nSAZIETA: "+tama.getSazieta());
				System.out.println("SODDISFAZIONE: "+tama.getSoddisfazione()+"\n\n");
				
				scelta=IOUtils.menu(scelte);
				
				switch (scelta)
				{
					case 1:
						tama.carezze(IOUtils.estraiIntero(1, 10));
						break;
					case 2:
						tama.biscotti(IOUtils.estraiIntero(1, 10));
						break;
					case 3:
						System.out.println(SALUTO_FINALE);
						continua=false;
				}
			}
			else
			{
				System.out.println(TAMAGOTCHI_MORTO);
				continua=false;
			}
			
		}
	}

}
