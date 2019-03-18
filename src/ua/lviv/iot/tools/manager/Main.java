package ua.lviv.iot.tools.manager;

import java.util.ArrayList;
import java.util.List;

import ua.lviv.iot.tools.manager.ToolsManagerImpl;
import ua.lviv.iot.tools.models.*;

public class Main {

	public static void main(String[] args) {
		
		List<Tools> tools = new ArrayList();
		tools.add(new Chainsaw(MaterialType.METAL, DriveType.MECHANICAL, 124, 5, SpeedType.LOW, 66));
		tools.add(new Jigsaw(MaterialType.METAL, DriveType.MECHANICAL, 123, "gccg", 88));
		
		ToolsManagerImpl manager = new ToolsManagerImpl(tools);
		
		manager.findByMaterial(MaterialType.PLASTIC);
		manager.findByDrive(DriveType.ENGINE);
		manager.sortByLength(tools, true);
	}

}
