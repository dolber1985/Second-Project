package com.project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.dao.LoginDao;
import com.project.model.LoginEntity;

@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    LoginDao loginDao;

    public boolean authenticateUser(LoginEntity loginEntity){
        LoginEntity login = loginDao.getLoginById(loginEntity.getUsername());
        if(login!=null){
            if(login.getPassword().equals(loginEntity.getPassword()) && login.getUsername().equals(loginEntity.getUsername())){
                return true;
            }
        }
        return false;
    }

}
