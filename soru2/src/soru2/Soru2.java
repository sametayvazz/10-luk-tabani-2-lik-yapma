/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soru2;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Soru2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
        int girilen;
        do {
            System.out.print("Lütfen 10'luk tabandaki sayıyı giriniz:");
            girilen = s.nextInt();
            System.out.println(cevir(girilen));
        } while (girilen != -1);
    }

    public static int cevir(int sayi) {
        if (sayi == 0) {
            return 0;
        } 
else
 {
            return (sayi % 2 + 10 * cevir(sayi / 2));
        }

    }
    
}
