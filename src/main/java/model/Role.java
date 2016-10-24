package model;

import java.util.HashSet;
import java.util.Set;

public class Role {
	Long idR;
	String description;
	String name;
	Set<User> users = new HashSet<User>();
	
	
	
	public Role(){}
	public Role(Long id, String description, String name) {
		super();
		this.idR = id;
		this.description = description;
		this.name = name;
	}
	public Long getIdR() {
		return idR;
	}
	public void setIdR(Long id) {
		this.idR = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Set<User> getUsers() {
		return users;
	}
	public void setUsers(Set<User> users) {
		this.users = users;
	}

}
