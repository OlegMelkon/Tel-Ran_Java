package de.telran.Melkonov.Oleg;

public class Person {

    public static String fullName;
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void talk(String fullName){
        System.out.println(fullName + " говорит...");
    }

    public int move(){
        return (int) (Math.random() * 100);
    }

    public Person(){

    }
    public Person(String fullName, int age){
        this.fullName = fullName;
        this.age = age;
    }

    public static void main(String[] args) {

        Person oleg = new Person();
        Person vadim = new Person("Вадим",16);

        oleg.setAge(41);
        vadim.setAge(17);

        System.out.println(oleg.getAge());
        System.out.println(vadim.getAge());

        System.out.println(vadim.move());
        System.out.println(oleg.move());

        talk("Вася");
    }

}
