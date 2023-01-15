package lesson_14;

public class Main {
    public static void main(String[] args) {
        System.out.println(" ------------------------ Fist Task 1.1 ------------------------"); //////////////////////////////// 1_1  ///////////////////////////////
        Car simpleCar1 = new Car();
        Car simpleCar2 = new Car();
        Car simpleCar3 = new Car();
        Car simpleCar4 = new Car();
        Car simpleCar5 = new Car();

        simpleCar1.brand="Lada"; simpleCar1.model="Granta"; simpleCar1.year=2015;simpleCar1.country = "Россия";
        simpleCar1.color ="Желтый";simpleCar1.engineVolume=1.7;

        simpleCar2.brand="Audi"; simpleCar2.model="A8 50 L TDI quattro"; simpleCar2.year=2020;simpleCar2.country = "Германия";
        simpleCar2.color ="Черный";simpleCar2.engineVolume=3.0;

        simpleCar3.brand="BMW"; simpleCar3.model="Z8"; simpleCar3.year=2021;simpleCar3.country = "Германия";
        simpleCar3.color ="Красный";simpleCar3.engineVolume=3.0;

        simpleCar4.brand="Kia"; simpleCar4.model="Sportage"; simpleCar4.year=2018;simpleCar4.country = "Южная Корея";
        simpleCar4.color ="Красный";simpleCar4.engineVolume=2.4;

        simpleCar5.brand="Hyundai"; simpleCar5.model="Avate"; simpleCar5.year=2016;simpleCar5.country = "Южная Корея";
        simpleCar5.color ="Оранжевый";simpleCar5.engineVolume=1.6;

        System.out.println(simpleCar1);System.out.println(simpleCar2);System.out.println(simpleCar3);System.out.println(simpleCar4);System.out.println(simpleCar5);

        System.out.println(" ------------------------ Second Task 1.2 ------------------------"); //////////////////////////////// 1_2  ///////////////////////////////

        Car1 middleCar1 = new Car1("Lada", "Granta", 1.7, "Желтый", 2015, "Россия");
        Car1 middleCar2 = new Car1("Audi", "A8 50 L TDI quattro", 3.0, "Черный", 2020, "Германия");
        Car1 middleCar3 = new Car1("BMW", "Z8", 3.0, "Красный", 2021, "Германия");
        Car1 middleCar4 = new Car1("Kia", "Sportage", 2.4, "Красный", 2018, "Южная Корея");
        Car1 middleCar5 = new Car1("Hyundai", "Avate", 1.6, "Оранжевый", 2016, "Южная Корея");

        System.out.println(middleCar1); System.out.println(middleCar2); System.out.println(middleCar3); System.out.println(middleCar4); System.out.println(middleCar5);


        System.out.println(" ------------------------ Third Task 1.3 ------------------------"); //////////////////////////////// 1_3  ///////////////////////////////

        Car2 HighCar1 = new Car2("Lada", "Granta", -100, "Желтый", 2015, "Россия" );
        Car2 HighCar2 = new Car2("", "A8 50 L TDI quattro", 3.0, "     ", 2020, "Германия");
        Car2 HighCar3   = new Car2("BMW", "Z8", 3.0, "Красный", 2021, "Германия");
        Car2 HighCar4 = new Car2("Kia", "", 2.4, "Красный", 2018, "Южная Корея");
        Car2 HighCar5 = new Car2("Hyundai", "Avate", 1.6, "Оранжевый", 2016, "   ");

        System.out.println(HighCar1); System.out.println(HighCar2); System.out.println(HighCar3); System.out.println(HighCar4); System.out.println(HighCar5);
    } // main
} // Main