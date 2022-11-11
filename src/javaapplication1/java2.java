/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.util.Scanner;

/**
 *
 * @author USER
 */
public class java2 {
    public static void main(String[] args) {
        JavaApplication1 hitungBMI = new JavaApplication1();
        Scanner userInput = new Scanner(System.in);
          System.out.print("Nama: ");
          hitungBMI.nama = userInput.next();
          System.out.print("Jenis kelamin (1. laki-laki)(2.perempuan): ");
          hitungBMI.jenisKelamin = userInput.next();
          System.out.print("Masukan Berat badan anda: ");
          hitungBMI.berat = userInput.nextDouble();
          System.out.print("Masukkan Tinggi Badan Anda: ");
          hitungBMI.tinggi = userInput.nextDouble();
          hitungBMI.MenghitungBMI();
          
          
                
        
    }
    
}
