package Java_Practica_Marcos.src;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ArbolBinario {


    private Nodo raiz;

    public ArbolBinario() {
        this.raiz = null;
    }

    public ArbolBinario(Nodo raiz) {
        this.raiz = raiz;
    }

  
    public Nodo getRaiz() {
        return raiz;
    }

    public boolean esVacio() {
        return raiz == null;
    }

    // Crear nodo
    public static Nodo nuevoArbol(Nodo ramaIzdo, Object dato, Nodo ramaDcho) {
        return new Nodo(ramaIzdo, dato, ramaDcho);
    }

    // Altura
    public int altura() {
        return alturaRec(raiz);
    }

    private int alturaRec(Nodo nodo) {
        if (nodo == null) return 0;
        return 1 + Math.max(
            alturaRec(nodo.getIzdo()),
            alturaRec(nodo.getDcho())
        );
    }

    // Cantidad de nodos
    public int cantidadNodos() {
        return cantidadRec(raiz);
    }

    private int cantidadRec(Nodo nodo) {
        if (nodo == null) return 0;
        return 1 + cantidadRec(nodo.getIzdo())
                 + cantidadRec(nodo.getDcho());
    }

    // buscar
    public boolean buscar(Object valor) {
        return buscarRec(raiz, valor);
    }

    private boolean buscarRec(Nodo nodo, Object valor) {
        if (nodo == null) return false;
        if (nodo.getDato().equals(valor)) return true;
        return buscarRec(nodo.getIzdo(), valor) ||
               buscarRec(nodo.getDcho(), valor);
    }

    // Recorridos
    //Preorden
    public List<Object> preOrden() {
        List<Object> resultado = new ArrayList<>();
        PreOrden(raiz, resultado);
        return resultado;
    }

    private void PreOrden(Nodo nodo, List<Object> resultado) {
        if (nodo != null) {
            resultado.add(nodo.getDato());
            PreOrden(nodo.getIzdo(), resultado);
            PreOrden(nodo.getDcho(), resultado);
        }
    }

    // Inorden
    public List<Object> InOrden() {
        List<Object> resultado = new ArrayList<>();
        InOrden(raiz, resultado);
        return resultado;
    }

    private void InOrden(Nodo nodo, List<Object> resultado) {
        if (nodo != null) {
            InOrden(nodo.getIzdo(), resultado);
            resultado.add(nodo.getDato());
            InOrden(nodo.getDcho(), resultado);
        }
    }

    // Postorden
    public List<Object> PostOrden() {
        List<Object> resultado = new ArrayList<>();
        PostOrden(raiz, resultado);
        return resultado;
    }

    private void PostOrden(Nodo nodo, List<Object> resultado) {
        if (nodo != null) {
            PostOrden(nodo.getIzdo(), resultado);
            PostOrden(nodo.getDcho(), resultado);
            resultado.add(nodo.getDato());
        }
    }

    // BFS busqueda a lo ancho
    public List<Object> BusquedaAloAncho() {
        List<Object> resultado = new ArrayList<>();
        if (raiz == null) return resultado;

        Queue<Nodo> cola = new LinkedList<>();
        cola.add(raiz);

        while (!cola.isEmpty()) {
            Nodo actual = cola.poll();
            resultado.add(actual.getDato());

            if (actual.getIzdo() != null) cola.add(actual.getIzdo());
            if (actual.getDcho() != null) cola.add(actual.getDcho());
        }
        return resultado;
    }

    // Es hoja?
    public boolean esHoja(Nodo nodo) {
        return nodo != null &&
               nodo.getIzdo() == null &&
               nodo.getDcho() == null;
    }
}