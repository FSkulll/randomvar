package edu.randomvar.mvc.service;

import edu.randomvar.mvc.domain.Users;

import java.util.List;

public interface UsersService {
    void addUser(Users user);
    void deleteUser(String username);
    Users getUser(String username);
    List<Users> getUsers();
}
