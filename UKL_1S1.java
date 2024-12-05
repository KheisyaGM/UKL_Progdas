/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ukl_1s1;

import java.util.Scanner;

/**
 *
 * @author LOQ
 */

public class UKL_1S1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
   
        //Menghitung bilangan prima
        System.out.println("Masukan bilangan: ");
        int bilangan = input.nextInt();
        
        boolean isPrima = true;
        
        for (int i = 2; i<= Math.sqrt(bilangan); i++){
        if (bilangan % i == 0){
            isPrima = false;
            break;
        }
        }
        //hasil
        if (isPrima && bilangan > 1){
            System.out.println(bilangan + " adalah bilangan prima.");
        }else {
            System.out.println(bilangan + " bukan bilangan prima.");
        }    }
    
}
