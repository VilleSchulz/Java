package t3;//Task 3: Create CoffeeMaker class
//
//A coffee maker has a selector for coffee type (normal/espresso) and a selector for coffee amount (10–80 ml).
// It also has an of/off switch that behaves in the same way as TV of/off switch. Coffee type and amount selectors
// behave like TV channel switch, i.e., they can only be changed when the device is on, and the device remembers the
// selections even when it is switched off.


public class CoffeeMaker_t03 {


    public boolean isOn = false;
    public boolean heatOn = false;
    public int coffeeType = 0 ;
    public int coffeeAmmount = 0;
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
        String rtn = "";
        switch (coffeeType) {
            case 0:
                rtn = "Coffee type set to none";
                break;
            case 1:
                rtn = "Coffee type set to Normal";
                break;

            case 2:
                rtn = "Coffee type set to Espresso";
                break;

        }


        return rtn;
    }


    public int setCoffeeAmount(int coffeeAmmount) {
        this.coffeeAmmount = coffeeAmmount;
        System.out.println(getCoffeeAmount());
        return coffeeAmmount;
    }

    public String getCoffeeAmount() {
        String rtn = "Coffee ammount set to " + this.coffeeAmmount + "ml\n";
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

