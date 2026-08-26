package com.pavan.SpringSecurityDemo.repo;

import com.pavan.SpringSecurityDemo.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<Users,Integer> {
    Users findByUsername(String username);
}
