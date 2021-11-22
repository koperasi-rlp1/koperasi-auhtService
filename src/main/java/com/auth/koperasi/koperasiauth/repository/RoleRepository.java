package com.auth.koperasi.koperasiauth.repository;

import com.auth.koperasi.koperasiauth.entity.Role;
import com.auth.koperasi.koperasiauth.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {

    public Role findByName(String name);
}
