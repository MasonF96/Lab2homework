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

public class Sumofnumbers {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Imput a integer to get the sum of it's numbers.");

        int num = keyboard.nextInt();
        int sum = 0;

        for (int i = 1; i <= num; ++i) {
            // sum = sum + i;
            sum += i;
        }

        System.out.println("Sum = " + sum);
    }
}

