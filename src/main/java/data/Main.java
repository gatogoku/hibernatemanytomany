package data;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import impl.HibernateRoleDAO;
import impl.HibernateUserDAO;
import model.Role;
import model.User;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		User user1 = new User(null, "mail","log","pas");
		User user2 = new User(null, "mail","log2","pas2");
		User user3 = new User(null, "mail","log3","pas3");
		
		Role role1 = new Role(null,"xd","xd");
		Role role2 = new Role(null,"xd","dd");
		Role role3 = new Role(null,"gt","gt");
		Role role4 = new Role(null,"gt","gt");
		Role role5 = new Role(null,"gt","y");
		Role role6 = new Role(null,"hy","hy");
		
		//ArrayList <Role>  roles = new ArrayList<>();
		List<Role> roles = new ArrayList<Role>() ;
		
		
		roles.add(role1);
		roles.add(role2);
		roles.add(role3);
		
		
		
		 // HibernateSession hs = new HibernateSession();hs.getSession();
		 
		//List roless = roles;
		
		HibernateUserDAO hudao = new HibernateUserDAO();
		HibernateRoleDAO hrdao = new HibernateRoleDAO();
		
		
		user1.setRoles(roles);
		
		hudao.insert(user1);
	hudao.insert(user2);
		hudao.insert(user3);
		
		
		
		hudao.delete(user2);
		
		
		
		
		

	}

}
