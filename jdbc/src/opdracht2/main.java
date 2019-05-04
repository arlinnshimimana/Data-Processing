package opdracht2;
import java.text.ParseException;
import java.text.SimpleDateFormat;



public class main {
	public static void main(String[] args) throws ParseException {
		ReizigersDAOimpl DAO = new ReizigersDAOimpl();
	
		
		Ovchipkaart ov1= new Ovchipkaart(1,new SimpleDateFormat("dd-MM-yyyy").parse("13-04-2004"), 2, 6.22);
		Ovchipkaart ov2= new Ovchipkaart(2,new SimpleDateFormat("dd-MM-yyyy").parse("13-02-2104"), 1, 99.12);

		
		System.out.println(DAO.getConnection())	;
		System.out.println(DAO.findByGBdatum("03-12-02"));
		
		Reiziger a = new Reiziger();
		a.setId(124);
		a.setVoorletter("a");
		a.setNaam("Armand ew");
		a.setGbdatum(java.sql.Date.valueOf("1992-03-09"));
		
		System.out.println(DAO.delete(a));
		
		
}
}