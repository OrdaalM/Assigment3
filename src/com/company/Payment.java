package com.company;

public class Payment {

     int payID;
      int moduleCode;
      String userID;
      String Confirm;



    public Payment(int payID, int moduleCode, String userID, String confirm) {
        this.payID= payID;
        this.moduleCode=moduleCode;
        this.userID=userID;
        this.Confirm= confirm;

    }

    public void setConfirm(String confirm) {
        Confirm = confirm;
    }


    public void setModuleCode(int moduleCode) {
        this.moduleCode = moduleCode;
    }

    public String getConfirm() {
        return Confirm;
    }

    public void setPayID(int payID) {
        this.payID = payID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public int getPayID() {
        return payID;
    }

    public String getUserID() {
        return userID;
    }

    public int getModuleCode() {
        return moduleCode;
    }
}




