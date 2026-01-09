package com.fooddelivery.fooddelivery.model;

import java.util.Date;

public class Delivery {
   private int delId;
   private int orderId;
   private Date createdOn;
   private String status;

    public int getDelPartnerId() {
        return delPartnerId;
    }

    public void setDelPartnerId(int delPartnerId) {
        this.delPartnerId = delPartnerId;
    }

    public int getDelId() {
        return delId;
    }

    public void setDelId(int delId) {
        this.delId = delId;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getToPlace() {
        return toPlace;
    }

    public void setToPlace(String toPlace) {
        this.toPlace = toPlace;
    }

    public String getFromPlace() {
        return fromPlace;
    }

    public void setFromPlace(String fromPlace) {
        this.fromPlace = fromPlace;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    private int delPartnerId;
   private String toPlace;
   private String fromPlace;
   private int distance;
}
