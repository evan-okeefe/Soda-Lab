/*
Main.Java
Evan O'Keefe, 8/15
APCSA
Sings the "99 bottles of soda" song
 */


import java.util.Random;
import java.util.Scanner;

public class Main {
    static Scanner input;
    static Random rand;

    public static void main(String[] args) {

        input = new Scanner(System.in);
        rand = new Random();

        System.out.print("Enter a starting number > ");

        int start = input.nextInt();

        System.out.println();

        int count = 0;

        for (int i = start; i > 0; i--) {
            printVerse(i);
            count += 1;
            if (count % 5 == 0){
                System.out.println("BURP!\n");
            }
            singHappyBirthday();
        }
    }

    static void printVerse(int i){
        if (i == 1){
            System.out.println(i + " bottle of soda on the wall,\n" +
                    i + " bottle of soda.\n" +
                    "You take " + i + " down, pass it around.\n" +
                    "No more bottles of soda on the wall.\n");
        }
        else{
            System.out.println(i + " bottles of soda on the wall,\n" +
                    i + " bottles of soda.\n" +
                    "You take one down, pass it around.\n" +
                    (i - 1) + " bottles of soda on the wall.\n");
        }
    }

    static void singHappyBirthday(){
        int num1 = rand.nextInt(30);
        int num2 = rand.nextInt(30);


        if (num1 == num2){
            System.out.println("""
                    Happy Birthday to you.
                    Happy Birthday to you.
                    Happy Birthday dear Captain Jack.
                    Happy Birthday to you!
                    """);
        }
    }
}