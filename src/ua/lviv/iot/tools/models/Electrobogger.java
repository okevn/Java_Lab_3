package ua.lviv.iot.tools.models;

public class Electrobogger extends Tools {
	
	private double maximumSpeed;
	private String typeOfSupply;
	private String backlighting;

	public Electrobogger(MaterialType materials, DriveType kindOfDrive, double length, double maximumSpeed,
			String typeOfSupply, String backlighting) {
		super(materials, kindOfDrive, length);
		this.maximumSpeed = maximumSpeed;
		this.typeOfSupply = typeOfSupply;
		this.backlighting = backlighting;
	}

	public double getMaximumSpeed() {
		return maximumSpeed;
	}

	public void setMaximumSpeed(double maximumSpeed) {
		this.maximumSpeed = maximumSpeed;
	}

	public String getTypeOfSupply() {
		return typeOfSupply;
	}

	public void setTypeOfSupply(String typeOfSupply) {
		this.typeOfSupply = typeOfSupply;
	}

	public String getBacklighting() {
		return backlighting;
	}

	public void setBacklighting(String backlighting) {
		this.backlighting = backlighting;
	}
}
	