package com.formation.formation.metier;

import java.util.List;

import org.apache.log4j.Logger;

import com.formation.formation.dao.InterDaoEtudiant;
import com.formation.formation.entities.Etudiant;

public class ImplMetierEtudiant implements InterMetierEtudiant{
	
	Logger log = Logger.getLogger("ImplMetierEtudiant");
	
	private InterDaoEtudiant daoEtudiant;
	
	
	public void setDaoEtudiant(InterDaoEtudiant daoEtudiant) {
		this.daoEtudiant = daoEtudiant;
		log.info("dao injected");
	}

	@Override
	public Etudiant addEtudiant(Etudiant et, Long idSession) {
		
		return daoEtudiant.addEtudiant(et, idSession);
	}

	@Override
	public List<Etudiant> getListEtudiant() {

		return daoEtudiant.getListEtudiant();
	}

	@Override
	public Etudiant updateEtudiant(Etudiant et) {

		return daoEtudiant.updateEtudiant(et);
	}

	@Override
	public void deleteEtudiant(Long idEtudiant) {
		daoEtudiant.deleteEtudiant(idEtudiant);
		
	}

	@Override
	public void addMaterielToEtudiant(Long idMateriel, Long idEtudiant) {
		daoEtudiant.addMaterielToEtudiant(idMateriel, idEtudiant);
		
	}
	
	

}
