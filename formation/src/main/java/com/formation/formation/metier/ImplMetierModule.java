package com.formation.formation.metier;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.transaction.annotation.Transactional;

import com.formation.formation.dao.InterDAOModule;
import com.formation.formation.entities.Module;

@Transactional
public class ImplMetierModule implements InterMetierModule {
	
	Logger log = Logger.getLogger("ImplMetierModule");
	
	private InterDAOModule daoModule;
	
	public void setDaoModule(InterDAOModule daoModule) {
		this.daoModule = daoModule;
		log.info("dao module injected");
	}

	@Override
	public Module addModule(Module m) {
		
		return daoModule.addModule(m);
	}

	@Override
	public Module updateModule(Module m) {
		
		return daoModule.updateModule(m);
	}

	@Override
	public Module getModule(Long idModule) {
		
		return daoModule.getModule(idModule);
	}

	@Override
	public List<Module> getListModule() {
		
		return daoModule.getListModule();
	}

	@Override
	public Module deleteModule(Long idModule) {
		
		return daoModule.deleteModule(idModule);
	}

}
