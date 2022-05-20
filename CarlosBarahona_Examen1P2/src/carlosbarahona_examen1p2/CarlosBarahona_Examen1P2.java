/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carlosbarahona_examen1p2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class CarlosBarahona_Examen1P2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<PC> pc = new ArrayList();
        Scanner leer = new Scanner(System.in);
        int opcion = 0;
        while (opcion != 3) {
            System.out.println("Bienvenido al sistema de administrador de redes\n"
                    + "¿Qué desea hacer?\n"
                    + "1) CRUD de PC\n"
                    + "2) Ingresar PC\n"
                    + "3) Salir");
            opcion = leer.nextInt();
            switch (opcion) {
                case 1: {
                    int opcion2 = 0;
                    while (opcion2 != 5) {
                        System.out.println("Bienvenido al CRUD\n"
                                + "¿Qué desea hacer?\n"
                                + "1) Crear PC\n"
                                + "2) Modificar PC\n"
                                + "3) Listar PC\n"
                                + "4) Eliminar PC\n"
                                + "5) Salir");
                        opcion2 = leer.nextInt();
                        switch (opcion2) {
                            case 1: {

                            }
                        }
                    }
                }
            }
        }
    }

}
