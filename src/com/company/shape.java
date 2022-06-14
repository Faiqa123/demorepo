package com.company;
public class shape {
    private int rad;
    //default constructor
    shape(){ rad = 0; }
    //parameterized constructor
    shape(int radius){ }
    //setter
    void set_radius(int a){ this.rad = a; }
    //getter
    int get_radius(){ return this.rad; }
    //class functions
    void print_area(){
        double pi = 3.14;
        double area = pi * get_radius() * get_radius();
        System.out.println("area of circle = "+ area);
    }
}//end class
