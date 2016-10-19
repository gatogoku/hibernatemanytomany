package impl;

import java.util.List;

import javax.management.relation.Role;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import dao.RoleDAO;
import data.HibernateSession;

public class HibernateRoleDAO implements RoleDAO{

	SessionFactory sessionFactory = null;
	Session session = null;
	
	public void initializaSession(){
		sessionFactory=HibernateSession.getSessionFactory();
		session=sessionFactory.openSession();
	}

	public Role selectById(Long id) {
		
		// TODO Auto-generated method stub
		initializaSession();
		Role customer = (Role) session.get(Role.class, id);
		session.close();
		return customer;
	
	}

	public List<Role> selectAll() {
		// TODO Auto-generated method stub
		initializaSession();
		List<Role> roles = session.createCriteria(Role.class).list();
		session.close();
		return roles;
	}

	public void insert(Role role) {
		// TODO Auto-generated method stub
		/*initializaSession();
		session.beginTransaction();
		Long id =  (Long) session.save(role);
		role.setRoleName(role.getRoleName());
		//role.setRoleValue();
		session.getTransaction().commit();
		session.close();*/
		
	}

	public void update(Role role) {
		// TODO Auto-generated method stub
		initializaSession();
		session.beginTransaction();
		session.merge(role);
		session.getTransaction().commit();
		session.close();
		
	}

	public void delete(Role role) {
		// TODO Auto-generated method stub
		initializaSession();
		session.beginTransaction();
		session.merge(role);
		session.getTransaction().commit();
		session.close();
		
	}

}
