/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

/**
 *
 * @author nguyenvanbien
 */
public class Vehicle {

    private String name;
    private String image;
    private String Model;
    private float Speed;
    private float Weight;
    private String Description;
    private float OverallHeight;
    private float OverallWidth;
    private float OverallLength;
    private int SeatingCapacity;
    private float FuelTank;
    private Brand oBrand;

    public Vehicle() {
    }

    public Vehicle(String name, String image, String Model, float Speed, float Weight, String Description, float OverallHeight, float OverallWidth, float OverallLength, int SeatingCapacity, float FuelTank, Brand oBrand) {
        this.name = name;
        this.image = image;
        this.Model = Model;
        this.Speed = Speed;
        this.Weight = Weight;
        this.Description = Description;
        this.OverallHeight = OverallHeight;
        this.OverallWidth = OverallWidth;
        this.OverallLength = OverallLength;
        this.SeatingCapacity = SeatingCapacity;
        this.FuelTank = FuelTank;
        this.oBrand = oBrand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String Model) {
        this.Model = Model;
    }

    public float getSpeed() {
        return Speed;
    }

    public void setSpeed(float Speed) {
        this.Speed = Speed;
    }

    public float getWeight() {
        return Weight;
    }

    public void setWeight(float Weight) {
        this.Weight = Weight;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public float getOverallHeight() {
        return OverallHeight;
    }

    public void setOverallHeight(float OverallHeight) {
        this.OverallHeight = OverallHeight;
    }

    public float getOverallWidth() {
        return OverallWidth;
    }

    public void setOverallWidth(float OverallWidth) {
        this.OverallWidth = OverallWidth;
    }

    public float getOverallLength() {
        return OverallLength;
    }

    public void setOverallLength(float OverallLength) {
        this.OverallLength = OverallLength;
    }

    public int getSeatingCapacity() {
        return SeatingCapacity;
    }

    public void setSeatingCapacity(int SeatingCapacity) {
        this.SeatingCapacity = SeatingCapacity;
    }

    public float getFuelTank() {
        return FuelTank;
    }

    public void setFuelTank(float FuelTank) {
        this.FuelTank = FuelTank;
    }

    public Brand getoBrand() {
        return oBrand;
    }

    public void setoBrand(Brand oBrand) {
        this.oBrand = oBrand;
    }
    
    
}
