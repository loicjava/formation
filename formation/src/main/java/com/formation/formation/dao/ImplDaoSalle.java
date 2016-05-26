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
		log.info(s.getIdSalle()+" a bien été enregistré");
		return s;
	}

	@Override
	public Salle updateSalle(Salle s) {
		em.merge(s);
		log.info(s.getIdSalle()+" a bien été modifié");
		return s;
	}

	@Override
	public Salle getSalle(Long idSalle) {
		Salle s= em.find(Salle.class, idSalle);
		log.info(s.getIdSalle()+" a bien été trouvé");
		return s;
	}

	@Override
	public Salle deleteSalle(Long idSalle) {
		Salle s= em.find(Salle.class, idSalle);
		em.remove(s);
		log.info(s.getIdSalle()+" a bien été supprimé");
		return s;
	}

	@Override
	public List<Salle> getSalles() {
		Query query=em.createQuery("from Classe");
		log.info("La liste des salles a été chargée");
		return query.getResultList();
	}

}
