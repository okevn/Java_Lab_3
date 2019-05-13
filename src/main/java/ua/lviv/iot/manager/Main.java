package ua.lviv.iot.manager;

import ua.lviv.iot.models.*;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(final String[] args) {

        List<Tools> tools = new ArrayList();
        tools.add(new Chainsaw(MaterialType.METAL, DriveType.MECHANICAL, 124,
                5, SpeedType.LOW, 66));
        tools.add(new Jigsaw(MaterialType.METAL, DriveType.MECHANICAL, 123,
                "gccg", 88));

        ToolsManagerImpl manager = new ToolsManagerImpl(tools);

        manager.findByMaterial(MaterialType.PLASTIC);
        manager.findByDrive(DriveType.ENGINE);
        manager.sortByLength(tools, true);
    }

}
