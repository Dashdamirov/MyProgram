package homeWork1;

public class Pryamougolnik {
    private int height;
    private int leight;

    public Pryamougolnik(int height, int leight) {
        this.height = height;
        this.leight = leight;
    }

    public Pryamougolnik(){

    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getLeight() {
        return leight;
    }

    public void setLeight(int leight) {
        this.leight = leight;
    }
    public void print(){
        System.out.printf("Прямоугольник - Высота: %d, Длина: %d ", this.height, this.leight);
    }
}
