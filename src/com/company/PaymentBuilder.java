package com.company;

public class PaymentBuilder {
    private int payID;
    private int moduleCode;
    private String userID;
    private String confirm;

    public PaymentBuilder setPayID(int payID) {
        this.payID = payID;
        return this;
    }

    public PaymentBuilder setModuleCode(int moduleCode) {
        this.moduleCode = moduleCode;
        return this;
    }

    public PaymentBuilder setUserID(String userID) {
        this.userID = userID;
        return this;
    }

    public PaymentBuilder setConfirm(String confirm) {
        this.confirm = confirm;
        return this;
    }

    public Payment createPayment() {
        return new Payment(payID, moduleCode, userID, confirm);
    }
}