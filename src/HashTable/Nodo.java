package HashTable;

public class Nodo<T> {
    public T data;
    public int next;

    public Nodo(T data) {
        this.data = data;
        this.next = -1;
    }

    /**
     * @return the data
     */
    public T getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(T data) {
        this.data = data;
    }

    /**
     * @return the next
     */
    public int getNext() {
        return next;
    }

    /**
     * @param next the next to set
     */
    public void setNext(int next) {
        this.next = next;
    }
    
}


