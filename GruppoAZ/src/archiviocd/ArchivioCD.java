package ArchivioCD;

import java.util.Vector;

import IOUtils.*;

public class ArchivioCD {
	private Vector<CD> elencoCD;

	public ArchivioCD() {
		elencoCD = new Vector<CD>();
	}
	
	public void inserireCD(CD cd) {
		elencoCD.add(cd);
	}
	
	public int cercaCD(CD cd) {
		for(int i=0; i<elencoCD.size(); i++) {
			if(cd.getAutore().equals(elencoCD.get(i).getAutore()) && cd.getTitolo().equals(elencoCD.get(i).getTitolo()))
			{
				return i;
			}			
		}
		return -1;
	}
	
	
	
	public CD visualizzareCD(int i) {
		return elencoCD.get(i);
	}
	
	public CD eliminareCD(int i) {
		return elencoCD.remove(i);
	}
	
	public CD selezioneCasualeCD() {
		int casuale = IOUtils.estraiIntero(0, elencoCD.size()-1);
		return elencoCD.get(casuale);
	}
}
