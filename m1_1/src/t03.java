import java.util.Scanner;

    public class t03 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Give the first number:");
            double first = Double.parseDouble(scanner.nextLine());

            System.out.println("Give the second number:");
            double second = Double.parseDouble(scanner.nextLine());

            System.out.println("Give the third number:");
            double third = Double.parseDouble(scanner.nextLine());

            double product = first*second*third;
            double average =(first+second+third) / 3;

            System.out.println("The sum of the numbers is " + (first + second + third));
            System.out.println("The product of the numbers is " + product);
            System.out.println("The average of the numbers is " + average);

        }
    }

