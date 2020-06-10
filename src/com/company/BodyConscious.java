package com.company;

import java.util.Scanner;

public class BodyConscious {
    private Body body;
    private double physicalActivityLevel;

    public BodyConscious(){
        this.setBodyByInput();
        this.setPhysicalActivityLevelByInput();
    }

    public void setBodyByInput(){
        Scanner input = new Scanner(System.in);

        System.out.print("What's your gender (male/female): ");
        String gender = input.nextLine().intern();

        System.out.print("What's your name: ");
        String name = input.nextLine().intern();

        System.out.print("What's your weight: ");
        double mass = input.nextDouble();

        System.out.print("What's your height: ");
        double height = input.nextDouble();

        System.out.print("What's your age: ");
        int age = input.nextInt();

        Body body = new Body(name, mass, height, age, gender);
        this.body = body;
    }
    public void setPhysicalActivityLevelByInput(){
        Scanner input = new Scanner(System.in);

        System.out.println("\nWhat is your average physical activity level?");
        System.out.println(
                "1,2 = you are sedentary and do little or no exercise\n" +
                "1,375 = you exercise lightly or do sport 1-3 days/week\n" +
                "1,55 = you are moderately active and do exercise or sport 3-5 days/week\n" +
                "1,725 = you are very active with hard exercise or sport 6-7 days a week\n" +
                "1,9 = you are extremely active with very hard exercise or sport and a physical job or training twice a day");
        this.physicalActivityLevel = input.nextDouble();
    }

    public double calculateBMR(){
        //Basal Metabolic Rate
        this.body.calculateBMRmifflinStJeor();
        return body.getProductionOfHeatAtCompleteRest();
    }
    public int calculateTDEE(){
        //Total Daily Energy Expenditure
        int tdee;
        tdee = (int) (this.calculateBMR() * this.physicalActivityLevel);
        return tdee;
    }
}
