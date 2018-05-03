package com.project.controller;


import com.google.gson.Gson;
import com.project.model.BuildingEntity;
import com.project.service.MapService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class MapController {

    @Autowired
    private MapService mapService;

    @RequestMapping(value="mapController", method=RequestMethod.GET)
    public ModelAndView printHouses(HttpServletRequest request) {
        String city = request.getParameter("city");

        List<BuildingEntity> buildings = mapService.getAllHousesByCity(city);
        String json_buildings = new Gson().toJson(buildings);

        ModelAndView model = new ModelAndView();

        if(!buildings.isEmpty()) {
            model.addObject("places", json_buildings);
            model.setViewName("map");
        }
        else {
            model.addObject("error","No houses found, sorry :(");
            model.setViewName("map");
        }

        return model;
    }
}
