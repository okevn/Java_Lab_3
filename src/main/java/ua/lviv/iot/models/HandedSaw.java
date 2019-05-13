package ua.lviv.iot.models;

public class HandedSaw extends Tools {
    private int prongsPerInch;

    public HandedSaw(final MaterialType materials, final DriveType kindOfDrive,
                     final double length, final int prongsPerInch) {
        super(materials, kindOfDrive, length);
        this.prongsPerInch = prongsPerInch;
    }

    public final int getProngsPerInch() {
        return prongsPerInch;
    }

    public final void setProngsPerInch(final int prongsPerInch) {
        this.prongsPerInch = prongsPerInch;
    }

}
