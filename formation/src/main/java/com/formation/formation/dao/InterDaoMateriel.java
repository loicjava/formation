package com.formation.formation.dao;

import java.util.List;

import com.formation.formation.entities.Materiel;

public interface InterDaoMateriel {
	
	public Materiel addMateriel(Materiel m);
	public List<Materiel> getListMateriel();
	public Materiel updateMateriel(Materiel m);
	public void deleteMateriel(Long idMateriel);

}
