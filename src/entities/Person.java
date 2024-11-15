package entities;

public abstract class Person {
    private String name;
    private int age;
    private String gender;
    private String phone;

    public Person(String name, int age, String gender, String phone) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.phone = phone;
    }
}
