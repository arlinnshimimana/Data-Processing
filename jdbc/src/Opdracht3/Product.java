package Opdracht3;

import java.util.ArrayList;
import java.util.List;

public class Product {
	private int productNummer;
	private String productNaam;
	private String beschrijving;
	private double prijs;
	private ArrayList<Ovchipkaart> mijnOvchipkaarten= new ArrayList<>();
	private List<Integer> kaartnummers;
	
	public Product(int pnr, String pn, String bs, double p) {
		productNummer = pnr;
		productNaam = pn;
		beschrijving= bs;
		prijs= p;
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
