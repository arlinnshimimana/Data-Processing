package opdracht_3;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;


public class run {
	public static void main(String[] args) throws ParseException {
		ReizigersDAOimpl DAO = new ReizigersDAOimpl();
		OvchipkaartDAOimpl ovdao= new OvchipkaartDAOimpl();
		ProductDAOimpl prdao = new ProductDAOimpl();

		
		System.out.println(DAO.getConnection())	;
		Product p = new Product(1	,"100% korting","je kan overal in nederland reizen voor gratiss",51234.0);
		
		//System.out.println(pr.findbyKaartnummer(35283));
		//System.out.println(pr.delete(p));
		System.out.println(ovdao.findAll());
		System.out.println(DAO.findAll());
		System.out.println(prdao.findAll());

		
}
}