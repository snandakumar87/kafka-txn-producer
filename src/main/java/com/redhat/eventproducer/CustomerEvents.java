package com.redhat.eventproducer;

public class CustomerEvents {

    String custId;
    String transactionAmount;
    String transactionDate;
    String merchantName;
    String transactionCountry;

    @Override
    public String toString() {
        return "CustomerEvents{" +
                "custId='" + custId + '\'' +
                ", transactionAmount='" + transactionAmount + '\'' +
                ", transactionDate='" + transactionDate + '\'' +
                ", merchantName='" + merchantName + '\'' +
                ", transactionCountry='" + transactionCountry + '\'' +
                '}';
    }

    public String getCustId() {
        return custId;
    }

    public void setCustId(String custId) {
        this.custId = custId;
    }

    public String getTransactionAmount() {
        return transactionAmount;
    }

    public void setTransactionAmount(String transactionAmount) {
        this.transactionAmount = transactionAmount;
    }

    public String getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(String transactionDate) {
        this.transactionDate = transactionDate;
    }

    public String getMerchantName() {
        return merchantName;
    }

    public void setMerchantName(String merchantName) {
        this.merchantName = merchantName;
    }

    public String getTransactionCountry() {
        return transactionCountry;
    }

    public void setTransactionCountry(String transactionCountry) {
        this.transactionCountry = transactionCountry;
    }
}
