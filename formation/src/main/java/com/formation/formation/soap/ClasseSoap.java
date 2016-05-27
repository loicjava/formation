package com.formation.formation.soap;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

import org.springframework.beans.factory.annotation.Autowired;

import com.formation.formation.entities.Salle;
import com.formation.formation.metier.InterMetierSalle;

@WebService
@SOAPBinding
public class ClasseSoap {
	
	@Autowired
	InterMetierSalle metierSalle;
	
	
	@WebMethod
	public Salle addSalle(@WebParam Salle s){
		return metierSalle.addSalle(s);
	}
	
	@WebMethod
	public Salle updateSalle(@WebParam Salle s){
		return metierSalle.updateSalle(s);
	}
	
	@WebMethod
	public Salle getSalle(@WebParam Long idSalle){
		return metierSalle.getSalle(idSalle);
	}
	
	@WebMethod
	public Salle deleteSalle(@WebParam Long idSalle){
		return metierSalle.deleteSalle(idSalle);
	}
	
	@WebMethod
	public List<Salle> getSalles(){
		return metierSalle.getSalles();
	}

}
