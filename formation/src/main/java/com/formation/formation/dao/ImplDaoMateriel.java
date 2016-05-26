package com.formation.formation.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.apache.log4j.Logger;

import com.formation.formation.entities.Materiel;

public class ImplDaoMateriel implements InterDaoMateriel{
	
	Logger log = Logger.getLogger("ImplDaoEtudiant");
	
	@PersistenceContext
	private EntityManager em;

	@Override
	public Materiel addMateriel(Materiel m) {
		em.persist(m);
		log.info(m.getNomMateriel()+" a bien �t� ajout�.");
		return m;
	}

	@Override
	public List<Materiel> getListMateriel() {
		Query query = em.createQuery("from Materiel m");
		log.info("La liste Materiel est l�.");
		return query.getResultList();
	}

	@Override
	public Materiel updateMateriel(Materiel m) {
		em.merge(m);
		log.info("Modification r�ussie!");
		return m;
	}

	@Override
	public void deleteMateriel(Long idMateriel) {
		Materiel m = em.find(Materiel.class, idMateriel);
		em.remove(m);
		log.info(m.getIdMateriel()+" a bien �t� supprim�.");
		
	}

	@Override
	public Materiel getMateriel(Long idMateriel) {
		Materiel m = em.find(Materiel.class, idMateriel);
		log.info(m.getIdMateriel()+" a bien �t� selectionn�.");
		return m;
	}
	
	

}
