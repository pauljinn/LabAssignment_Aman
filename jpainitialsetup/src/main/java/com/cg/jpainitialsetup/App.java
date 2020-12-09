package com.cg.jpainitialsetup;

import com.cg.jpainitialsetup.model.UserDetail;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;


public class App 
{
    /**
     * @param args
     */
    /**
     * @param args
     */
    public static void main( String[] args )
    {
    	//readAll();
    	//findOperation(3);
    	//insertOperation("Honey", "Singh", 43);
    	
    	
    }
    
    public static void deleteUsers(int id) {
    	//DAO layer -- will receive one model from service layer.
    	//1. Create Entity Manager Factory - Factory Design Pattern - load driver.
    	EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA-PU");
    	//2. Create Entity Manager - get connection.
    	EntityManager em = emf.createEntityManager();
    	//3. Begin transaction - statement/ create query.
    	em.getTransaction().begin();
    	
    	//4.Finding the user to remove.
    	UserDetail user = em.find(UserDetail.class, id);
    	em.remove(user);
    	
    	//5. Commit changes - automatic.
    	em.getTransaction().commit();
    	
    	//6. Release Resources - stmt and con close.
    	em.close();
    	emf.close();
    }
    
    public static void updateData(int id) {
    	//DAO layer -- will receive one model from service layer.
    	//1. Create Entity Manager Factory - Factory Design Pattern - load driver.
    	EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA-PU");
    	//2. Create Entity Manager - get connection.
    	EntityManager em = emf.createEntityManager();
    	//3. Begin transaction - statement/ create query.
    	em.getTransaction().begin();
    	UserDetail userToFind = em.find(UserDetail.class, id);
    	userToFind.setFirstName("Sher");
    	
    	//5. Commit changes - automatic.
    	em.getTransaction().commit();
    	
    	//6. Release Resources - stmt and con close.
    	em.close();
    	emf.close();
    }
    
    public static void readAll() {
    	//DAO layer -- will receive one model from service layer.
    	//1. Create Entity Manager Factory - Factory Design Pattern - load driver.
    	EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA-PU");
    	//2. Create Entity Manager - get connection.
    	EntityManager em = emf.createEntityManager();
    	//3. Begin transaction - statement/ create query.
    	em.getTransaction().begin();
    	Query query = em.createQuery("select u from UserDetail u");
    	List<UserDetail> ls = (List<UserDetail>) query.getResultList();
    	
    	//5. Commit changes - automatic.
    	em.getTransaction().commit();
    	
    	//6. Release Resources - stmt and con close.
    	em.close();
    	emf.close();
    	
    	for(UserDetail users:ls) {
    		System.out.println(users);
    	}
    }
    
    public static void findOperation(int id) {
    	//1. Create Entity Manager Factory - Factory Design Pattern - load driver.
    	EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA-PU");
    	
    	//2. Create Entity Manager - get connection.
    	EntityManager em = emf.createEntityManager();
    	
    	//3. Begin transaction - statement/ create query.
    	em.getTransaction().begin();
    	
    	//4. Finding the user with given ID.
    	UserDetail userToFind = em.find(UserDetail.class, id);
    	
    	//5. Commit changes - automatic.
    	em.getTransaction().commit();
    	
    	//6. Release Resources - stmt and con close.
    	em.close();
    	emf.close();
    	
    	if(userToFind==null) {
    		System.out.println("No user Exist with the given ID");
    	}
    	else {
    		System.out.println(userToFind);
    	}
    }
    
    public static void insertOperation(String firstName, String lastName,int age) {
    	UserDetail user = new UserDetail();
    	user.setFirstName(firstName);
    	user.setLastName(lastName);
    	user.setAge(age);
  
    	//1. Create Entity Manager Factory - Factory Design Pattern - load driver.
    	EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA-PU");
    	
    	//2. Create Entity Manager - get connection.
    	EntityManager em = emf.createEntityManager();
    	
    	//3. Begin transaction - statement/ create query.
    	em.getTransaction().begin();
    	
    	//4. Perform transaction- execute query.
    	em.persist(user);
    
    	//5. Commit changes - automatic.
    	em.getTransaction().commit();
    	
    	//6. Release Resources - stmt and con close.
    	em.close();
    	emf.close();
    }
    
    //public void 
}
