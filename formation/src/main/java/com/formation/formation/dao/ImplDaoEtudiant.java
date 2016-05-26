package com.formation.formation.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.apache.log4j.Logger;

import com.formation.formation.entities.Etudiant;
import com.formation.formation.entities.Materiel;
import com.formation.formation.entities.Sessions;


public class ImplDaoEtudiant implements InterDaoEtudiant{
	
	Logger log = Logger.getLogger("ImplDaoEtudiant");
	
	@PersistenceContext
	private EntityManager em;

	@Override
	public Etudiant addEtudiant(Etudiant et, Long idSession) {
		Sessions s = em.find(Sessions.class, idSession);
		et.setSessions(s);
		em.persist(et);
		log.info(et.getIdEtudiant()+" a bien été ajouté.");
		return et;
	}

	@Override
	public List<Etudiant> getListEtudiant() {
		Query query = em.createQuery("from Etudiant e");
		log.info("La liste des Etudiants est là.");
		return query.getResultList();
	}

	@Override
	public Etudiant updateEtudiant(Etudiant et) {
		em.merge(et);
		log.info("Modification réussie!");
		return et;
	}

	@Override
	public void deleteEtudiant(Long idEtudiant) {
		Etudiant et = em.find(Etudiant.class, idEtudiant);
		em.remove(et);
		log.info(et.getIdEtudiant()+" a bien été supprimé.");
		
	}

	@Override
	public void addMaterielToEtudiant(Long idMateriel, Long idEtudiant) {
		Materiel m = em.find(Materiel.class, idMateriel);
		Etudiant et = em.find(Etudiant.class, idEtudiant);
		et.getTabMateriel().add(m);
		log.info(m.getIdMateriel()+" a bien été attribué à "+et.getIdEtudiant());
		
		
	}

}
