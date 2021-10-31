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
public class Community {
    private String communityName;
     private HouseCatalog houseCatalog;
             public Community() {
        houseCatalog = new HouseCatalog();
    }

    public String getCommunityName() {
        return communityName;
    }

    public void setCommunityName(String communityName) {
        this.communityName = communityName;
    }

    public HouseCatalog getHouseCatalog() {
        return houseCatalog;
    }

    public void setHouseCatalog(HouseCatalog houseCatalog) {
        this.houseCatalog = houseCatalog;
    }
                         public String toString() {
        return communityName; 
    }
 
}
