package ua.lviv.iot.models;

import javax.persistence.*;

@Entity
@Inheritance
public class Tools {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private MaterialType materials;
    private DriveType kindOfDrive;
    private double length;

    public Tools(final MaterialType materials, final DriveType kindOfDrive,
                 final double length) {
        this.materials = materials;
        this.kindOfDrive = kindOfDrive;
        this.length = length;
    }

    public Tools() {
    }

    public String getHeaders() {
        return "materials, "
                + "kindOfDrive, "
                + "length ,";
    }

    public String toCSV() {
        return materials + ", "
                + kindOfDrive + ", "
                + length;
    }

    public MaterialType getMaterials() {
        return materials;
    }

    public void setMaterials(final MaterialType materials) {
        this.materials = materials;
    }

    public DriveType getKindOfDrive() {
        return kindOfDrive;
    }

    public void setKindOfDrive(final DriveType kindOfDrive) {
        this.kindOfDrive = kindOfDrive;
    }

    public double getLength() {
        return length;
    }

    public void setLength(final double length) {
        this.length = length;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
