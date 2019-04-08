package ua.lviv.iot.models;

public class Jigsaw extends Tools {

    private String workingMaterial;
    private double handleWidth;

    public Jigsaw(final MaterialType materials, final DriveType kindOfDrive,
                  final double length, final String workingMaterial,
                  final double handleWidth) {
        super(materials, kindOfDrive, length);
        this.workingMaterial = workingMaterial;
        this.handleWidth = handleWidth;
    }

    public final String getWorkingMaterial() {
        return workingMaterial;
    }

    public final void setWorkingMaterial(final String workingMaterial) {
        this.workingMaterial = workingMaterial;
    }

    public final double getHandleWidth() {
        return handleWidth;
    }

    public final void setHandleWidth(final double handleWidth) {
        this.handleWidth = handleWidth;
    }


}
