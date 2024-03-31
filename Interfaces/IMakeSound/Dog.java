package IMakeSound;

public class Dog implements IMakesSound {
    String name;

    public Dog() {
        this.name = "Dog";
    }

    @Override
    public void makeSound() {
        System.out.println("Woof");
    }
}
