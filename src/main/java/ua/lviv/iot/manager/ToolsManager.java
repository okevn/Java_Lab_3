package ua.lviv.iot.manager;

import ua.lviv.iot.models.DriveType;
import ua.lviv.iot.models.MaterialType;
import ua.lviv.iot.models.Tools;

import java.util.List;

public interface ToolsManager {
    List<Tools> findByMaterial(MaterialType materials);

    List<Tools> findByDrive(DriveType kindOfDrive);

    List<Tools> sortByLength(List<Tools> tools, boolean reverse);
}
