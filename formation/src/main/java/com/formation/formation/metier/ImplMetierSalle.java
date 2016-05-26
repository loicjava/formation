package com.formation.formation.metier;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.transaction.annotation.Transactional;

import com.formation.formation.dao.InterDaoSalle;
import com.formation.formation.entities.Salle;


@Transactional
public class ImplMetierSalle implements InterMetierSalle{
	
	Logger log = Logger.getLogger("ImplMetierClasse");
	
	private InterDaoSalle daoSalle;

	public void setDaoSalle(InterDaoSalle daoSalle) {
		this.daoSalle = daoSalle;
		log.info("dao salle injected");
	}

	@Override
	public Salle addSalle(Salle s) {
		
		return daoSalle.addSalle(s);
	}

	@Override
	public Salle updateSalle(Salle s) {
		
		return daoSalle.updateSalle(s);
	}

	@Override
	public Salle getSalle(Long idSalle) {
		
		return daoSalle.getSalle(idSalle);
	}

	@Override
	public Salle deleteSalle(Long idSalle) {
		
		return daoSalle.deleteSalle(idSalle);
	}

	@Override
	public List<Salle> getClasses() {
		
		return daoSalle.getClasses();
	}
	
	
	
	

}
