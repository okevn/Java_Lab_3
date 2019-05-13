package ua.lviv.iot.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MetalKnifeTest {

    @Test
    void getGuarantee() {
        MetalKnife metalKnife = new MetalKnife();
        metalKnife.setGuarantee("Yes");
        assertEquals("Yes", metalKnife.getGuarantee());
    }

    @Test
    void getWeight() {
        MetalKnife metalKnife = new MetalKnife();
        metalKnife.setWeight(6.7);
        assertEquals(6.7, metalKnife.getWeight());
    }
}