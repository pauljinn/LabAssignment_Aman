package com.cg.onetoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.cg.onetoone.model.Employee;
import com.cg.onetoone.model.Project;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Employee emp1 = new Employee();
        emp1.setName("Aman Soni");
        
        Project trainingProject = new Project();
        trainingProject.setTitle("J2EE Full Stack");
        
        emp1.setProject(trainingProject);
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA-PU");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(emp1);
        em.persist(trainingProject);
        em.getTransaction().commit();
        em.close();
        emf.close();
    }
}
