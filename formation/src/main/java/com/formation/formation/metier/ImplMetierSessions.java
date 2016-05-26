package com.formation.formation.metier;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.formation.formation.dao.InterDAOModule;
import com.formation.formation.dao.InterDAOSessions;
import com.formation.formation.entities.Sessions;

@Transactional
public class ImplMetierSessions implements InterMetierSessions{
	private InterDAOSessions daoSessions;
	
	public void setDaoSessions(InterDAOSessions daoSessions) {
		this.daoSessions = daoSessions;
	}

	@Override
	public Sessions addSession(Sessions s, Long idSalle) {
		
		return daoSessions.addSession(s, idSalle);
	}

	@Override
	public Sessions updateSession(Sessions s) {
		
		return daoSessions.updateSession(s);
	}

	@Override
	public Sessions getSession(Long idSession) {
		
		return daoSessions.getSession(idSession);
	}

	@Override
	public List<Sessions> getListSession() {
		
		return daoSessions.getListSession();
	}

	@Override
	public Sessions deleteSession(Long idSession) {
		
		return daoSessions.deleteSession(idSession);
	}

	@Override
	public void addModuletoSession(Long idSession, Long idModule) {
		daoSessions.addModuletoSession(idSession, idModule);
		
	}

}
