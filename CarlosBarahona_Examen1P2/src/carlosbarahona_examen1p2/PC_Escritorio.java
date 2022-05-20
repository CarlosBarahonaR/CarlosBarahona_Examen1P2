/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carlosbarahona_examen1p2;

import java.util.ArrayList;
import java.util.StringTokenizer;

/**
 *
 * @author Admin
 */
public class PC_Escritorio extends PC {

    private String RAM;
    private String capacidadAlmacenamiento;
    private String tipoAlmacenamiento;
    private boolean tarjetaGráfica;

    public PC_Escritorio(String RAM, String capacidadAlmacenamiento, String tipoAlmacenamiento, boolean tarjetaGráfica, String IP, String mascaraRed, String hostname) {
        super(IP, mascaraRed, hostname);
        this.RAM = RAM;
        this.capacidadAlmacenamiento = capacidadAlmacenamiento;
        this.tipoAlmacenamiento = tipoAlmacenamiento;
        this.tarjetaGráfica = tarjetaGráfica;
    }

    public String getRAM() {
        return RAM;
    }

    public void setRAM(String RAM) {
        this.RAM = RAM;
    }

    public String getCapacidadAlmacenamiento() {
        return capacidadAlmacenamiento;
    }

    public void setCapacidadAlmacenamiento(String capacidadAlmacenamiento) {
        this.capacidadAlmacenamiento = capacidadAlmacenamiento;
    }

    public String getTipoAlmacenamiento() {
        return tipoAlmacenamiento;
    }

    public void setTipoAlmacenamiento(String tipoAlmacenamiento) {
        this.tipoAlmacenamiento = tipoAlmacenamiento;
    }

    public boolean isTarjetaGráfica() {
        return tarjetaGráfica;
    }

    public void setTarjetaGráfica(boolean tarjetaGráfica) {
        this.tarjetaGráfica = tarjetaGráfica;
    }

    @Override
    public String toString() {
        return "PC_Escritorio{" + "RAM=" + RAM + ", capacidadAlmacenamiento=" + capacidadAlmacenamiento + ", tipoAlmacenamiento=" + tipoAlmacenamiento + ", tarjetaGr\u00e1fica=" + tarjetaGráfica + '}';
    }

    @Override
    public void ping(String ip, String ip2) {
        boolean encontrado = false;
        ArrayList<PC> pc = CarlosBarahona_Examen1P2.pc;
        for (int i = 0; i < pc.size(); i++) {
            if (pc.get(i).getIP().equals(ip)) {
                encontrado = true;
                String IPBuscar = pc.get(i).getIP();
                String mascaraRedBuscar = pc.get(i).getMascaraRed();

                StringTokenizer t2 = new StringTokenizer(mascaraRedBuscar, ".");
                int a2 = Integer.parseInt(t2.nextToken());
                int b2 = Integer.parseInt(t2.nextToken());
                int c2 = Integer.parseInt(t2.nextToken());
                int d2 = Integer.parseInt(t2.nextToken());
                String aB2 = Integer.toBinaryString(a2);
                String bB2 = Integer.toBinaryString(b2);
                String cB2 = Integer.toBinaryString(c2);
                String dB2 = Integer.toBinaryString(d2);
                String mascaraBuscarB = aB2 + bB2 + cB2 + dB2;

                StringTokenizer t = new StringTokenizer(IPBuscar, ".");
                int a = Integer.parseInt(t.nextToken());
                int b = Integer.parseInt(t.nextToken());
                int c = Integer.parseInt(t.nextToken());
                int d = Integer.parseInt(t.nextToken());
                String aB = Integer.toBinaryString(a);
                String bB = Integer.toBinaryString(b);
                String cB = Integer.toBinaryString(c);
                String dB = Integer.toBinaryString(d);
                String IPBuscarB = aB + bB + cB + dB;

                StringTokenizer t3 = new StringTokenizer(ip2, ".");
                int a3 = Integer.parseInt(t3.nextToken());
                int b3 = Integer.parseInt(t3.nextToken());
                int c3 = Integer.parseInt(t3.nextToken());
                int d3 = Integer.parseInt(t3.nextToken());
                String aB3 = Integer.toBinaryString(a3);
                String bB3 = Integer.toBinaryString(b3);
                String cB3 = Integer.toBinaryString(c3);
                String dB3 = Integer.toBinaryString(d3);
                String IPB = aB3 + bB3 + cB3 + dB3;
                int numerosUno = 0;
                for (int j = 0; j < mascaraBuscarB.length(); j++) {
                    if (mascaraBuscarB.charAt(j) == 1) {
                        numerosUno += 1;
                    }
                }
                int parecidos = 0;
                for (int y = 0; y < numerosUno; y++) {
                    for (int k = 0; k < numerosUno; k++) {
                        if (IPBuscarB.charAt(y) == IPB.charAt(k)) {
                            parecidos += 0;
                        }
                    }

                }
                if (parecidos == numerosUno) {
                    System.out.println("");
                    System.out.println("Pinging to " + ip + " with 32 bytes of data:\n"
                            + "Reply from " + ip + ": bytes=32 time=37ms TTL=46" + "\n"
                            + "Reply from " + ip + ": bytes=32 time=37ms TTL=46" + "\n"
                            + "Reply from " + ip + ": bytes=32 time=37ms TTL=46" + "\n"
                            + "Reply from " + ip + ": bytes=32 time=37ms TTL=46" + "\n"
                            + "\n"
                            + "Ping statistics for " + ip + ":\n"
                            + "     Packets: Sent = 4, Recieved = 4, Lost = 0 (0% loss)\n"
                    );
                } else {
                    System.out.println("");
                    System.out.println("Pinging to " + ip + " with 32 bytes of data:\n"
                            + "Reply from " + ip + ": Desination host unreachable" + "\n"
                            + "Reply from " + ip + ": Desination host unreachable" + "\n"
                            + "Reply from " + ip + ": Desination host unreachable" + "\n"
                            + "Reply from " + ip + ": Desination host unreachable" + "\n"
                            + "\n"
                            + "Ping statistics for " + ip + ":\n"
                            + "     Packets: Sent = 4, Recieved = 4, Lost = 0 (0% loss)\n"
                    );

                }
            }

        }

        if (!encontrado) {

            System.out.println("");
            System.out.println("Pinging to " + ip + " with 32 bytes of data:\n"
                    + "Request timed out.\n"
                    + "Request timed out.\n"
                    + "Request timed out.\n"
                    + "Request timed out.\n"
                    + "\n"
                    + "Ping statistics for " + ip + ":\n"
                    + "     Packets: Sent = 4, Recieved = 0, Lost = 4 (100% loss)\n"
            );

        }
    }

}
