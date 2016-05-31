package com.formation.formation.metier;

import java.util.List;

import com.formation.formation.entities.Etudiant;
import com.formation.formation.entities.Examen;

public interface InterMetierExamen {
	
	public Examen addExamen(Examen ex, Long idEtudiant);
	public List<Examen> getListExamen();
	public Examen updateExamen(Examen ex);
	public void deleteExamen(Long idExamen);
	public Examen getExamen(Long idExamen);
	public Etudiant getEtudiantbyE(Long idExamen);
}
