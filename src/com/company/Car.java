package com.company;

public class Car {

    private String color;
    private double enginePower;


    public Car(String color, double enginePower) {
        this.color = color;
        this.enginePower = enginePower;
    }

    public double getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(double enginePower) {
        this.enginePower = enginePower;

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}


class Porshe extends Car {

    public Porshe(String color, int enginePower) {
        super(color, enginePower);
    }
}

class Toyota extends Car {
    public Toyota(String color, double enginePower) {
        super(color, enginePower);
    }
}

class Honda extends Car {
    public Honda(String color, double enginePower) {
        super(color, enginePower);
    }
}

class Audi extends Car {

    public Audi(String color, double enginePower) {
        super(color, enginePower);
    }
}

class BMW extends Car {

    public BMW(String color, double enginePower) {
        super(color, enginePower);
    }
}


class Garage<A extends Car> implements Printable<A> {
    private A cars;
    private int year;
    private String from;



    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public A getCars() {
        return cars;
    }

    public void setCars(A cars) {
        this.cars = cars;
    }

    @Override
    public void print(A a) {
        System.out.println("Name: " + a.getClass().getSimpleName() + "\ncolor: " + a.getColor() +
                "\nengine power: " + a.getEnginePower());

    }


}