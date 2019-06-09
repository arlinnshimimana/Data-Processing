package opdracht_3;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ProductDAOimpl extends OraclebaseDAO implements ProductDAO {
	@Override
	public List<Product> findAll() {
		Connection conn = super.getConnection();
		List<Product> pr = new ArrayList<>();
		try {
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("Select * from product");
			while (rs.next()) {
				Product p = new Product();
				p.setProductNaam(rs.getString("productnaam"));
				p.setProductNummer(rs.getInt("productnummer"));
				p.setBeschrijving(rs.getString("beschrijving"));
				p.setPrijs(rs.getDouble("prijs"));
				OvchipkaartDAOimpl a = new OvchipkaartDAOimpl();
				List<Integer> i = a.findByProductNummer(p.getProductNummer());
				p.setKaartnummers(i);
				pr.add(p);
			}
			return pr;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Product> findbyKaartnummer(int kaartnummer) {
		Connection conn = super.getConnection();
		List<Product> pr = new ArrayList<Product>();
		Statement stmt;
		try {
			stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("select * from product where productnummer in ("
					+ "select productnummer from ov_chipkaart_product where kaartnummer = " + kaartnummer + ")");
			while (rs.next()) {
				Product p = new Product();
				p.setBeschrijving(rs.getString("beschrijving"));
				p.setPrijs(rs.getDouble("prijs"));
				p.setProductNaam(rs.getString("productnaam"));
				p.setProductNummer(rs.getInt("productnummer"));
				OvchipkaartDAOimpl a = new OvchipkaartDAOimpl();
				List<Integer> b = a.findByProductNummer(p.getProductNummer());
				p.setKaartnummers((ArrayList<Integer>) b);
				pr.add(p);
			}
			return pr;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Product save(Product product) {
		Connection conn = super.getConnection();
		try {
			Statement stmt = conn.createStatement();
			stmt.executeQuery("insert into product(productnummer,productnaam, beschrijving,prijs) values("
					+ product.getProductNummer() + ",'" + product.getProductNaam() + "', '" + product.getBeschrijving()
					+ "'," + product.getPrijs() + " )");
			return product;
		} catch (SQLException e) {

			e.printStackTrace();
		}
		return null;

	}

	@Override
	public Product update(Product product) {
		Connection conn = super.getConnection();
		try {
			String query = "update product set productnaam = '" + product.getProductNaam() + "', beschrijving = '"
					+ product.getBeschrijving() + "', prijs = " + (product.getPrijs() + 1) + " where productnummer = "
					+ product.getProductNummer();
			System.out.println("query: " + query);

			PreparedStatement stmt = conn.prepareStatement(query);
			stmt.executeUpdate();
			System.out.println("Done");
			return product;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;

	}

	@Override
	public Product delete(Product product) {
		Connection conn = super.getConnection();
		try {
			Statement stmt = conn.createStatement();
			stmt.executeQuery("delete from ov_chipkaart_product where productnummer = " + product.getProductNummer());
			stmt.executeQuery("delete from product where productnummer = " + product.getProductNummer());

			return product;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;

	}

}
