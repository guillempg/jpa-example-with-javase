package com.guillempg.app;

import javax.persistence.EntityManager;

public class Main {

    public static void main(String[] args) {
        Address address = new Address();
        address.setCity("Sant Cugat")
                .setCountry("Spain")
                .setPostcode("08173")
                .setStreet("Valles");
        EntityManager em = PersistenceManager.INSTANCE.getEntityManager();
        em.getTransaction().begin();
        em.persist(address);
        em.getTransaction().commit();
        em.close();
        PersistenceManager.INSTANCE.close();
    }
}
