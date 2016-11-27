package edu.randomvar.mvc.service.impl;

import edu.randomvar.mvc.dao.UsersDAO;
import edu.randomvar.mvc.domain.Users;
import edu.randomvar.mvc.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.inject.Named;
import java.util.List;

@Named("userService")
@Service
public class UsersServiceImpl implements UsersService {

    @Autowired
    private UsersDAO usersDAO;


    @Transactional
    @Override
    public void addUser(Users user) {
        usersDAO.addUser(user);
    }

    @Transactional
    @Override
    public void deleteUser(String username) {
        usersDAO.deleteUser(username);
    }

    @Transactional
    @Override
    public Users getUser(String username) {
        return usersDAO.getUser(username);
    }

    @Transactional
    @Override
    public List<Users> getUsers() {
        return usersDAO.getUsers();
    }
}
