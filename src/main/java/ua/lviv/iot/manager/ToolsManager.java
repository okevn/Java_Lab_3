package ua.lviv.iot.manager;

import java.util.List;

import ua.lviv.iot.models.*;

public interface ToolsManager {
	List<Tools>findByMaterial(MaterialType materials);
	List<Tools>findByDrive(DriveType kindOfDrive);
	void sortByLength(List<Tools> tools, boolean reverse);
}
