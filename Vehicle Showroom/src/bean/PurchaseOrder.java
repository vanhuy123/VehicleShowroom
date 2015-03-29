/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author nguyenvanbien
 */
public class PurchaseOrder {

    private int purchaseId;
    private Account user;
    private Date purchaseDate;
    private boolean status;
    private ArrayList<PurchaseOrderDetails> listPurchaseOrderDetails;

    public PurchaseOrder() {
        listPurchaseOrderDetails = new ArrayList<>();
    }

    public PurchaseOrder(int purchaseId, Account user, Date purchaseDate, boolean status, ArrayList<PurchaseOrderDetails> listPurchaseOrderDetails) {
        this.purchaseId = purchaseId;
        this.user = user;
        this.purchaseDate = purchaseDate;
        this.status = status;
        this.listPurchaseOrderDetails = listPurchaseOrderDetails;
    }

    public int getPurchaseId() {
        return purchaseId;
    }

    public void setPurchaseId(int purchaseId) {
        this.purchaseId = purchaseId;
    }

    public Account getUser() {
        return user;
    }

    public void setUser(Account user) {
        this.user = user;
    }

    public Date getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(Date purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public ArrayList<PurchaseOrderDetails> getListPurchaseOrderDetails() {
        return listPurchaseOrderDetails;
    }

    public void setListPurchaseOrderDetails(ArrayList<PurchaseOrderDetails> listPurchaseOrderDetails) {
        this.listPurchaseOrderDetails = listPurchaseOrderDetails;
    }
}
