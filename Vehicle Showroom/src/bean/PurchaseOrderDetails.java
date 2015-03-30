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
public class PurchaseOrderDetails {

    private PurchaseOrder purchaseId;
    private Vehicle oVehicle;
    private float purchasePrice;
    private int quantity;

    public PurchaseOrderDetails() {
    }

    public PurchaseOrderDetails(PurchaseOrder purchaseId, Vehicle oVehicle, float purchasePrice, int quantity) {
        this.purchaseId = purchaseId;
        this.oVehicle = oVehicle;
        this.purchasePrice = purchasePrice;
        this.quantity = quantity;
    }

    public PurchaseOrder getPurchaseId() {
        return purchaseId;
    }

    public void setPurchaseId(PurchaseOrder purchaseId) {
        this.purchaseId = purchaseId;
    }

    public Vehicle getoVehicle() {
        return oVehicle;
    }

    public void setoVehicle(Vehicle oVehicle) {
        this.oVehicle = oVehicle;
    }

    public float getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(float purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
}
