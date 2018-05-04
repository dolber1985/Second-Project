package com.project.dao;

import com.project.model.ServiceEntity;

import java.sql.SQLException;
import java.util.List;

public interface ServiceDao {
    //public boolean authenticateUser(LoginEntity loginBean);
    public List<ServiceEntity> printServices();
    public List<ServiceEntity> searchKeyWord(String keyword);
}
