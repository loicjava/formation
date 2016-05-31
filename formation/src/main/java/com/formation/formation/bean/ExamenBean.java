package com.formation.formation.bean;

import java.util.List;

import javax.faces.bean.RequestScoped;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import com.formation.formation.entities.Etudiant;
import com.formation.formation.entities.Examen;
import com.formation.formation.metier.InterMetierExamen;

@Controller
@Component("examenBean")
@RequestScoped
public class ExamenBean {
	@Autowired
	private InterMetierExamen metierexamen;
	private  Examen e=new Examen();
    private Long idExamen;
    private Long idEtu;
    private Etudiant etudiant;
    private List<Examen> listExamen;
	
	public Examen getE() {
		return e;
	}
	public void setE(Examen e) {
		this.e = e;
	}
	public Long getIdExamen() {
		return idExamen;
	}
	public void setIdExamen(Long idExamen) {
		this.idExamen = idExamen;
	}
	public List<Examen> getListExamen() {
		return listExamen;
	}
	public void setListExamen(List<Examen> listExamen) {
		this.listExamen = listExamen;
	}
	
	public Long getIdEtu() {
		return idEtu;
	}
	public void setIdEtu(Long idEtu) {
		this.idEtu = idEtu;
	}
	
	public Etudiant getEtudiant() {
		return etudiant;
	}
	public void setEtudiant(Etudiant etudiant) {
		this.etudiant = etudiant;
	}
	public ExamenBean() {
		super();
	}
	/*************Methode****************/
    public void addE(){
    	e.setIdExamen(null);
    	metierexamen.addExamen(e, idEtu);
    }
    public List<Examen> getlistE(){
    	listExamen=metierexamen.getListExamen();
    	return listExamen;
    }
    public void getE(Long id){
    	idExamen=id;
    	e= metierexamen.getExamen(idExamen);
    	etudiant=metierexamen.getEtudiantbyE(idExamen);
    }
    public void uppE(){
    	metierexamen.updateExamen(e);
    }
    public void suppE(){
    	metierexamen.deleteExamen(idExamen);
    }
}
