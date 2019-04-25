package Opdracht1;

import java.util.Date;

public class Reiziger {
	private int reizigerID;
	private String naam;
	private Date gbdatum;
	
	public Reiziger(int id,String nm, Date gb) {
		reizigerID = id;
		naam = nm;
		gbdatum = gb;
	}
	public int getId() {
		return reizigerID;
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
}
