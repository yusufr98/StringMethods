package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = k.next();
        System.out.print("Enter a number as an index: ");
        int index = k.nextInt();
        int length = word.length();
        System.out.println("The length of " + word + " is " + length);
        if(length>index) {
            String str = word.substring(0, index);
            System.out.println("The substring from 0 to " + index + " is: " + str);
        }
        else{
            System.out.print("Index is larger than length");
        }
    }
}
