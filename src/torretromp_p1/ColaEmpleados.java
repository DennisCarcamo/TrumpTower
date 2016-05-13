package torretromp_p1;

public class ColaEmpleados {

    Nodo head;
    int size = 0;

    /*  public void setHead(Nodo newhead){
        this.head=newhead;
    }*/
    public void Queue(Empleado empleado) {
        Nodo nodonuevo = new Nodo(null, null, empleado);
        if (head == null) {
            head = nodonuevo;
            this.size++;
        } else {
            int contador = -1;
            Nodo temporal = head;
            while (temporal.getNext() != null) {
                temporal = temporal.getNext();
            }
            temporal.setNext(nodonuevo);
            this.size++;
        }
    }

    public Nodo DeQueue() {
        Nodo temporal = head;
        if (head.getNext() != null) {
            head = head.getNext();
        }

        return temporal;

    }

    public Empleado Peek() {
        Object empleadoObject = this.head.getData();
        Empleado empleado = (Empleado) empleadoObject;
        return empleado;
    }

    public int getSize() {
        return this.size;
    }

}
