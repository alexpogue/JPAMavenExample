package com.javawebtutor;
 
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
 
@Entity
@Table(name = "dogs")
public class Dog {
 
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
 
    @Column(name = "name")
    private String name;
 
    @Column(name = "breed")
    private String breed;
 
    public Dog() {
 
    }
 
    public Dog(int id, String name, String breed) {
        this.setId(id);
        this.setFirstName(name);
        this.setBreed(breed);
    }
 
    public int getId() {
        return id;
    }
 
    public void setId(int id) {
        this.id = id;
    }
 
    public String getFirstName() {
        return name;
    }
 
    public void setFirstName(String firstName) {
        this.name = firstName;
    }
 
    public String getBreed() {
        return breed;
    }
 
    public void setBreed(String breed) {
        this.breed = breed;
    }
}