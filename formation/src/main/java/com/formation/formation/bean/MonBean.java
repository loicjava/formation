package com.formation.formation.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.formation.formation.entities.Module;
import com.formation.formation.metier.InterMetierModule;

@Controller
@RequestScoped
@ManagedBean(name="adel")
public class MonBean {
    @Autowired
	private InterMetierModule metier;
    
    Module m = new Module();
    
    
    

	public Module getM() {
		return m;
	}

	public void setM(Module m) {
		this.m = m;
	}
    
	   public void addM(){
	    	this.metier.addModule(m);
	      }
    
	
	
	
}
