package ua.lviv.iot.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JigsawTest {

    @Test
    void getWorkingMaterial() {
        Jigsaw jigsaw = new Jigsaw();
        jigsaw.setWorkingMaterial("wooden");
        assertEquals("wooden", jigsaw.getWorkingMaterial());
    }

    @Test
    void getHandleWidth() {
        Jigsaw jigsaw = new Jigsaw();
        jigsaw.setHandleWidth(3);
        assertEquals(3, jigsaw.getHandleWidth());
    }
}