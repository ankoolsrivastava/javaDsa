package oops;

// ==============================
// 1. ABSTRACTION (Abstract Class)
// ==============================
abstract class Animal {
    String name;

    Animal(String name) {
        this.name = name; // 'this' keyword
    }

    abstract void sound(); // abstract method

    void sleep() {
        System.out.println(name + " is sleeping...");
    }
}

// ==============================
// 2. INTERFACE
// ==============================
interface Pet {
    void play();
}

// ==============================
// 3. INHERITANCE + OVERRIDING
// ==============================
class Dog extends Animal implements Pet {

    Dog(String name) {
        super(name); // calling parent constructor
    }

    @Override
    void sound() { // runtime polymorphism
        System.out.println(name + " barks");
    }

    @Override
    public void play() {
        System.out.println(name + " is playing");
    }
}

// ==============================
// ENCAPSULATION
// ==============================
class Person {
    private String name;
    private int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        if (age > 0)
            this.age = age;
    }

    public int getAge() {
        return age;
    }
}

// ==============================
// POLYMORPHISM (OVERLOADING)
// ==============================
class Calculator {

    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }
}

// ==============================
// STATIC + FINAL
// ==============================
class Utility {
    static int count = 0;

    Utility() {
        count++;
    }

    static void showCount() {
        System.out.println("Objects created: " + count);
    }

    final void display() {
        System.out.println("Final method");
    }
}

// ==============================
// MAIN CLASS (ONLY ONE PUBLIC)
// ==============================
public class OOPConceptsDemo {

    public static void main(String[] args) {

        // Object Creation
        Dog d = new Dog("Tommy");
        d.sound();
        d.sleep();
        d.play();

        // Encapsulation
        Person p = new Person("Rishu", 20);
        System.out.println("Name: " + p.getName());
        p.setAge(22);
        System.out.println("Age: " + p.getAge());

        // Method Overloading
        Calculator calc = new Calculator();
        System.out.println("Add int: " + calc.add(2, 3));
        System.out.println("Add double: " + calc.add(2.5, 3.5));

        // Static
        Utility u1 = new Utility();
        Utility u2 = new Utility();
        Utility.showCount();

        // Runtime Polymorphism
        Animal a = new Dog("Rocky");
        a.sound();

        // Final
        u1.display();
    }
}