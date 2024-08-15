package web.model;

public class Car {
    private String brand;
    private String color;
    private int power;

    public Car(String brand, String color, int power) {
        this.brand = brand;
        this.color = color;
        this.power = power;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }
}


