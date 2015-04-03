/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.util.Date;
import java.util.List;

/**
 *
 * @author nguyenvanbien
 */
public class PurchaseOrder {

    private int purchaseId;
    private Account userId;
    private Date purchaseDate;
    private int status;
    private List<PurchaseOrderDetails> listPurchaseOrderDetails;

    public PurchaseOrder() {
    }

    public PurchaseOrder(int purchaseId, Account userId, Date purchaseDate, int status, List<PurchaseOrderDetails> listPurchaseOrderDetails) {
        this.purchaseId = purchaseId;
        this.userId = userId;
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

    public Account getUserId() {
        return userId;
    }

    public void setUserId(Account userId) {
        this.userId = userId;
    }

    public Date getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(Date purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public List<PurchaseOrderDetails> getListPurchaseOrderDetails() {
        return listPurchaseOrderDetails;
    }

    public void setListPurchaseOrderDetails(List<PurchaseOrderDetails> listPurchaseOrderDetails) {
        this.listPurchaseOrderDetails = listPurchaseOrderDetails;
    }

    
    
}
