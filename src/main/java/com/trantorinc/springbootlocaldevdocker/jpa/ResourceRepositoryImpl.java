package com.trantorinc.springbootlocaldevdocker.jpa;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class ResourceRepositoryImpl {
  @PersistenceContext
  private EntityManager em;
}
