import utils.HibernateUtil;

import javax.persistence.EntityManager;

public class App {
    public static void main(String[] args) {
        HibernateUtil instance = HibernateUtil.getInstance();
        EntityManager entityManager = instance.getEntityManager();

    }
}
