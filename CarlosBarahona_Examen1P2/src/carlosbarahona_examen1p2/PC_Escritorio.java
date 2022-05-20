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
public class PC_Escritorio extends PC {

    private int RAM;
    private int capacidadAlmacenamiento;
    private String tipoAlmacenamiento;
    private boolean tarjetaGráfica;

    public PC_Escritorio(int RAM, int capacidadAlmacenamiento, String tipoAlmacenamiento, boolean tarjetaGráfica, String IP, String mascaraRed, String hostname) {
        super(IP, mascaraRed, hostname);
        this.RAM = RAM;
        this.capacidadAlmacenamiento = capacidadAlmacenamiento;
        this.tipoAlmacenamiento = tipoAlmacenamiento;
        this.tarjetaGráfica = tarjetaGráfica;
    }

    public int getRAM() {
        return RAM;
    }

    public void setRAM(int RAM) {
        this.RAM = RAM;
    }

    public int getCapacidadAlmacenamiento() {
        return capacidadAlmacenamiento;
    }

    public void setCapacidadAlmacenamiento(int capacidadAlmacenamiento) {
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
    public void ping(String ip) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
