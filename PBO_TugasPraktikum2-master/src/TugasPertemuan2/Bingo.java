/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPertemuan2;

/**
 *
 * @author Lenovo
 */
class Bingo {
    public Bingo(){
        String lirikAtas = "There was a farmer who had a dog.";
        String lirikBawah = "And Bingo was his name o.";
        String nama = "B-I-N-G-O";
        
        for (int i = 0; i <= 5; i++){
            System.out.println(lirikAtas);
            System.out.println(lirikBawah);
            
            String[] namaArray = nama.split("-");
            for (int j = 0; j < 3; j++){
                for (int k = 0; k < namaArray.length; k++){
                    if (k < i){
                        System.out.print("(clap)");
                    }else{
                        System.out.print(namaArray[k]);
                    }
                    if (k < namaArray.length - 1){
                        System.out.print("-");
                    }
                }
                System.out.println();
            }
            System.out.println(lirikBawah);
            System.out.println();
        }
    }
}
