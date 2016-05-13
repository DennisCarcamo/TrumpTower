package torretromp_p1;

public class Nodo {
    Nodo next;
    Nodo Pila;
    Object data;

    public Nodo() {
    }
    
    public Nodo(Nodo next, Nodo Pila, Object data) {
        this.next = next;
        this.Pila = Pila;
        this.data = data;
    }

    public Nodo getNext() {
        return next;
    }

    public void setNext(Nodo next) {
        this.next = next;
    }

    public Nodo getPila() {
        return Pila;
    }

    public void setPila(Nodo Pila) {
        this.Pila = Pila;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    
}
