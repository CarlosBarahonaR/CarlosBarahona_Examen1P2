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
                    String tipo = leer.next();
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
                                        String hostname = leer.next();
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
                                    case 2: {
                                        System.out.println("Ingrese la posicion de la PC de escritorio que desea modificar");
                                        int posicion = leer.nextInt();
                                        if (pc.get(posicion) instanceof PC_Escritorio) {

                                            int opcion3 = 0;
                                            while (opcion3 != 9) {
                                                System.out.println("Bienvenido a modificacion de PC Escritorio\n"
                                                        + "¿Qué desea modificar?\n"
                                                        + "1) IP\n"
                                                        + "2) Mascara de red\n"
                                                        + "3) Hostname\n"
                                                        + "4) RAM\n"
                                                        + "5) Capacidad almacenamiento\n"
                                                        + "6) Tipo de almacenamiento\n"
                                                        + "7) Tarjeta grafica\n"
                                                        + "8) Todo\n"
                                                        + "9) Salir");
                                                opcion3 = leer.nextInt();
                                                switch (opcion3) {
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
                                                        pc.get(posicion).setIP(IP);
                                                        break;
                                                    }
                                                    case 2: {
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
                                                        pc.get(posicion).setMascaraRed(mascaraRed);
                                                        break;
                                                    }
                                                    case 3: {
                                                        System.out.println("Ingrese el hostname");
                                                        String hostname = leer.next();
                                                        hostname += leer.nextLine();
                                                        pc.get(posicion).setHostname(hostname);
                                                        break;
                                                    }
                                                    case 4: {
                                                        System.out.println("Ingrese la capacidad de RAM de la computadora");
                                                        String RAM = leer.next();

                                                        ((PC_Escritorio) pc.get(posicion)).setRAM(RAM);
                                                        break;
                                                    }
                                                    case 5: {
                                                        System.out.println("Ingrese la capacidad de almacenamiento");
                                                        String capacidadAlmacenamiento = leer.next();

                                                        ((PC_Escritorio) pc.get(posicion)).setCapacidadAlmacenamiento(capacidadAlmacenamiento);
                                                        break;
                                                    }
                                                    case 6: {
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
                                                        ((PC_Escritorio) pc.get(posicion)).setCapacidadAlmacenamiento(tipoAlmacenamiento);
                                                        break;
                                                    }
                                                    case 7: {
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
                                                        ((PC_Escritorio) pc.get(posicion)).setTarjetaGráfica(tarjetaGrafica);
                                                        break;
                                                    }
                                                    case 8: {
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
                                                        pc.get(posicion).setIP(IP);
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
                                                        pc.get(posicion).setMascaraRed(mascaraRed);
                                                        System.out.println("Ingrese el hostname");
                                                        String hostname = leer.next();
                                                        hostname += leer.nextLine();
                                                        pc.get(posicion).setHostname(hostname);
                                                        System.out.println("Ingrese la capacidad de RAM de la computadora");
                                                        String RAM = leer.next();

                                                        ((PC_Escritorio) pc.get(posicion)).setRAM(RAM);
                                                        System.out.println("Ingrese la capacidad de almacenamiento");
                                                        String capacidadAlmacenamiento = leer.next();

                                                        ((PC_Escritorio) pc.get(posicion)).setCapacidadAlmacenamiento(capacidadAlmacenamiento);
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
                                                        ((PC_Escritorio) pc.get(posicion)).setCapacidadAlmacenamiento(tipoAlmacenamiento);
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
                                                        ((PC_Escritorio) pc.get(posicion)).setTarjetaGráfica(tarjetaGrafica);
                                                        break;
                                                    }
                                                }
                                            }
                                        } else {
                                            System.out.println("No existe ninguna pc de escritorio en esa posición");
                                        }
                                        break;
                                    }
                                    case 3: {
                                        for (int n = 0; n < pc.size(); n++) {

                                            for (int i = 0; i < pc.size(); i++) {
                                                if (pc.get(i) instanceof PC_Escritorio) {
                                                    System.out.println(pc.get(i));
                                                }

                                            }

                                        }
                                        break;
                                    }
                                    case 4: {
                                        System.out.println("Ingrese la posicion de la PC que desea eliminar");
                                        int posicion = leer.nextInt();
                                        if (pc.get(posicion) instanceof PC_Escritorio) {
                                            pc.remove(posicion);
                                        }

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
                                        String hostname = leer.next();
                                        hostname += leer.nextLine();
                                        System.out.println("Ingrese la marca de la laptop");
                                        String marca = leer.next();
                                        marca += leer.nextLine();
                                        System.out.println("Ingrese la definicion de la pantalla");
                                        String definicionPantalla = leer.next();
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
                                    case 2: {
                                        System.out.println("Ingrese la posicion de la laptop que desea modificar");
                                        int posicion = leer.nextInt();
                                        if (pc.get(posicion) instanceof Laptop) {

                                            int opcion3 = 0;
                                            while (opcion3 != 9) {
                                                System.out.println("Bienvenido a modificacion de Laptop\n"
                                                        + "¿Qué desea modificar?\n"
                                                        + "1) IP\n"
                                                        + "2) Mascara de red\n"
                                                        + "3) Hostname\n"
                                                        + "4) Marca\n"
                                                        + "5) Definicion de pantalla\n"
                                                        + "6) RGB\n"
                                                        + "7) Todo\n"
                                                        + "8) Salir");
                                                opcion3 = leer.nextInt();
                                                switch (opcion3) {
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
                                                        pc.get(posicion).setIP(IP);
                                                        break;
                                                    }
                                                    case 2: {
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
                                                        pc.get(posicion).setMascaraRed(mascaraRed);
                                                        break;
                                                    }
                                                    case 3: {
                                                        System.out.println("Ingrese el hostname");
                                                        String hostname = leer.next();
                                                        hostname += leer.nextLine();
                                                        pc.get(posicion).setHostname(hostname);
                                                        break;
                                                    }
                                                    case 4: {
                                                        System.out.println("Ingrese la marca de la laptop");
                                                        String marca = leer.next();
                                                        marca += leer.nextLine();

                                                        ((Laptop) pc.get(posicion)).setMarca(marca);
                                                        break;
                                                    }
                                                    case 5: {
                                                        System.out.println("Ingrese la definicion de la pantalla");
                                                        String definicionPantalla = leer.next();
                                                        definicionPantalla += leer.nextLine();

                                                        ((Laptop) pc.get(posicion)).setDefinicionPantalla(definicionPantalla);
                                                        break;
                                                    }

                                                    case 6: {
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
                                                        ((Laptop) pc.get(posicion)).setRGB(RGB);
                                                        break;
                                                    }
                                                    case 7: {
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
                                                        pc.get(posicion).setIP(IP);
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
                                                        pc.get(posicion).setMascaraRed(mascaraRed);
                                                        System.out.println("Ingrese el hostname");
                                                        String hostname = leer.next();
                                                        hostname += leer.nextLine();
                                                        pc.get(posicion).setHostname(hostname);
                                                        System.out.println("Ingrese la marca de la laptop");
                                                        String marca = leer.next();
                                                        marca += leer.nextLine();

                                                        ((Laptop) pc.get(posicion)).setMarca(marca);

                                                        System.out.println("Ingrese la definicion de la pantalla");
                                                        String definicionPantalla = leer.next();
                                                        definicionPantalla += leer.nextLine();

                                                        ((Laptop) pc.get(posicion)).setDefinicionPantalla(definicionPantalla);
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
                                                        ((Laptop) pc.get(posicion)).setRGB(RGB);
                                                        break;
                                                    }
                                                }
                                            }
                                        } else {
                                            System.out.println("No existe una laptop en esta posición");
                                        }
                                        break;
                                    }
                                    case 3: {
                                        for (int n = 0; n < pc.size(); n++) {

                                            for (int i = 0; i < pc.size(); i++) {
                                                if (pc.get(i) instanceof Laptop) {
                                                    System.out.println(pc.get(i));
                                                }

                                            }

                                        }
                                        break;
                                    }
                                    case 4: {
                                        System.out.println("Ingrese la posicion de la PC que desea eliminar");
                                        int posicion = leer.nextInt();
                                        if (pc.get(posicion) instanceof Laptop) {
                                            pc.remove(posicion);
                                        }

                                        break;
                                    }
                                }
                            }
                            break;
                        }
                    }
                    break;
                }
                case 2: {
                    System.out.println("Ingrese la posicion de su PC");
                    int posicion = leer.nextInt();
                    if (pc.get(posicion) != null) {
                        System.out.println(pc.get(posicion).getHostname() + "#ping_" + pc.get(posicion).getIP());
                        System.out.print("Escribir comando:");
                        String comando = leer.next();
                        StringTokenizer t = new StringTokenizer(comando, "_");
                        String a = t.nextToken();

                        switch (a) {
                            case "ping": {
                                break;
                            }
                            case "show": {
                                break;
                            }
                            case "exit": {
                                return;

                            }

                        }
                    }
                    break;
                }
            }
        }
    }

}
