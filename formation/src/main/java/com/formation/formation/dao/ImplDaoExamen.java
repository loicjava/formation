package com.formation.formation.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.apache.log4j.Logger;

import com.formation.formation.entities.Etudiant;
import com.formation.formation.entities.Examen;

public class ImplDaoExamen implements InterDaoExamen{
	
	Logger log = Logger.getLogger("ImplDaoExamen");
	
	@PersistenceContext
	private EntityManager em;
	

	@Override
	public Examen addExamen(Examen ex, Long idEtudiant) {
		Etudiant et = em.find(Etudiant.class, idEtudiant);
		ex.setEtudiant(et);
		em.persist(ex);
		log.info(ex.getIdExamen()+" a bien été ajouté.");
		return ex;
	}

	@Override
	public List<Examen> getListExamen() {
		Query query = em.createQuery("from Examen e");
		log.info("La liste Examen est là.");
		return query.getResultList();
	}

	@Override
	public Examen updateExamen(Examen ex) {
		em.merge(ex);
		log.info("Modification réussie!");
		return ex;
	}

	@Override
	public void deleteExamen(Long idExamen) {
		Examen ex = em.find(Examen.class, idExamen);
		em.remove(ex);
		log.info(ex.getIdExamen()+" a bien été supprimé.");
	}

	@Override
	public Examen getExamen(Long idExamen) {
		Examen query = (Examen) em.createQuery("from Examen e where e.idExamen ="+idExamen).getSingleResult();
		return query;
	}


	
}
