package lesson12;

public class Main {
    public static void main(String[] args) {
    Teacher teacher1 = new Teacher();
    Teacher teacher2 = new Teacher();

    Shofer shofer1 = new Shofer(20,"Maks");
    Shofer shofer2 = new Shofer(25,"Mark");

    Emploer[] emploers = new Emploer[4];
    emploers[0] = shofer1;
    emploers[1] = teacher1;
    emploers[2] = shofer2;
    emploers[3] = teacher2;

    for (int i =0 ; i < emploers.length ; i++){
        emploers[i].doWork();
    }

    }
}
