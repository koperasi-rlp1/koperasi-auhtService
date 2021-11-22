package com.auth.koperasi.koperasiauth.repository;

import com.auth.koperasi.koperasiauth.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    public User findByUsername(String username);
}
