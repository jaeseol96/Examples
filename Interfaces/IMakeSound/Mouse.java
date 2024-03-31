package IMakeSound;

public class Mouse implements IMakesSound {
    String name;

    public Mouse() {
        this.name = "Mouse";
    }

    @Override
    public void makeSound() {
        System.out.println("Squeak");
    }
}
