package com.alanpugachev.shinydisco.repositories;

import com.alanpugachev.shinydisco.entities.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {

}
