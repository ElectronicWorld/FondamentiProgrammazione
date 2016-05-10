package ArchivioCD;

public class Brano {
	private String titolo; 
	private double durata;
	
	public Brano() {
		this.titolo = "";
		this.durata = 0.0d;
	}
	
	public Brano(String titolo, double durata) {
		this.titolo = titolo;
		this.durata = durata;
	}
	
	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public Double getDurata() {
		return durata;
	}

	public void setDurata(Double durata) {
		this.durata = durata;
	}

	@Override 
	public String toString() {
		return "Brano [titolo=" + titolo + ", durata=" + durata + "]";
	}	
}
