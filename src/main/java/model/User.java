package model;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class User {
	
	Long idU;
	String email;
	String login;
	String password;
	HashSet roles = new HashSet() ;
	
	
	public HashSet getRoles() {
		return roles;
	}
	public void setRoles(HashSet roles) {
		this.roles = roles;
	}
	public User(){}
	public User(Long id, String email, String login, String password) {
		super();
		this.idU = id;
		this.email = email;
		this.login = login;
		this.password = password;
	}
	
	public Long getIdU() {
		return idU;
	}
	public void setIdU(Long id) {
		this.idU = id;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}
