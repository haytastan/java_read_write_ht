package com.hayatitastan;

/**
 * Created by Dr. Hayati TASTAN on $DATE
 * @home
**/

import java.lang.*;
import java.util.*;
import java.util.Scanner;

  public class Read_Write {
    public static void main(String[] args) {

        // Using Scanner for Getting Input from User
        System.out.println("What is your name? ");
        Scanner in = new Scanner(System.in);

        String s = in.nextLine();
        System.out.println("Your name is:  " + s);

        System.out.println("How old are you "+ s + " ?");
        int a = in.nextInt();
        System.out.println("You are "+ a + " years old.");

        System.out.println("How long are you in meter " + s + " ?");
        float b = in.nextFloat();
        System.out.println("You are "+ b + " meter long");


    }
}
