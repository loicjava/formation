package com.formation.formation.metier;

import java.util.List;

import com.formation.formation.entities.Module;
import com.formation.formation.entities.Sessions;

public interface InterMetierSessions {
	public Sessions addSession(Sessions s, Long idSalle);
	public Sessions updateSession(Sessions s);
	public Sessions getSession(Long idSession);
	public List<Sessions>getListSession();
	public Sessions deleteSession(Long idSession);
	public void addModuletoSession(Long idSession,Long idModule);
	public List<Module>getListSesMod(Long idSession);
}
