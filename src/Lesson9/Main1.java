package Lesson9;

public class Main1 {
    public static void main(String[] args) {
        DrobnoeChislo drob1 = new DrobnoeChislo();
        DrobnoeChislo drob2 = new DrobnoeChislo();

        drob1.setChislitel(3);
        drob1.setZnamenate1(15);

        drob2.setChislitel(4);
        drob2.setZnamenate1(18);

        int result = UtilsForDrobi.commonZnam(drob1, drob2);
        System.out.println(result);
    }
}