package de.telran.Melkonov.Oleg;

import java.util.Random;

public class Phone {
    private String number;
    public String model;
    int weight;

    public void setNumber(String number){
        this.number = number;
    }
    public String getNumber(){
        return number;
    }
    public void setWeight(int weight){
        if(weight > 0) this.weight = weight;
        else System.out.println("Вес не может равняться нулю");
    }

    public int getWeight(){
        return weight;
    }

    public void receiveCall(String incomingName){
        System.out.println("Звонит " + incomingName);
    }

    public void call(String outgoingName){
        Random random = new Random();
        boolean availability = random.nextBoolean();
        if (availability == true) System.out.println("Дозвонился до " + outgoingName);
        else System.out.println("Абонент " + outgoingName + " не доступен");
    }

    public Phone(){

    }

    public Phone(String number, String model, int weight){
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public static void main(String[] args) {
        Phone phone1 = new Phone("123", "Samsung", 300);
        Phone phone2 = new Phone("456", "iPhone", 200);
        Phone phone3 = new Phone("789", "RusPhone", 1000);
        System.out.println("Первый телефон с номером " + phone1.model + " модели " + phone1.number + " весит " + phone1.weight + " гр.");
        System.out.println("Второй телефон с номером " + phone2.model + " модели " + phone2.number + " весит " + phone2.weight + " гр.");
        System.out.println("Второй телефон с номером " + phone3.model + " модели " + phone3.number + " весит " + phone3.weight + " гр.");

        phone1.receiveCall("Катя");
        phone2.receiveCall("Вадик");
        phone3.receiveCall("Марго");

        phone1.call("Миша");
        phone2.call("Серёжа");
        phone3.call("Юля");

        phone1.setNumber("321");
        phone2.setNumber("654");
        phone3.setNumber("987");

        System.out.println(phone1.getNumber());
        System.out.println(phone2.getNumber());
        System.out.println(phone3.getNumber());

    }
}
