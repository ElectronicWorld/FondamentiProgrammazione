package polveri_sottili;

/**
 * @author simo
 */

import IOUtils.IOUtils;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		inizio();

	}
	
	public static void inizio()
	{
		IOUtils io= new IOUtils();
		Polveri_sottili polveri=new Polveri_sottili();
		int scelta;
		boolean continua=true;
		
		while(continua)
		{
			
			String voci[] =new String[]{"inserisci settimana","quit"};
			
			scelta=io.menu(voci);
			
			switch (scelta)
			{
				case 1:
					polveri.inserisci_settimana();
					break;
				case 2:
					System.out.println("\n*** CIAO, A PRESTO! ***");
					continua=false;
			}
		}
	}
	

}
