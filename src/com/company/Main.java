package com.company;

public class Main {

    public static void main(String[] args) {

        shape obj = new shape(); //to make an object of a class
        obj.set_radius(13); //set value in setter of a class
        int value = obj.get_radius(); //get value from getter of a class
        System.out.println(value); //simply print getter value
        obj.print_area(); //calling a class function using object of the class

    }
}
