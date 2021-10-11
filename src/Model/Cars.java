/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Date;

/**
 *
 * @author priyankakuklani
 */
public class Cars {
    private int carID;
    private String registrationState;
    private String vehicleNumber;
    private String modelNumber;
    private String manufacturerName;
    private int maxSeat;
    private int minSeat;
    private Date manufactureDate;
    private Date mainIssue;
    private Date mainExpiry;
    private String city;
    private Date dateFrom;
    private boolean currAvail;

    public int getCarID() {
        return carID;
    }

    public void setCarID(int carID) {
        this.carID = carID;
    }
    
    public String getRegistrationState() {
        return registrationState;
    }

    public void setRegistrationState(String regState) {
        this.registrationState = regState;
    }
    
    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public String getModelNumber() {
        return modelNumber;
    }

    public void setModelNumber(String modelNumber) {
        this.modelNumber = modelNumber;
    }

    public String getManufacturerName() {
        return manufacturerName;
    }

    public void setManufacturerName(String manufacturerName) {
        this.manufacturerName = manufacturerName;
    }

    public int getMaxSeat() {
        return maxSeat;
    }

    public void setMaxSeat(int maxSeat) {
        this.maxSeat = maxSeat;
    }

    public int getMinSeat() {
        return minSeat;
    }

    public void setMinSeat(int minSeat) {
        this.minSeat = minSeat;
    }

    public Date getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(Date manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    public Date getMainIssue() {
        return mainIssue;
    }

    public void setMainIssue(Date mainIssue) {
        this.mainIssue = mainIssue;
    }

    public Date getMainExpiry() {
        return mainExpiry;
    }

    public void setMainExpiry(Date mainExpiry) {
        this.mainExpiry = mainExpiry;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public boolean getCurrentAvailability() {
        return currAvail;
    }
    
    public String getCurrentAvailabilityText() {
        return currAvail ? "Yes" : "No";
    }

    public void setCurrentAvailability(boolean avail) {
        this.currAvail = avail;
    }
    
    public Date getDateFrom() {
        return dateFrom;
    }

    public void setDateFrom(Date dateFrom) {
        this.dateFrom = dateFrom;
    }
    
    public boolean getPermitValid() {
        return this.mainExpiry.after(new Date());
    }
    
    public String getPermitValidText() {
        return getPermitValid() ? "Yes" : "No";
    }
    
}
