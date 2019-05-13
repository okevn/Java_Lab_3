package ua.lviv.iot.models;

public class Electrobogger extends Tools {

    private double maximumSpeed;
    private String typeOfSupply;
    private String backlighting;

    public Electrobogger() {
    }

    public Electrobogger(final MaterialType materials,
                         final DriveType kindOfDrive,
                         final double length, final double maximumSpeed,
                         final String typeOfSupply, final String backlighting) {
        super(materials, kindOfDrive, length);
        this.maximumSpeed = maximumSpeed;
        this.typeOfSupply = typeOfSupply;
        this.backlighting = backlighting;
    }

    public final double getMaximumSpeed() {
        return maximumSpeed;
    }

    public final void setMaximumSpeed(final double maximumSpeed) {
        this.maximumSpeed = maximumSpeed;
    }

    public final String getTypeOfSupply() {
        return typeOfSupply;
    }

    public final void setTypeOfSupply(final String typeOfSupply) {
        this.typeOfSupply = typeOfSupply;
    }

    public final String getBacklighting() {
        return backlighting;
    }

    public final void setBacklighting(final String backlighting) {
        this.backlighting = backlighting;
    }


}
