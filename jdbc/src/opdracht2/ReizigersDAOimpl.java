package opdracht2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.management.Query;

import java.sql.*;

public class ReizigersDAOimpl extends OraclebaseDAO implements ReizigersDAO {
	private List<Reiziger> mijnreiziger;

	public List<Reiziger> findAll() {
		Connection connection = super.getConnection();
		List<Reiziger> al = new ArrayList<>();

		try {
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM reiziger");
			if (rs.next()) {
				Reiziger r = new Reiziger();
				r.setId(rs.getInt("reizigerid"));
				r.setNaam(rs.getString("achternaam"));
				r.setGbdatum(rs.getDate("gebortedatum"));
				al.add(r);
				return al;
			}
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
		return null;
	}

	public List<Reiziger> findByGBdatum(String Gbdatum) {
		Connection connection = super.getConnection();
		List<Reiziger> al = new ArrayList<>();

		try {
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM reiziger WHERE gebortedatum ='" + Gbdatum + "'");
			while (rs.next()) {
				Reiziger r = new Reiziger();
				r.setId(rs.getInt("reizigerid"));
				r.setNaam(rs.getString("achternaam"));
				r.setGbdatum(rs.getDate("gebortedatum"));
				al.add(r);
				
			}
			return al;
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
		return null;
	}

	public Reiziger save(Reiziger reiziger) {
		  Connection connection = super.getConnection();
	       
			
			try {
	            Statement stmt = connection.createStatement();
	            stmt.executeQuery("insert into reiziger(reizigerID, voorletters, achternaam,gebortedatum) values("+
	            reiziger.getId()+",'"+reiziger.getVoorletter()+"','"
	            + reiziger.getNaam()+ "',To_date('"+reiziger.getGbdatum()+"','yyyy-mm-dd'))");
			} catch (SQLException ex) {
				ex.printStackTrace();
			}
			return reiziger;
	           
	}

	public Reiziger update(Reiziger reiziger) {
		 Connection connection = super.getConnection();
			
			try {
				String statementString = "update reiziger set achternaam = '"+reiziger.getNaam()+
	            		 "', gebortedatum = To_date('"+reiziger.getGbdatum()+"','yyyy-mm-dd')"+
	            		 "where reizigerId="+reiziger.getId();
				
				System.out.println(statementString);
				
				PreparedStatement stmt = connection.prepareStatement(statementString);
				int i = stmt.executeUpdate();
				
			} catch (SQLException ex) {
				ex.printStackTrace();
			}
			return reiziger;
	           

	}

	public Reiziger delete(Reiziger reiziger) {
		 Connection connection = super.getConnection();
			
			try {
	            Statement stmt = connection.createStatement();
	             stmt.executeQuery("delete from reiziger where reizigerid = "+reiziger.getId());
			} catch (SQLException ex) {
				ex.printStackTrace();
			}
			return reiziger;
	           

	}

}
