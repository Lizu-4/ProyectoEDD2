package HashTable;

public class Lista {
    private Nodo pfirst;
    private Nodo plast;
    private int size;
    
    public Lista(){
        pfirst = null;
        plast = null;
    }
    
    public boolean itsEmpty(){
        return pfirst == null;
    }
    
    public void insert(Articulo articulo){
        Nodo nuevoNodo = new Nodo(articulo);
        if(itsEmpty()){
            this.pfirst = nuevoNodo;
        }else{
            Nodo nodoActual = getPfirst().getNext();
            if(nodoActual==null){
                getPfirst().setNext(nuevoNodo);
            }else{
                while(nodoActual.getNext() != null){
                    nodoActual = nodoActual.getNext();
                }
                nodoActual.setNext(nuevoNodo);
            
            }           
        }
        this.plast = nuevoNodo;
        size +=1;
    }
    
    public void insertFirst(Articulo articulo){
        Nodo nodo = new Nodo(articulo);
        if(!itsEmpty()){          
            nodo.setNext(this.pfirst);
            this.pfirst = nodo;
        }else{
            this.pfirst = nodo;
            this.plast = nodo;
        }
        size +=1;
    }
    
    public void insertLast(Articulo articulo){
        Nodo nodo = new Nodo(articulo);
        if(!itsEmpty()){          
            this.plast.setNext(nodo);
            this.plast = nodo;
        }else{
            this.pfirst = nodo;
            this.plast = nodo;
        }
        size +=1;
    }
    
    public void deleteFirst(){
        if(!itsEmpty()){
            this.pfirst = pfirst.getNext();
            size = size -1;
        }else{
            System.out.println("La lista esta vacia");
        }
    }
    
    
 
    public void deleteLast(){
        if(!itsEmpty()){
            Nodo aux = getPfirst();
            while(aux.getNext() != this.plast){
                aux = aux.getNext();
            }
            this.plast = aux;
            aux.setNext(null);
            size = size -1;
        }else{
            System.out.println("La lista esta vacia");
        }
    }
   
   
    
    public int getSize() {
        return size;
    }

    /**
     * @return the pfirst
     */
    public Nodo getPfirst() {
        return pfirst;
    }

    /**
     * @return the plast
     */
    public Nodo getPlast() {
        return plast;
    }
}
