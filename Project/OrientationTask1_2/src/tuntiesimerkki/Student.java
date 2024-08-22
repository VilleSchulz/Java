package tuntiesimerkki;

public class Student implements Comparable<Student> {
    private int age;
    private String name;
    private Yearcourse yearCourse;

    Student(String newName, int newAge) {
        name = newName;
        age = newAge;
        yearCourse = Yearcourse.FIRST;
    }


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
public Yearcourse getYearCourse() {
        return yearCourse;
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