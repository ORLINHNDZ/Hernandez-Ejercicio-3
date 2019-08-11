package com.hernandez;


import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        ArrayList<Vehiculo> vehiculos = new ArrayList();
        boolean x = true;
        System.out.println("BIENVENIDO");
        while (x == true) {

            System.out.println("1. Registrar vehiculo");
            System.out.println("2. Mostrar Vehiculo");
            System.out.println("3. Salir");
            int opc = lector.nextInt();

            switch (opc) {

                case 1:

                    System.out.println("1. Ford");
                    System.out.println("2. Toyota");
                    System.out.println("3. Honda");
                    System.out.println("4. Nissan");

                    int marca = LectorDeDatos.solicitarEntero("Ingrese la marca del vehiculo: ");
                    //Año
                    int an = LectorDeDatos.solicitarEntero("año del vehiculo: ");

                    //Precio
                    double precio = LectorDeDatos.solicitarDouble("Precio del vehiculo: ");
                    //Color
                    System.out.println("Ingrese el color del vehiculo: ");
                    String color = lector.next();

                    if (marca == 1) {
                        Ford RegistrarNuevoFord = new Ford();
                        RegistrarNuevoFord.an = an;
                        RegistrarNuevoFord.color = color;
                        RegistrarNuevoFord.precio = precio;
                        vehiculos.add(RegistrarNuevoFord);

                    } else if (marca == 2) {
                        Toyota RegistrarNuevoToyota = new Toyota();
                        RegistrarNuevoToyota.color = color;
                        RegistrarNuevoToyota.an = an;
                        RegistrarNuevoToyota.precio = precio;
                        vehiculos.add(RegistrarNuevoToyota);
                        System.out.println("Nuevo Toyota registrado");
                    } else if (marca == 3) {
                        Honda RegistrarNuevoHonda = new Honda();
                        RegistrarNuevoHonda.color = color;
                        RegistrarNuevoHonda.an = an;
                        RegistrarNuevoHonda.precio = precio;
                        vehiculos.add(RegistrarNuevoHonda);
                        System.out.println("Nuevo Honda registrado");
                    } else if (marca == 4) {
                        Nissan RegistrarNuevoNissan = new Nissan();
                        RegistrarNuevoNissan.color = color;
                        RegistrarNuevoNissan.an = an;
                        RegistrarNuevoNissan.precio = precio;
                        vehiculos.add(RegistrarNuevoNissan);
                        System.out.println("Nuevo Nissan registrado");
                    } else {
                        System.out.println("La marca no exite");
                    }

                    break;

                case 2:
                    if (vehiculos.isEmpty()) {
                        System.out.println("No se han ingresado nuevos registros");
                    } else {
                        for (Vehiculo v : vehiculos) {
                            if (v instanceof Toyota) {
                                System.out.println("Marca: Toyota");
                                System.out.println("Color: " + v.color);
                                System.out.println("Año: " + v.an);
                                System.out.println("Precio: Lps. " + v.precio + "\n");
                            } else if (v instanceof Nissan) {
                                System.out.println("Marca: Nissan");
                                System.out.println("Color: " + v.color);
                                System.out.println("Año: " + v.an);
                                System.out.println("Precio: Lps. " + v.precio + "\n");
                            }
                        }
                    }
                    break;
                case 3:
                    x = false;
                    break;

                default:
                    System.out.println("Opcion invalida");

            }
        }
    }
}



