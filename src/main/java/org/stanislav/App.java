package org.stanislav;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.stanislav.models.Animal;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args ) {
        Animal animal = new Animal(4,"Test Animal",true);

        SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .buildSessionFactory();

        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(animal);
        System.out.println("All animals from  created table:");
        System.out.println(session.createQuery("FROM Animal").getResultList());
        session.getTransaction().commit();

        session.close();
        sessionFactory.close();
    }
}
