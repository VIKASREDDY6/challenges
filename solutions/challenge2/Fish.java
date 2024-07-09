package solutions.challenge2;

public class Fish implements Animal {
    public String id;
    public String name;

    @Override
    public void eat() {
        System.out.println("Fish eats");
    }

    @Override
    public void swim() {
        System.out.println("Fish swims");
    }

    // Is it ok to have this method throwing exception? How to solve?
    @Override
    public void run() {
        throw new RuntimeException("Fish doesn't run");
    }
}
