package lesson16;

public class Tovar implements Comparable<Tovar> {
    private int price;
    private int buyCount;
    private String name;
    private int rating;
    private int viev;

    public Tovar(){

    }

    public Tovar(int price, int buyCount, String name, int rating, int viev) {
        this.price = price;
        this.buyCount = buyCount;
        this.name = name;
        this.rating = rating;
        this.viev = viev;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getBuyCount() {
        return buyCount;
    }

    public void setBuyCount(int buyCount) {
        this.buyCount = buyCount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public int getViev() {
        return viev;
    }

    public void setViev(int viev) {
        this.viev = viev;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Tovar tovar = (Tovar) o;

        if (price != tovar.price) return false;
        if (buyCount != tovar.buyCount) return false;
        if (rating != tovar.rating) return false;
        if (viev != tovar.viev) return false;
        return name.equals(tovar.name);
    }

    @Override
    public int hashCode() {
        int result = price;
        result = 31 * result + buyCount;
        result = 31 * result + name.hashCode();
        result = 31 * result + rating;
        result = 31 * result + viev;
        return result;
    }

    @Override
    public String toString() {
        return "Tovar{" +
                "price =" + price +
                ", buyCount =" + buyCount +
                ", name ='" + name + '\'' +
                ", rating =" + rating +
                ", viev =" + viev +
                '}';
    }

    @Override
    public int compareTo(Tovar o) {
        if (this.price != o.price){
            return this.price - o.price;
        }
        if (this.buyCount != o.buyCount){
            return this.buyCount - o.buyCount;
        }
        if (this.rating != o.rating){
            return this.rating - o.rating;
        }
        if (this.viev != o.viev){
            return this.viev - o.viev;
        }



        return this.name.compareTo(o.name);
    }
}
