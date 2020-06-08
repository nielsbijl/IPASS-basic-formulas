package com.company;

import static org.junit.jupiter.api.Assertions.*;

class BodyTest {

    @org.junit.jupiter.api.Test
    void setName() {
        Body test = new Body("null", 0, 0, 0,"male", 0);
        test.setName("test");

        assertEquals("test", test.getName());
    }

    @org.junit.jupiter.api.Test
    void setProductionOfHeatAtCompleteRest() {
        Body test = new Body("test", 0, 0, 0,"male", 0);
        test.setProductionOfHeatAtCompleteRest(10);
        assertEquals(10, test.getProductionOfHeatAtCompleteRest());
    }

    @org.junit.jupiter.api.Test
    void setMass() {
        Body test = new Body("null", 0, 0, 0,"male", 0);
        test.setMass(100);

        assertEquals(100, test.getMass());
    }

    @org.junit.jupiter.api.Test
    void setHeight() {
        Body test = new Body("null", 0, 0, 0,"male", 0);
        test.setHeight(100);

        assertEquals(100, test.getHeight());
    }

    @org.junit.jupiter.api.Test
    void setAge() {
        Body test = new Body("null", 0, 0, 0,"male", 0);
        test.setAge(100);

        assertEquals(100, test.getAge());
    }

    @org.junit.jupiter.api.Test
    void setBodyFatPercentage() {
        Body test = new Body("null", 0, 0, 0,"male", 0);
        test.setBodyFatPercentage(20);

        assertEquals(20, test.getBodyFatPercentage());
    }

    @org.junit.jupiter.api.Test
    void getName() {
        Body test = new Body("test", 0, 0, 0,"male", 0);
        assertEquals("test", test.getName());
    }

    @org.junit.jupiter.api.Test
    void getProductionOfHeatAtCompleteRest() {
        Body test = new Body("test", 0, 0, 0,"male", 0);
        test.setProductionOfHeatAtCompleteRest(1000);
        assertEquals(1000, test.getProductionOfHeatAtCompleteRest());
    }

    @org.junit.jupiter.api.Test
    void getMass() {
        Body test = new Body("test", 0, 0, 0,"male", 0);
        assertEquals(0, test.getMass());
    }

    @org.junit.jupiter.api.Test
    void getHeight() {
        Body test = new Body("test", 0, 0, 0,"male", 0);
        assertEquals(0, test.getHeight());
    }

    @org.junit.jupiter.api.Test
    void getAge() {
        Body test = new Body("test", 0, 0, 0,"male", 0);
        assertEquals(0, test.getAge());
    }

    @org.junit.jupiter.api.Test
    void getGender() {
        Body test = new Body("test", 0, 0, 0,"male", 0);
        assertEquals("male", test.getGender());
    }

    @org.junit.jupiter.api.Test
    void getBodyFatPercentage() {
        Body test = new Body("test", 0, 0, 0,"male", 0);
        assertEquals(0, test.getBodyFatPercentage());
    }

    @org.junit.jupiter.api.Test
    void calculateBMRharrisBenedict() {
        Body niels = new Body("Niels", 83, 185, 18, "male", 17);

        niels.calculateBMRharrisBenedict();
        assertEquals(2011.8763000000001, niels.getProductionOfHeatAtCompleteRest());
    }

    @org.junit.jupiter.api.Test
    void calculateBMRharrisBenedictRevised() {
        Body niels = new Body("Niels", 83, 185, 18, "male", 17);

        niels.calculateBMRharrisBenedictRevised();
        assertEquals(1985.9420000000002, niels.getProductionOfHeatAtCompleteRest());
    }

    @org.junit.jupiter.api.Test
    void calculateBMRmifflinStJeor() {
        Body niels = new Body("Niels", 83, 185, 18, "male", 17);

        niels.calculateBMRmifflinStJeor();
        assertEquals(1901.25, niels.getProductionOfHeatAtCompleteRest());
    }

    @org.junit.jupiter.api.Test
    void calculateBMRkatchMcArdle() {
        Body niels = new Body("Niels", 83, 185, 18, "male", 17);

        niels.calculateBMRkatchMcArdle();
        assertEquals(2162.8, niels.getProductionOfHeatAtCompleteRest());
    }
}