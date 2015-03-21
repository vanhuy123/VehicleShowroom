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
public class SalesOrder {

    private int salesId;
    private Customer customerId;
    private Date salesDate;
    private int status;
    private List<SalesOrderDetails> listSalesOrderDetails;

    public SalesOrder() {
    }

    public SalesOrder(int salesId, Customer customerId, Date salesDate, int status, List<SalesOrderDetails> listSalesOrderDetails) {
        this.salesId = salesId;
        this.customerId = customerId;
        this.salesDate = salesDate;
        this.status = status;
        this.listSalesOrderDetails = listSalesOrderDetails;
    }

    public int getSalesId() {
        return salesId;
    }

    public void setSalesId(int salesId) {
        this.salesId = salesId;
    }

    public Customer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Customer customerId) {
        this.customerId = customerId;
    }

    public Date getSalesDate() {
        return salesDate;
    }

    public void setSalesDate(Date salesDate) {
        this.salesDate = salesDate;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public List<SalesOrderDetails> getListSalesOrderDetails() {
        return listSalesOrderDetails;
    }

    public void setListSalesOrderDetails(List<SalesOrderDetails> listSalesOrderDetails) {
        this.listSalesOrderDetails = listSalesOrderDetails;
    }

}
