package Homework.coffeeMachine;

import java.util.Scanner;

public class CoffeeMachineMain
{

    public static void main(String[] args)
    {
        Options c = new Options();

        double drinkChosen = c.drinkSelection();

        double drinkPrepared = c.drinkPreparation(drinkChosen);

        if (drinkPrepared == 1) System.out.println("Your espresso is ready. Thank you!");
        else if (drinkPrepared == 2) System.out.println("Your americano is ready. Thank you!");
        else if (drinkPrepared == 3) System.out.println("Your cappuccino is ready. Thank you!");
        else if (drinkPrepared == 4) System.out.println("Your tea is ready. Thank you!");
        else System.out.println("Unfortunately, you have not chosen any drink.");

    }


}


