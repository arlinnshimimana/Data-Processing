//Studentnummer: 1743650
//naam: Arlin
//Achternaam: NShimimana
//Opdracht nummer: p1

package opdracht2.original;
import java.text.ParseException;
import java.text.SimpleDateFormat;


public class Reizigermain {

	public static void main(String[] args) throws ParseException  {
		ReizigersDAO DAO = new ReizigersDAOimpl();
		
	

		Reiziger r1 = new Reiziger(1, "Arlin",new SimpleDateFormat("dd-MM-yyyy").parse("13-04-2004"), "");
		Reiziger r2 = new Reiziger(2,"Bart",new SimpleDateFormat("dd-MM-yyyy").parse("03-07-2004"), "");
		Reiziger r3 = new Reiziger(3,"Armand",new SimpleDateFormat("dd-MM-yyyy").parse("18-09-2014"), "");

		System.out.println(r1.getNaam());
		System.out.println(r2.getNaam());
		System.out.println(r3.getNaam());
		System.out.println(r2.getGbdatum());

		System.out.println(DAO.save(r1));
		System.out.println(DAO.save(r2));
		System.out.println(DAO.save(r3));
		System.out.println(DAO.delete(r2));
		System.out.println(DAO.update(new Reiziger(3,"Hans",new SimpleDateFormat("dd-MM-yyyy").parse("18-09-2004"), "")));
		System.out.println(DAO.findAll());
		
		
		
		
		
	}

}
