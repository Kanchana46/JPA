package com.code.JPA;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class App 
{
    public static void main( String[] args )
    {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
        EntityManager em = emf.createEntityManager();
        
        Student std = em.find(Student.class, 6); // Get data
        System.out.println(std);
        
        Student student = new Student();
        student.setId(25);
        student.setName("Test Name");
        student.setMarks(85);
        
        em.getTransaction().begin();
        em.persist(student);         // Save data
        em.getTransaction().commit();
    }
}
