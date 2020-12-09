package com.cg.userdetail;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.cg.userdetail.model.Address;
import com.cg.userdetail.model.UserDetail;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	UserDetail user = new UserDetail();
    	user.setId(101);
    	user.setName("Aman Soni");
    	
    	Address address1 = new Address();
    	address1.setCity("Delhi");
    	address1.setHouseno("Wz-823");
    	address1.setStreet("Naraina");
    	address1.setZip("10028");
    	
    	Address address2 = new Address();
    	address2.setCity("Pune");
    	address2.setHouseno("Pu-78");
    	address2.setStreet("Hinjewadi");
    	address2.setZip("23134");
    	
    	user.getAddress().add(address1);
    	user.getAddress().add(address2);
    	
    	
    	//1. Create Entity Manager Factory.
    	EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA-PU");
    	
    	//2. Create Entity Manager.
    	EntityManager em = emf.createEntityManager();
    	
    	//3. Begin transaction.
    	em.getTransaction().begin();
    	
    	//4. Perform Transaction.
    	em.persist(user);
    	
    	//5. Commit Transaction.
    	em.getTransaction().commit();
    	
    	//6. Release Resources.
    	em.close();
    	emf.close();
    	
    	
    }
}
