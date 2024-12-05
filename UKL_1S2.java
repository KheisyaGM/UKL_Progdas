/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ukl_1s2;

/**
 *
 * @author LOQ
 */
import java.util.Scanner;
public class UKL_1S2 {

    /**
     * @param args the command line arguments
     */
    public static double hitungLuasPermukaan(double r) {
        double pi = Math.PI; 
        return 4 * pi * r * r;  // Rumusnya: 4 × phi × r^2
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan radius bola (dalam satuan meter): ");
        double radius = input.nextDouble();
        
        double luas = hitungLuasPermukaan(radius);
        
 //hasil hitungannya
        System.out.println("Luas permukaan bola dengan radius " + radius + 
                " meter adalah: " + luas + " meter persegi.");
    }
    }
    

