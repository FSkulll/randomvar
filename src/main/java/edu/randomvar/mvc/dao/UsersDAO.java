package edu.randomvar.mvc.dao;

import edu.randomvar.mvc.domain.Users;

import java.util.List;

public interface UsersDAO {
    void addUser(Users user);
    void deleteUser(String username);
    Users getUser(String username);
    List<Users> getUsers();
}
