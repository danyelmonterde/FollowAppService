package com.jil.church.followapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jil.church.followapp.model.UserAccount;

@Repository
public interface UserAccountRepository extends JpaRepository<UserAccount, String>{

}
