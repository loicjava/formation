package com.formation.formation.metier;

import java.util.List;

import org.apache.log4j.Logger;

import com.formation.formation.dao.InterDaoExamen;
import com.formation.formation.entities.Examen;

public class ImplMetierExamen implements InterMetierExamen{
	
	Logger log = Logger.getLogger("ImplMetierExamen");
	
	private InterDaoExamen daoExamen;
	
	
	public void setDaoExamen(InterDaoExamen daoExamen) {
		this.daoExamen = daoExamen;
		log.info("dao injected");
	}

	@Override
	public Examen addExamen(Examen ex, Long idEtudiant) {

		return daoExamen.addExamen(ex, idEtudiant);
	}

	@Override
	public List<Examen> getListExamen() {

		return daoExamen.getListExamen();
	}

	@Override
	public Examen updateExamen(Examen ex) {

		return daoExamen.updateExamen(ex);
	}

	@Override
	public void deleteExamen(Long idExamen) {

		daoExamen.deleteExamen(idExamen);
		
	}
	
	

}
