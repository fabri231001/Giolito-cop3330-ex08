/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Fabrizio Giolito
 */

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	    System.out.println("How many people? ");
        Scanner s1 = new Scanner(System.in);
        int p = s1.nextInt();
        System.out.println("How many pizzas do you have? ");
        Scanner s2 = new Scanner(System.in);
        int z = s2.nextInt();
        int sl = (p*z);
        System.out.println(p + " people with " + z + " pizzas (" + sl + " slices.)");
        if(sl % 2 == 0)
            System.out.println("Each person gets " + (sl/p) + " pieces of pizza.\n" +
                    "There are 0 leftover pieces.");
        else{
            System.out.println("Each person gets " + (sl/p) + " pieces of pizza.\n" +
                    "There are " + (sl%p) + " leftover pieces.");
        }
    }
}
