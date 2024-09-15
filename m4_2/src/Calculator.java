import java.util.Scanner;

public class Calculator {
    private int currentValue;

    public int getCurrentValue() {//this method returns the current value
        System.out.println("Current value is: " + this.currentValue);
        return this.currentValue;


    }

    public void sumToCurrentValue(int number)  {//  this method adds the numbert to the current value and checks if number is <0 throws exeption
        if (number < 0) {
            throw new IllegalArgumentException("Number must be positive.");
        }
        this.currentValue += number;
        System.out.println("Current value is now: " + this.currentValue);

    }

    public void resetCurrentValue() {
        this.currentValue = 0;
        System.out.println("Current value is now: " + this.currentValue);
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        String input;

        while (true) {
            System.out.println("Enter a number to add to the current value or 'reset' to reset the value or 'current' to get current value" +
                    " . Type 'exit' to quit:");
            input = scanner.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                break;
            } else if (input.equalsIgnoreCase("reset")) {
                calculator.resetCurrentValue();
            } else if (input.equalsIgnoreCase("current")) {
                calculator.getCurrentValue();
            } else {
                try {
                    int number = Integer.parseInt(input);
                    calculator.sumToCurrentValue(number);
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter a valid number.");
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }
            }
        }

        scanner.close();
    }
}