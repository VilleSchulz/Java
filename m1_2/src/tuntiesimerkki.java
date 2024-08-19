import java.util.Scanner;

public class tuntiesimerkki {
    public static void main(String[] args) {
        int x = 5;
        double y = 3.14765;
        System.out.println("x : "+ x + y);
        System.out.printf("y: %.2f\n", y);

        String merkkijono = "H";
        char z = 'a';
        System.out.println(merkkijono + z);
        int _1x; // esimerkkejä määrityksistä
        int x1;
        int students;
        int numberOfStudents;
        int numberOfStudentsInClass;


//toinen esimerkki

    Scanner in = new Scanner(System.in);
    System.out.print("Anna nimesi: ");
    String name = in.nextLine();
    System.out.println("Terve " + name);
    System.out.print("Annatko lisäksi ikäsi? :");
    int age = Integer.parseInt(in.nextLine());
    //int age = in.nextInt();
    System.out.println("Terve, " + name + ", ikäsi on:" + age);
    /*int a = 5, b = 2;
    int tulos = a / b;
    System.out.println("tulos: " + tulos);*/
        int a = 5;

        double b = 2;
        double tulos = a / b;
        System.out.println("tulos : " + tulos);
}
}