package lesson_14;

public class Car {
    public String brand;
    public String model;
    public double engineVolume;
    public String color;
    public int year;
    public String country;

    @Override
    public String toString() {
        return String.format("Brand: %1$8s model: %2$8s Volume: %3$.2f Color: %4$7s" +
                " Year: %5$d Country: %6$7s","'"+brand+"'","'"+model+"'",engineVolume, color, year,country);
    }
}

