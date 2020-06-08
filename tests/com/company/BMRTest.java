package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BMRTest {

    @Test
    void harrisBenedict() {
        Body niels = new Body("Niels", 83, 185, 18, "male", 17);
        Body roos = new Body("Roos", 48, 165, 18, "female", 25);
        assertEquals(2011.8763000000001, BMR.harrisBenedict(niels));
        assertEquals(1335.1619, BMR.harrisBenedict(roos));
    }

    @Test
    void harrisBenedictRevised() {
        Body niels = new Body("Niels", 83, 185, 18, "male", 17);
        Body roos = new Body("Roos", 48, 165, 18, "female", 25);
        assertEquals(1985.9420000000002, BMR.harrisBenedictRevised(niels));
        assertEquals(1324.679, BMR.harrisBenedictRevised(roos));
    }

    @Test
    void mifflinStJeor() {
        Body niels = new Body("Niels", 83, 185, 18, "male", 17);
        Body roos = new Body("Roos", 48, 165, 18, "female", 25);
        assertEquals(1901.25, BMR.mifflinStJeor(niels));
        assertEquals(1260.25, BMR.mifflinStJeor(roos));
    }

    @Test
    void katchMcArdle() {
        Body niels = new Body("Niels", 83, 185, 18, "male", 17);
        Body roos = new Body("Roos", 48, 165, 18, "female", 25);
        assertEquals(2162.8, BMR.katchMcArdle(niels));
        assertEquals(1406.8000000000002, BMR.katchMcArdle(roos));
    }
}