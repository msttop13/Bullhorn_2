package com.example.demo;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class SimpleDate {
    public static void main(String[] args) throws ParseException{
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
        String date="12/04/2017";
        System.out.println(sdf.parse(date));
    }
}