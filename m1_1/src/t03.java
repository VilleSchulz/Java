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

            //If you parse input as integers, average count will be wrong
            // because it doesnt count numbers after "."
            double sum = first + second + third;
            double product = first*second*third;
            double average = (first+second+third) / 3;

            System.out.println("The sum of the numbers is " + sum);
            System.out.println("The product of the numbers is " + product);
            System.out.println("The average of the numbers is " + average);
            scanner.close();
        }
    }

