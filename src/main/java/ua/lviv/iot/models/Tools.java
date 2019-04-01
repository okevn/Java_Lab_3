package ua.lviv.iot.models;

public abstract class Tools {
	
	private MaterialType materials;
	private DriveType kindOfDrive;
	private double length;
	
	public Tools(MaterialType materials, DriveType kindOfDrive, double length) {
		this.materials = materials;
		this.kindOfDrive = kindOfDrive;
		this.length = length;
	}

	public MaterialType getMaterials() {
		return materials;
	}

	public void setMaterials(MaterialType materials) {
		this.materials = materials;
	}

	public DriveType getKindOfDrive() {
		return kindOfDrive;
	}

	public void setKindOfDrive(DriveType kindOfDrive) {
		this.kindOfDrive = kindOfDrive;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}
	
}
