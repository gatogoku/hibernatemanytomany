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
		
		Role role1 = new Role(101L,"xd","xd");
		Role role2 = new Role(102L,"xd","dd");
		Role role3 = new Role(103L,"gt","gt");
		Role role4 = new Role(104L,"gt","gt");
		Role role5 = new Role(105L,"gt","y");
		Role role6 = new Role(106L,"hy","hy");
		
		//ArrayList <Role>  roles = new ArrayList<>();
		HashSet roles = new HashSet() ;
		
		
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
		
		
		
		//hudao.delete(user2);
		
		
		
		
		

	}

}
