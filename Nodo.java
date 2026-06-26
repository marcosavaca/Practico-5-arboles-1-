package Java_Practica_Marcos.src;


public class Nodo {
    
    // private en vez de proteceted
    private Object dato;
    private Nodo izdo;
    private Nodo dcho;

  
    public Nodo(Object valor) {
        this.dato = valor;
        this.izdo = null;
        this.dcho = null;
    }

    public Nodo(Nodo ramaIzdo, Object valor, Nodo ramaDcho) {
        this.dato = valor;     
        this.izdo = ramaIzdo;
        this.dcho = ramaDcho;
    }

    // geett  y setters.
    public Object getDato() {
        return dato;
    }

    public void setDato(Object dato) {
        this.dato = dato;
    }

    public Nodo getIzdo() {
        return izdo;
    }

    public void setIzdo(Nodo izdo) {
        this.izdo = izdo;
    }

    public Nodo getDcho() {
        return dcho;
    }

    public void setDcho(Nodo dcho) {
        this.dcho = dcho;
    }

   
    @Override
    public String toString() {
        return dato != null ? dato.toString() : "null";
    }
}