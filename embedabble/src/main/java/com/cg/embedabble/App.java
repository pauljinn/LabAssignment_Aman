package com.cg.embedabble;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.cg.embedabble.model.Address;
import com.cg.embedabble.model.Employee;

public class App 
{
    public static void main( String[] args )
    {
        Employee e = new Employee();
        
        e.setId(101);
        e.setName("Aman");
        
        Address a = new Address();
        a.setCity("Delhi");
        a.setHouseno("820");
        a.setStreet("Naraina");
        a.setZip("1102");
        
        e.setAddress(a);
        
      //1. Create Entity Manager Factory.
    	EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA-PU");
    	
    	//2. Create Entity Manager.
    	EntityManager em = emf.createEntityManager();
    	
    	//3. Begin transaction.
    	em.getTransaction().begin();
    	
    	//4. Perform Transaction.
    	em.persist(e);
    	
    	//5. Commit Transaction.
    	em.getTransaction().commit();
    	
    	//6. Release Resources.
    	em.close();
    	emf.close();
        
    }
}
