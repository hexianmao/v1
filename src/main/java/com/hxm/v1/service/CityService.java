package com.hxm.v1.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
import com.hxm.v1.model.City;

@Service
public class CityService {

  public City findCityById(Long id) {
    return new City();
  }

  public List<City> findAllCity() {
    List<City> list = new ArrayList<>();
    list.add(new City());
    return list;
  }

}
