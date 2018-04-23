package com.hxm.v1.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.hxm.v1.model.City;
import com.hxm.v1.service.CityService;

public class CityController {
  @Autowired
  private CityService cityService;

  @RequestMapping(value = "/api/city/{id}", method = RequestMethod.GET)
  public String findOneCity(Model model, @PathVariable("id") Long id) {
    model.addAttribute("city", cityService.findCityById(id));
    return "city";
  }

  @RequestMapping(value = "/api/city", method = RequestMethod.GET)
  public String findAllCity(Model model) {
    List<City> cityList = cityService.findAllCity();
    model.addAttribute("cityList", cityList);
    return "cityList";
  }

}
