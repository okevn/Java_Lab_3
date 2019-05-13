package ua.lviv.iot.manager;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ua.lviv.iot.models.*;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ToolsManagerImplTest {

    List<Tools> tools = new ArrayList();
    ToolsManagerImpl manager = new ToolsManagerImpl(tools);

    @BeforeEach
    void setUp() {
        tools.add(new Chainsaw(MaterialType.METAL, DriveType.MECHANICAL, 124,
                5, SpeedType.LOW, 66));
        tools.add(new Jigsaw(MaterialType.METAL, DriveType.MECHANICAL, 123,
                "gccg", 88));

        ToolsManagerImpl manager = new ToolsManagerImpl(tools);

        manager.findByMaterial(MaterialType.PLASTIC);
        manager.findByDrive(DriveType.ENGINE);
        manager.sortByLength(tools, true);
    }


    @Test
    void findByMaterial() {
    List<Tools> result = manager.findByMaterial(MaterialType.METAL);
        Assertions.assertEquals(2, result.size());

    }

    @Test
    void findByDrive() {
        List<Tools> result = manager.findByDrive(DriveType.MECHANICAL);
        Assertions.assertEquals(2, result.size());
    }

    @Test
    void sortByLength() {
        List<Tools> result = manager.sortByLength(tools,true);
        for (int i = 1; i < result.size(); i++) {
            Assertions.assertTrue(result.get(i - 1).getLength() >= result.get(i).getLength());
        }
        Assertions.assertNotNull(result );
    }
}