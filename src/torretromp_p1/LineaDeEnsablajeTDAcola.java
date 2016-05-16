package torretromp_p1;

public class LineaDeEnsablajeTDAcola {

    Nodo head;
    int size = 0;

    /*  public void setHead(Nodo newhead){
        this.head=newhead;
    }*/
    public void Queue(Nodo orden) {//mete un nodo

        if (head == null) {
            head = orden;
            this.size++;
        } else {
            Nodo temporal = head;
            while (temporal.getNext() != null) {
                temporal = temporal.getNext();
            }
            temporal.setNext(orden);
            this.size++;
        }
    }

    public Nodo DeQueue() {//saca a head
        Nodo temporal = head;
        if (head.getNext() != null) {
            head = head.getNext();
            this.size--;
        }

        return temporal;

    }

    public Nodo Peek() {//solo muestra no saca
        return this.head;
    }

    public int getSize() {
        return this.size;
    }

}
