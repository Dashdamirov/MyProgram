package lesson12;

import java.util.Objects;

public class Shofer implements Father, Emploer {
    private int age;
    private String name;

    public Shofer(){


    }

    public Shofer(int age, String name) {
        this.age = age;
        this.name = name;
    }

    /*annatatsiya override*/
    @Override

    public void getSallary() {
        System.out.println("I am shafer");

    }

    @Override
    public void doWork() {
        System.out.println("I am work");

    }

    @Override
    public void otveztiRebenkaVSad() {
        System.out.println("Otvoju rebenka");

    }

    @Override
    public void zabtatRebenkaIzDetsad() {
        System.out.println("Zabirayu rebenka");

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Shofer shofer = (Shofer) o;
        return age == shofer.age &&
                Objects.equals(name, shofer.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name);
    }

    @Override
    public String toString() {
        return "Shofer{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
