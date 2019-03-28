package lesson12.homeWork12;

public class FractionNumberImpl implements FractionNumber {
    private int chisl;
    private int znam;

    public FractionNumberImpl(){

    }

    public FractionNumberImpl(int chisl, int znam) {
        this.chisl = chisl;
        this.znam = znam;
    }

    @Override
    public void setDividend(int dividend) {
        this.chisl = dividend;

    }

    @Override
    public int getDividend() {
        return this.chisl;
    }

    @Override
    public void setDivisor(int divisor) throws IllegalArgumentException {
        this.znam = divisor;
    }

    @Override
    public int getDivisor() {
        return this.znam;
    }

    @Override
    public double value() {
        return this.chisl / (double)this.znam;
    }

    @Override
    public String toString() {
        return  chisl + " / " + znam ;
    }
}
