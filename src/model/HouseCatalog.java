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
public class HouseCatalog {
    private List<House> houseCatalog;
        public HouseCatalog() {
        houseCatalog = new ArrayList<House>();
    }

    public List<House> getHouseCatalog() {
        return houseCatalog;
    }

    public void setHouseCCatalog(List<House> houseCatalog) {
        this.houseCatalog = houseCatalog;
    }
      public House addHouse() {
        House h = new House();
        houseCatalog.add(h);
        return h;
    }

    public void removeHouse(House h) {
        houseCatalog.remove(h);
    }

    public House searchPeople(String houseName) {
        for (House house : houseCatalog) {
            if (house.getHouseName().equals(houseName)) {
                return house;
            }
        }
        return null;
    }
      public void addHouse(House h) {
        houseCatalog.add(h);
    }
}
