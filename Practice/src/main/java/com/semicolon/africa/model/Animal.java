package main.java.com.semicolon.africa.model;

public class Animal {
    public String name;
    public String sound;
    public int age;
    public String color;

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", sound='" + sound + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }

    public Animal(String name, String sound, int age, String color) {
        this.name = name;
        this.sound = sound;
        this.age = age;
        this.color = color;
    }

    public void move(String speed) {
        System.out.println(name + "moves at" +speed + "m/s");
    }

    public void eat(String foodName) {
        System.out.println(name + " eats " + foodName);
    }

    public void sleep(String sleepTime) {
        System.out.println(name + " sleeps by" + sleepTime);
    }

    public void hunt(String hunt) {
        System.out.println(name + " hunts " + hunt);
    }

    public void behaviour() {
        System.out.println(name + " makes a" + sound + "sound");
    }

    public void behaviourTwo() {
        System.out.println(name + "is" + age + "years old and is" + color+ "in color");
    }


}
