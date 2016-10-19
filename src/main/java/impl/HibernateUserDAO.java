package impl;

import java.util.List;


import org.hibernate.Session;
import org.hibernate.SessionFactory;

import dao.UserDAO;
import data.HibernateSession;
import model.User;

public class HibernateUserDAO implements UserDAO{
	
	SessionFactory sessionFactory = null;
	Session session = null;
	
	public void initializaSession(){
		sessionFactory=HibernateSession.getSessionFactory();
		session=sessionFactory.openSession();
	}

	public User selectById(Long id) {
		
		// TODO Auto-generated method stub
		initializaSession();
		User customer = (User) session.get(User.class, id);
		session.close();
		return customer;
	
	}

	public List<User> selectAll() {
		// TODO Auto-generated method stub
		initializaSession();
		List<User> users = session.createCriteria(User.class).list();
		session.close();
		return users;
	}

	public void insert(User user) {
		// TODO Auto-generated method stub
		initializaSession();
		session.beginTransaction();
		Long id =  (Long) session.save(user);
		user.setIdU(id);
		session.getTransaction().commit();
		session.close();
		
	}

	public void update(User user) {
		// TODO Auto-generated method stub
		initializaSession();
		session.beginTransaction();
		session.merge(user);
		session.getTransaction().commit();
		session.close();
		
	}

	public void delete(User user) {
		// TODO Auto-generated method stub
		initializaSession();
		session.beginTransaction();
		session.merge(user);
		session.getTransaction().commit();
		session.close();
		
	}

}
