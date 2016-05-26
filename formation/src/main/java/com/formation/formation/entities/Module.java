package com.formation.formation.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@XmlRootElement
public class Module {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
private Long idModule;
private String nomModule;
private int dureeModule;
private String description;
public Long getIdModule() {
	return idModule;
}
public void setIdModule(Long idModule) {
	this.idModule = idModule;
}
public String getNomModule() { 
	return nomModule;
}
public void setNomModule(String nomModule) {
	this.nomModule = nomModule;
}
public int getDureeModule() {
	return dureeModule;
}
public void setDureeModule(int dureeModule) {
	this.dureeModule = dureeModule;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public Module() {
	super();
}
public Module(String nomModule, int dureeModule, String description) {
	super();
	this.nomModule = nomModule;
	this.dureeModule = dureeModule;
	this.description = description;
}

}
