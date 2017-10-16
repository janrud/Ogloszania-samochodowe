package klasy;

public class Samochod extends Ogloszenie{
	private String marka,model;
	private double przebieg;
	private int rok,moc;
	public Samochod(String tytul, String opis, String kontant, int cena, String marka, String model, double przebieg,
			int rok, int moc) {
		super(tytul, opis, kontant, cena);
		this.marka = marka;
		this.model = model;
		this.przebieg = przebieg;
		this.rok = rok;
		this.moc = moc;
	}
	public String getMarka() {
		return marka;
	}
	public void setMarka(String marka) {
		this.marka = marka;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public double getPrzebieg() {
		return przebieg;
	}
	public void setPrzebieg(double przebieg) {
		this.przebieg = przebieg;
	}
	public int getRok() {
		return rok;
	}
	public void setRok(int rok) {
		this.rok = rok;
	}
	public int getMoc() {
		return moc;
	}
	public void setMoc(int moc) {
		this.moc = moc;
	}
	@Override
	public String toString() {
		return  super.toString() +"Samochod marka=" + marka + ", model=" + model + ", przebieg=" + przebieg + ", rok=" + rok + ", moc="
				+ moc;
	}

}
