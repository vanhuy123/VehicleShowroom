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

    private PurchaseOrder PurchaseId;
    private Vehicle VehicleId;
    private float PurchasePrice;
    private int Quantity;

    public PurchaseOrderDetails() {
    }

    public PurchaseOrderDetails(PurchaseOrder PurchaseId, Vehicle VehicleId, float PurchasePrice, int Quantity) {
        this.PurchaseId = PurchaseId;
        this.VehicleId = VehicleId;
        this.PurchasePrice = PurchasePrice;
        this.Quantity = Quantity;
    }

    public PurchaseOrder getPurchaseId() {
        return PurchaseId;
    }

    public void setPurchaseId(PurchaseOrder PurchaseId) {
        this.PurchaseId = PurchaseId;
    }

    public Vehicle getVehicleId() {
        return VehicleId;
    }

    public void setVehicleId(Vehicle VehicleId) {
        this.VehicleId = VehicleId;
    }

    public float getPurchasePrice() {
        return PurchasePrice;
    }

    public void setPurchasePrice(float PurchasePrice) {
        this.PurchasePrice = PurchasePrice;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int Quantity) {
        this.Quantity = Quantity;
    }

}
