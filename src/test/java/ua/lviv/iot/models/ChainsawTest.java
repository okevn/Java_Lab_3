package ua.lviv.iot.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChainsawTest {

    @Test
    void getEngineCapacity() {
        Chainsaw chainsaw = new Chainsaw();
        chainsaw.setEngineCapacity(55);
        assertEquals(55, chainsaw.getEngineCapacity());
    }

    @Test
    void getTankVolume() {
        Chainsaw chainsaw = new Chainsaw();
        chainsaw.setTankVolume(4);
        assertEquals(4, chainsaw.getTankVolume());

    }
}