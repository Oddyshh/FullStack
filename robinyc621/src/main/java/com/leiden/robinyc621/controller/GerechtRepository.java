package com.leiden.robinyc621.controller;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.leiden.robinyc621.domein.Gerecht;

@Component
public interface GerechtRepository extends CrudRepository<Gerecht, Long>{

}
