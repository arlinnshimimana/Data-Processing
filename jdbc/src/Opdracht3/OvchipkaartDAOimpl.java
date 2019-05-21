package Opdracht3;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import opdracht2.Reiziger;

public class OvchipkaartDAOimpl extends OraclebaseDAO implements OvchipkaartDAO {

	public List<Ovchipkaart> findAll() {
		Connection connection = super.getConnection();
		List<Ovchipkaart> al = new ArrayList<>();

		try {
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM ov_chipkaart ");
			while (rs.next()) {
				Ovchipkaart o = new Ovchipkaart();
				o.setKaartNummer(rs.getInt("kaartnummer"));
				o.setKlasse(rs.getInt("klasse"));
				o.setGeldigTot(rs.getDate("geldigtot"));
				o.setSaldo(rs.getBigDecimal("saldo"));
				Statement st = connection.createStatement();
				ResultSet as = st.executeQuery("Select * from reiziger where reizigerid ="+rs.getInt("reizigerid"));
				while (as.next()){
					Reiziger r = new Reiziger();
					r.setId(as.getInt("reizigerid"));
					r.setNaam(as.getString("achternaam"));
					r.setGbdatum(as.getDate("gebortedatum"));
					r.setVoorletter(as.getString("voorletters"));
					o.setReiziger(r);
				}
				al.add(o);

			}
			return al;
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
		return null;
	}

	public List<Ovchipkaart> findByKaartnummer(int kaartnummer) {
		Connection connection = super.getConnection();
		List<Ovchipkaart> al = new ArrayList<>();

		try {
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM ov_chipkaart WHERE kaartnummer ='" + kaartnummer + "'");
			while (rs.next()) {
				Ovchipkaart r = new Ovchipkaart();
				r.setKaartNummer(rs.getInt("kaartnummer"));
				r.setKlasser(s.getInt("klasse"));
				r.setGeldigTot(rs.getDate("geldigtot"));
				r.setSaldo(rs.getBigDecimal("saldo"));
				al.add(r);
				
			}
			return al;
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
		return null;
	}

	public Ovchipkaart save(Ovchipkaart ovchipkaart) {
		  Connection connection = super.getConnection();
	       
			
			try {
	            Statement stmt = connection.createStatement();
	            String query = "insert into ov_chipkaart(kaartnummer, klasse, saldo,geldigtot, reizigerid) values("+
	            ovchipkaart.getKaartNummer()+","+ovchipkaart.getKlasse()+","
	            + ovchipkaart.getSaldo()+ ",To_date('"+ovchipkaart.getGeldigTot()+"','yyyy-mm-dd'),"+ovchipkaart.getReiziger().getId()+")";
	            System.out.println(query);
				stmt.executeQuery(query);
			} catch (SQLException ex) {
				ex.printStackTrace();
			}
			
			return ovchipkaart;
	           
	}

	public List<Ovchipkaart> findByProduct(Product product){
		Connection connection = super.getConnection();
		List<Ovchipkaart> al = new ArrayList<>();

		
	};

	public Ovchipkaart update(Ovchipkaart ovchipkaart) {
		 Connection connection = super.getConnection();
			
			try {
				String statementString = "update ov_chipkaart set  klasse= "+ovchipkaart.getKlasse()+
	            		 ", geldigtot = To_date('"+ovchipkaart.getGeldigTot()+"','yyyy-mm-dd'), saldo = "+ovchipkaart.getSaldo()+
	            		 " where kaartnummer="+ovchipkaart.getKaartNummer();
				
				System.out.println(statementString);
				
				PreparedStatement stmt = connection.prepareStatement(statementString);
				int i = stmt.executeUpdate();
				
			} catch (SQLException ex) {
				ex.printStackTrace();
			}
			return ovchipkaart;
	           

	}

	public Ovchipkaart delete(Ovchipkaart ovchipkaart) {
		 Connection connection = super.getConnection();
			
			try {
	            Statement stmt = connection.createStatement();
	             stmt.executeQuery("delete from ov_chipkaart where kaartnummer = "+ovchipkaart.getKaartNummer());
			} catch (SQLException ex) {
				ex.printStackTrace();
			}
			return ovchipkaart;
	           

}

	@Override
	public List<Reiziger> findByGBdatum(String Gbdatum) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Reiziger save(Reiziger reiziger) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Reiziger update(Reiziger reiziger) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Reiziger delete(Reiziger reiziger) {
		// TODO Auto-generated method stub
		return null;
	}
}
