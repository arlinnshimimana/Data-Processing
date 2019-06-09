package opdracht_3;

import java.util.ArrayList;
import java.util.List;

public class Product {
	private int productNummer;
	private String productNaam;
	private String beschrijving;
	private double prijs;
	private ArrayList<Ovchipkaart> mijnOvchipkaarten = new ArrayList<>();
	private List<Integer> kaartnummers = new ArrayList<>();

	public ArrayList<Ovchipkaart> getMijnOvchipkaarten() {
		return mijnOvchipkaarten;
	}

	public void setMijnOvchipkaarten(ArrayList<Ovchipkaart> mijnOvchipkaarten) {
		this.mijnOvchipkaarten = mijnOvchipkaarten;
	}

	public List<Integer> getKaartnummers() {
		return kaartnummers;
	}

	public void setKaartnummers(List<Integer> kaartnummers) {
		this.kaartnummers = kaartnummers;
	}

	public Integer addKaartnummer(int kaartnummer) {
		Integer nt = new Integer(kaartnummer);
		kaartnummers.add(nt);
		return kaartnummer;
	}

	public Product(int pnr, String pn, String bs, double p) {
		productNummer = pnr;
		productNaam = pn;
		beschrijving = bs;
		prijs = p;
	}

	public Product() {
	};

	@Override
	public String toString() {
		return "productNummer=" + productNummer + ", productNaam=" + productNaam + ", beschrijving=" + beschrijving
				+ ", prijs=" + prijs + ", mijnOvchipkaarten=" + kaartnummers + "\n";
	}

	public int getProductNummer() {
		return productNummer;
	}

	public void setProductNummer(int productNummer) {
		this.productNummer = productNummer;
	}

	public String getProductNaam() {
		return productNaam;
	}

	public void setProductNaam(String productNaam) {
		this.productNaam = productNaam;
	}

	public String getBeschrijving() {
		return beschrijving;
	}

	public void setBeschrijving(String beschrijving) {
		this.beschrijving = beschrijving;
	}

	public double getPrijs() {
		return prijs;
	}

	public void setPrijs(double prijs) {
		this.prijs = prijs;
	}

}
