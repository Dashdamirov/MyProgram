package lesson13;

public abstract class AbstractCountry implements Country {
    private int narod;
    private int kurort;
    private int square;
    private String stolitsa;
    private boolean visa;



    @Override
    public void printNarod() {
        System.out.println(narod);
    }

    @Override
    public void printKurorti() {
        System.out.println(kurort);
    }

    @Override
    public void printSquare() {
        System.out.println(square);
    }

    @Override
    public String getStolitsa() {
        return stolitsa;
    }

    @Override
    public boolean needVisa() {
        return visa;
    }

    public int getNarod() {
        return narod;
    }

    public void setNarod(int narod) {
        this.narod = narod;
    }

    public int getKurort() {
        return kurort;
    }

    public void setKurort(int kurort) {
        this.kurort = kurort;
    }

    public int getSquare() {
        return square;
    }

    public void setSquare(int square) {
        this.square = square;
    }

    public void setStolitsa(String stolitsa) {
        this.stolitsa = stolitsa;
    }

    public boolean isVisa() {
        return visa;
    }

    public void setVisa(boolean visa) {
        this.visa = visa;
    }
}
