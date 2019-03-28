package homeWork1;

public class Kvadrat extends Pryamougolnik {
    public Kvadrat(){

    }
    public Kvadrat(int height, int leight){
        super(height,leight);
    }

    @Override
    public void print() {
        System.out.printf("Квадрат - высота: %d, длина: %d", getHeight(),getLeight());
    }
}
