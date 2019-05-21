package Opdracht3;

import java.util.List;

import opdracht2.Reiziger;

public interface OvchipkaartDAO {
	public List<Ovchipkaart> findAll();
	public List<Reiziger> findByGBdatum(String Gbdatum);
	public Reiziger save(Reiziger reiziger);
	public Reiziger update(Reiziger reiziger);
	public Reiziger delete(Reiziger reiziger);



}
