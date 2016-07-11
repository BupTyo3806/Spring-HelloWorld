package com.example.repositories;

import com.example.domain.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {

    User findOneByName(String name);
}
