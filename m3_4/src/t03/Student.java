package t03;

import java.io.Serializable;

public class Student implements Serializable {
    private String name;
    private int age;
    private int id;
    public Student(String name, int age, int id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public int getId(){
        return id;
    }
}
