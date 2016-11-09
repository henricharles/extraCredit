package Controllerpack;

import java.sql.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import model.Volunteer;

public class App {
	public static void main(String arg[])
	{
		SessionFactory fc;
		
		
		Configuration c = new Configuration();
		fc=c.configure().buildSessionFactory();
		 @SuppressWarnings("deprecation")
		
		 Session session = fc.openSession();
		 Transaction  tx=session.beginTransaction(); 
//		 Volunteer v1=new Volunteer();
//		 Date d1=new Date(2014, 02, 11);
//		 v1.setDob(d1);
//		 v1.setName("heheh");
//		 session.persist(v1);
		 System.out.println("Session Is Opened :: "+session.isOpen());
		 
		 System.out.println(session.isConnected());
		 tx.commit();
		 session.close();
		 fc.close();
		 	
	
	
		 
		 
	}

}
