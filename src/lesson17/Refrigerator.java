package lesson17;

import java.util.HashMap;
import java.util.Set;

public class Refrigerator {
    private HashMap<String, Integer> products = new HashMap<>();
    private int capasity = 50;


    public void addProduct (String product, int value){
        if (products.containsKey(product)){
            int correntValue = products.get(product);
            int newValue = value + correntValue;
            products.put(product,newValue);
        }else {
            products.put(product,value);
        }

    }
    public void deleteProduct (String product, int value){
        if (!products.containsKey(product)){
            System.out.println("Такого продукта в холодильнике нет");
            return;
        }
        int carrentValue = products.get(product);
        if (value > carrentValue){
            System.out.println("Вы запрашиваете больше чем есть!");
            return;
        }
        int newValue = carrentValue - value;
        if (newValue == 0){
            products.remove(product);
        }else {
        products.put(product,newValue);}
    }

    public void printListProduct (){
        Set<String> prodNames = products.keySet();
        for (String name:prodNames) {
            System.out.printf("%s + %d кг",name, products.get(name));
        }
        System.out.println();

    }

}
