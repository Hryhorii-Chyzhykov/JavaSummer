package com.summer.mvc;

public class Model {
    private String value = "";


    public void setValue(String value){

        this.value += value;
    }
    public String getValue() {
        return value;
    }
}
