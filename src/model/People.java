/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author yaopeixinmac
 */
public class People {
    String name;
    String house;
    String Community;
    String City;
    boolean bloodpressure;
    EncounterHistory encounterHistory;

    public EncounterHistory getEncounterHistory() {
        return encounterHistory;
    }

    public void setEncounterHistory(EncounterHistory encounterHistory) {
        this.encounterHistory = encounterHistory;
    }
    public String getHouse() {
        return house;
    }

    public void setHouse(String house) {
        this.house = house;
    }

    public String getCommunity() {
        return Community;
    }

    public void setCommunity(String Community) {
        this.Community = Community;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String City) {
        this.City = City;
    }

    public boolean isBloodpressure() {
        if(encounterHistory==null||encounterHistory.getEncounterHistory()==null||encounterHistory.getEncounterHistory().size()==0){
            return false;
        }
        int size=encounterHistory.getEncounterHistory().size();
        if(encounterHistory.getEncounterHistory().get(size-1).getVitalsigns().getBloodpressure()>140){
            return true;
        }else{
            return false;
        }
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
   public String toString() {
        return name; 
    }
}
