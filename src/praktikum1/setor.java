/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum1;

/**
 *
 * @author A455L
 */
import javax.swing.JOptionPane;
class setor {
    private int saldo;
    public void menabung (int bal, int s){
        if(s%100!=0)
            JOptionPane.showMessageDialog(null,
        "Mesin ATM BRI tidak menerima koin. Silakan ulangi!","Transaksi gagal",0);
        else if(s<50000)
            JOptionPane.showMessageDialog(null, "Besaran minimal setor tunai Rp. 50000","ERROR",0);
        else if(s>=50000)
            saldo = bal+s;
        JOptionPane.showMessageDialog(null,"Saldo Anda sebesar: " +saldo);
    }
    public int getSaldo(){
    return saldo;
}
}


