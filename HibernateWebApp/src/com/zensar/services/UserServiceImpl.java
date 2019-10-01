package com.zensar.services;

/**
 * @author Priya mirchandani
 * @version 2.0
 * @creation_date 21 sep 2019 5.23 pm
 * @modification_date 28 sep 2019 11.47 am
 * @copyright Zensar Technologies ,All rights reserved
 * @description- it is a class using hibernate 
 *
 */

import java.util.List;

import com.zensar.daos.UserDao;
import com.zensar.entities.User;
import com.zensar.exceptions.ServiceException;

public class UserServiceImpl implements UserService {
  private UserDao userDao;
  
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public void addUser(User user) throws ServiceException {
		// TODO Auto-generated method stub
		try
		{
			userDao.insert(user);
		}
		catch(Exception e)
		{
			throw new ServiceException(e.getMessage());
		}
	}

	@Override
	public void updateUser(User user) throws ServiceException {
		userDao.update(user);
	}

	@Override
	public void removeUser(User user) throws ServiceException {
		userDao.delete(user);
		}

	@Override
	public User findUserByUsername(String username) throws ServiceException {
		User user=userDao.getByUsername(username);
		  return user;
		
	}

	@Override
	public List<User> findAllUsers() throws ServiceException {
		return userDao.getAll();
	}

	@Override
	public boolean validateUser(User user) throws ServiceException {
		// TODO Auto-generated method stub
		User dbuser=findUserByUsername(user.getUsername());
		if(dbuser!=null&&dbuser.getPassword().equals(user.getPassword()))
            return true;
         else
	
		return false;
	}

}
