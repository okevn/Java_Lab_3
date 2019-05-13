package ua.lviv.iot.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoHandedSawTest {

    @Test
    void getModel() {
        TwoHandedSaw twoHandedSaw = new TwoHandedSaw();
        twoHandedSaw.setModel(1000);
        assertEquals(1000, twoHandedSaw.getModel());
    }

    @Test
    void getPrice() {
        TwoHandedSaw twoHandedSaw = new TwoHandedSaw();
        twoHandedSaw.setPrice(22);
        assertEquals(22, twoHandedSaw.getPrice());
    }
}