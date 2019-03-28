package lesson16;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<Tovar> tovars = new HashSet<>();

        Tovar tovar1 = new Tovar(100,2,"Mobile",5,4);
        Tovar tovar2 = new Tovar(1000,12,"Ruchka",5,0);
        Tovar tovar3 = new Tovar(10000,11,"Knife",4,1);
        Tovar tovar4 = new Tovar(4000,13,"Mobi",3,20);
        Tovar tovar5 = new Tovar(5000,2,"Mobil",2,4);
        Tovar tovar6 = new Tovar(6000,7,"Oil",5,2);

        tovars.add(tovar1);
        tovars.add(tovar2);
        tovars.add(tovar3);
        tovars.add(tovar4);
        tovars.add(tovar5);
        tovars.add(tovar6);

        SortTovara.sortByPrice(tovars);
    }
}
