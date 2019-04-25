package Opdracht1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ReizigersDAOimpl implements ReizigersDAO{
	private List<Reiziger> mijnreiziger= new ArrayList<>(); 

	public List<Reiziger> findAll() {
		return mijnreiziger;
	}

	
	public List<Reiziger> findByGBdatum(String Gbdatum) {
		SimpleDateFormat d= new SimpleDateFormat("dd-MM-YYYY");
		Date date1 =null;
		try {
			date1 = d.parse(Gbdatum);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		ArrayList<Reiziger> result = new ArrayList();
		for(Reiziger r: mijnreiziger) {
		if(r.getGbdatum() ==date1) {
			result.add(r);
		}
			}
		return result ;
		}

	
	public Reiziger save(Reiziger reiziger) {
	if(!mijnreiziger.contains(reiziger)) {
		mijnreiziger.add(reiziger);
	}
	return reiziger;
	}

	
	public Reiziger update(Reiziger reiziger) {
		Reiziger gewijzigd = null;
		for(Reiziger r: mijnreiziger) {
			if(r.getId() == reiziger.getId()) {
				r.setGbdatum(reiziger.getGbdatum());
				r.setNaam(reiziger.getNaam());
				
				gewijzigd = r;
			}
		}
		
		return gewijzigd;
	}


	public Reiziger delete(Reiziger reiziger) {
		Reiziger verwijderd = null;
		for(Reiziger r: mijnreiziger) {
			if(r.equals(reiziger)) {
				mijnreiziger.remove(r);
				verwijderd = r;
			}
		}
		return verwijderd;
		}
	
	
	
}
