package core;

import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * User: vladimir.ovcharov
 * Date: 6/25/13
 * Time: 12:21 PM
 * To change this template use File | Settings | File Templates.
 */
public class User implements Serializable {
    private String name;
    private String lastName;

    public User() {
    }

    public User(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}