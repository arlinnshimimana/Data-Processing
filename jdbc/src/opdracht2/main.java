package opdracht2;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;


public class main {
	public static void main(String[] args) throws ParseException {
		ReizigersDAOimpl DAO = new ReizigersDAOimpl();
		OvchipkaartDAOimpl dao= new OvchipkaartDAOimpl();

		
		System.out.println(DAO.getConnection())	;
		


		System.out.println(dao.findAll());
}
}