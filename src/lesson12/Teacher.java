package lesson12;

public class Teacher implements Emploer {

    @Override
    public void getSallary() {
        System.out.println("I am get 20000 rubles");

    }

    @Override
    public void doWork() {
        System.out.println("I am worc in school");

    }
}
