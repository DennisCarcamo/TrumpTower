package torretromp_p1;

public class Nodo {

    Nodo next;
    Object data;

    public Nodo() {
    }

    public Nodo(Nodo next, int data) {
        this.next = next;
        this.data = data;
    }

    public Nodo getNext() {
        return next;
    }

    public void setNext(Nodo next) {
        this.next = next;
    }

    public Object  getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

}
