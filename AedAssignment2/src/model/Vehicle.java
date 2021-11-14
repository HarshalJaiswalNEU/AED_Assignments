/*
     * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
     * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;

/**
 *
 * @author harshaljaiswal
 */
public class Vehicle {

    private String make;
    private String model;
    private int yearOfMan;
    private int maxSeats;
    private String serialNo;
    private String city;
    private Date maintenanceDate;
    private long updateTime;
    private boolean isAvaliable;
    private String LicencePlate;

    public Vehicle(String make,
            String model,
            int yearOfMan,
            int maxSeats,
            String serialNo,
            String city,
            String maintenanceDate,
            long updateTime,
            boolean isAvaliable,
            String LicencePlate) {

        Date resultdate = new Date(maintenanceDate);

        this.make = make;
        this.model = model;
        this.yearOfMan = yearOfMan;
        this.maxSeats = maxSeats;
        this.serialNo = serialNo;
        this.city = city;
        this.maintenanceDate = resultdate;
        this.isAvaliable = isAvaliable;
        this.updateTime = updateTime;
        this.LicencePlate = LicencePlate;

    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYearOfMan() {
        return yearOfMan;
    }

    public void setYearOfMan(int yearOfMan) {
        this.yearOfMan = yearOfMan;
    }

    public int getMaxSeats() {
        return maxSeats;
    }

    public void setMaxSeats(int maxSeats) {
        this.maxSeats = maxSeats;
    }

    public String getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(String serialNo) {
        this.serialNo = serialNo;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getMaintenanceDate() {

        return maintenanceDate.toString();
    }

    public void setMaintenanceDate(String maintenanceDate) {
        Date resultdate = new Date(maintenanceDate);
        this.maintenanceDate = resultdate;
    }

    public long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(long updateTime) {
        this.updateTime = updateTime;
    }

    public boolean isIsAvaliable() {
        return isAvaliable;
    }

    public void setIsAvaliable(boolean isAvaliable) {
        this.isAvaliable = isAvaliable;
    }

    public String getLicencePlate() {
        return LicencePlate;
    }

    public void setLicencePlate(String LicencePlate) {
        this.LicencePlate = LicencePlate;
    }

}
