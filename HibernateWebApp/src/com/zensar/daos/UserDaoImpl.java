package com.zensar.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.zensar.entities.User;
/**
 * @author Priya mirchandani
 * @version 2.0
 * @creation_date 21 sep 2019 11.13 am
 * @modification_date 28 sep 2019 11.14 am
 * @copyright Zensar Technologies ,All rights reserved
 * @description- it is data access object interface implementor class
 *               it is used in persistance layer of application
 *
 */
public class UserDaoImpl implements UserDao {
    private Session s;
    public UserDaoImpl() {
		
    Configuration c=new Configuration().configure();
    SessionFactory f=c.buildSessionFactory();
    s=f.openSession();
 
    }
   
	@Override
	public void insert(User user) {
	Transaction t=s.beginTransaction();
	s.save(user);
	t.commit();
		
	}

	@Override
	public void update(User user) {
		Transaction t=s.beginTransaction();
		s.update(user);
		t.commit();
	}

	@Override
	public void delete(User user) {
		Transaction t=s.beginTransaction();
		s.delete(user);
		t.commit();
	}

	@Override
	public User getByUsername(String username) {
	
		return s.get(User.class, username);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<User> getAll() {
		Query q=s.createQuery("from User");
		return q.getResultList();
	}
     
	
}
