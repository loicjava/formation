package com.formation.formation.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.apache.log4j.Logger;

import com.formation.formation.entities.Salle;

public class ImplDaoSalle implements InterDaoSalle {
	
	Logger log = Logger.getLogger("ImplDaoSalle");
			
	@PersistenceContext
	 private EntityManager em;

	@Override
	public Salle addSalle(Salle s) {
		em.persist(s);
		log.info(s.getIdSalle()+" a bien �t� enregistr�");
		return s;
	}

	@Override
	public Salle updateSalle(Salle s) {
		em.merge(s);
		log.info(s.getIdSalle()+" a bien �t� modifi�");
		return s;
	}

	@Override
	public Salle getSalle(Long idSalle) {
		Salle s= em.find(Salle.class, idSalle);
		log.info(s.getIdSalle()+" a bien �t� trouv�");
		return s;
	}

	@Override
	public Salle deleteSalle(Long idSalle) {
		Salle s= em.find(Salle.class, idSalle);
		em.remove(s);
		log.info(s.getIdSalle()+" a bien �t� supprim�");
		return s;
	}

	@Override
	public List<Salle> getSalles() {
		Query query=em.createQuery("from Classe");
		log.info("La liste des salles a �t� charg�e");
		return query.getResultList();
	}

}
