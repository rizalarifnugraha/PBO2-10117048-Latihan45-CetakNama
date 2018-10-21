/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117048.latihan45.cetaknama;

import java.util.Scanner;

/**
 *
 * @author 
 * Nama : Rizal Arif Nugraha 
 * Nim : 10117048 
 * Kelas : PBO2 
 * Deskripsi Program : Program ini berisi tentang mencetak nama seseorang.
 */
public class PBO210117048Latihan45CetakNama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        Printer prt = new Printer();
        System.out.println("=====Aplikasi Pencetak Nama=====");
        System.out.print("Masukkan nama anda : ");
        String nama = scn.next();
        System.out.print("Mau cetak nama berapa kali? : ");
        int cetak = scn.nextInt();
        System.out.println();
        
        prt.setNama(nama);
        prt.setJmlCetak(cetak);
        prt.cetak(nama);
        prt.cetak(cetak, nama);
    
    }
    
}
