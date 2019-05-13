package ua.lviv.iot.manager;

import ua.lviv.iot.models.DriveType;
import ua.lviv.iot.models.MaterialType;
import ua.lviv.iot.models.Tools;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ToolsManagerImpl implements ToolsManager {

    private List<Tools> tools;

    public ToolsManagerImpl(final List<Tools> tools) {
        this.tools = tools;
    }

    public final void setTools(final List<Tools> tools) {
        this.tools = tools;
    }

    @Override
    public final List<Tools> findByMaterial(final MaterialType materials) {
        return tools.stream().filter(tools1 -> (tools1.getMaterials(
        ) == materials)).collect(Collectors.toList());
    }

    @Override
    public final List<Tools> findByDrive(final DriveType kindOfDrive) {
        return tools.stream().filter(tools1 -> (tools1.getKindOfDrive(
        ) == kindOfDrive)).collect(Collectors.toList());
    }

    @Override
    public final void sortByLength(
            final List<Tools> tools, final boolean reverse) {
        if (reverse) {
            Collections.sort(tools, Comparator.comparing(
                    Tools::getLength).reversed());
        } else {
            Collections.sort(tools, Comparator.comparing(Tools::getLength));
        }
        tools.stream().forEach(System.out::println);
    }

}
