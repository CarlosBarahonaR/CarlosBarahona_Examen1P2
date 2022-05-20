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
public class Laptop extends PC {

    private String marca;
    private String definicionPantalla;
    private boolean RGB;

    public Laptop(String marca, String definicionPantalla, boolean RGB, String IP, String mascaraRed, String hostname) {
        super(IP, mascaraRed, hostname);
        this.marca = marca;
        this.definicionPantalla = definicionPantalla;
        this.RGB = RGB;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getDefinicionPantalla() {
        return definicionPantalla;
    }

    public void setDefinicionPantalla(String definicionPantalla) {
        this.definicionPantalla = definicionPantalla;
    }

    public boolean isRGB() {
        return RGB;
    }

    public void setRGB(boolean RGB) {
        this.RGB = RGB;
    }

    @Override
    public String toString() {
        return "Laptop{" + "marca=" + marca + ", definicionPantalla=" + definicionPantalla + ", RGB=" + RGB + '}';
    }

    @Override
    public void ping(String ip) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
