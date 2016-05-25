package com.formation.formation.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Examen {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idExamen;
	private String nomExamen;
	
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern="dd-MM-yyyy")
	private Date dateExamen;
	private Double noteExamen;
	
	@ManyToOne
	@JoinColumn(name="idEtudiant")
	private Etudiant etudiant;
	
	
	public Etudiant getEtudiant() {
		return etudiant;
	}
	public void setEtudiant(Etudiant etudiant) {
		this.etudiant = etudiant;
	}
	public Long getIdExamen() {
		return idExamen;
	}
	public void setIdExamen(Long idExamen) {
		this.idExamen = idExamen;
	}
	public String getNomExamen() {
		return nomExamen;
	}
	public void setNomExamen(String nomExamen) {
		this.nomExamen = nomExamen;
	}
	public Date getDateExamen() {
		return dateExamen;
	}
	public void setDateExamen(Date dateExamen) {
		this.dateExamen = dateExamen;
	}
	public Double getNoteExamen() {
		return noteExamen;
	}
	public void setNoteExamen(Double noteExamen) {
		this.noteExamen = noteExamen;
	}
	
	public Examen() {
		super();
	}
	
	public Examen(String nomExamen, Date dateExamen, Double noteExamen) {
		super();
		this.nomExamen = nomExamen;
		this.dateExamen = dateExamen;
		this.noteExamen = noteExamen;
	}
	
	
	
	

}
