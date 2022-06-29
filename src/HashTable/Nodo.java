package HashTable;

public class Nodo {
    private Articulo art;
    private Nodo next;

    public Nodo(Articulo art) {
        this.art = art;
        this.next = null;
    }

    /**
     * @return the cancion
     */
    public Articulo getArt() {
        return art;
    }

    /**
     * @param cancion the cancion to set
     */
    public void setArt(Articulo art) {
        this.art = art;
    }

    /**
     * @return the next
     */
    public Nodo getNext() {
        return next;
    }

    /**
     * @param next the next to set
     */
    public void setNext(Nodo next) {
        this.next = next;
    }
    
}


