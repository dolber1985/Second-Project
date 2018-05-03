package com.project.dao;


import com.project.model.LoginEntity;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

public interface LoginDao {


    public LoginEntity getLoginById(String username);
}

