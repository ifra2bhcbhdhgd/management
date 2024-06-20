package oop;

public class Car {
    public void display(){
        System.out.println("Hi, I am a Car!");
    }

    public String name(){
        return "Hi, I am a Red Car!";
    }

    public void displayProperty(String name){
        System.out.println("Hi, I am a " + name);
    }

    public String nameProperty(String name){
        return "Hi, I am a Red " + name;
    }
}
