package torretromp_p1;

public class ColaEmpleados {

    Nodo head;
    int size = 0;

    public void Queue(Nodo nodonuevo) {//mete un nodo

        if (head == null) {
            System.out.println("cola cabeza");
            head = nodonuevo;
            this.size++;
        } else {
            Nodo temporal = head;
            System.out.println("cola hijo");
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
        Object empleadoObject = this.head.getData();
        Nodo empleado = (Nodo) empleadoObject;
        return empleado;
    }

    public int getSize() {
        return this.size;
    }

}
