package com.project.service;

import com.project.dao.ServiceDao;
import com.project.model.ServiceEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ServiceServiceImpl implements ServiceService {

    @Autowired
    ServiceDao serviceDao;


    public List<ServiceEntity> getServiceService()  {

        List<ServiceEntity> result = serviceDao.printServices();
        return result;

    }
}
