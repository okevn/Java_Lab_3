package ua.lviv.iot.tools.models;

public class Jigsaw extends Tools {
	
	private String workingMaterial;
	private double handleWidth;
	
	public Jigsaw(MaterialType materials, DriveType kindOfDrive, double length, String workingMaterial,
			double handleWidth) {
		super(materials, kindOfDrive, length);
		this.workingMaterial = workingMaterial;
		this.handleWidth = handleWidth;
	}

	public String getWorkingMaterial() {
		return workingMaterial;
	}

	public void setWorkingMaterial(String workingMaterial) {
		this.workingMaterial = workingMaterial;
	}

	public double getHandleWidth() {
		return handleWidth;
	}

	public void setHandleWidth(double handleWidth) {
		this.handleWidth = handleWidth;
	}
	
	

}
