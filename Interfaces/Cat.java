public class Cat implements IMakesSound {
    String name;

    public Cat() {
        this.name = "Cat";
    }

    @Override
    public void makeSound() {
        System.out.println("Meow");
    }
}
