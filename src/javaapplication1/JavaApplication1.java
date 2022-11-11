/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author USER
 */
public class JavaApplication1 {

        double menghitungBMI,berat,tinggi;
        String nama,jenisKelamin;
         void MenghitungBMI (){
             
           menghitungBMI = Math.ceil(berat / (tinggi * tinggi) * 10000);
           System.out.print(nama +": Masa berat Badan anda adalah(BMI)  " + menghitungBMI + " kg/m2");
           
             
         }
    
}
