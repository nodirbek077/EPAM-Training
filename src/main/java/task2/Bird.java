package task2;

import task1.Animal;

public class Bird extends Animal {
    public Bird() {
        super("blue",2,false);
    }

    @Override
    public String getDescription() {
        return super.getDescription();
    }

    public static void main(String[] args) {
        Bird bird = new Bird();
        Dog dog = new Dog();
        System.out.println("Bird: " + bird.getDescription());
        System.out.println("Dog: " + dog.getDescription());
    }
}
