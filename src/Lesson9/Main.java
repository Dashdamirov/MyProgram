package Lesson9;

public class Main {
    public static void main(String[] args) {
        Student vasya = new Student();
        Student petya = new Student();
        double result = vasya.perimetr(2,4,7);

        vasya.setName("Vasya");
        petya.setName("Petya");

        vasya.setAge(23);
        petya.setAge(24);

        vasya.setSurname("Petrov");
        petya.setSurname("Vasnetsov");

        System.out.println(petya.getName());
        System.out.println(vasya.getName());

    }
}
