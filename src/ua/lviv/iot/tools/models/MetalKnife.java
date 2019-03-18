package ua.lviv.iot.tools.models;

public class MetalKnife extends Tools {

	private String guarantee;
	private double weight;
	
	public MetalKnife(MaterialType materials, DriveType kindOfDrive, double length, String guarantee, double weight) {
		super(materials, kindOfDrive, length);
		this.guarantee = guarantee;
		this.weight = weight;
	}

	public String getGuarantee() {
		return guarantee;
	}

	public void setGuarantee(String guarantee) {
		this.guarantee = guarantee;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	} 
	
}
