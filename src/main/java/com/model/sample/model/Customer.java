package com.model.sample.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="customer")
public class Customer {
    private int sampleNo;
    private String sampleDate;
    private String customerName;

    public int getSampleNo() {
        return sampleNo;
    }

    public void setSampleNo(int sampleNo) {
        this.sampleNo = sampleNo;
    }

    public String getSampleDate() {
        return sampleDate;
    }

    public void setSampleDate(String sampleDate) {
        this.sampleDate = sampleDate;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
}
