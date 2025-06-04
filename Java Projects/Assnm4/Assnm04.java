/**
  Assnm04
  Pablo Rivas 
 */

import java.util.*;

public class Assnm04 {
    public static void main(String[] args) {
        /*
         * Olserod:1
         * Knarrevik:2
         * Utespelare:3
         * Yngvar:4
         * Melltrop:5
         * 
         * lose:0
         * win:1
         * tie:-1
         * 
         */
        
        Scanner in = new Scanner(System.in);

        System.out.println("Welcome to Lagkapten! Please choose from the following options:");
        System.out.println("" +
                "          1 | Olserod\n" + 
                "          2 | Knarrevik\n" + 
                "          3 | Utespelare\n" + 
                "          4 | Yngvar\n" + 
                "          5 | Melltrop\n\n" +
                "          [-1]EXIT");

        int choice;
        choice = in.nextInt();
        while(choice < -1 || choice == 0 || choice > 5){
            System.out.println("Please enter a valid response: ");
            choice = in.nextInt();
        }
        while(choice != -1){
            int result = winner(choice);
            if(result == 0){
                System.out.println("You lost!");
            }else if(result == 1){
                System.out.println("You won!");
            }else if(result == -1){
                System.out.println("It is a tie!");
            }
            choice = in.nextInt();
            while(choice < -1 || choice == 0 || choice > 5){
                System.out.println("Please enter a valid response: ");
                choice = in.nextInt();
            }
        }
        
        in.close();
        
    }

    public static int winner(int p1) {
        int p2 = random();

        //Olserod
        if (p1 == 1){
            if(p2 == 1){
                return -1;
            }else if(p2 == 3 || p2 == 4){
                return 1;
            }else{
                return 0;
            }
        }

        //Knarrevik
        if(p1 == 2){
            if (p2 == 2){
                return -1;
            }else if (p2 == 5 || p2 == 1){
                return 1;                
            }else{
                return 0;
            }
        }

        //Utespelare
        if(p1 == 3){
            if (p2 == 3){
                return -1;
            }else if (p2 == 2 || p2 == 4){
                return 1;                
            }else{
                return 0;
            }
        }
        
        //Yngvar
        if(p1 == 4){
            if (p2 == 4){
                return -1;
            }else if (p2 == 5 || p2 == 2){
                return 1;                
            }else{
                return 0;
            }
        }

        //Melltrop
        if(p1 == 5){
            if (p2 == 5){
                return -1;
            }else if (p2 == 3 || p2 == 1){
                return 1;                
            }else{
                return 0;
            }
        }

        return -1;
    }

    public static int random() {
        Random rand = new Random();
        int x = rand.nextInt(5) +1;
        if (x == 1){
            System.out.println("Computer chose Olserod!");
        }else if(x == 2){
            System.out.println("Computer chose Knarrevik!");
        }else if (x == 3){
            System.out.println("Computer chose Utespelare");
        }else if (x == 4){
            System.out.println("Computer chose Yngvar!");
        }else if (x == 5){
            System.out.println("Computer chose Melltrop!");
        }
        return x;
    }
}