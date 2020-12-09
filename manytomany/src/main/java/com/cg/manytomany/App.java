package com.cg.manytomany;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.cg.manytomany.model.Employee;
import com.cg.manytomany.model.Project;

public class App 
{
    public static void main( String[] args )
    {
    	Employee emp1 = new Employee();
        emp1.setName("Aman Soni");
        
        Project trainingProject1 = new Project();
        trainingProject1.setTitle("J2EE Full Stack");
        trainingProject1.setEmployee(emp1);
        Project trainingProject2 = new Project();
        trainingProject2.setTitle("ILP_Full Stack");
        trainingProject2.setEmployee(emp1);
        
        emp1.getProject().add(trainingProject1);
        emp1.getProject().add(trainingProject2);
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA-PU");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(emp1);
        em.persist(trainingProject1);
        em.persist(trainingProject2);
        em.getTransaction().commit();
        em.close();
        emf.close();
    }
}
