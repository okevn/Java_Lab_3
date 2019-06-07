package ua.lviv.iot.manager;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ua.lviv.iot.models.*;

import java.io.*;
import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static ua.lviv.iot.models.DriveType.ENGINE;
import static ua.lviv.iot.models.DriveType.MECHANICAL;
import static ua.lviv.iot.models.MaterialType.*;
import static ua.lviv.iot.models.SpeedType.LOW;

class ToolsWriterTest {

    private List<Tools> tools = new LinkedList<>();

    @BeforeEach
    void setUp() {
        tools.add(new Chainsaw(PLASTIC, ENGINE, 30, 70, LOW, 70));

        tools.add(new Electrobogger(METAL, ENGINE, 35, 20, "electric", "yes"));

        tools.add(new Jigsaw(WOODEN, MECHANICAL, 40, "wood", 7));

        tools.add(new MetalKnife(METAL, MECHANICAL, 20, "no", 4));
    }

    @Test
    void writeToFile() {
        ToolsWriter writer = new ToolsWriter();
        writer.writeToFile(tools);

        File myFile = new File("result.csv");
        assertTrue(myFile.exists() && myFile.isFile(),
                "Initialization file problem");

        try (FileInputStream fis = new FileInputStream("result.csv");
             InputStreamReader isr = new InputStreamReader(fis);
             BufferedReader bufReader = new BufferedReader(isr)) {

            for (Tools tools1 : tools) {
                assertEquals(tools1.getHeaders(), bufReader.readLine());
                assertEquals(tools1.toCSV(), bufReader.readLine());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}