/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119004.latihan20.tabungan;

/**
 *
 * @author ENDOG
 */

public class IF110119004Latihan20Tabungan {

    /**
     * @param args the command line arguments
     */
     public static Double bunga, jmlBunga;
    public static int targetSaldo, lama, saldoawal;
    
    public static double hitungBunga(double bunga, int saldo) {
        jmlBunga = bunga * saldo;
        return jmlBunga;
    }
    
    public static void tampilSaldo(double bunga, int saldo, int targetSaldo) {
        lama = 1;
        while(saldo < targetSaldo) {
            saldo += hitungBunga(bunga, saldo);
            System.out.printf("Saldo di bulan ke-"+lama+" Rp. %,d%n", saldo);
            lama++;
        }
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        tampilSaldo(0.08, 3500000, 6000000);
    }
    
}