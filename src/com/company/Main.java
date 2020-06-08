package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Body niels = new Body("Niels", 83, 185, 18, "male", 17);
        niels.calculateBMRharrisBenedict();
        System.out.println("harrisBenedict = " + niels.getProductionOfHeatAtCompleteRest() + " cal");
    }
}
