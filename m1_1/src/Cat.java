public class Cat {
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    public void meow() {
        System.out.println("The cat named " + name + " says: Meow!");
    }

    public static void main(String[] args) {
        // Create an instance of the Cat class with a name
        Cat cat1 = new Cat("Whiskers");

        // Call the meow method on the cat instance
        for (int i = 0; i < 2 ; i++) {
            cat1.meow();
        }
        Cat cat2 = new Cat("Rex");
        cat2.meow();
        cat1.meow();

    }
}
