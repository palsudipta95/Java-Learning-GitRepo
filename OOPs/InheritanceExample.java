class Animal {
    String name;

    void makeSound() {
        System.out.println("Some generic animal sound");
    }
}

class Dog extends Animal {
    void makeSound() {
        System.out.println("Bark! Bark!");
    }
}

public class InheritanceExample {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.name = "Buddy";
        System.out.println("Dog Name: " + myDog.name);
        myDog.makeSound();
    }
}