package com.aziz.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.aziz.entities.Projet;
import com.aziz.util.JPAutil;

public class ProjetDao {
	private EntityManager entityManager = JPAutil.getEntityManager("ProjetJPA");

	public void ajouter(Projet p) {
		EntityTransaction tx = entityManager.getTransaction();
		tx.begin();
		entityManager.persist(p);
		tx.commit();

	}

	public void modifier(Projet p) {
		EntityTransaction tx = entityManager.getTransaction();
		tx.begin();
		entityManager.merge(p);
		tx.commit();

	}

	public void supprimer(Projet p) {
		EntityTransaction tx = entityManager.getTransaction();
		tx.begin();
		p = entityManager.merge(p); // important
		entityManager.remove(p);
		tx.commit();
	}

	public Projet consulter(Projet p, Object idProjet) {
		return entityManager.find(p.getClass(), idProjet);
	}

	public List<Projet> listerTous() {
		List<Projet> projets = entityManager.createQuery("select p from Projet p").getResultList();
		return projets;
	}

	public List<Projet> listerParnomProjet(String nomProjet) {
		List<Projet> projets = entityManager.createQuery("select p from Projet p where p.nomProjet like :pnomProjet").setParameter("pnomProjet", "%" + nomProjet + "%").getResultList();
		return projets;
	}

}
