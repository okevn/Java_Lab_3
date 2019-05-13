package ua.lviv.iot.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ElectroboggerTest {

    @Test
    void getMaximumSpeed() {
        Electrobogger electrobogger = new Electrobogger();
        electrobogger.setMaximumSpeed(45);
        assertEquals(45, electrobogger.getMaximumSpeed());
    }

    @Test
    void getTypeOfSupply() {
        Electrobogger electrobogger = new Electrobogger();
        electrobogger.setTypeOfSupply("Random");
        assertEquals("Random", electrobogger.getTypeOfSupply());
    }

    @Test
    void getBacklighting() {
        Electrobogger electrobogger = new Electrobogger();
        electrobogger.setBacklighting("Yes");
        assertEquals("Yes", electrobogger.getBacklighting());
    }
}