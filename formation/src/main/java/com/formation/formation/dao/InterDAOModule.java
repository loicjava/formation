package com.formation.formation.dao;

import java.util.List;

import com.formation.formation.entities.Module;


public interface InterDAOModule {
	public Module addModule(Module m);
	public Module updateModule(Module m);
	public Module getModule(Long idModule);
	public List<Module>getListModule();
	public Module deleteModule(Long idModule);
	
}
