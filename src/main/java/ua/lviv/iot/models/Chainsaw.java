package ua.lviv.iot.models;

public class Chainsaw extends Tools {
	
	private double engineCapacity;
	private SpeedType chainSpeed;
	private double tankVolume;
	
	public Chainsaw(MaterialType materials, DriveType kindOfDrive, double length, double engineCapacity,
			SpeedType chainSpeed, double tankVolume) {
		super(materials, kindOfDrive, length);
		this.engineCapacity = engineCapacity;
		this.chainSpeed = chainSpeed;
		this.tankVolume = tankVolume;
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
