package torretromp_p1;

public class ColaEmpleados {

    Nodo head;
    int size = 0;

    public void Queue(Nodo nodonuevo) {//mete un nodo

        if (head == null) {

            head = nodonuevo;
            this.size++;
        } else {
            Nodo temporal = head;

            while (temporal.getNext() != null) {
                temporal = temporal.getNext();
            }
            temporal.setNext(nodonuevo);
            this.size++;
        }
    }

    public Nodo DeQueue() {//saca el head
        Nodo temporal = head;
        if (head.getNext() != null) {
            head = head.getNext();
        }

        return temporal;

    }

    public Nodo Peek() {//muestra un  nodo
        return this.head;
    }

    public int getSize() {
        return this.size;
    }

}
