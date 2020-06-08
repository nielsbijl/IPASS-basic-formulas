package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Body niels = new Body("Niels", 83, 185, 18, "male", 17);

        niels.calculateBMRharrisBenedict();
        System.out.println("harrisBenedict = " + niels.getProductionOfHeatAtCompleteRest() + " cal");
        System.out.println("Rounded integer = " + Math.round(niels.getProductionOfHeatAtCompleteRest()) + " cal \n");

        niels.calculateBMRharrisBenedictRevised();
        System.out.println("harrisBenedictRevised = " + niels.getProductionOfHeatAtCompleteRest() + " cal");
        System.out.println("Rounded integer = " + Math.round(niels.getProductionOfHeatAtCompleteRest()) + " cal \n");

        niels.calculateBMRmifflinStJeor();
        System.out.println("mifflinStJeor = " + niels.getProductionOfHeatAtCompleteRest() + " cal");
        System.out.println("Rounded integer = " + Math.round(niels.getProductionOfHeatAtCompleteRest()) + " cal \n");

        niels.calculateBMRkatchMcArdle();
        System.out.println("katchMcArdle = " + niels.getProductionOfHeatAtCompleteRest() + " cal");
        System.out.println("Rounded integer = " + Math.round(niels.getProductionOfHeatAtCompleteRest()) + " cal \n");

    }
}
