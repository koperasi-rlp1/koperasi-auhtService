package com.auth.koperasi.koperasiauth.service.implementation;

import com.auth.koperasi.koperasiauth.entity.Role;
import com.auth.koperasi.koperasiauth.entity.User;
import com.auth.koperasi.koperasiauth.repository.RoleRepository;
import com.auth.koperasi.koperasiauth.repository.UserRepository;
import com.auth.koperasi.koperasiauth.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;
import java.util.List;

@Component
@RequiredArgsConstructor
@Transactional
@Slf4j
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository repository;

    @Autowired
    private RoleRepository roleRepository;

    @Override
    public User saveUser(User user) {
        return repository.save(user);
    }

    @Override
    public Role saveRole(Role role) {
        return roleRepository.save(role);
    }

    @Override
    public void addRoleToUser(String username, String roleName) {
        User user = repository.findByUsername(username);
        Role role = roleRepository.findByName(roleName);
        user.getRoles().add(role);
    }

    @Override
    public User getUser(String username) {
        User user = repository.findByUsername(username);
        return user;
    }

    @Override
    public List<User> getUsers() {
        return repository.findAll();
    }
}
