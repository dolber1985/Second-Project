package com.project.service;

import com.project.dao.RegisterDao;
import com.project.model.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.jws.soap.SOAPBinding;
import java.util.List;

@Service
public class RegisterServiceImpl implements RegisterService {

    @Autowired
    RegisterDao registerDao;

    public boolean checkUser(UserEntity newUser) {
        List checkedUser = registerDao.getCheckedUser(newUser);

        if(checkedUser.equals(null)){
            return true;
        }
        return false;
    }

    public UserEntity insertNewUser(UserEntity newUser) {

        registerDao.insertNewUser(newUser);

        return null;
    }
}
