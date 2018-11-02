package com.bd.javabase;

public class Util {
    public String[] splitInputValueBySign(String value, String sign){
        String[] valueArr = value.split(sign);
        return valueArr;
    }
}
