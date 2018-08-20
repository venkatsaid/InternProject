package com.example.user.internproject;

public class Myorder {
    String Grandtotal,Rate,Servicerequired,amount,bn,date,image,name,paymentstatus,role,status,wheretowork;

    public Myorder(String grandtotal, String rate, String servicerequired, String amount, String bn, String date, String image, String name, String paymentstatus, String role, String status, String wheretowork) {
        Grandtotal = grandtotal;
        Rate = rate;
        Servicerequired = servicerequired;
        this.amount = amount;
        this.bn = bn;
        this.date = date;
        this.image = image;
        this.name = name;
        this.paymentstatus = paymentstatus;
        this.role = role;
        this.status = status;
        this.wheretowork = wheretowork;
    }

    public String getGrandtotal() {
        return Grandtotal;
    }

    public String getRate() {
        return Rate;
    }

    public String getServicerequired() {
        return Servicerequired;
    }

    public String getAmount() {
        return amount;
    }

    public String getBn() {
        return bn;
    }

    public String getDate() {
        return date;
    }

    public String getImage() {
        return image;
    }

    public String getName() {
        return name;
    }

    public String getPaymentstatus() {
        return paymentstatus;
    }

    public String getRole() {
        return role;
    }

    public String getStatus() {
        return status;
    }

    public String getWheretowork() {
        return wheretowork;
    }

    public void setGrandtotal(String grandtotal) {
        Grandtotal = grandtotal;
    }

    public void setRate(String rate) {
        Rate = rate;
    }

    public void setServicerequired(String servicerequired) {
        Servicerequired = servicerequired;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public void setBn(String bn) {
        this.bn = bn;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPaymentstatus(String paymentstatus) {
        this.paymentstatus = paymentstatus;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setWheretowork(String wheretowork) {
        this.wheretowork = wheretowork;
    }
}
