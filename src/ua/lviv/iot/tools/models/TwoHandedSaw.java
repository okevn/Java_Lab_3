package ua.lviv.iot.tools.models;

public class TwoHandedSaw extends Tools {
	private double model;
	private double price;
	
	public TwoHandedSaw(MaterialType materials, DriveType kindOfDrive, double length, double model, double price) {
		super(materials, kindOfDrive, length);
		this.model = model;
		this.price = price;
	}

	public double getModel() {
		return model;
	}

	public void setModel(double model) {
		this.model = model;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	

}
