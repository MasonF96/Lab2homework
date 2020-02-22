/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mason
 */
import java.util.*;

public class TestScores {

    public static void main(String[] args) {

        //ask the user for 3 test scores
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Please imput 3 tests score to find out your grade.");

        double testscore1 = keyboard.nextDouble();

        double testscore2 = keyboard.nextDouble();

        double testscore3 = keyboard.nextDouble();

        //Calculate average
        double testaverage =(testscore1 + testscore2 + testscore3)/3;
        System.out.println("You test average is " + testaverage);

        //calculate which letter grade 
      
        if (testaverage <= 100 && testaverage >= 90){
             System.out.print("A");
        }
         if (testaverage <= 89 && testaverage >= 80){
             System.out.print("B");
        }
         if (testaverage <= 79 && testaverage >= 70){
             System.out.print("C");
        }
         if (testaverage <= 69 && testaverage >= 60){
             System.out.print("D");
        }
         if (testaverage <= 59 && testaverage >= 0){
             System.out.print("F");
        }
    }
}
