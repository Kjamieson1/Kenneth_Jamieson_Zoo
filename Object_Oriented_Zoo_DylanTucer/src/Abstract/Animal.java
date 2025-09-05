package Abstract;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 * ABSTRACT CLASS
 * @author spect
 */


 //Sets up most basic attributes in an animal necessary to program
public abstract class Animal {

    public abstract void move();  //default animal movement

    public abstract void makeSound();   //Make Animal make a sound

    public abstract void identify();   //Identifies species name of animal instance
}
