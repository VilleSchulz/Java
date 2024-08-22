package tuntiesimerkki;

public class Student implements Comparable<Student> {
    private int age;
    private String name;


    Student(String newName, int newAge) {
        name = newName;
        age = newAge;
    }


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(Student o) {
        //Sort by first letter
        //if(name.charAt(0) < o.getName().charAt(0)){}
        if (age < o.getAge()){

        return -1;}
        else if (age == o.getAge()){
            return 0;
        }
        else {
            return 1;
        }

    }
}