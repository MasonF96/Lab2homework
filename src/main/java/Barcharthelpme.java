
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mason
 */
public class Barcharthelpme {
    public static void main(String[] args) {
        int numberofstores = 5;
        String userStringinput;
        double storesales;
        int divisionofhundreds;
        String outputString = "Sales Bar Chart\n";
        
        for( int store = 1; store <= numberofstores; store++) {
            userStringinput = JOptionPane.showInputDialog("Enter todays sales reports for store " + store );
            storesales = Double.parseDouble( userStringinput);
            divisionofhundreds = ( int )( storesales/ 100);
            outputString += "Store " + store + ": ";
            for (int printAsterisk = 1; printAsterisk <= divisionofhundreds; printAsterisk++) {
                outputString += "*";
            }
            outputString += "\n";
    }
        JOptionPane.showMessageDialog( null, outputString);
        System.exit(0);
               
        
    }
            
    
}
