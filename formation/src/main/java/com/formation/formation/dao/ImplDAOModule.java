package com.formation.formation.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.formation.formation.entities.Module;

public class ImplDAOModule implements InterDAOModule{
	@PersistenceContext
	private EntityManager em;
	@Override
	public Module addModule(Module m) {
		em.persist(m);
		return m;
	}

	@Override
	public Module updateModule(Module m) {
		
		em.merge(m);
		return m;
	}

	@Override
	public Module getModule(Long idModule) {
		Module m=em.find(Module.class, idModule);
		return m;
	}

	@Override
	public List<Module> getListModule() {
		Query req=(Query) em.createQuery("from Module");
		return req.getResultList();
	}

	@Override
	public Module deleteModule(Long idModule) {
		Module m=em.find(Module.class, idModule);
		em.remove(m);
		return m;
	}

}
