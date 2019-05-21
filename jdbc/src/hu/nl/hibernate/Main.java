package hu.nl.hibernate;

import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;



import org.hibernate.Session;  
import org.hibernate.SessionFactory;  
import org.hibernate.Transaction;  
import org.hibernate.boot.Metadata;  
import org.hibernate.boot.MetadataSources;  
import org.hibernate.boot.registry.StandardServiceRegistry;  
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class Main {
  private static SessionFactory factory;
  public static void main(String[] args) throws SQLException, ParseException {
      try {
        factory = new Configuration().configure().buildSessionFactory();
      } catch (Throwable ex) {
        System.err.println("Failed to create sessionFactory object." + ex);
        throw new ExceptionInInitializerError(ex);
      }
      Session session = factory.openSession();
      Transaction t = session.beginTransaction();

      Log log = new Log(1,"Hibernate works!");
      Klasgenoot k = new Klasgenoot(4,"Kristiaan","unknown","zoon van god",20);
      Klasgenoot l = (Klasgenoot) session.get(Klasgenoot.class, 1);
      l.setLeeftijd(20);
      
    
//create   //session.save(k);
//read     //System.out.println(session.get(Klasgenoot.class,1));
//update   //session.update(l);   
//delete   //session.delete(k);
      t.commit();  
      System.out.println("successfully");    
      factory.close();  
      session.close();   
  }
}
