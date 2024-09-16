Idea was to create calculator class with sum, reset and current value methods .

```

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



```
Explanation of the code:
- The class Calculator has three methods: getCurrentValue, sumToCurrentValue, and resetCurrentValue.
- The getCurrentValue method returns the current value.
- The sumToCurrentValue method adds the given number to the current value. If the number is negative, it throws an IllegalArgumentException.
- The resetCurrentValue method resets the current value to 0.
- The main method creates an instance of the Calculator class and uses a Scanner to read user input.
- The program runs in a loop, prompting the user to enter a number to add to the current value, reset the value, or get the current value.
- If the user enters "exit," the program exits the loop and ends.
- If the user enters an invalid number, the program catches the NumberFormatException and prompts the user to enter a valid number.
- If the user enters a negative number, the program catches the IllegalArgumentException and prompts the user to enter a positive number.
- The program closes the Scanner when the loop ends.

After co-pilot explained the code it started to hallusinate endlessly about the code:D

- The program allows the user to perform basic calculator operations interactively.
- The program demonstrates the use of exception handling to handle invalid input.
- The program demonstrates the use of a loop to repeatedly prompt the user for input.
- The program demonstrates the use of a Scanner to read user input from the console.
- The program demonstrates the use of a class with methods to encapsulate functionality.
- The program demonstrates the use of instance variables to maintain state across method calls.
- The program demonstrates the use of conditional statements to control program flow based on user input.
...