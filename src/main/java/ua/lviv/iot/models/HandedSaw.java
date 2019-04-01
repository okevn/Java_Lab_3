package ua.lviv.iot.models;

public class HandedSaw extends Tools {
	private int prongsPerInch;

	public HandedSaw(MaterialType materials, DriveType kindOfDrive, double length, int prongsPerInch) {
		super(materials, kindOfDrive, length);
		this.prongsPerInch = prongsPerInch;
	}

	public int getProngsPerInch() {
		return prongsPerInch;
	}

	public void setProngsPerInch(int prongsPerInch) {
		this.prongsPerInch = prongsPerInch;
	}

}
