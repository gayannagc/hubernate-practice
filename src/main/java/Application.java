import org.hibernate.Session;
import org.hibernate.Transaction;

import javax.naming.Context;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.transaction.UserTransaction;
import java.security.MessageDigest;

public class Application {


    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("maven-test");
        EntityManager em = emf.createEntityManager();

        EntityTransaction transaction = em.getTransaction();
        transaction.begin();
        Message message = new Message();
        message.setText("test text");
        em.persist(message);
        transaction.commit();
        emf.close();


    }
}
