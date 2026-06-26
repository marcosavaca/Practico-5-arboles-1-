package Java_Practica_Marcos.src;


public class App {
    public static void main(String[] args) {

        // hojas 
        Nodo maria    = ArbolBinario.nuevoArbol(null, "Maria",   null);
        Nodo rodrigo  = ArbolBinario.nuevoArbol(null, "Rodrigo", null);
        Nodo anyora   = ArbolBinario.nuevoArbol(null, "Sofia",  null);
        Nodo abel     = ArbolBinario.nuevoArbol(null, "Matias",    null);

        // Nivle medio
        Nodo esperanza = ArbolBinario.nuevoArbol(maria,   "Esperanza", rodrigo);
        Nodo mJesus    = ArbolBinario.nuevoArbol(anyora,  "Juan",   abel);

        // Raiz
        Nodo raiz = ArbolBinario.nuevoArbol(esperanza, "Esperanza", mJesus);

        ArbolBinario arbol = new ArbolBinario(raiz);

        // informacion
        System.out.println("¿Vacio?     " + arbol.esVacio());
        System.out.println("Altura:     " + arbol.altura());
        System.out.println("Nodos:      " + arbol.cantidadNodos());

        //Recorridos
        System.out.println("PreOrden:    " + arbol.PostOrden());
        System.out.println("InOrden:     " + arbol.InOrden());
        System.out.println("PostOrden:   " + arbol.PostOrden());
        System.out.println("Por niveles: " + arbol.PostOrden());

        //Busqueda
        System.out.println("¿Existe Maria?  " + arbol.buscar("Maria"));
        System.out.println("¿Existe Rodrigo?  " + arbol.buscar("Rodrigo"));

        //Es o no hoja:
        System.out.println("¿Raiz es hoja?  " + arbol.esHoja(arbol.getRaiz()));
    }
}