//Task 3: Create CoffeeMaker class
//
//A coffee maker has a selector for coffee type (normal/espresso) and a selector for coffee amount (10–80 ml).
// It also has an of/off switch that behaves in the same way as TV of/off switch. Coffee type and amount selectors
// behave like TV channel switch, i.e., they can only be changed when the device is on, and the device remembers the
// selections even when it is switched off.

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class CoffeeMaker_t03 {
    public static void main(String[] args) {

        //set utilities
        Timer timer = new Timer();
        Scanner in = new Scanner(System.in);

        class CoffeeMachine {
            private boolean isOn = false;
            private boolean heatOn = false;
            private int coffeeType;
            private int coffeeAmmount = 0;
            public boolean startMenu = false;
            public boolean brewMenu = false;


            public void turnOnOff() {
                isOn = !isOn;
                if (isOn) {
                    System.out.println("Coffee machine is on!");
                } else {
                    System.out.println("Coffee machine is off!");
                }

            }

            public void setCoffeeType(int coffeeType) {
                this.coffeeType = coffeeType;
                System.out.println(getCoffeeType());

            }

            public String getCoffeeType() {
                String rtn;
                if (this.coffeeType == 1) {
                    rtn = "Coffee type set to Normal";
                } else {
                    rtn = "Coffee type set to Espresso";
                }

                return rtn;
            }


            public int setCoffeeAmount(int coffeeAmmount) {
                this.coffeeAmmount = coffeeAmmount;
                System.out.println(getCoffeeAmount());
                return coffeeAmmount;
            }

            public String getCoffeeAmount() {
                String rtn= "Coffee ammount set to " + this.coffeeAmmount + "ml\n";
                return rtn;

            }

            public boolean brewCoffee() {
                if (isOn) {
                    heatOn = true;//starts heating coffee (brewing)
                    System.out.println("Brewing coffee.");//
                    System.out.println("Coffee ready!!");
                }



                return true;
            }

        }

        CoffeeMachine coffeeMachine = new CoffeeMachine();// init machine

        while (true) {
            while (!coffeeMachine.isOn) {
                System.out.println("Do you want to turn coffee mahine on? (y/n)");
                String answer = in.nextLine();
                if (answer.equals("y")) {
                    coffeeMachine.turnOnOff();
                }
            }

            coffeeMachine.startMenu = true;// go to starmenu

            while (coffeeMachine.isOn) {
                while (coffeeMachine.startMenu) {
                    System.out.println("************************START MENU*********************************" +
                            "\nPress 1) to select coffee type, press 2) to select coffee amount");
                    System.out.println("press 3) to go brew menu " + "press 4) to turn the coffee machine off");
                    String answer = in.nextLine();
                    switch (answer) {
                        case "1"://select coffeetype
                            System.out.println("************************COFFEE TYPE*********************************" +
                                    "\nSelect between coffee type, press 1) => normal, press 2) => espresso");
                            int coffeeType = Integer.parseInt(in.nextLine());
                            switch (coffeeType) {
                                case 1:
                                    coffeeMachine.setCoffeeType(1);
                                    break;
                                case 2:
                                    coffeeMachine.setCoffeeType(2);
                                    break;
                            }
                            break;

                        case "2"://select coffee ammount
                            System.out.println("**********COFFEE AMMOUNT*************"
                                    + "\nselect coffee amount between 10-80ml");
                            int coffeeAmmount = Integer.parseInt(in.nextLine());
                            while (true) {
                                if (coffeeAmmount > 80 || coffeeAmmount < 10) {
                                    System.out.println("Wrong value!!! select coffee amount between 10-80ml! " +
                                            "You gave " + coffeeAmmount + "ml");
                                    coffeeAmmount = Integer.parseInt(in.nextLine());
                                } else {
                                    break;

                                }

                            }
                            coffeeMachine.setCoffeeAmount(coffeeAmmount);
                            break;

                        case "3":
                            coffeeMachine.brewMenu = true;
                            coffeeMachine.startMenu = false; //go to brew menu
                            break;
                        case "4"://turn off coffee machine
                            coffeeMachine.turnOnOff();
                            break;


                    }
                    //exit startMenu


                    while (coffeeMachine.brewMenu) {
                        System.out.println("\n************************BREW MENU*********************************\n" +
                                coffeeMachine.getCoffeeType() + " and " + coffeeMachine.getCoffeeAmount()
                                + "\nPress 1) to start brewing, press 2 to go back to start menu");
                        answer = in.nextLine();
                        switch (answer) {
                            case "1":
                                coffeeMachine.brewMenu = false;
                                coffeeMachine.startMenu = true;
                                coffeeMachine.brewCoffee();
                                break;
                            case "2":
                                coffeeMachine.brewMenu = false;
                                coffeeMachine.startMenu = true;
                                break;
                        }
                    }

                }


            }
        }
    }


}

