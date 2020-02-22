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

        //calculate which letter grade 
        
        //output average and letter grade to user
    }
}
