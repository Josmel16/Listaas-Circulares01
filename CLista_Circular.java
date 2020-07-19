package Clases;

import java.util.Random;

public class CLista_Circular {

    private CNodo cabeza;
    private CNodo cola;
    private int tope;
    final Random r = new Random();
    
    public CLista_Circular(){
        cabeza = null;
        cola=null;
        tope = 0;
    }

    public boolean vacio() {
        return cabeza == null;
    }

    public int crearAleatorios() {
        int valor = (int) r.nextInt(91) + 10;
        return valor;
    }

    public void insertarInicio() {
        CNodo nuevo = new CNodo();
        nuevo.setDato(crearAleatorios());

        if (vacio()) {
            cabeza = nuevo;
            cola = nuevo;

        } else {
            nuevo.setSiguiente(cabeza);
            cabeza = nuevo;
        }
        cola.setSiguiente(cabeza);
        tope++;
    }

    public void insertarFinal() {
        CNodo nuevo = new CNodo();
        nuevo.setDato(crearAleatorios());

        if (vacio()) {
            cabeza = nuevo;
           cola=nuevo;

        } else {

            cola.setSiguiente(nuevo);
            cola = nuevo;
        }
        cola.setSiguiente(cabeza);
        tope++;
        
        
    }

    public void insertarpocicion(int pos) {

        if (pos >= 1 && pos <= tope) {
            CNodo nuevo = new CNodo();
            nuevo.setDato(crearAleatorios());

            if (pos == 0) {
                nuevo.setSiguiente(cabeza);
                cabeza = nuevo;

            } else {
                if (pos == tope) {
                    CNodo aux = cola;
                    while (aux.getSiguiente() != null) {
                        aux = aux.getSiguiente();
                    }
                    aux.setSiguiente(nuevo);
                } else {
                    CNodo aux = cabeza;
                    for (int i = 1; i < (pos - 1); i++) {
                        aux = aux.getSiguiente();
                    }
                    CNodo siguiente = aux.getSiguiente();
                    aux.setSiguiente(nuevo);
                    nuevo.setSiguiente(siguiente);
                }
            }
            
            tope++;
        }
    }

    public void recorrido() {
        if (!vacio()) {
            CNodo aux = cabeza;
            
            do {
                System.out.println("[" + aux.getDato() + "]" +"-->");
                aux = aux.getSiguiente();
            } while (aux != cabeza);
        }
    }

    public boolean buscar(int elemento) {
        CNodo busqueda;
        boolean encontrado = false;
        busqueda = cola;
        while (busqueda.getSiguiente() != cola && !encontrado) {
            encontrado = (busqueda.getSiguiente().getDato() == elemento);
            if (!encontrado) {
                busqueda = busqueda.getSiguiente();
            }
        }
        return busqueda.getSiguiente().getDato() == elemento;
    }

    public void ordenardescendete() {
        if (vacio()) {
            System.out.println("La lista esta vacia");
        } else {
            CNodo aux = cabeza;
            String cadena = "";
            while (aux != cola) {
                cadena = cadena + "[" + aux.getDato() + "]-->";
                aux = aux.getSiguiente();
            }
        System.out.println(cadena + "Mostrando lista en forma descendente");
            

        }

    }

    public int getTamaño() {
        return tope;
    }

    public void contarPrimos() {
        if (vacio()) {
            int cont = 0;
            int primo = 0;
            CNodo aux = cabeza;
            do {
                for (int x = 1; x <= 100; x++) {
                    if (aux.getDato() % x == 0) {
                        cont++;
                    }
                }
                if (cont == 2) {
                    primo++;
                    System.out.println("[" + aux.getDato() + "]-->");
                }
                cont = 0;
                aux = aux.getSiguiente();
            } while (aux != cabeza);
            System.out.println("Hay" + primo + " numeros primos");
        } else {
            System.out.println("Lista Circular vacia!!!");
        }
    }

    public void modificarPar(int num) {
        if (!vacio()) {
            CNodo aux = cabeza;
            for (int i = 0; i < tope; i++) {
                if (aux.getDato() % 2 == 0) {
                    aux.setDato(num);
                    return;
                }
                aux = aux.getSiguiente();
            }
        } else {
            System.out.println("Lista circular vacia!!!");
        }
    }

    public void IntercambioMayorUltimo() {
        CNodo aux;
        int mayor = 0;
        aux = cabeza;
        int ultimo = cola.getDato();
        while (aux.getSiguiente() != cabeza) {
            if (mayor < aux.getDato()) {
                mayor = aux.getDato();
            }
            CNodo aux1 = cabeza;
            aux1 = aux1.getSiguiente();
            while (aux1.getSiguiente() != cabeza) {
                if (aux1.getDato() == mayor) {
                    aux1.setDato(ultimo);
                }
                aux1 = aux1.getSiguiente();
            }
            aux = aux.getSiguiente();
        }
        cola.setDato(mayor);
        System.out.println("El dato mayor es:" + mayor);
        System.out.println("Intercambio realizado");
    }

   
    public void IntercambioMenorPrimero() {
        int contador =0;
        CNodo aux;
        int Menor = cabeza.getDato();
        aux = cabeza;
        int primero = cabeza.getDato();
        while (contador < tope) {
            if (Menor > aux.getDato()) {
                Menor = aux.getDato();
            }
            CNodo aux1 = cola;
            aux1 = aux1.getSiguiente();
            while (aux1.getSiguiente() != cola) {
                if (aux1.getDato() == Menor) {
                    aux1.setDato(primero);
                }
                aux1 = aux1.getSiguiente();
            }
            aux = aux.getSiguiente();
            contador++;
        }
        cabeza.setDato(Menor);
        System.out.println("El dato menor es:" + Menor);
        System.out.println("Intercambio realizado");
    }

    public void IntercambioPrimerParPrimerImpar() {
        CNodo aux;
        int par = 0;
        int impar =0;
        aux = cabeza;
        while (aux.getSiguiente()!=cola) {
            if (aux.getDato()%2 == 0) {
                par = aux.getDato();
            }
                if (aux.getDato()%2 != 0) {
                impar = aux.getDato();
            }

            CNodo aux1 = cabeza;
            aux1 = aux1.getSiguiente();
            while (aux1.getSiguiente() != cola) {
                if (aux1.getDato() == impar) {
                    aux1.setDato(par);
                }
                aux1 = aux1.getSiguiente();
            }        
            aux = aux.getSiguiente();
        }
        
        System.out.println("El primer elemento par es: "+par);
        System.out.println("El primer elemento impar es: "+impar);
        System.out.println("Intercambio realizado");
    }
}
