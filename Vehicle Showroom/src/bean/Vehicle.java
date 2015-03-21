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

    private int VehicleId;
    private String name;
    private String modelNumber;
    private Brand brandId;

    public Vehicle() {
    }

    public Vehicle(int VehicleId, String name, String modelNumber, Brand brandId) {
        this.VehicleId = VehicleId;
        this.name = name;
        this.modelNumber = modelNumber;
        this.brandId = brandId;
    }

    public int getVehicleId() {
        return VehicleId;
    }

    public void setVehicleId(int VehicleId) {
        this.VehicleId = VehicleId;
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

    public Brand getBrandId() {
        return brandId;
    }

    public void setBrandId(Brand brandId) {
        this.brandId = brandId;
    }

}
