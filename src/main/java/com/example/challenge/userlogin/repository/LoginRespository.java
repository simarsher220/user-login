package com.example.challenge.userlogin.repository;

import com.example.challenge.userlogin.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface LoginRespository extends CrudRepository<User, UUID> {
}
