package Lecture_10;
//Създайте клас Car, който има следните характеристики:
//● Марка (String)
//● Модел (String)
//● Година на производство (int)
//● Цена (double)
//Класът трябва да има конструктори както с параметри, така и без параметри, метод за
//изчисляване на годините на колата от настоящето време (calculateAge()), който връща
//цяло число - годините на колата, метод за изчисляване на данъка за кола (calculateTax()),
//който връща данъка според следната формула:
//● Данък = Цена * 0.05, ако колата е произведена преди 5 години или повече
//● Данък = 0, ако колата е произведена преди 5 години или по-малко
import java.time.LocalDate;

public class Car {
    private String brand;
    private String model;
    private int year;
    private double price;

    // Конструктори
    public Car() {
    }

    public Car(String brand, String model, int year, double price) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    //Годините на колата от текущата дата:
    public int calculateAge() {
        int currentYear = LocalDate.now().getYear();
        return currentYear - year;
    }

    // Данък за колата:
    public double calculateTax() {
        int age = calculateAge();
        if (age >= 5) {
            return price * 0.05; // Данък = Цена * 0.05, ако колата е произведена >= 5 г.
        } else {
            return 0; // Данък = 0, ако колата е произведена <= 5г.
        }
    }

    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
}

