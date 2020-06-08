package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("-----------------------------------\n" +
                            "--------------MALE BODY------------\n" +
                            "-----------------------------------\n");

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


        System.out.println("\n-----------------------------------\n" +
                "-------------FEMALE BODY-----------\n" +
                "-----------------------------------\n");

        Body roos = new Body("Roos", 48, 165, 18, "female", 25);

        roos.calculateBMRharrisBenedict();
        System.out.println("harrisBenedict = " + roos.getProductionOfHeatAtCompleteRest() + " cal");
        System.out.println("Rounded integer = " + Math.round(roos.getProductionOfHeatAtCompleteRest()) + " cal \n");

        roos.calculateBMRharrisBenedictRevised();
        System.out.println("harrisBenedictRevised = " + roos.getProductionOfHeatAtCompleteRest() + " cal");
        System.out.println("Rounded integer = " + Math.round(roos.getProductionOfHeatAtCompleteRest()) + " cal \n");

        roos.calculateBMRmifflinStJeor();
        System.out.println("mifflinStJeor = " + roos.getProductionOfHeatAtCompleteRest() + " cal");
        System.out.println("Rounded integer = " + Math.round(roos.getProductionOfHeatAtCompleteRest()) + " cal \n");

        roos.calculateBMRkatchMcArdle();
        System.out.println("katchMcArdle = " + roos.getProductionOfHeatAtCompleteRest() + " cal");
        System.out.println("Rounded integer = " + Math.round(roos.getProductionOfHeatAtCompleteRest()) + " cal \n");

    }
}
