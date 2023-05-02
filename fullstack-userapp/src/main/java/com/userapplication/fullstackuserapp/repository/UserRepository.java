package com.userapplication.fullstackuserapp.repository;

import com.userapplication.fullstackuserapp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
