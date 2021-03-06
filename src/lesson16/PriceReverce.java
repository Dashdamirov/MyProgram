package lesson16;


import java.util.Comparator;

public class PriceReverce implements Comparator<Tovar> {



    @Override
    public int compare(Tovar o1, Tovar o2) {
        if (o1.getPrice() != o2.getPrice()){
            return o1.getPrice() - o2.getPrice();
        }
        if (o1.getBuyCount() != o2.getBuyCount()){
            return o1.getBuyCount() - o2.getBuyCount();
        }
        if (o1.getRating() != o2.getRating()){
            return o1.getRating() - o2.getRating();
        }
        if (o1.getViev() != o2.getViev()){
            return o1.getViev() - o2.getViev();
        }
        return o1.getName().compareTo(o2.getName());
    }

}
