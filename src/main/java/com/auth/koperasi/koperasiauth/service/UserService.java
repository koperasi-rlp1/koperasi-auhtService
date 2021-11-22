package com.auth.koperasi.koperasiauth.service;

import com.auth.koperasi.koperasiauth.entity.Role;
import com.auth.koperasi.koperasiauth.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {

    public User saveUser(User user);
    public Role saveRole(Role role);
    public void addRoleToUser(String username, String roleName);
    public User getUser(String username);
    public List<User> getUsers();
}
