package org.stanislav.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * @author Stanislav Hlova
 */
@Entity
@Table(name = "Animals")
public class Animal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "age")
    private int age;
    @Column(name = "name")
    private String name;
    @Column(name = "tailed")
    private boolean tail;

    public Animal() {
    }

    public Animal(int age, String name, boolean tail) {
        this.age = age;
        this.name = name;
        this.tail = tail;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isTail() {
        return tail;
    }

    public void setTail(boolean tail) {
        this.tail = tail;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                ", tail=" + tail +
                '}';
    }
}
