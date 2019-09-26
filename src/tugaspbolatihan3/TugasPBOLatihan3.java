/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugaspbolatihan3;

import java.util.Scanner;

/**
 *
 * @author 
 * Nama : Permai Ramadhan
 * Kelas : IF 2
 * NIM : 10118060
 * Deskripsi Program : Memasukkan Nilai dari Keyboard
 */
public class TugasPBOLatihan3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.print("Masukkan nama anda: ");
        Scanner scanner = new Scanner (System.in);
        
        String nama = scanner.next();
        System.out.println("Nama anda adalah "+nama);
        
        
        
    }
    
}
