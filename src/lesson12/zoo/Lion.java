package lesson12.zoo;

public class Lion implements ZooAnimal {

    @Override
    public void voice() {
        System.out.println("RRRRRRRR");
    }

    @Override
    public void jump() {
        System.out.println("Jump");
    }
}
