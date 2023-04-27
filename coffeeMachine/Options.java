package Homework.coffeeMachine;

import java.util.Scanner;

public class Options {

    private double drink;
    private double espresso = 1;
    private double water = 1;
    private double foamedMilk = 2;
    private double tea = 4;

    public double drinkSelection() {

        Scanner sc = new Scanner(System.in);
         System.out.print("Please enter your preferred drink number (1 - espresso, 2 - americano, 3 - cappuccino, 4 - tea): ");
            double number = sc.nextDouble();

            if (number == 1) { System.out.println("Your espresso is being prepared..."); }
            else
            {
                if (number == 2) { System.out.println("Your americano is being prepared..."); }
                else
                {
                    if (number == 3) { System.out.println("Your cappuccino is being prepared..."); }
                    else
                    {
                        if (number == 4) { System.out.println("Your tea is being prepared..."); }
                        else
                        {
                            System.out.println("You have entered a wrong number.");

                        }
                    }
                }
            }

        sc.close();
        return number;
    }

    public double drinkPreparation(double choice) {
        if (choice == 1) drink = espressoPreparation();
        else if (choice == 2) drink = americanoPreparation();
        else if (choice == 3) drink = cappuccinoPreparation();
        else if (choice == 4) drink = teaPreparation();
        else drink = 0;

        return drink;
    }

    private double espressoPreparation() {
        return espresso;
    }

    private double americanoPreparation() {
        return espresso + water;
    }

    private double cappuccinoPreparation() {
        return espresso + foamedMilk;
    }

    private double teaPreparation() {
        return tea;
    }


}



