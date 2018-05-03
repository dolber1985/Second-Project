package com.project.service;

import com.project.dao.MapDao;
import com.project.model.BuildingEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MapServiceImpl implements MapService {
    @Autowired
    private MapDao mapDao;


    public List<BuildingEntity> getAllHousesByCity(String city) {
        List<BuildingEntity> list = mapDao.listHousesByCity(city);

        return  list;
    }
}
