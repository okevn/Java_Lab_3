package ua.lviv.iot.models;

import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Inheritance;

@Entity
@Inheritance
public class Chainsaw extends Tools {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private double engineCapacity;
    private SpeedType chainSpeed;
    private double tankVolume;

    public Chainsaw() {
    }

    public Chainsaw(final MaterialType materials, final DriveType kindOfDrive,
                    final double length, final double engineCapacity,
                    final SpeedType chainSpeed, final double tankVolume) {
        super(materials, kindOfDrive, length);
        this.engineCapacity = engineCapacity;
        this.chainSpeed = chainSpeed;
        this.tankVolume = tankVolume;
    }

    public String getHeaders() {
        return "engineCapacity, "
                + "chainSpeed, "
                + "tankVolume ,";
    }

    public String toCSV() {
        return engineCapacity + ", "
                + chainSpeed + ", "
                + tankVolume;
    }

    @Override
    public Integer getId() {
        return id;
    }

    @Override
    public void setId(Integer id) {
        this.id = id;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(double engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public SpeedType getChainSpeed() {
        return chainSpeed;
    }

    public void setChainSpeed(SpeedType chainSpeed) {
        this.chainSpeed = chainSpeed;
    }

    public double getTankVolume() {
        return tankVolume;
    }

    public void setTankVolume(double tankVolume) {
        this.tankVolume = tankVolume;
    }
}
