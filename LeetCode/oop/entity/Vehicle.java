package oop.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

public class Vehicle implements Serializable {

    private Long id;

    private String make;

    private String model;

    private String characteristics;

    private int yearOfProduction;

    private Long odometer;

    private String color;

    private String licensePlate;

    private int numberOfSeats;

    private BigDecimal price;

    private char requiredLicense;

    private BodyType bodyType;

    public Vehicle() {
    }

    public Vehicle(Long id, String make, String model, String characteristics,
                   int yearOfProduction, Long odometer, String color,
                   String licensePlate, int numberOfSeats, BigDecimal price,
                   char requiredLicense, BodyType bodyType) {
        this.id = id;
        this.make = make;
        this.model = model;
        this.characteristics = characteristics;
        this.yearOfProduction = yearOfProduction;
        this.odometer = odometer;
        this.color = color;
        this.licensePlate = licensePlate;
        this.numberOfSeats = numberOfSeats;
        this.price = price;
        this.requiredLicense = requiredLicense;
        this.bodyType = bodyType;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCharacteristics() {
        return characteristics;
    }

    public void setCharacteristics(String characteristics) {
        this.characteristics = characteristics;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    public Long getOdometer() {
        return odometer;
    }

    public void setOdometer(Long odometer) {
        this.odometer = odometer;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public char getRequiredLicense() {
        return requiredLicense;
    }

    public void setRequiredLicense(char requiredLicense) {
        this.requiredLicense = requiredLicense;
    }

    public BodyType getBodyType() {
        return bodyType;
    }

    public void setBodyType(BodyType bodyType) {
        this.bodyType = bodyType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehicle vehicle = (Vehicle) o;
        return yearOfProduction == vehicle.yearOfProduction && numberOfSeats == vehicle.numberOfSeats && requiredLicense == vehicle.requiredLicense && Objects.equals(id, vehicle.id) && Objects.equals(make, vehicle.make) && Objects.equals(model, vehicle.model) && Objects.equals(characteristics, vehicle.characteristics) && Objects.equals(odometer, vehicle.odometer) && Objects.equals(color, vehicle.color) && Objects.equals(licensePlate, vehicle.licensePlate) && Objects.equals(price, vehicle.price) && bodyType == vehicle.bodyType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, make, model, characteristics, yearOfProduction, odometer, color, licensePlate, numberOfSeats, price, requiredLicense, bodyType);
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "id=" + id +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", characteristics='" + characteristics + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                ", odometer=" + odometer +
                ", color='" + color + '\'' +
                ", licensePlate='" + licensePlate + '\'' +
                ", numberOfSeats=" + numberOfSeats +
                ", price=" + price +
                ", requiredLicense=" + requiredLicense +
                ", bodyType=" + bodyType +
                '}';
    }
}
