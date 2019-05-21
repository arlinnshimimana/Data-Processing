package hu.nl.hibernate;

public class Klasgenoot {
	private int id;
	private String naam;
	private String achternaam;
	private String mening;
	private int leeftijd;
	
	public Klasgenoot(int id,String nm, String an, String mn, int lf) {
		this.id = id;
		naam= nm;
		achternaam = an;
		mening = mn;
		leeftijd = lf;
	}
	public Klasgenoot() {}
	
	public String getNaam() {
		return naam;
	}
	public void setNaam(String naam) {
		this.naam = naam;
	}
	public String getAchternaam() {
		return achternaam;
	}
	public void setAchternaam(String achternaam) {
		this.achternaam = achternaam;
	}
	public String getMening() {
		return mening;
	}
	public void setMening(String mening) {
		this.mening = mening;
	}
	public int getLeeftijd() {
		return leeftijd;
	}
	public void setLeeftijd(int leeftijd) {
		this.leeftijd = leeftijd;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "id: " + id + ", naam: " + naam + ", achternaam: " + achternaam + ", mening: " + mening
				+ ", leeftijd: " + leeftijd + "]";
	}
	
	
}
