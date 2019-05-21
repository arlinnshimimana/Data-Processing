package Opdracht3;

import java.util.List;

public interface ProductDAO {
	public List<Product> findAll();
	public List<Product> findByOvchipkaart(Ovchipkaart ovchipkaart);
	public Product save(Product product);
	public Product update(Product product);
	public Product delete(Product product);


}
