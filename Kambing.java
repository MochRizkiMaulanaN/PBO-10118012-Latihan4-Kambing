/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kambing;

/**
 * Nama     : Moch Rizki Maulana N
 * Kelas    : IF-1 2018
 * Nim      : 10118012
 * Deskripsi Program : Kambing
 *
 * @author LENOVO
 */
public class Kambing {
    
    public void tambahKambing(){
        //deklarasi variabel lokal
        int jumlahKambing = 0;
        
        jumlahKambing=jumlahKambing + 5;
        System.out.println("Jumlah kambing setelah ditambah : "+jumlahKambing);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Kambing kambingJantan = new Kambing();
        kambingJantan.tambahKambing();
    }
    
}
