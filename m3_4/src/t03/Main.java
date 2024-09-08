package t03;

import java.io.*;

public class Main {
    private final static String FILENAME = "enrollments.ser";

    public static void main(String[] args) {
        File file = new File(FILENAME);
        Student[] student = new Student[5];
        student[0] = new Student("Pertti", 14, 1);
        student[1] = new Student("Miro", 15, 2);
        student[2] = new Student("Ville", 155, 3);
        student[3] = new Student("Karri", 17, 4);
        student[4] = new Student("Maisa", 99, 5);
        Course course = new Course("Kitaranhuolto", "KH", "Pertti Höyläsoikkeli");
        Enrollment[] enrollments = new Enrollment[5];
       enrollments[0] = new Enrollment(student[0], course, "KH1");
        enrollments[1] = new Enrollment(student[1], course, "KH2");
        enrollments[2] = new Enrollment(student[2], course, "KH3");
        enrollments[3]  = new Enrollment(student[3], course, "KH4");
        enrollments[4] = new Enrollment(student[4], course, "KH5");


        try (
                FileOutputStream outputStream = new FileOutputStream(FILENAME);
                ObjectOutputStream objects = new ObjectOutputStream(outputStream);
        ) {
            for (Enrollment e : enrollments) {
                objects.writeObject(e);
                System.out.println("Enrollment: " + e.getenrollment());
            }
            objects.close();
            System.out.println("Objects serializet to " + FILENAME);
        } catch (Exception e) {
            System.err.println("Write error: " + e);
        }
        if (file.exists() && file.isFile()) {
            try (FileInputStream inputStream = new FileInputStream(FILENAME);
                 ObjectInputStream inputObjects = new ObjectInputStream(inputStream);
            ) {
                for (int i = 0; i < enrollments.length; i++) {
                    Enrollment enrollment = (Enrollment) inputObjects.readObject();
                    enrollments[i] = enrollment;
                    System.out.println("Enrollment deserialized: " + enrollment.getenrollment());
                }
                inputObjects.close();
            }
            catch (Exception e) {
                System.err.println("Read error: " + e);
            }

        }


    }
}
