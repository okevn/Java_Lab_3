package ua.lviv.iot.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HandedSawTest {

    @Test
    void getProngsPerInch() {
        HandedSaw handedSaw = new HandedSaw();
        handedSaw.setProngsPerInch(7);
        assertEquals(7, handedSaw.getProngsPerInch());

    }
}