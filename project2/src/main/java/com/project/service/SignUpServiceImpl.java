package com.project.service;

import com.project.dao.SignUpDao;
import com.project.model.LoginEntity;
import org.springframework.beans.factory.annotation.Autowired;

public class SignUpServiceImpl implements SignUpService {

    @Autowired
    SignUpDao signupDao;


    public boolean createUser(LoginEntity entity) {
        return false;
    }
}
