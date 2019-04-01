package ua.lviv.iot.manager;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import ua.lviv.iot.models.DriveType;
import ua.lviv.iot.models.MaterialType;
import ua.lviv.iot.models.Tools;

public class ToolsManagerImpl implements ToolsManager {
	
	private List<Tools> tools;

	public void setTools(List<Tools> tools) {
		this.tools = tools;
	}
	
	public ToolsManagerImpl(List<Tools> tools){
		this.tools = tools;
	}

	@Override
	public List<Tools> findByMaterial(final MaterialType materials) {
		return tools.stream().filter(tools1 -> (tools1.getMaterials() == materials)).collect(Collectors.toList());
	}

	@Override
	public List<Tools> findByDrive(DriveType kindOfDrive) {
		return tools.stream().filter(tools1 -> (tools1.getKindOfDrive() == kindOfDrive)).collect(Collectors.toList());
	}

	@Override
	public void sortByLength(List<Tools> tools, boolean reverse) {
		if(reverse){
			Collections.sort(tools, Comparator.comparing(Tools::getLength).reversed());
		}
		else{
			Collections.sort(tools, Comparator.comparing(Tools::getLength));
		}
		tools.stream().forEach(System.out::println);
		
	}

}
