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
public class SalesOrderDetails {

    private VehicleRegistration registrationId;
    private SalesOrder salesId;
    private float salesPrice;
    private int quantity;

    public SalesOrderDetails() {
    }

    public SalesOrderDetails(VehicleRegistration registrationId, SalesOrder salesId, float salesPrice, int quantity) {
        this.registrationId = registrationId;
        this.salesId = salesId;
        this.salesPrice = salesPrice;
        this.quantity = quantity;
    }

    public VehicleRegistration getRegistrationId() {
        return registrationId;
    }

    public void setRegistrationId(VehicleRegistration registrationId) {
        this.registrationId = registrationId;
    }

    public SalesOrder getSalesId() {
        return salesId;
    }

    public void setSalesId(SalesOrder salesId) {
        this.salesId = salesId;
    }

    public float getSalesPrice() {
        return salesPrice;
    }

    public void setSalesPrice(float salesPrice) {
        this.salesPrice = salesPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

}
