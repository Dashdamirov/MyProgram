package lesson10;

public class Dog extends Animal{
    public Dog(){

    }
    public Dog(String name, int age, int price){
        super(name, age, price);
    }
    public void print(){
    System.out.printf("Собака: имя - %s,цена - %d, возраст - %d", this.getName() , this.getAge(), this.getPrice());
    }
}
