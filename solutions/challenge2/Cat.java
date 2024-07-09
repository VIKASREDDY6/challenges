package solutions.challenge2;

public class Cat implements Animal {
    public String id;
    public String name;

    @Override
    public void eat() {
        System.out.println("Cat eats");
    }

    @Override
    public void run() {
        System.out.println("Cat runs");
    }

    // Is it ok to have this method throwing exception? How to solve?
    @Override
    public void swim() {
        throw new RuntimeException("Cat doesn't swim");
    }
}
