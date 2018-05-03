package com.project.service;

import com.project.model.BuildingEntity;

import java.util.List;

public interface MapService {
    List<BuildingEntity> getAllHousesByCity(String city);
}
