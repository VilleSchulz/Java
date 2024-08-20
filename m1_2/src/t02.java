import java.util.Scanner;
public class t02 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give the lenght of the first side of triangle ");
        double firstSide = Double.parseDouble(scanner.nextLine());
        System.out.println("Give the lenght of the second side of triangle ");
        double secondSide = Double.parseDouble(scanner.nextLine());
        double hypotenusa = Math.sqrt(Math.pow(firstSide,2) + Math.pow(secondSide,2));
        System.out.printf("Lenght of the hypotenusa is %.2f", hypotenusa);

    }
}
