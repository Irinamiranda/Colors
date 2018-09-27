package com.company;
import java.util.Random;

public class Colors {

    private String redColor;
    private String blueColor;
    private String greyColor;

    public String getRedColor() {
        return redColor;

    }

    public void setRedColor(String redColor) {
        this.redColor = redColor;
        System.out.println("It pops!");
    }

    public String getBlueColor() {
        return blueColor;
    }

    public void setBlueColor(String blueColor) {
        this.blueColor = blueColor;
        System.out.println("It is a nice color");
    }

    public String getGreyColor() {
        return greyColor;
    }

    public void setGreyColor(String greyColor) {
        this.greyColor = greyColor;
        System.out.println("OK");
    }
}
