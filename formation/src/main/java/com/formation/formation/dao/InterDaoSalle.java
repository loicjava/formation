package com.formation.formation.dao;

import java.util.List;

import com.formation.formation.entities.Salle;

public interface InterDaoSalle {
	
	public Salle addSalle(Salle s);
	public Salle updateSalle(Salle s);
	public Salle getSalle(Long idSalle);
	public Salle deleteSalle(Long idSalle);
	public List<Salle> getClasses();

}
