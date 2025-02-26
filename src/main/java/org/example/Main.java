package org.example; //DO NOT DELETE
/*
GallonConverter
Neil Jain
*/
import java.util.Scanner ;
public class Main {
    public static void main(String[] args) {
        double gallons;
        double quarts;
        double pints;
        double cups;
        double tablespoons;
        Scanner input = new Scanner(System.in) ;
        System.out.print("Enter the number of gallons: ") ;
        gallons = input.nextDouble() ;
        input.close() ;
        System.out.println("In 4.0 gallons there are:") ;
        quarts = gallons * 4.0 ;
        pints = gallons * 8.0 ;
        cups = pints * 2.0 ;
        tablespoons = cups * 16.0 ;
        System.out.println(quarts + " quarts") ;
        System.out.println(pints + " pints") ;
        System.out.println(cups + " cups") ;
        System.out.println(tablespoons + " tablespoons") ;

        
    }
}