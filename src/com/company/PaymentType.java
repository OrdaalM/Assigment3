package com.company;

public class PaymentType {
String id;
double paymentType;


    public PaymentType(String id ,double paymentType) {
        this.id=id;
        this.paymentType=paymentType;

    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setPaymentType(double paymentType) {
        this.paymentType = paymentType;
    }

    public double getPaymentType() {
        return paymentType;
    }
}
