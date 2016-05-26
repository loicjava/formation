package com.formation.formation.metier;

import java.util.List;

import com.formation.formation.entities.Materiel;

public interface InterMetierMateriel {
	
	public Materiel addMateriel(Materiel m);
	public List<Materiel> getListMateriel();
	public Materiel updateMateriel(Materiel m);
	public void deleteMateriel(Long idMateriel);
	public Materiel getMateriel(Long idMateriel);

}
