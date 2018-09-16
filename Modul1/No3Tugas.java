package Modul1;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.net.NetworkInterface;
import javax.swing.JOptionPane;

public class No3Tugas {
    public static void main(String[] args) throws UnknownHostException {
        System.out.println("Scan IP");
        String IP = "192.168.1.54";
        String hasil = null;
        try{
           InetAddress local = InetAddress.getLocalHost();
           byte[] ip = local.getAddress();
           
           for(int i=1; i<=50; i++){
               InetAddress address = InetAddress.getByAddress(ip);
               ip[3] = (byte)i;
               hasil = address.toString();
               
               if(address.isReachable(3000)){
                   System.out.println(hasil + "Aktif");
               } else {
                   System.out.println(hasil + "Tidak aktif");
               }
           }
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
