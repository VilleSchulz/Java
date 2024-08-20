import java.util.Scanner;

public class t01 {

    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a temperature as Fahrenheit");
        double temperatureF = scanner.nextDouble();
        //Example: (50°F - 32) x .5556 = 10°C
        double temperatureC = (temperatureF - 32)* 0.5556;
        System.out.printf("Here is converted value to Celsius: %.2f ", temperatureC);
        scanner.close();
    }
}

