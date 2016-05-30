package com.formation.formation.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import com.formation.formation.entities.Etudiant;
import com.formation.formation.metier.InterMetierEtudiant;

@Controller
@Component("beanEtudiant")
@SessionScoped
public class EtudiantBean implements Serializable{
	
	
	private static final long serialVersionUID = 1065141788707597304L;
	

	@Autowired
	private InterMetierEtudiant metierEtudiant;
	
	private Etudiant etudiant=new Etudiant();
	private List<Etudiant> tabEtudiant=new ArrayList<Etudiant>();
	private Long idSession;
	private Long idEtudiant;
	
	
	
	public Long getIdEtudiant() {
		return idEtudiant;
	}

	public void setIdEtudiant(Long idEtudiant) {
		this.idEtudiant = idEtudiant;
	}

	public Etudiant getEtudiant() {
		return etudiant;
	}

	public void setEtudiant(Etudiant etudiant) {
		this.etudiant = etudiant;
	}

	public List<Etudiant> getTabEtudiant() {
		return tabEtudiant;
	}

	public void setTabEtudiant(List<Etudiant> tabEtudiant) {
		this.tabEtudiant = tabEtudiant;
	}
	
	public Long getIdSession() {
		return idSession;
	}

	public void setIdSession(Long idSession) {
		this.idSession = idSession;
	}
	
	

	public EtudiantBean() {
		super();
	}
	
	//Méthodes
	

	public void addEtu(){
		idSession=1L;
		etudiant.setIdEtudiant(null);
		metierEtudiant.addEtudiant(etudiant, idSession);
		
	}
	
	public List<Etudiant> getListEtu(){
		tabEtudiant= metierEtudiant.getListEtudiant();
		return tabEtudiant;
		
	}
	
	public void getEtu(Long idEtu){ 
		idEtudiant=idEtu;
		etudiant=metierEtudiant.getEtudiant(idEtu);
		
		
	}
	
	
	public Etudiant updateEtu(){
		return metierEtudiant.updateEtudiant(etudiant);
		
	}
	
	public void deleteEtu(Long idEtudiant){
		metierEtudiant.deleteEtudiant(idEtudiant);
	}
	
	
	public void addMaterielToEtudiant(Long idMat, Long idEtu){
		metierEtudiant.addMaterielToEtudiant(idMat, idEtu);
	}
	
	
	

}
