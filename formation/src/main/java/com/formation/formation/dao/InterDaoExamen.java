package com.formation.formation.dao;

import java.util.List;

import com.formation.formation.entities.Examen;

public interface InterDaoExamen {
	

	public Examen addExamen(Examen ex, Long idEtudiant);
	public List<Examen> getListExamen();
	public Examen updateExamen(Examen ex);
	public void deleteExamen(Long idExamen);
	public Examen getExamen(Long idExamen);

}
