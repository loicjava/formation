package com.formation.formation.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Sessions {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
private Long idSession;
private String nomSession;
@Temporal(TemporalType.DATE)
@DateTimeFormat(pattern="dd-MM-yyyy")
private Date dateDebutSession;
@Temporal(TemporalType.DATE)
@DateTimeFormat(pattern="dd-MM-yyyy")
private Date dateFinSession;
@ManyToMany
@JoinTable(name="sessionmodule")
private List<Module> listmodule; 
@ManyToOne
@JoinColumn(name="idSalle")
private Salle salle;
@OneToMany(mappedBy="sessions")
private List<Etudiant> listetudiant;
public Long getIdSession() {
	return idSession;
}

public List<Etudiant> getListetudiant() {
	return listetudiant;
}

public void setListetudiant(List<Etudiant> listetudiant) {
	this.listetudiant = listetudiant;
}

public void setIdSession(Long idSession) {
	this.idSession = idSession;
}
public String getNomSession() {
	return nomSession;
}
public void setNomSession(String nomSession) {
	this.nomSession = nomSession;
}
public Date getDateDebutSession() {
	return dateDebutSession;
}
public void setDateDebutSession(Date dateDebutSession) {
	this.dateDebutSession = dateDebutSession;
}
public Date getDateFinSession() {
	return dateFinSession;
}
public void setDateFinSession(Date dateFinSession) {
	this.dateFinSession = dateFinSession;
}
public List<Module> getListmodule() {
	return listmodule;
}
public void setListmodule(List<Module> listmodule) {
	this.listmodule = listmodule;
}
public Salle getSalle() {
	return salle;
}
public void setSalle(Salle salle) {
	this.salle = salle;
}
public Sessions() {
	super();
}
public Sessions(String nomSession, Date dateDebutSession, Date dateFinSession) {
	super();
	this.nomSession = nomSession;
	this.dateDebutSession = dateDebutSession;
	this.dateFinSession = dateFinSession;
}


}
