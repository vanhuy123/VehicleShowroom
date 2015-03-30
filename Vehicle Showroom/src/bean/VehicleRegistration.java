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
public class VehicleRegistration {

    private int registrationId;
    private PurchaseOrder oPurchaseOrder;
    private Vehicle oVehicle;
    private float price;
    private String remarks;
    private String color;

    public VehicleRegistration() {
    }

    public VehicleRegistration(int registrationId, PurchaseOrder oPurchaseOrder, Vehicle oVehicle, float price, String remarks, String color) {
        this.registrationId = registrationId;
        this.oPurchaseOrder = oPurchaseOrder;
        this.oVehicle = oVehicle;
        this.price = price;
        this.remarks = remarks;
        this.color = color;
    }

    public int getRegistrationId() {
        return registrationId;
    }

    public void setRegistrationId(int registrationId) {
        this.registrationId = registrationId;
    }

    public PurchaseOrder getoPurchaseOrder() {
        return oPurchaseOrder;
    }

    public void setoPurchaseOrder(PurchaseOrder oPurchaseOrder) {
        this.oPurchaseOrder = oPurchaseOrder;
    }

    public Vehicle getoVehicle() {
        return oVehicle;
    }

    public void setoVehicle(Vehicle oVehicle) {
        this.oVehicle = oVehicle;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
}
