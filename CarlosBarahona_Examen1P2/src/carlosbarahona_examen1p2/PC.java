/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carlosbarahona_examen1p2;

/**
 *
 * @author Admin
 */
public abstract class PC {

    public String IP;
    public String mascaraRed;
    public String hostname;

    public PC(String IP, String mascaraRed, String hostname) {
        this.IP = IP;
        this.mascaraRed = mascaraRed;
        this.hostname = hostname;
    }

    public String getIP() {
        return IP;
    }

    public void setIP(String IP) {
        this.IP = IP;
    }

    public String getMascaraRed() {
        return mascaraRed;
    }

    public void setMascaraRed(String mascaraRed) {
        this.mascaraRed = mascaraRed;
    }

    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    @Override
    public String toString() {
        return "PC{" + "IP=" + IP + ", mascaraRed=" + mascaraRed + ", hostname=" + hostname + '}';
    }

    public abstract void ping(String ip, String ip2);

}
