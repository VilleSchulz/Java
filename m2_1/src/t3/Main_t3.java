package t3;

import java.util.Scanner;

public class Main_t3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        CoffeeMaker_t03 coffeeMachine = new CoffeeMaker_t03();


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
                            if (CoffeeMaker_t03.coffeeType == 0 || CoffeeMaker_t03.coffeeAmmount == 0) {
                                System.out.println("!!!!Select both coffee type and ammount before brewing!!!!\n"+
                                        coffeeMachine.getCoffeeAmount()+coffeeMachine.getCoffeeType());//if coffee ammount and type not set go back to start menu

                            } else {
                                coffeeMachine.brewMenu = true; //go to brew menu
                                coffeeMachine.startMenu = false;
                            }
                            break;


                        case "4"://turn off coffee machine
                            coffeeMachine.turnOnOff();
                            coffeeMachine.startMenu = false;
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
