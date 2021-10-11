/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author priyankakuklani
 */
public class Fleet {

    private static ArrayList<Cars> fleet;
    private int maxCarID = 0;
    private Date lastUpdateDate = new Date();

    public Fleet() {
        this.fleet = new ArrayList<Cars>();
    }

    public ArrayList<Cars> getFleet() {
        return fleet;
    }

    public void setFleet(ArrayList<Cars> fleet) {
        this.fleet = fleet;
    }
    
    public Date getLastUpdateDate() {
        return this.lastUpdateDate;
    }

    public int getCarCount() {
        return this.fleet.size();
    }

    public int getAvailableCarCount() {
        int availCar = 0;
        for (int i = 0; i < fleet.size(); i++) {
            if (fleet.get(i).getCurrentAvailability()) {
                availCar++;
            }
        }
        return availCar;
    }

    public int getUnavailableCarCount() {
        int unavailCar = 0;
        for (int i = 0; i < fleet.size(); i++) {
            if (!fleet.get(i).getCurrentAvailability()) {
                unavailCar++;
            }
        }
        return unavailCar;
    }

    public void addUpdateCar(Cars carObj) {
        if (carObj.getCarID() > 0) {
            for (int i = 0; i < fleet.size(); i++) {
                if (carObj.getCarID() == fleet.get(i).getCarID()) {
                    fleet.set(i, carObj);
                    break;
                }
            }
        } else {
            this.maxCarID++;
            carObj.setCarID(maxCarID);
            fleet.add(carObj);
        }
        lastUpdateDate = new Date();
    }
}
