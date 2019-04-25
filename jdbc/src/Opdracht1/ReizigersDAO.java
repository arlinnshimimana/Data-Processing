package Opdracht1;

import java.util.List;

public interface ReizigersDAO {
	public List<Reiziger> findAll();
	public List<Reiziger> findByGBdatum(String Gbdatum);
	public Reiziger save(Reiziger reiziger);
	public Reiziger update(Reiziger reiziger);
	public Reiziger delete(Reiziger reiziger);

}
