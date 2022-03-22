/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bank;

import java.util.Scanner;

/**
 *
 * @author HP 820
 */
public class Bank {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   
        System.out.println(" Welcome to XYZ Bank");
         System.out.println(" choose one account from the following accounts");
          System.out.println(" 1.regular account");
           System.out.println(" 2.interest account");
            System.out.println(" 3. checking account");
             System.out.println(" 4.CD account");
             Scanner scn = new Scanner(System.in);
             System.out.println(" enter pin");
             int pin =scn.nextInt();
            switch(pin){
             
                case 1:
             System.out.println(" charges are 10% of balance at the end of the month");
             System.out.println(" no interest");
             System.out.println("penalties;10.00 when balance goes below  minimum of 50000.00 ");
             break;
                case 2:
              System.out.println(" charges are 10% of bank at the month");   
              System.out.println(" interest:7% paid monthly");
              break;
                case 3:
                    System.out.println(" charges are 10% of the balance at the end of the month");
                    System.out.println(" interests are annually 7% paid per month");
                    System.out.println(" penalties are 10%  if the balance  goes below minimum 10000");
                    System.out.println(" another penalties 0.10 for each transaction");
                    break;
                case 4:
                    System.out.println(" charges are 10% of the balance at the end of the month");
                    System.out.println(" annual interest of 15%  ");
                    System.out.println("no interest ");
                    System.out.println(" penalties of 20% of the current balance if you withdraw before 12 months");
                    break;
                default:
                    System.out.println(" wrong pin");
                    main(null);
                    break;
            }
    }
}
    

    
   
    

        // TODO code application logic here
    
