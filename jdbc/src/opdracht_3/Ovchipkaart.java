package opdracht_3;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Ovchipkaart {
	private int kaartNummer;
	private Date geldigTot;
	private int klasse;
	private Number saldo;
	private Reiziger reiziger;
	private List<opdracht_3.Product> mijnProducten = new ArrayList<>();

	public Ovchipkaart(int kn, Date gld, int kl, Number sal) {
		kaartNummer = kn;
		geldigTot = gld;
		klasse = kl;
		saldo = sal;
	}

	public Ovchipkaart() {
	};

	public Reiziger getReiziger() {
		return reiziger;
	}

	public void setReiziger(Reiziger reiziger) {
		this.reiziger = reiziger;
	}

	public int getKaartNummer() {
		return kaartNummer;
	}

	public void setKaartNummer(int kaartNummer) {
		this.kaartNummer = kaartNummer;
	}

	public Date getGeldigTot() {
		return geldigTot;
	}

	public void setGeldigTot(Date geldigTot) {
		this.geldigTot = geldigTot;
	}

	public int getKlasse() {
		return klasse;
	}

	public void setKlasse(int klasse) {
		this.klasse = klasse;
	}

	public Number getSaldo() {
		return saldo;
	}

	public void setSaldo(Number saldo) {
		this.saldo = saldo;
	}

	@Override
	public String toString() {

		return "OvchipkaartNummer=" + kaartNummer + ", geldigTot=" + geldigTot + ", klasse=" + klasse + ", saldo="
				+ saldo + ", reiziger= " + reiziger.getId() + ",\n Producten =" + mijnProducten + "\n";
	}

	public List<opdracht_3.Product> getMijnProducten() {
		return mijnProducten;
	}

	public void setMijnProducten(List<opdracht_3.Product> pr) {
		this.mijnProducten = pr;
	}

}
