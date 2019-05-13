package ua.lviv.iot.models;

public class MetalKnife extends Tools {
    private String guarantee;

    private double weight;

    public MetalKnife() {

    }

    public MetalKnife(final MaterialType materials, final DriveType kindOfDrive,
                      final double length,
                      final String guarantee,
                      final double weight) {
        super(materials, kindOfDrive, length);
        this.guarantee = guarantee;
        this.weight = weight;
    }

    public final String getGuarantee() {
        return guarantee;
    }

    public final void setGuarantee(final String guarantee) {
        this.guarantee = guarantee;
    }

    public final double getWeight() {
        return weight;
    }

    public final void setWeight(final double weight) {
        this.weight = weight;
    }
}
