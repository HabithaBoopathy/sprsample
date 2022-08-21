package com.model.sample.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="sample")
public class Sample {
    private int sampleNo;

    public int getSampleNo() {
        return sampleNo;
    }

    public void setSampleNo(int sampleNo) {
        this.sampleNo = sampleNo;
    }
}
