package com.example.question1;

import java.sql.Timestamp;
import java.util.Date;

public class Supply {
    private String productId;
    private String updateTimeStamp;
    private int quantity;
    private String status;

    public Supply(){}

    public Supply(String productId, String updateTimeStamp, int quantity, String status) {
        this.setProductId(productId);
        this.setUpdateTimeStamp(updateTimeStamp);
        this.setQuantity(quantity);
        this.setStatus(status);
    }
    public String getId() {
        return productId;
    }

    public void setProductId(String id) {
        this.productId = id;
    }

    public String getUpdateTimeStamp() {
        return updateTimeStamp;
    }

    public void setUpdateTimeStamp(String timeStamp) {
        this.updateTimeStamp = timeStamp;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int qty) {
        this.quantity = qty;
    }
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    @Override
    public String toString() {
        return "{" +
                "productid:" + productId +
                ", updateTimeStamp:'" + updateTimeStamp + '\'' +
                ", quantity:'" + quantity + '\'' +
                '}';
    }
}
