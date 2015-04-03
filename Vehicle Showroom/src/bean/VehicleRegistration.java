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

    private int RegistrationId;
    private PurchaseOrder purchaseId;
    private Vehicle vehicleId;
    private float price;
    private String remarks;
    private String type;

    public VehicleRegistration() {
    }

    public VehicleRegistration(int RegistrationId, PurchaseOrder purchaseId, Vehicle vehicleId, float price, String remarks, String type) {
        this.RegistrationId = RegistrationId;
        this.purchaseId = purchaseId;
        this.vehicleId = vehicleId;
        this.price = price;
        this.remarks = remarks;
        this.type = type;
    }

    public int getRegistrationId() {
        return RegistrationId;
    }

    public void setRegistrationId(int RegistrationId) {
        this.RegistrationId = RegistrationId;
    }

    public PurchaseOrder getPurchaseId() {
        return purchaseId;
    }

    public void setPurchaseId(PurchaseOrder purchaseId) {
        this.purchaseId = purchaseId;
    }

    public Vehicle getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(Vehicle vehicleId) {
        this.vehicleId = vehicleId;
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

    public String getType() {
        return type;
    }

    public void settype(String type) {
        this.type = type;
    }

}
