package klasy;

public class Ogloszenie {

	private String tytul,opis,kontant;
	private int cena;
	

	public Ogloszenie(String tytul, String opis, String kontant, int cena) {
		super();
		this.tytul = tytul;
		this.opis = opis;
		this.kontant = kontant;
		this.cena = cena;
	}


	public String getTytul() {
		return tytul;
	}


	public void setTytul(String tytul) {
		this.tytul = tytul;
	}


	public String getOpis() {
		return opis;
	}


	public void setOpis(String opis) {
		this.opis = opis;
	}


	public String getKontant() {
		return kontant;
	}


	public void setKontant(String kontant) {
		this.kontant = kontant;
	}


	public int getCena() {
		return cena;
	}


	public void setCena(int cena) {
		this.cena = cena;
	}


	@Override
	public String toString() {
		return "Ogloszenie tytul=" + tytul + ", opis=" + opis + ", kontant=" + kontant + ", cena=" + cena;
	}



}
