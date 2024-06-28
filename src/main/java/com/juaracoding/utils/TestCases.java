package com.juaracoding.utils;

public enum TestCases {

    //Register
    T1("Show Activity Menu"),
    T2("Add To Cart");


    private String testCaseName;
    TestCases(String value){
        testCaseName = value;
    }
    public String getTestCaseName(){
        return testCaseName;
    }
}
