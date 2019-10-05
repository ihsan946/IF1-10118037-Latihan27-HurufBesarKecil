/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if110118037latihan27hurufbk;
import java.util.Scanner;
/**
 * @author Muhammad Ihsan
 * NAMA      : Muhammad Ihsan
 * KELAS     : IF-1
 * NIM       : 10118037
 * Deskripsi Program   : Program ini berisi program mengatur huruf besar dan huruf kecil 
 *                                        dalam kalimat
 */
public class IF110118037Latihan27HurufBK {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String kalimat;
        String hurufBesar;
        String hurufKecil;
        
        //input
        System.out.print("Masukkan Kalimat  : ");
        Scanner tempKalimat = new Scanner(System.in);
        kalimat = tempKalimat.nextLine();
        System.out.println();
        
        //output
        hurufBesar = kalimat.toUpperCase();
        hurufKecil = kalimat.toLowerCase();
        System.out.println("+++++Hasil Formatting+++++");
        System.out.println("Huruf Besar\t: " + hurufBesar);
        System.out.println("Huruf Kecil   \t: " + hurufKecil);
        
    }
    
}
