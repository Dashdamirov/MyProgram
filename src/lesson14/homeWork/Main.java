package lesson14.homeWork;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> num1 = new ArrayList<>();
        num1.add(1);
        num1.add(2);
        num1.add(3);
        num1.add(5);

        HashSet<Integer> num2 = new HashSet<>();
        num2.add(1);
        num2.add(7);
        num2.add(6);
        num2.add(5);

        CollectionUtils utils = new CollectionUtilsImpl();
        Collection<Integer> result1 = utils.union(num1, num2);
        System.out.println(result1);
    }
}