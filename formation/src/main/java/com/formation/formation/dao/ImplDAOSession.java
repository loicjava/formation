package com.formation.formation.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;






import com.formation.formation.entities.Module;
import com.formation.formation.entities.Salle;
import com.formation.formation.entities.Sessions;



public class ImplDAOSession implements InterDAOSessions{
	@PersistenceContext
	private EntityManager em;

	@Override
	public Sessions addSession(Sessions s, Long idSalle) {
		Salle salle=em.find(Salle.class, idSalle);
		s.setSalle(salle);
		em.persist(s);
		return s;
	}

	@Override
	public Sessions updateSession(Sessions s) {
		em.merge(s);
		return s;
	}

	@Override
	public Sessions getSession(Long idSession) {
		Sessions s=em.find(Sessions.class, idSession);
		return s;
	}

	@Override
	public List<Sessions> getListSession() {
		Query req=(Query) em.createQuery("from Sessions");
		return req.getResultList();
	}

	@Override
	public Sessions deleteSession(Long idSession) {
		Sessions s=em.find(Sessions.class, idSession);
		em.remove(s);
		return s;
	}

	@Override
	public void addModuletoSession(Long idSession, Long idModule) {
		Module m=em.find(Module.class, idModule);
		Sessions s=em.find(Sessions.class, idSession);
		s.getListmodule().add(m);
		em.merge(s);
		
	}

	@Override
	public List<Module> getListSesMod(Long idSession) {
		Query req=(Query) em.createQuery("select s.listmodule from Sessions s where s.idSession = :x");
		req.setParameter("x", idSession);
		return req.getResultList();
	}



}
