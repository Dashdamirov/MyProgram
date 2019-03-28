package lesson16;

import java.util.HashSet;
import java.util.TreeSet;

public class SortTovara {
    public static void sortByPrice(HashSet<Tovar> tovars){
        TreeSet<Tovar> result = new TreeSet<>();
        result.addAll(tovars);

        for (Tovar t: result){
            System.out.println(t);
        }
    }


    public static void sortByPriceRecet(HashSet<Tovar> tovars){
        TreeSet<Tovar> result = new TreeSet<>();
        result.addAll(tovars);

        for (Tovar t: result){
            System.out.println(t);
        }
    }
}
