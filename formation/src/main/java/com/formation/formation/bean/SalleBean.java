package com.formation.formation.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import org.apache.log4j.Logger;
import org.hibernate.boot.model.relational.Loggable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import com.formation.formation.entities.Salle;
import com.formation.formation.metier.InterMetierSalle;
@Controller
@Component("ss")
@RequestScoped
public class SalleBean implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -599706657477041434L;

	@Autowired
	private static InterMetierSalle metierSalle;
	
	private Salle s=new Salle();
	private Long idSalle;
	private List<Salle> listSalle=new ArrayList<Salle>();
	
	public Salle getS() {
		return s;
	}
	public void setS(Salle s) {
		this.s = s;
	}
	public Long getIdSalle() {
		return idSalle;
	}
	public void setIdSalle(Long idSalle) {
		this.idSalle = idSalle;
	}
	public List<Salle> getListSalle() {
		return listSalle;
	}
	public void setListSalle(List<Salle> listSalle) {
		this.listSalle = listSalle;
	}
	
	
	/****** Methodes******/
	
	public Salle addS(){
		return metierSalle.addSalle(this.s);
	}
	
	public List<Salle> getSalle(){
		listSalle = metierSalle.getSalles();
		return listSalle;
	}
	
	

}
