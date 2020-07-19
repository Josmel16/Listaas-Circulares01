package Clases;

import java.util.Scanner;

public class CAplicaLista_Circular {

    static Scanner teclado = new Scanner(System.in);
    static CLista_Circular listaCir = new CLista_Circular();

    public static void main(String[] args) {
        menu();
    }

    static void menu() {
        int opcion;

        do {
            System.out.println("\nOperaciones de la lista");
            subrayado();
            System.out.println("\u001B[36m[1] Insertar inicio");
            System.out.println("\033[35m[2] Insertar final");
            System.out.println("\033[32m[3] Insertar por posicion");
            System.out.println("\033[36m[4] Mostrar lista");
            System.out.println("\033[31m[5] Busqueda de un elemento");
            System.out.println("\033[33m[6] Ordenamiento de la lista");
            System.out.println("\033[32m[7] Intercambio del elemento mayor con el ultimo elemento");
            System.out.println("\033[32m[8] Intercambio del elemento menor con el primer elemento");
            System.out.println("\033[32m[9] Intercambio del primer elemento par con el ultimo impar");
            System.out.println("\033[33m[10] Tamaño de la lsita");
            System.out.println("\033[33m[11] Contar primos de la lista");
            System.out.println("\033[35m[12] Modificar primer elemento par");
            subrayado();
            System.out.println("[0] Salir");
            subrayado();

            System.out.println("Elige una de las opciones: ");
            opcion = teclado.nextInt();

            switch (opcion) {
                case 1: {
                    listaCir.insertarInicio();
                    System.out.println("Se inserto elemento...");

                    break;
                }
                case 2: {
                    listaCir.insertarFinal();
                    System.out.println("Se inserto elemento...");
                    break;
                }
                case 3: {
                    ingresoAleatorio();
                    System.out.println("Se inserto elemento...");

                    break;
                }
                case 4: {
                    System.out.println("");
                    System.out.println("Los elementos som");
                    subrayado();
                    listaCir.recorrido();
                    System.out.println("");
                    break;
                }
                case 5: {
                    if (listaCir.vacio()) {
                        System.out.println("La lista esta vacia");
                    } else {
                        System.out.println("Ingrese el elemento a buscar");
                        int elemento = teclado.nextInt();
                        if (listaCir.buscar(elemento)) {
                            System.out.println("El elemento " + elemento + "  existe");
                        } else {
                            System.out.println("El elemento " + elemento + "  no existe");
                        }
                    }
                    break;

                }
                case 6: {
                    listaCir.ordenardescendete();

                    break;
                }
                case 7: {
                    listaCir.IntercambioMayorUltimo();

                    break;
                }
                case 8: {
                    listaCir.IntercambioMenorPrimero();

                    break;
                }
                case 9: {
                    listaCir.IntercambioPrimerParPrimerImpar();

                    break;
                }
                case 10: {
                    System.out.println("");
                    subrayado();
                    System.out.println("El tamaño de la lista es: "
                            + listaCir.getTamaño() + " Elementos");
                    subrayado();
                    System.out.println("");
                    break;
                }
                case 11: {
                    System.out.println("Los primos son");
                    subrayado();
                    listaCir.contarPrimos();
                    System.out.println("");
                    subrayado();
                    break;
                }
                case 12: {
                    System.out.println("Ingrese un nuevo numero: ");
                    int num = teclado.nextInt();
                    listaCir.modificarPar(num);
                    break;
                }

                default:
                    System.out.println("Ingrese opcion correcta...");
            }
        } while (opcion != 0);
    }

    static void subrayado() {
        System.out.println("*******************");
    }

    static void ingresoAleatorio() {
        System.out.println("Ingrese posicion: ");
        int pos = teclado.nextInt();
        listaCir.insertarpocicion(pos);
    }

}
