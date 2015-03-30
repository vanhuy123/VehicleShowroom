/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

/**
 *
 * @author nguyenvanbien
 */
public class Vehicle {

    private int vehicleId;
    private String name;
    private String modelNumber;
    private Brand oBrand;

    public Vehicle() {
    }

    public Vehicle(int vehicleId, String name, String modelNumber, Brand oBrand) {
        this.vehicleId = vehicleId;
        this.name = name;
        this.modelNumber = modelNumber;
        this.oBrand = oBrand;
    }

    public int getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(int vehicleId) {
        this.vehicleId = vehicleId;
    }

    public Brand getoBrand() {
        return oBrand;
    }

    public void setoBrand(Brand oBrand) {
        this.oBrand = oBrand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModelNumber() {
        return modelNumber;
    }

    public void setModelNumber(String modelNumber) {
        this.modelNumber = modelNumber;
    }
}
