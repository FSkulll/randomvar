package edu.randomvar.mvc.dao.impl;

import edu.randomvar.mvc.dao.UsersDAO;
import edu.randomvar.mvc.domain.*;
import org.hibernate.Hibernate;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UsersDAOImpl implements UsersDAO {

    @Qualifier("sessionFactory")
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void addUser(Users user) {
        user.setEnabled(1);
        UserRoles userRole = new UserRoles();
        userRole.setUsername(user.getUsername());
        userRole.setRole(ListRole.ROLE_USER.toString());
        sessionFactory.getCurrentSession().save(user);
        sessionFactory.getCurrentSession().save(userRole);
    }

    @Override
    public void deleteUser(String username) {
        Users user = (Users) sessionFactory.getCurrentSession().get(Users.class, username);
        if(user != null){
            sessionFactory.getCurrentSession().delete(user);
        }
    }

    @Override
    public Users getUser(String username) {
        Users user = (Users) sessionFactory.getCurrentSession().get(Users.class, username);
        return user;
    }

    @Override
    public List<Users> getUsers() {
        return sessionFactory.getCurrentSession().createQuery("from users").list();
    }


}
