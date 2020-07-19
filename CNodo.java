
package Clases;

public class CNodo {
    
    private int dato;
    private CNodo siguiente;
    
    public CNodo(){
        dato=0;
        siguiente=null;
    }

    public CNodo(int id) {
        dato=id;
        siguiente=null;
    }

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public CNodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(CNodo siguiente) {
        this.siguiente = siguiente;
    }

    
    
    
}
