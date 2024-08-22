package tuntiesimerkki;

import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        Student a1 = new Student("Make", 13);
        Student a2 = new Student("Jari", 14);
        Student a3 = new Student("Kari", 19);
        Student a4 = new Student("Pertsa", 24);
        Student a5 = new Student("Maarit", 100);

        PriorityQueue<Student> list = new PriorityQueue<>();
        list.add(a1);
        list.add(a2);
        list.add(a3);
        list.add(a4);
        list.add(a5);
        for(int i = 0; i < list.size(); i++){
            Student s = list.poll();
            while (s != null){
                System.out.println("Student: "+ s.getName()+ " age "+ s.getAge()+  " Yearcourse: "+ s.getYearCourse());
                s=list.poll();
            }


        }

    }
}
