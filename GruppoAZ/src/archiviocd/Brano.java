package ArchivioCD;

public class Brano {
	private String titolo; 
	private float durata;
	
	public Brano() {
		this.titolo = "";
		this.durata = 0.0f;
	}
	
	public Brano(String titolo, float durata) {
		this.titolo = titolo;
		this.durata = durata;
	}
	
	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public float getDurata() {
		return durata;
	}

	public void setDurata(float durata) {
		this.durata = durata;
	}

	@Override
	public String toString() {
		return "Brano [titolo=" + titolo + ", durata=" + durata + "]";
	}	
}
