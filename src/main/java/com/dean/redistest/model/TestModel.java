package com.dean.redistest.model;

import java.io.Serializable;

public class TestModel implements Serializable {
    private String info;

    public TestModel(String info) {
        this.info = info;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
