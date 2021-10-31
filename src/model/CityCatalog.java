/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author yaopeixinmac
 */
public class CityCatalog {
        private List<City> cityCatalog;
        public CityCatalog() {
        cityCatalog = new ArrayList<City>();
    }

    public List<City> getCityCatalog() {
        return cityCatalog;
    }

    public void setCityCatalog(List<City> cityCatalog) {
        this.cityCatalog = cityCatalog;
    }
    public City addCity() {
        City c = new City();
        cityCatalog.add(c);
        return c;
    }

    public void removeCity(City c) {
        cityCatalog.remove(c);
    }

    public City searchCity(String cityName) {
        for (City city : cityCatalog) {
            if (city.getCityNmae().equals(cityName)) {
                return city;
            }
        }
        return null;
    }
      public void addCity(City c) {
        cityCatalog.add(c);
    }
}
