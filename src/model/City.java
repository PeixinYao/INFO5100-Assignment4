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
public class City {
    private String cityNmae;
     private CommunityCatalog communityCatalog;
         public City() {
        communityCatalog = new CommunityCatalog();
    }
    public String getCityNmae() {
        return cityNmae;
    }

    public void setCityNmae(String cityNmae) {
        this.cityNmae = cityNmae;
    }
    public CommunityCatalog getCommunityCatalog() {
        return communityCatalog;
    }

    public void setCommunityCatalog(CommunityCatalog communityCatalog) {
        this.communityCatalog = communityCatalog;
    }
                 public String toString() {
        return cityNmae; 
    }

}
