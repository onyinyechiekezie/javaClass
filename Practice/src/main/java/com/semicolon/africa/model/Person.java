package main.java.com.semicolon.africa.model;

public class Person {
    public String name;
    public int age;
    public String gender;
    public String address;
    public String phone;

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }

    public Person(String name, int age, String gender, String address, String phone) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
        this.phone = phone;
    }
    public Person(String name, int age, String gender, String address) {
        this(name, age, gender, address, null);
    }
    public Person(String name, int age, String gender) {
        this(name, age, gender, null, null);
    }
    public Person(String name, int age) {
        this(name, age, null, null, null);
    }
    public Person(String name) {
        this(name,0,null);
    }
    public Person() {
        this(null);
    }
}
