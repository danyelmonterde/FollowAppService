package com.jil.church.followapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jil.church.followapp.model.Municipalities;

@Repository
public interface MunicipalitiesRepository extends JpaRepository<Municipalities, String>{

}
