package Homework.pizza;

public class PizzaCalories {
    // S = pi * (diameter / 2)^2
    public PizzaCalories() {
        System.out.println("A 24 cm diameter pizza has " + countPizzaCal(24) + " calories.");
        System.out.println("A 28 cm pizza has " + countPizzaCal(28) + " calories.");
        System.out.println("Hence your 28 cm pizza has " + (countPizzaCal(28) - countPizzaCal(24)) + " more calories that a 24 cm diameter pizza.");

    }
    public double div(double x){
        return x / 2;
    }

    public double pow(double q){
        return Math.pow(q, 2);
    }

    public double mul(double w){ return Math.PI * w; }

    public double cal(double c){ return c * 40; }

    public double countPizzaCal (double z) { return cal(mul(pow(div(z)))); }


}
