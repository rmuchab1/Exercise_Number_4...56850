package com.company;

public class Task_2 {
    private String model;
    private String brand ;

    public carAttri(String model, String brand, int year, int price, String color, int quantity) {
        this.model = model;
        this.brand = brand;
        this.year = year;
        this.price = price;
        this.color = color;
        this.quantity = quantity;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "carAttri{" +
                "model='" + model + '\'' +
                ", brand='" + brand + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", color='" + color + '\'' +
                ", quantity=" + quantity +
                '}';
    }

    private int year ;
    private int price ;
    private String color;
    private int quantity;
}
public class Car {
    public static void main(String[] args) {
        carAttri car1 = new carAttri("GLE", "Mercedes", 2020 ,350000, "blue", 5);

        System.out.println(car1.toString());


        System.out.println(car1.getColor());;

        int year = car1.getYear();

        car1.setColor("black");

        System.out.println(car1.toString());
    }

}
}
