package com.formation.formation.metier;

import java.util.List;

import com.formation.formation.entities.Module;

public interface InterMetierModule {
	
	public Module addModule(Module m);
	public Module updateModule(Module m);
	public Module getModule(Long idModule);
	public List<Module>getListModule();
	public Module deleteModule(Long idModule);

}
