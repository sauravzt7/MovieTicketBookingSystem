package entities;

import java.util.UUID;

public class User extends Person {
    private UUID id;
    public User(String name, int age, String gender, String phone) {
        super(name, age, gender, phone);
        this.id = UUID.randomUUID();
    }

    public UUID getId() {
        return id;
    }
}
