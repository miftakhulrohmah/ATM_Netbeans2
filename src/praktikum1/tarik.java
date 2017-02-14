/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum1;

import javax.swing.JOptionPane;

/**
 *
 * @author A455L

*/
public class tarik {
        private int saldo;
        public void ambil (int tab, int t){
            if(t%100!=0)
                JOptionPane.showMessageDialog(null, "Mesin ATM BRI tidak menerima uang koin \n Silakan lakukan penyetoran","Transaksi gagal",0);
            else{
                if (t>tab)
                    JOptionPane.showMessageDialog(null, "Saldo minimal wajib Rp 50000,00. Segera lakukan penyetoran untuk menghindari blokir","CAUTION",2);
            }
        }
public int getSaldo(){
     return saldo;
    }    
}
    
