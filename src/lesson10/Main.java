package lesson10;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("bear",12,23000);
        Lion lion = new Lion("Gab",10,50000);
        Lion lion1 = new Lion("FAG",13,70000);
        Lion lion2 = new Lion("DAS",12,60000);

        Dog dog = new Dog("REW",9,30000);
        Dog dog1 = new Dog("REq",5,40000);
        Dog dog2 = new Dog("REp",7,50000);

        Animal[] zoo = new Animal[6];
        zoo[0]=dog;
        zoo[1]=dog2;
        zoo[2]=lion;
        zoo[3]=dog1;
        zoo[4]=lion;
        zoo[5]=lion2;

        for (int i = 0; i < zoo.length ; i++){
            zoo[i].print();
        }



        lion.print();
        animal.print();
    }
}
