package com.formation.formation.bean;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.formation.formation.entities.Materiel;
import com.formation.formation.metier.InterMetierMateriel;

@Controller
@ManagedBean(name="materielBean")
@SessionScoped
public class MaterielBean {
	Logger log = Logger.getLogger("MaterielBean");
	@Autowired
	private InterMetierMateriel metierMateriel;
	
	
	private Materiel materiel= new Materiel();
	private List<Materiel> tabMateriel=new ArrayList<Materiel>();
	private Long idMateriel;
	
	
	public Materiel getMateriel() {
		return materiel;
	}
	public void setMateriel(Materiel materiel) {
		this.materiel = materiel;
	}
	public List<Materiel> getTabMateriel() {
		return tabMateriel;
	}
	public void setTabMateriel(List<Materiel> tabMateriel) {
		this.tabMateriel = tabMateriel;
	}
	public Long getIdMateriel() {
		return idMateriel;
	}
	public void setIdMateriel(Long idMateriel) {
		this.idMateriel = idMateriel;
	}
	public MaterielBean() {
		super();
	}
	
	
	/*************Methode****************/
	
	public void add(){
		materiel.setIdMateriel(null);
		metierMateriel.addMateriel(materiel);
	}
	
	public List<Materiel> getList(){
		tabMateriel=metierMateriel.getListMateriel();
		return tabMateriel;
	}
	
	public void delete(){
		log.info("delete appelé");
		metierMateriel.deleteMateriel(idMateriel);
	}

}
