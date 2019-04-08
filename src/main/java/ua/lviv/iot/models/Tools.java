package ua.lviv.iot.models;

public abstract class Tools {

    private MaterialType materials;
    private DriveType kindOfDrive;
    private double length;

    public Tools(final MaterialType materials, final DriveType kindOfDrive,
                 final double length) {
        this.materials = materials;
        this.kindOfDrive = kindOfDrive;
        this.length = length;
    }

    public final MaterialType getMaterials() {
        return materials;
    }

    public final void setMaterials(final MaterialType materials) {
        this.materials = materials;
    }

    public final DriveType getKindOfDrive() {
        return kindOfDrive;
    }

    public final void setKindOfDrive(final DriveType kindOfDrive) {
        this.kindOfDrive = kindOfDrive;
    }

    public final double getLength() {
        return length;
    }

    public final void setLength(final double length) {
        this.length = length;
    }

}
