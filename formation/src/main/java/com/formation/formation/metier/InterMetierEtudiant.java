package com.formation.formation.metier;

import java.util.List;

import com.formation.formation.entities.Etudiant;

public interface InterMetierEtudiant {
	
	public Etudiant addEtudiant(Etudiant et, Long idSession);
	public List<Etudiant> getListEtudiant();
	public Etudiant updateEtudiant(Etudiant et);
	public void deleteEtudiant(Long idEtudiant);
	public void addMaterielToEtudiant(Long idMateriel, Long idEtudiant);

}
