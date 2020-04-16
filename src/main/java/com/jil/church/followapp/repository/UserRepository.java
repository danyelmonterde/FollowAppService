package com.jil.church.followapp.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jil.church.followapp.model.User;

@Repository
public interface UserRepository extends CrudRepository<User, Integer>{

}
