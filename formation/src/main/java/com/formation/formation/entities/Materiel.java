package com.formation.formation.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**/

@Entity
public class Materiel {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idMateriel;
	private String nomMateriel;
	private String etatMateriel;
	
	public Long getIdMateriel() {
		return idMateriel;
	}
	public void setIdMateriel(Long idMateriel) {
		this.idMateriel = idMateriel;
	}
	public String getNomMateriel() {
		return nomMateriel;
	}
	public void setNomMateriel(String nomMateriel) {
		this.nomMateriel = nomMateriel;
	}
	public String getEtatMateriel() {
		return etatMateriel;
	}
	public void setEtatMateriel(String etatMateriel) {
		this.etatMateriel = etatMateriel;
	}
	
	public Materiel() {
		super();
	}
	public Materiel(String nomMateriel, String etatMateriel) {
		super();
		this.nomMateriel = nomMateriel;
		this.etatMateriel = etatMateriel;
	}
	
	
	

}
