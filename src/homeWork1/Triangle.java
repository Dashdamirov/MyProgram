package homeWork1;

public class Triangle {
    private String name;
    private int katet;
    private int gipotenuza;

    public Triangle(){

    }

    public Triangle(String name, int katet, int gipotenuza) {
        this.name = name;
        this.katet = katet;
        this.gipotenuza = gipotenuza;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getKatet() {
        return katet;
    }

    public void setKatet(int katet) {
        this.katet = katet;
    }

    public int getGipotenuza() {
        return gipotenuza;
    }

    public void setGipotenuza(int gipotenuza) {
        this.gipotenuza = gipotenuza;
    }
    public void print(){
        System.out.printf("Треугольник: %s, катет: %s, гипотенуза: %s", this.name,this.katet, this.gipotenuza);
    }
}
