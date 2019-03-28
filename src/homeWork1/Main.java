package homeWork1;

public class Main {
    public static void main(String[] args) {
        Pryamougolnik pryam = new Pryamougolnik(12,24);
        Triangle treug = new Triangle("Равнобедренный",23,45);
        Kvadrat kvad = new Kvadrat(40,40);
        Krug krug = new Krug(12.45);
        krug.print();
        System.out.println();
        kvad.print();
        System.out.println();
        treug.print();
        System.out.println();
        pryam.print();
    }
}
