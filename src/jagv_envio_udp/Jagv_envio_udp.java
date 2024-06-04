/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jagv_envio_udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 *
 * @author Andres Gallegos
 */
public class Jagv_envio_udp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        try {
            DatagramSocket MiSocket = new DatagramSocket(14000);
            byte[] buffer = new byte[15];
            DatagramPacket Paquete = new DatagramPacket(buffer, buffer.length);
            MiSocket.receive(Paquete);
            System.out.println(new String(Paquete.getData()));
            MiSocket.close();
        } catch (IOException e) {
            System.out.println("Error: "+e);
        }

    }

}
