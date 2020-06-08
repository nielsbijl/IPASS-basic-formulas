package com.company;

public class Body {
    private String name;
    private double productionOfHeat;
    private double mass;
    private double height;
    private int age;

    //constructor
    public Body(String name, double massKG, double heightCM, int ageYEARS){
        this.name = name;
        this.mass = massKG;
        this.height = heightCM;
        this.age = ageYEARS;
    }

    //setters
    void setName(String name){
        this.name = name;
    }
    void setProductionOfHeat(double productionOfHeat){
        this.productionOfHeat = productionOfHeat;
    }
    void setMass(double massKG){
        this.mass = massKG;
    }
    void setHeight(double heightCM){
        this.height = heightCM;
    }
    void setAge(int ageYEARS){
        this.age = ageYEARS;
    }

    //getters
    String getName(){
        return this.name;
    }
    double getProductionOfHeat(){
        return this.productionOfHeat;
    }
    double getMass(){
        return this.mass;
    }
    double getHeight(){
        return this.height;
    }
    int getAge(){
        return this.age;
    }


}
