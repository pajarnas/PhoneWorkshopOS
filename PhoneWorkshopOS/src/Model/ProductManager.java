package Model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class ProductManager {
	public static void main(String[] args) {
		 
        Configuration cfg = new Configuration();
        cfg.configure();
        
        
        SessionFactory sf = cfg.buildSessionFactory();
        
      
        Session session = sf.openSession();
        
       
        Transaction tx = session.beginTransaction();
      
        Product product = new Product();
        product.setId(1);
        product.setName("iPhone");
        product.setQuality(5);
        product.setWarehouse_id(1);
        session.save(product);
        tx.commit();
        session.close();
        sf.close();

    }
}

