package com.springbootboilerplate.security.repository;

import com.springbootboilerplate.security.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    //Optional<Role> findByName(ERole name);
    Role findByName(String role);
}
