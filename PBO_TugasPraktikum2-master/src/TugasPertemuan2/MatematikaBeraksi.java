/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPertemuan2;

/**
 *
 * @author Lenovo
 */
class MatematikaBeraksi {
    public static void main(String[] args){
        Matematika m = new Matematika();
        
        int hasilTambah = m.pertambahan(20, 10);
        System.out.println("Pertambahan: 20 + 10 = " + hasilTambah);
        
        int hasilKurang = m.pengurangan(10, 5);
        System.out.println("Pengurangan: 10 - 5 = " + hasilKurang);
        
        int hasilKali = m.perkalian(10, 3);
        System.out.println("Perkalian: 10 * 3 = " + hasilKali);
        
        double hasilBagi = m.pembagian(21, 2);
        System.out.println("Pembagian: 21 / 2 = " + hasilBagi);
    }
}
