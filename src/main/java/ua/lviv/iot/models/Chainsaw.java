package ua.lviv.iot.models;

public class Chainsaw extends Tools {
    private double engineCapacity;
    private SpeedType chainSpeed;
    private double tankVolume;

    public Chainsaw(final MaterialType materials, final DriveType kindOfDrive,
                    final double length, final double engineCapacity,
                    final SpeedType chainSpeed, final double tankVolume) {
        super(materials, kindOfDrive, length);
        this.engineCapacity = engineCapacity;
        this.chainSpeed = chainSpeed;
        this.tankVolume = tankVolume;
    }

    public final double getEngineCapacity() {
        return engineCapacity;
    }

    public final void setEngineCapacity(final double engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public final SpeedType getChainSpeed() {
        return chainSpeed;
    }

    public final void setChainSpeed(final SpeedType chainSpeed) {
        this.chainSpeed = chainSpeed;
    }

    public final double getTankVolume() {
        return tankVolume;
    }

    public final void setTankVolume(final double tankVolume) {
        this.tankVolume = tankVolume;
    }


}
