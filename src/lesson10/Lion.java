package lesson10;

public class Lion extends Animal {
    public Lion(){

    }
    public Lion(String name,int age, int price){
        super(name,age,price);
    }
    @Override
    public void print() {
        System.out.printf("Лев: имя - %s,цена - %d, возраст - %d", this.getName(), this.getAge(), this.getPrice());
        System.out.println();
    }
}
