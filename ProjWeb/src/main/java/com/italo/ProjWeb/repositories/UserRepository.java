package com.italo.ProjWeb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.italo.ProjWeb.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
