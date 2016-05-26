package com.formation.formation.soap;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import org.springframework.beans.factory.annotation.Autowired;

import com.formation.formation.entities.Materiel;
import com.formation.formation.metier.InterMetierMateriel;

@WebService
public class MaterielSoap {
	
	@Autowired
	InterMetierMateriel metierMateriel;
	
	@WebMethod
	public Materiel addMateriel(@WebParam Materiel m){
		return metierMateriel.addMateriel(m);
	}
	
	@WebMethod
	public List<Materiel> getListMateriel(){
		return metierMateriel.getListMateriel();
	}
	
	@WebMethod
	public Materiel updateMateriel(@WebParam Materiel m){
		return metierMateriel.updateMateriel(m);
	}
	
	@WebMethod
	public void deleteMateriel(@WebParam Long idMateriel){
		metierMateriel.deleteMateriel(idMateriel);
	}
	
	@WebMethod
	public Materiel getMateriel(@WebParam Long idMateriel){
		return metierMateriel.getMateriel(idMateriel);
	}
	

}
