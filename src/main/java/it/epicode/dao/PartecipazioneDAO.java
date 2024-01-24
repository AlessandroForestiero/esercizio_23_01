package it.epicode.dao;

import it.epicode.entities.Evento;
import it.epicode.entities.Partecipazione;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class PartecipazioneDAO {
    private EntityManagerFactory emf;
    private EntityManager em;

    public PartecipazioneDAO() {
        emf = Persistence.createEntityManagerFactory("gestioneeventi");
        em = emf.createEntityManager();
    }

    public Partecipazione save(Partecipazione p) {
        EntityTransaction et = em.getTransaction();
        et.begin();
        em.persist(p);
        et.commit();
        em.refresh(p);
        return p;
    }
    public Partecipazione getById(int id) {
        return em.find(Partecipazione.class, id);
    }
    public void delete(int id){
        EntityTransaction et=em.getTransaction();
        et.begin();
        Partecipazione p = getById(id);
        em.remove(p);
        et.commit();
    }
}
