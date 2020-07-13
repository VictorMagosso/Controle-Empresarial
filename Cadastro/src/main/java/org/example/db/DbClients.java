package org.example.db;

import org.example.ClientController;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceUnit;

public class DbClients {
    @PersistenceUnit
    public void inserirDados() {
        ClientController client = new ClientController();
        client.setNome("vic");

        EntityManagerFactory factory = Persistence.createEntityManagerFactory("cadastroHibernate");
        EntityManager manager = factory.createEntityManager();
        manager.getTransaction().begin();
        manager.persist(client);
        manager.getTransaction().commit();

        System.out.println(client.getId());
        System.out.println(client.getNome());
        manager.close();
    }
}
