/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul1;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.net.NetworkInterface;
import javax.swing.JOptionPane;

public class No4Tugas {
    public static void main(String[] args) throws UnknownHostException {
        try {
            InetAddress n = InetAddress.getLocalHost();
            NetworkInterface mac = NetworkInterface.getByInetAddress(n);
            byte[]host = mac.getHardwareAddress();
            
            StringBuilder sb = new StringBuilder();
            for(int i=0; i<host.length; i++){
                sb.append(String.format("%02X%s", host[i], (i<host.length-1)?"-":""));
            }
            
            System.out.println("Mac Address: "+sb.toString());
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
