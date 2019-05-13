package ua.lviv.iot.models;

public class TwoHandedSaw extends Tools {
    private double model;
    private double price;

    public TwoHandedSaw() {
    }

    public TwoHandedSaw(final MaterialType materials,
                        final DriveType kindOfDrive, final double length,
                        final double model, final double price) {
        super(materials, kindOfDrive, length);
        this.model = model;
        this.price = price;
    }

    public final double getModel() {
        return model;
    }

    public final void setModel(final double model) {
        this.model = model;
    }

    public final double getPrice() {
        return price;
    }

    public final void setPrice(final double price) {
        this.price = price;
    }
}
