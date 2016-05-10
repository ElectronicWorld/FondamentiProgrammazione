package ArchivioCD;

import java.util.Vector;

import IOUtils.*;

public class MyMenu {
	
	private static final String INSERIMENTO_TITOLO_CD = "Inserire il titolo del CD: ";
	private static final String INSERIMENTO_AUTORE_CD = "Inserire l'autore del CD: ";
	
	ArchivioCD archivio = new ArchivioCD();
	
	public void inizio() {
		String scelte[] = {"Inserire un nuovo CD nella collezione", "Visualizzare un CD", "Rimozione di un CD", "Visualizzare del contenuto dell’intera collezione", "Selezionare di un brano a caso estratto dall’intera collezione"};
		
		
		boolean continua=true;
		
		while(continua)
		{
			int scelta=IOUtils.menu(scelte);
			switch(scelta){
				case 1:
						archivio.inserireCD(aggiungiCD());
						break;
				case 2: 
						visualizzaCD();
						break;
				case 3: 
						rimuoviCD();
			}
			
		}
		
	}
	
	private CD aggiungiCD(){
		String titolo, autore;
		
		titolo = IOUtils.leggiStringa(INSERIMENTO_TITOLO_CD);
		
		autore = IOUtils.leggiStringa(INSERIMENTO_AUTORE_CD);
		CD cd = new CD(titolo, autore);
		
		return aggiungiBrani(cd);
		
		
	}
	
	// Aggiunge brani al CD passato come parametro
	private CD aggiungiBrani(CD cd)
	{
		boolean continua1=true;
		
		while(continua1)
		{
			String titolobrano = IOUtils.leggiStringa("Inserisci il titolo del brano: ");
			double duratabrano = IOUtils.leggiDouble("Inserisci la durata del brano: ");
			
			cd.aggiungereBrano(new Brano(titolobrano, duratabrano));
			
			if(IOUtils.leggiIntero("Vuoi inserire un altro brano? \n 0: no \n 1:si")==0)
				continua1=false;
		}
		return cd;
	}
	
	private void visualizzaCD(){
		String titolo, autore;
		titolo = IOUtils.leggiStringa(INSERIMENTO_TITOLO_CD);
		autore = IOUtils.leggiStringa(INSERIMENTO_AUTORE_CD);
		Vector<Brano> elencoBrani = new Vector<Brano>();
		
		CD cd = new CD(titolo, autore);
		
		if(archivio.cercaCD(cd)!=-1)
		{
			cd = archivio.visualizzareCD(archivio.cercaCD(cd));
			
			System.out.println("Autore: " + cd.getAutore() + "Titolo: " + cd.getTitolo());
			
			elencoBrani = cd.getElencoBrani();
			
			int i=1;
			
			for(Brano brano: elencoBrani){
				System.out.println("Titolo"+ i + ": "+ brano.getTitolo() + "Durata: " + brano.getDurata() + "\n");
				i++;
			}
		}
		else
		{
			System.out.println("\nCd non presente");
			
		}
		
		
	}
	
	private void rimuoviCD(){
		String titolo, autore;
		titolo = IOUtils.leggiStringa(INSERIMENTO_TITOLO_CD);
		autore = IOUtils.leggiStringa(INSERIMENTO_AUTORE_CD);
		
		CD cd = new CD(titolo, autore);
		
		cd = archivio.eliminareCD(archivio.cercaCD(cd));
		
	}
}
