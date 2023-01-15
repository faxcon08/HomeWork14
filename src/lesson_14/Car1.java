package lesson_14;

public class Car1{
    private String brand;
    private String model;
    private double engineVolume;
    private String color;
    private int year;
    private String country;

    public Car1(String brand, String model, double engineVolume, String color, int year, String country) {
        this.brand = brand;
        this.model=model;
        this.engineVolume = engineVolume;
        this.color = color;
        this.year = year;
        this.country = country;
    }

    public Car1(){
        this.brand = "default";
        this.model = "default";
        this.engineVolume = 1.5;
        this.color = "white";
        this.year = 2000;
        this.country = "defaulte";
    }
    @Override
    public String toString() {
        return String.format("Brand: %1$8s model: %2$8s Volume: %3$.2f Color: %4$7s" +
                " Year: %5$d Country: %6$7s","'"+brand+"'","'"+model+"'",engineVolume, color, year,country);
    }
    ///////////////// getters  ///////////

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }
    //////////////////// setters ///////////////

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setCountry(String country) {
        this.country = country;
    }
} // Car1
