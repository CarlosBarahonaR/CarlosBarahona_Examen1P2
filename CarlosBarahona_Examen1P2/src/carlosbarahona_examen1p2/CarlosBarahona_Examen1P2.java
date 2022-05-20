/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carlosbarahona_examen1p2;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

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
                    System.out.println("Ingrese el tipo de la PC que desea agregar");
                    String tipo = leer.nextLine();
                    tipo += leer.nextLine();
                    tipo = tipo.toLowerCase();
                    switch (tipo) {
                        case "pc escritorio": {
                            int opcion2 = 0;
                            while (opcion2 != 5) {
                                System.out.println("Bienvenido al CRUD de PC Escritorio\n"
                                        + "¿Qué desea hacer?\n"
                                        + "1) Crear PC\n"
                                        + "2) Modificar PC\n"
                                        + "3) Listar PC\n"
                                        + "4) Eliminar PC\n"
                                        + "5) Salir");
                                opcion2 = leer.nextInt();
                                switch (opcion2) {
                                    case 1: {
                                        System.out.println("Ingrese la IP");
                                        String IP = leer.next();
                                        boolean correcto = false;
                                        while (!correcto) {

                                            StringTokenizer t = new StringTokenizer(IP, ".");
                                            int a = Integer.parseInt(t.nextToken());
                                            int b = Integer.parseInt(t.nextToken());
                                            int c = Integer.parseInt(t.nextToken());
                                            int d = Integer.parseInt(t.nextToken());
                                            if ((a >= 0 && a <= 255) && (b >= 0 && b <= 255)
                                                    && (c >= 0 && c <= 255) && (d >= 0 && d <= 255)) {
                                                correcto = true;
                                            } else {
                                                System.out.println("Ingrese una IP correcta");
                                                IP = leer.next();
                                            }
                                        }
                                        System.out.println("Ingrese la mascara de red");
                                        String mascaraRed = leer.next();
                                        boolean correcto2 = false;
                                        while (!correcto2) {

                                            StringTokenizer t = new StringTokenizer(mascaraRed, ".");
                                            int a = Integer.parseInt(t.nextToken());
                                            int b = Integer.parseInt(t.nextToken());
                                            int c = Integer.parseInt(t.nextToken());
                                            int d = Integer.parseInt(t.nextToken());
                                            if ((a >= 0 && a <= 255) && (b >= 0 && b <= 255)
                                                    && (c >= 0 && c <= 255) && (d >= 0 && d <= 255)) {
                                                correcto2 = true;
                                            } else {
                                                System.out.println("Ingrese una mascara de red correcta");
                                                mascaraRed = leer.next();
                                            }
                                        }
                                        System.out.println("Ingrese el hostname");
                                        String hostname = leer.nextLine();
                                        hostname += leer.nextLine();
                                        System.out.println("Ingrese la capacidad de RAM de la computadora");
                                        String RAM = leer.next();
                                        System.out.println("Ingrese la capacidad de almacenamiento");
                                        String capacidadAlmacenamiento = leer.next();
                                        System.out.println("Ingrese el tipo de almacenamiento (HDD o SSD)");
                                        String tipoAlmacenamiento = leer.next();
                                        boolean textoCorrecto = false;
                                        while (!textoCorrecto) {
                                            if ("HDD".equals(tipoAlmacenamiento) || "SSD".equals(tipoAlmacenamiento)) {
                                                textoCorrecto = true;
                                            } else {
                                                System.out.println("Ingrese el tipo de almacenamiento correcto (HDD o SSD)");
                                                tipoAlmacenamiento = leer.next();
                                            }
                                        }
                                        System.out.println("¿Tiene tarjeta gráfica?");
                                        String confirmar = leer.next();
                                        confirmar = confirmar.toLowerCase();
                                        boolean respuestaCorrecta = false;
                                        boolean tarjetaGrafica = false;
                                        while (!respuestaCorrecta) {
                                            if ("si".equals(confirmar)) {
                                                tarjetaGrafica = true;
                                                respuestaCorrecta = true;
                                            } else if ("no".equals(confirmar)) {
                                                respuestaCorrecta = true;

                                            } else {
                                                System.out.println("Ingrese un si o un no");
                                                confirmar = leer.next();
                                            }
                                        }

                                        pc.add(new PC_Escritorio(RAM, capacidadAlmacenamiento, tipoAlmacenamiento, tarjetaGrafica, IP, mascaraRed, hostname));
                                        break;
                                    }
                                }
                            }
                            break;
                        }

                        case "laptop": {
                            int opcion2 = 0;
                            while (opcion2 != 5) {
                                System.out.println("Bienvenido al CRUD de Laptop\n"
                                        + "¿Qué desea hacer?\n"
                                        + "1) Crear PC\n"
                                        + "2) Modificar PC\n"
                                        + "3) Listar PC\n"
                                        + "4) Eliminar PC\n"
                                        + "5) Salir");
                                opcion2 = leer.nextInt();
                                switch (opcion2) {
                                    case 1: {

                                        System.out.println("Ingrese la IP");
                                        String IP = leer.next();
                                        boolean correcto = false;
                                        while (!correcto) {

                                            StringTokenizer t = new StringTokenizer(IP, ".");
                                            int a = Integer.parseInt(t.nextToken());
                                            int b = Integer.parseInt(t.nextToken());
                                            int c = Integer.parseInt(t.nextToken());
                                            int d = Integer.parseInt(t.nextToken());
                                            if ((a >= 0 && a <= 255) && (b >= 0 && b <= 255)
                                                    && (c >= 0 && c <= 255) && (d >= 0 && d <= 255)) {
                                                correcto = true;
                                            } else {
                                                System.out.println("Ingrese una IP correcta");
                                                IP = leer.next();
                                            }
                                        }
                                        System.out.println("Ingrese la mascara de red");
                                        String mascaraRed = leer.next();
                                        boolean correcto2 = false;
                                        while (!correcto2) {

                                            StringTokenizer t = new StringTokenizer(mascaraRed, ".");
                                            int a = Integer.parseInt(t.nextToken());
                                            int b = Integer.parseInt(t.nextToken());
                                            int c = Integer.parseInt(t.nextToken());
                                            int d = Integer.parseInt(t.nextToken());
                                            if ((a >= 0 && a <= 255) && (b >= 0 && b <= 255)
                                                    && (c >= 0 && c <= 255) && (d >= 0 && d <= 255)) {
                                                correcto2 = true;
                                            } else {
                                                System.out.println("Ingrese una mascara de red correcta");
                                                mascaraRed = leer.next();
                                            }
                                        }
                                        System.out.println("Ingrese el hostname");
                                        String hostname = leer.nextLine();
                                        hostname += leer.nextLine();
                                        System.out.println("Ingrese la marca de la computadora");
                                        String marca = leer.nextLine();
                                        marca += leer.nextLine();
                                        System.out.println("Ingrese la definicion de la pantalla");
                                        String definicionPantalla = leer.nextLine();
                                        definicionPantalla += leer.nextLine();

                                        System.out.println("¿Tiene RGB?");
                                        String confirmar = leer.next();
                                        confirmar = confirmar.toLowerCase();
                                        boolean respuestaCorrecta = false;
                                        boolean RGB = false;
                                        while (!respuestaCorrecta) {
                                            if ("si".equals(confirmar)) {
                                                RGB = true;
                                                respuestaCorrecta = true;
                                            } else if ("no".equals(confirmar)) {
                                                respuestaCorrecta = true;

                                            } else {
                                                System.out.println("Ingrese un si o un no");
                                                confirmar = leer.next();
                                            }
                                        }

                                        pc.add(new Laptop(marca, definicionPantalla, RGB, IP, mascaraRed, hostname));
                                        break;

                                    }
                                }
                            }
                            break;
                        }
                    }

                }
            }
        }
    }

}
