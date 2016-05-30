package com.formation.formation.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.SessionScoped;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import com.formation.formation.entities.Materiel;
import com.formation.formation.entities.Module;
import com.formation.formation.entities.Sessions;
import com.formation.formation.metier.InterMetierModule;
import com.formation.formation.metier.InterMetierSessions;




@Controller
@Component("sessionBean")
@SessionScoped
public class SessionBean implements Serializable {

	private static final long serialVersionUID = -9126184046547608409L;
	
	@Autowired
	private InterMetierSessions metierSessions;
	@Autowired
	private InterMetierModule metierModule;
	
	private Sessions sessions=new Sessions();
	private List<Sessions> tabSessions= new ArrayList<Sessions>();
	private List<Module> tabModule= new ArrayList<Module>();
	private List<Module> tabSesMod= new ArrayList<Module>();
	private Long idSession;
	private Long idSalle;
	private Long idModule;
	
	public Sessions getSessions() {
		return sessions;
	}
	public void setSessions(Sessions sessions) {
		this.sessions = sessions;
	}
	public List<Sessions> getTabSessions() {
		return tabSessions;
	}
	public void setTabSessions(List<Sessions> tabSessions) {
		this.tabSessions = tabSessions;
	}
	public Long getIdSession() {
		return idSession;
	}
	public void setIdSession(Long idSession) {
		this.idSession = idSession;
	}
	public Long getIdSalle() {
		return idSalle;
	}
	public void setIdSalle(Long idSalle) {
		this.idSalle = idSalle;
	}
	public Long getIdModule() {
		return idModule;
	}
	public void setIdModule(Long idModule) {
		this.idModule = idModule;
	}
	public List<Module> getTabSesMod() {
		return tabSesMod;
	}
	public void setTabSesMod(List<Module> tabSesMod) {
		this.tabSesMod = tabSesMod;
	}
	public List<Module> getTabModule() {
		return tabModule;
	}
	public void setTabModule(List<Module> tabModule) {
		this.tabModule = tabModule;
	}
	public SessionBean() {
		super();
	}
	
	/*************Methode****************/
	
	public void add(){
		sessions.setIdSession(null);
		metierSessions.addSession(sessions, idSalle);
	}
	
	public List<Sessions> getList(){
		tabSessions=metierSessions.getListSession();
		return tabSessions;
	}
	
	public void delete(){
		metierSessions.deleteSession(idSession);
	}
	
	public void getSes(Long id){
		idSession=id;
		sessions = metierSessions.getSession(idSession);
	}
	
	public void update(){
		metierSessions.updateSession(sessions);
	}
	
	public void addMtoS(){
		metierSessions.addModuletoSession(idSession, idModule);
	}
	
	public List<Module> getListMod(){
		tabModule= new ArrayList<Module>();
		tabSesMod=metierSessions.getListSesMod(idSession);
		for(Module m:metierModule.getListModule()){
			Boolean b=true;
			for(Module m2:tabSesMod){
				if(m.getIdModule()==m2.getIdModule()){
					b=false;
					break;
				}
			}
			if(b){
				tabModule.add(m);
			}
		}
		return tabModule;
	}
	
	/*public List<Module> getListSesMod(){
		tabSesMod=metierSessions.getListSesMod(idSession);
		return tabSesMod;
	}*/

}
