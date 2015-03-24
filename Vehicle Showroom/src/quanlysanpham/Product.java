/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlysanpham;

import java.io.Serializable;

/**
 *
 * @author HUY
 */
public class Product implements Serializable {

    private static final long serialVersionUID = 1L;
    private String productId;

    private String productName;

    private String description;

    private double unitPrice;

    private int quantity;

    public String getProductId() {

        return productId;

    }

    public void setProductId(String productId) {

        this.productId = productId;

    }

    public String getProductName() {

        return productName;

    }

    public void setProductName(String productName) {

        this.productName = productName;

    }

    public String getDescription() {

        return description;

    }

    public void setDescription(String description) {

        this.description = description;

    }

    public double getUnitPrice() {

        return unitPrice;

    }

    public void setUnitPrice(double unitPrice) {

        this.unitPrice = unitPrice;

    }

    public int getQuantity() {

        return quantity;

    }

    public void setQuantity(int quantity) {

        this.quantity = quantity;

    }

    public Product(String productId, String productName,
            String description, double unitPrice, int quantity) {

        super();

        this.productId = productId;

        this.productName = productName;

        this.description = description;

        this.unitPrice = unitPrice;

        this.quantity = quantity;

    }

    public Product() {

        super();

    }

}
