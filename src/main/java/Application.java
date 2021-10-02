import org.hibernate.Transaction;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Application {

    private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("maven-test");

    public static void main(String[] args) {
        System.out.println("test");

        Customer customer = new Customer();
        customer.setId("gayan");
        EntityManager entityManager = emf.createEntityManager();
        EntityTransaction tx = entityManager.getTransaction();
        tx.begin();
        entityManager.persist(customer);
        tx.commit();
        entityManager.close();







    }
}
