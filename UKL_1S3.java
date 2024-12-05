/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ukl_1s3;

/**
 *
 * @author LOQ
 */
import java.util.Scanner;
public class UKL_1S3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);

        // Meminta pengguna memasukkan jumlah elemen array
        System.out.print("Masukkan jumlah elemen array: ");
        int n = input.nextInt();

        // Membuat array dengan ukuran yang ditentukan pengguna
        int[] array = new int[n];

        // Meminta pengguna untuk memasukkan elemen-elemen array
        System.out.println("Masukkan elemen-elemen array:");
        for (int i = 0; i < n; i++) {
            System.out.print("Elemen ke-" + (i + 1) + ": ");
            array[i] = input.nextInt();
        }

        // Menyimpan elemen negatif yang ditemukan
        String negatif = "";

        // Memeriksa setiap elemen array apakah negatif
        for (int i = 0; i < n; i++) {
            if (array[i] < 0) {
               
                if (negatif.isEmpty()) {
                    negatif = String.valueOf(array[i]);
                } else {
                    negatif += "," + array[i];
                }
            }
        }

        // Menampilkan hasil
        if (!negatif.isEmpty()) {
            System.out.println("Array mengandung elemen negatif: " + negatif);
        } else {
            System.out.println("Array tidak mengandung elemen negatif.");
        }
    }
    
}
