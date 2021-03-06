package sklep;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class PracownikObslugi extends Pracownik {

	private String zakresOdpowiedzialności;
	private List<Zamowienie> zamowienia = new ArrayList<>();

	public PracownikObslugi(String imie, String nazwisko, String adres, String telefon, String emial, double stazPracy,
			LocalDate dataZatrudnienia, LocalDate dataZwolnienia, String nazwaStazu, String zakresOdpowiedzialności) {
		super(imie, nazwisko, adres, telefon, emial, stazPracy, dataZatrudnienia, dataZwolnienia, nazwaStazu);
		this.zakresOdpowiedzialności = zakresOdpowiedzialności;
	}

	public PracownikObslugi(String imie, String nazwisko, String adres, String telefon, String emial, double stazPracy,
			LocalDate dataZatrudnienia, String nazwaStazu, String zakresOdpowiedzialności) {
		super(imie, nazwisko, adres, telefon, emial, stazPracy, dataZatrudnienia, nazwaStazu);
		this.zakresOdpowiedzialności = zakresOdpowiedzialności;
	}

	public PracownikObslugi(String imie, String nazwisko, String adres, String telefon, String emial, double stazPracy,
			LocalDate dataZatrudnienia, LocalDate dataZwolnienia, int lataDoswiadczenia,
			String zakresOdpowiedzialności) {
		super(imie, nazwisko, adres, telefon, emial, stazPracy, dataZatrudnienia, dataZwolnienia, lataDoswiadczenia);
		this.zakresOdpowiedzialności = zakresOdpowiedzialności;
	}

	public PracownikObslugi(String imie, String nazwisko, String adres, String telefon, String emial, double stazPracy,
			LocalDate dataZatrudnienia, int lataDoswiadczenia, String zakresOdpowiedzialności) {
		super(imie, nazwisko, adres, telefon, emial, stazPracy, dataZatrudnienia, lataDoswiadczenia);
		this.zakresOdpowiedzialności = zakresOdpowiedzialności;
	}

	public String getZakresOdpowiedzialności() {
		return zakresOdpowiedzialności;
	}

	public void setZakresOdpowiedzialności(String zakresOdpowiedzialności) {
		this.zakresOdpowiedzialności = zakresOdpowiedzialności;
	}

	public List<Zamowienie> getZamowienia() {
		return zamowienia;
	}

	public void setZamowienia(List<Zamowienie> zamowienia) {
		this.zamowienia = zamowienia;
	}

	public void dodajZamowienie(Zamowienie zamowienie) {
		if (zamowienie.getPracownikObslugi() != null) {
			throw new IllegalArgumentException("Nie można dodac");
		}
		zamowienia.add(zamowienie);
		zamowienie.setPracownikObslugi(this);
	}

	@Override
	public double wyliczPensje() {
		// TODO Auto-generated method stub
		return getStazPracy() * 1000;
	}

}
