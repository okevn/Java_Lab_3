package ua.lviv.iot.tools.manager;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import ua.lviv.iot.tools.models.DriveType;
import ua.lviv.iot.tools.models.MaterialType;
import ua.lviv.iot.tools.models.Tools;

public class ToolsManagerImpl implements ToolsManager {
	
	private List<Tools> tools;

	public void setTools(List<Tools> tools) {
		this.tools = tools;
	}
	
	public ToolsManagerImpl(List<Tools> tools){
		this.tools = tools;
	}

	@Override
	public List<Tools> findByMaterial(MaterialType materials) {
		tools.stream().filter(tools1 -> (tools1.getMaterials() == materials)).forEach(tools1 -> System.out.println(tools1));
		return null;
	}

	@Override
	public List<Tools> findByDrive(DriveType kindOfDrive) {
		tools.stream().filter(tools1 -> (tools1.getKindOfDrive() == kindOfDrive)).forEach(tools1 -> System.out.println(tools1));
		return null;
	}

	@Override
	public void sortByLength(List<Tools> tools, boolean reverse) {
		if(reverse){
			Collections.sort(tools, Comparator.comparing(Tools::getLength).reversed());
			tools.stream().forEach(System.out::println);
		}
		else{
			Collections.sort(tools, Comparator.comparing(Tools::getLength));
			tools.stream().forEach(System.out::println);
		}
		
	}

}
