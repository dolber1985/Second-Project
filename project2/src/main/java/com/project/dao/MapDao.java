package com.project.dao;

import com.project.model.BuildingEntity;

import java.util.List;

public interface MapDao {
    List<BuildingEntity> listHousesByCity(String city);
}
