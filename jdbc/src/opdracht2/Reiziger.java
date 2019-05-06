package opdracht2;

import java.util.ArrayList;
import java.util.Date;

public class Reiziger {
	private int reizigerID;
	private String voorletter;
	private String naam;
	private Date gbdatum;
	private ArrayList<Ovchipkaart> mijnOvchipkaarten= new ArrayList<>();
	
	public Reiziger(int id,String nm, Date gb, String vrl) {
		reizigerID = id;
		voorletter = vrl;
		naam = nm;
		gbdatum = gb;
	}
	public Reiziger() {};
	public int getId() {
		return reizigerID;
	}
	public void setId(int id) {
		this.reizigerID = id;
	}

	public String getNaam() {
		return naam;
	}

	public void setNaam(String naam) {
		this.naam = naam;
	}

	public Date getGbdatum() {
		return gbdatum;
	}

	public void setGbdatum(Date gbdatum) {
		this.gbdatum = gbdatum;
	}
	
	public String toString() {
		return naam+" geboren "+gbdatum;
	}
	public ArrayList<Ovchipkaart> getMijnOvchipkaart() {
		return mijnOvchipkaarten;
	}

	public Ovchipkaart addMijnOvchipkaart(Ovchipkaart a) {
		mijnOvchipkaarten.add(a);
		return a;
	}
	public String getVoorletter() {
		return voorletter;
	}
	public void setVoorletter(String voorletters) {
		this.voorletter = voorletters;
	}
}
