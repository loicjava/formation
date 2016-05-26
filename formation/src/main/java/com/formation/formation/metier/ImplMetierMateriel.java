package com.formation.formation.metier;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.transaction.annotation.Transactional;

import com.formation.formation.entities.Materiel;

@Transactional
public class ImplMetierMateriel implements InterMetierMateriel {
	
	Logger log = Logger.getLogger("ImplMetierMateriel");
	
	private InterMetierMateriel daoMateriel;

	public void setDaoMateriel(InterMetierMateriel daoMateriel) {
		this.daoMateriel = daoMateriel;
		log.info("dao metier injected");
	}
	

	@Override
	public Materiel addMateriel(Materiel m) {
		
		return daoMateriel.addMateriel(m);
	}

	@Override
	public List<Materiel> getListMateriel() {
		
		return daoMateriel.getListMateriel();
	}

	@Override
	public Materiel updateMateriel(Materiel m) {
		
		return daoMateriel.updateMateriel(m);
	}

	@Override
	public void deleteMateriel(Long idMateriel) {
		daoMateriel.deleteMateriel(idMateriel);

	}

	@Override
	public Materiel getMateriel(Long idMateriel) {
		
		return daoMateriel.getMateriel(idMateriel);
	}

}
