package com.formation.formation.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@XmlRootElement
public class Salle implements Serializable{
	
	private static final long serialVersionUID = -2895808874724283360L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
private Long idSalle;
private String adresseSalle;
private String nomSalle;
private int capaciteSalle;
@OneToMany(mappedBy="salle")
private List<Sessions> tabsession; 

public Long getIdSalle() {
	return idSalle;
}
public void setIdSalle(Long idSalle) {
	this.idSalle = idSalle;
}
public String getAdresseSalle() {
	return adresseSalle;
}
public void setAdresseSalle(String adresseSalle) {
	this.adresseSalle = adresseSalle;
}
public String getNomSalle() {
	return nomSalle;
}
public void setNomSalle(String nomSalle) {
	this.nomSalle = nomSalle;
}
public int getCapaciteSalle() {
	return capaciteSalle;
}
public void setCapaciteSalle(int capaciteSalle) {
	this.capaciteSalle = capaciteSalle;
}

public List<Sessions> getTabsession() {
	return tabsession;
}
public void setTabsession(List<Sessions> tabsession) {
	this.tabsession = tabsession;
}

public Salle() {
	super();
}
public Salle(String adresseSalle, String nomSalle, int capaciteSalle) {
	super();
	this.adresseSalle = adresseSalle;
	this.nomSalle = nomSalle;
	this.capaciteSalle = capaciteSalle;
}

}
