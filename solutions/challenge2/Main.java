package solutions.challenge2;

import java.util.ArrayList;
import java.util.List;

/*
Goal:
This project is not well-coded and needs improvement.

Tasks:

How can we improve the classes by following best coding practices?
Consider all possible options for improvement.
Add a new animal class (Dog) and implement output lists.
Hints:

Which SOLID principles can be applied?
*/
public class Main {

    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Cat());
        animals.add(new Fish());
        // Add Dog that runs and swims


        // Listing all animals eating
        for (Animal animal : animals) {
            animal.eat();
        }

        // How we can list the animal names?
        // <code for loop here>

        // How we can list the animals running?
        // <code for loop here>

        // How we can list the animals swimming?
        // <code for loop here>
    }
}