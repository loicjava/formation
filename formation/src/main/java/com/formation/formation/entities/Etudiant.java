package com.formation.formation.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


import org.springframework.format.annotation.DateTimeFormat;

/**/

@Entity
public class Etudiant {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idEtudiant;
	private String nomEtudiant;
	private String prenomEtudiant;
	
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern="dd-MM-yyyy")
	private Date dateNaissanceEtudiant;
	private String telEtudiant;
	private String mailEtudiant;
	private String adresseEtudiant;
	private String specialiteEtudiant;
	
	
	@OneToMany
	@JoinColumn(name="idEtudiant")
	private List<Materiel> tabMateriel = new ArrayList<Materiel>();
	
	@OneToMany(mappedBy="etudiant")
	private List<Examen> tabExamen = new ArrayList<Examen>();
	
	@ManyToOne
	@JoinColumn(name="idSessions")
	private Sessions sessions;
	
	
	
	public List<Materiel> getTabMateriel() {
		return tabMateriel;
	}
	public void setTabMateriel(List<Materiel> tabMateriel) {
		this.tabMateriel = tabMateriel;
	}
	public List<Examen> getTabExamen() {
		return tabExamen;
	}
	public void setTabExamen(List<Examen> tabExamen) {
		this.tabExamen = tabExamen;
	}
	public Sessions getSessions() {
		return sessions;
	}
	public void setSessions(Sessions sessions) {
		this.sessions = sessions;
	}
	public Long getIdEtudiant() {
		return idEtudiant;
	}
	public void setIdEtudiant(Long idEtudiant) {
		this.idEtudiant = idEtudiant;
	}
	public String getNomEtudiant() {
		return nomEtudiant;
	}
	public void setNomEtudiant(String nomEtudiant) {
		this.nomEtudiant = nomEtudiant;
	}
	public String getPrenomEtudiant() {
		return prenomEtudiant;
	}
	public void setPrenomEtudiant(String prenomEtudiant) {
		this.prenomEtudiant = prenomEtudiant;
	}
	public Date getDateNaissanceEtudiant() {
		return dateNaissanceEtudiant;
	}
	public void setDateNaissanceEtudiant(Date dateNaissanceEtudiant) {
		this.dateNaissanceEtudiant = dateNaissanceEtudiant;
	}
	public String getTelEtudiant() {
		return telEtudiant;
	}
	public void setTelEtudiant(String telEtudiant) {
		this.telEtudiant = telEtudiant;
	}
	public String getMailEtudiant() {
		return mailEtudiant;
	}
	public void setMailEtudiant(String mailEtudiant) {
		this.mailEtudiant = mailEtudiant;
	}
	public String getAdresseEtudiant() {
		return adresseEtudiant;
	}
	public void setAdresseEtudiant(String adresseEtudiant) {
		this.adresseEtudiant = adresseEtudiant;
	}
	public String getSpecialiteEtudiant() {
		return specialiteEtudiant;
	}
	public void setSpecialiteEtudiant(String specialiteEtudiant) {
		this.specialiteEtudiant = specialiteEtudiant;
	}
	
	public Etudiant() {
		super();
	}
	public Etudiant(String nomEtudiant, String prenomEtudiant,
			Date dateNaissanceEtudiant, String telEtudiant,
			String mailEtudiant, String adresseEtudiant,
			String specialiteEtudiant) {
		super();
		this.nomEtudiant = nomEtudiant;
		this.prenomEtudiant = prenomEtudiant;
		this.dateNaissanceEtudiant = dateNaissanceEtudiant;
		this.telEtudiant = telEtudiant;
		this.mailEtudiant = mailEtudiant;
		this.adresseEtudiant = adresseEtudiant;
		this.specialiteEtudiant = specialiteEtudiant;
	}
	
	
	

}
