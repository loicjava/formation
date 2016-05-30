package com.formation.formation.bean;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import com.formation.formation.entities.Module;
import com.formation.formation.entities.Salle;
import com.formation.formation.metier.InterMetierModule;


@Controller
@Component("moduleBean")
@SessionScoped
public class ModuleBean {
	
	@Autowired
	private InterMetierModule metierModule;
	
	
	private Module module=new Module();
	private List<Module> tabModule=new ArrayList<Module>(); 
	private Long idModule;
	
	
	public Module getModule() {
		return module;
	} 
	public void setModule(Module module) {
		this.module = module;
	}
	public List<Module> getTabModule() {
		return tabModule;
	}
	public void setTabModule(List<Module> tabModule) {
		this.tabModule = tabModule;
	}
	public Long getIdModule() {
		return idModule;
	}
	public void setIdModule(Long idModule) {
		this.idModule = idModule;
	}
	
	public ModuleBean() {
		super();
	}
	
	/*************Methode****************/
	public void addM(){ 
		metierModule.addModule(this.module);
	}
	
	public List<Module> getModules(){
		tabModule = metierModule.getListModule();
		return tabModule;
	}
	public void suppS(){
		module.setIdModule(null);
		metierModule.deleteModule(idModule);
	}
	public void uppS(){
		metierModule.updateModule(module);
	}
	public void getS(Long id){
		idModule=id;
		module=metierModule.getModule(idModule);
	}
	

}
