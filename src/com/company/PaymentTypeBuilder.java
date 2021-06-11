package com.company;

public class PaymentTypeBuilder {
    private String id;
    private double paymentType;

    public PaymentTypeBuilder setId(String id) {
        this.id = id;
        return this;
    }

    public PaymentTypeBuilder setPaymentType(double paymentType) {
        this.paymentType = paymentType;
        return this;
    }

    public PaymentType createPaymentType() {
        return new PaymentType(id, paymentType);
    }
}