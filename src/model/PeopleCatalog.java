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
public class PeopleCatalog {
    private List<People> peopleCatalog;
    public PeopleCatalog() {
        peopleCatalog = new ArrayList<People>();
    }

    public List<People> getPeopleCatalog() {
        return peopleCatalog;
    }

    public void setPeopleCatalog(List<People> peopleCatalog) {
        this.peopleCatalog = peopleCatalog;
    }
      public People addPeople() {
        People p = new People();
        peopleCatalog.add(p);
        return p;
    }

    public void removePeople(People p) {
        peopleCatalog.remove(p);
    }

    public People searchPeople(String Name) {
        for (People people : peopleCatalog) {
            if (people.getName().equals(Name)) {
                return people;
            }
        }
        return null;
    }
      public void addPeople(People p) {
        peopleCatalog.add(p);
    }
}
