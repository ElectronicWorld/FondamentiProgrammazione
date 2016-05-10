package ArchivioCD;

import java.util.*;

import IOUtils.*;

public class CD {
	private String titolo;
	private String autore;
	private Vector <Brano> elencoBrani;
	
	public CD(String titolo, String autore) {
		this.titolo = titolo;
		this.autore = autore;
		elencoBrani = new Vector<Brano>();
	}
	
	public String getTitolo() {
		return titolo;
	}

	public String getAutore() {
		return autore;
	}

	public void aggiungereBrano(Brano b) {
		elencoBrani.add(b);
	}
	
	public Brano selezionareBranoCasuale() {
		int casuale = IOUtils.estraiIntero(1, elencoBrani.size()-1);
		return elencoBrani.get(casuale);
	}
	
	public Brano selezionareBranoSpecifico(int i) {
		return elencoBrani.get(i);
	}

	@Override
	public String toString() {
		return "CD [Titolo=" + titolo + ", Autore=" + autore + ", Numero Brani=" + elencoBrani.size()+ "]";
	}

	public Vector<Brano> getElencoBrani() {
		return elencoBrani;
	}


}
