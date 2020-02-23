/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mason
 *
 */
import java.util.*;

public class Bankcharges {

    public static void main(String[] args) {

        //ask the number of checks they have used
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Please enter the amount of checks that you have used in the past month?");

        int numberofchecks = keyboard.nextInt();
        double totalmonthlycharges;

        if (numberofchecks <= 20) {
            totalmonthlycharges = (numberofchecks * 0.1) + 10;
            System.out.println("Your monthly charges for " + numberofchecks + " checks is, " + totalmonthlycharges);
        } else if (numberofchecks >= 21 && numberofchecks >= 39) {
            totalmonthlycharges = (numberofchecks * 0.8) + 10;
            System.out.println("Your monthly charges for " + numberofchecks + " checks is, " + totalmonthlycharges);
        } else if (numberofchecks >= 40 && numberofchecks >= 59) {
            totalmonthlycharges = (numberofchecks * 0.06) + 10;
            System.out.println("Your monthly charges for " + numberofchecks + " checks is, " + totalmonthlycharges);
        } else if (numberofchecks >= 60) {
            totalmonthlycharges = (numberofchecks * 0.04);
            System.out.println("Your monthly charges for " + numberofchecks + " checks is, " + totalmonthlycharges);
        }
        }
    }
