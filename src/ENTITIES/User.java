package ENTITIES;

import java.util.Date;

public class User extends Base {

    public String name;
    public String surname;
    public String username;

    public User() {

    }

    public User(int id, Date createdAt, Date modifiedAt, String name, String surname, String username) {
        super(id, createdAt, modifiedAt);
        this.name = name;
        this.surname = surname;
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
