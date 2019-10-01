package com.zensar.daos;


import java.util.List;

import com.zensar.entities.User;

/**
 * @author Priya mirchandani
 * @version 2.0
 * @creation_date 21 sep 2019 5.23 pm
 * @modification_date 28 sep 2019 11.20 am
 * @copyright Zensar Technologies ,All rights reserved
 * @description- it is data access object interface
 *               it is used in persistance layer of application
 *
 */
public interface UserDao {
void insert(User user) ;
void update(User user) ;
void delete(User user) ;
User getByUsername(String username) ;
List<User>getAll();
}
