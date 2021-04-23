package sklep;

public abstract class Produkt {

	private String nazwa;
	private double cena;
	private Zamowienie zamowienie;

	public Produkt(String nazwa, double cena) {
		this.nazwa = nazwa;
		this.cena = cena;
		
	}

	public String getNazwa() {
		return nazwa;
	}

	public void setNazwa(String nazwa) {
		this.nazwa = nazwa;
	}

	public double getCena() {
		return cena;
	}

	public void setCena(double cena) {
		this.cena = cena;
	}

	public Zamowienie getZamowienie() {
		return zamowienie;
	}

	public void setZamowienie(Zamowienie zamowienie) {
		this.zamowienie = zamowienie;
	}
	

}
