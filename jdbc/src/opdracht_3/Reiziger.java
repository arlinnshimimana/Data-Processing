package opdracht_3;

import java.util.ArrayList;
import java.util.Date;

public class Reiziger {
	private int reizigerID;
	private String voorletter;
	private String naam;
	private Date gbdatum;
	private ArrayList<Ovchipkaart> mijnOvchipkaarten = new ArrayList<>();

	public Reiziger(int id, String nm, Date gb, String vrl) {
		reizigerID = id;
		voorletter = vrl;
		naam = nm;
		gbdatum = gb;
	}

	public Ovchipkaart addKaarten(Ovchipkaart a) {
		mijnOvchipkaarten.add(a);
		return a;
	}

	public ArrayList<Ovchipkaart> getMijnOvchipkaarten() {
		return mijnOvchipkaarten;
	}

	public void setMijnOvchipkaarten(ArrayList<Ovchipkaart> mijnOvchipkaarten) {
		this.mijnOvchipkaarten = mijnOvchipkaarten;
	}

	public Reiziger() {
	};

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

	@Override
	public String toString() {
		return "reizigerID=" + reizigerID + ", voorletter=" + voorletter + ", naam=" + naam + ", gbdatum=" + gbdatum
				+ ", mijnOvchipkaarten= \n " + mijnOvchipkaarten + "\n";
	}

	public ArrayList<Ovchipkaart> getMijnOvchipkaart() {
		return mijnOvchipkaarten;
	}

	public String getVoorletter() {
		return voorletter;
	}

	public void setVoorletter(String voorletters) {
		this.voorletter = voorletters;
	}
}
