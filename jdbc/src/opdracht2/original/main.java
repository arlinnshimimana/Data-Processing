package opdracht2.original;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;


public class main {
	public static void main(String[] args) throws ParseException {
		ReizigersDAOimpl DAO = new ReizigersDAOimpl();
		OvchipkaartDAOimpl dao= new OvchipkaartDAOimpl();

		
		System.out.println(DAO.getConnection())	;
		Reiziger r = new Reiziger();
		r.setId(321);
		r.setNaam("arkin");
		r.setVoorletter("b");
		r.setGbdatum( java.sql.Date.valueOf("1999-07-23"));
		
		System.out.println(DAO.findAll());

}
}