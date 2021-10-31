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
public class House {
    private String houseName;
    private PeopleCatalog peopleCatalog;
        public House() {
        peopleCatalog = new PeopleCatalog();
    }

    public String getHouseName() {
        return houseName;
    }

    public void setHouseName(String houseName) {
        this.houseName = houseName;
    }

    public PeopleCatalog getPeopleCatalog() {
        return peopleCatalog;
    }

    public void setPeopleCatalog(PeopleCatalog peopleCatalog) {
        this.peopleCatalog = peopleCatalog;
    }
             public String toString() {
        return houseName; 
    }

}
