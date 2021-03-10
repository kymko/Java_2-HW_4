package com.company;

public class Main {

    public static void main(String[] args) {

        Garage<Toyota> toyotaGarage = new Garage<>();
        Toyota toyota = new Toyota("black", 3.5);
        toyotaGarage.setCars(toyota);
        toyotaGarage.print(toyota);
        toyotaGarage.setYear(2011);
        toyotaGarage.setFrom("Japan");
        System.out.println("Toyota Camry from: " + toyotaGarage.getFrom());
        System.out.println("year of realize: " + toyotaGarage.getYear());
        toyotaGarage.setYear(2022);
        System.out.println(toyota.getClass().getSimpleName() + " Camry the best car in the world, " +
                "\nWait me and I'll bought you in " + toyotaGarage.getYear() + " 30 october");

        System.out.println();

        Garage<Porshe> porsheGarage = new Garage<>();
        Porshe porshe = new Porshe("black",3);
        porsheGarage.setCars(porshe);
        porsheGarage.print(porshe);
        toyotaGarage.setYear(2010);
        System.out.println("year of realize: " + toyotaGarage.getYear());

        System.out.println();

        Garage<Honda> hondaGarage = new Garage<>();
        Honda honda = new Honda("white", 2.4);
        hondaGarage.setCars(honda);
        hondaGarage.print(honda);
        hondaGarage.setYear(1995);
        System.out.println("year of realize: " + hondaGarage.getYear());

        System.out.println();

        Garage<Car> audiGarage = new Garage<>();
        audiGarage.setCars(new Audi("Silver",1.8));
        audiGarage.setYear(2013);
        audiGarage.print(audiGarage.getCars());
        System.out.println("year of realize: " +audiGarage.getYear());

        System.out.println();

        Garage<BMW> bmwGarage = new Garage<>();
        bmwGarage.setCars(new BMW("Space",2.5));
        bmwGarage.setYear(2020);
        bmwGarage.print(bmwGarage.getCars());
        System.out.println(bmwGarage.getYear());





    }
}
