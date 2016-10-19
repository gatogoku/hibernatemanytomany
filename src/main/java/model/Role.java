package model;

public class Role {
	Long idR;
	String description;
	String name;
	
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

}
