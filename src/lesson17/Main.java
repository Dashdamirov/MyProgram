package lesson17;

public class Main {
    public static void main(String[] args) {
        Refrigerator refrigerator = new Refrigerator();
        refrigerator.addProduct("яблоко ", 2);
        refrigerator.addProduct("груша ", 2);
        refrigerator.addProduct("яблоко ", 1);
        refrigerator.addProduct("слива ", 4);
        refrigerator.addProduct("сливки ", 3);

        refrigerator.deleteProduct("груша", 2);
        refrigerator.printListProduct();
    }
}
