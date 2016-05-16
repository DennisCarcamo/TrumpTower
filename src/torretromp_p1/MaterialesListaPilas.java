package torretromp_p1;

public class MaterialesListaPilas {

    protected Nodo head;
    protected int size;

    public Nodo top() {
        return this.head;
    }

    public int size() {
        return this.size;
    }

    public Material pop() {
        Nodo temporal = this.head;
        head = head.getNext();
        size--;
        return (Material) temporal.getData();
    }

    public void push(Material material) {
        Nodo nuevonodo = new Nodo(null, null, material);
        nuevonodo.setPila(head);
        head = nuevonodo;
        this.size++;
    }

    public boolean isempty() {
        return head != null;
    }

    public int getsize() {
        return size;
    }

    public Material peek() {
        Material retorno = (Material) head.getData();
        return retorno;
    }

    //
    public void setHead(Nodo uncomingnode) {
        if (uncomingnode == null) {
            this.head = null;
        } else if (this.head == null) {
            this.head = uncomingnode;
            size++;
        } else {
            uncomingnode.setNext(head);
            this.head = uncomingnode;
            size++;
        }
    }

    public Nodo getHead() {
        return this.head;
    }

    public void insert(int position, int value) {
        if (position == 0) {
            Nodo temporal = new Nodo();
            temporal.setData(value);
            temporal.setNext(head);
            head = temporal;
        } else {
            Nodo headtemp = head;
            int contador = 0;
            while (headtemp.getNext() != null) {
                contador++;
                if (contador == position) {
                    Nodo nodoinsertar = new Nodo();
                    nodoinsertar.setData(value);
                    nodoinsertar.setNext(headtemp.getNext());
                    headtemp.setNext(nodoinsertar);
                    break;
                }
                headtemp = headtemp.getNext();
            }

        }
    }

    public Object at(int position) {
        Nodo temporal = this.head;
        boolean bandera = false;
        int contador = -1;
        Object returnvalue = null;
        while (temporal != null) {
            contador++;
            if (contador == position) {
                returnvalue = temporal.getData();
                bandera = true;
                break;
            }
            temporal = temporal.getNext();
        }

        if (bandera == false) {
            returnvalue = -1;
        }

        return returnvalue;
    }

    public void delete(int posicion) {

        if (posicion == 0) {
            head = head.getNext();
        } else if (posicion == 1) {
            Nodo temp = head;
            temp = temp.getNext();
            temp = temp.getNext();
            head.setNext(temp);
        } else {
            int contador = 0;
            Nodo temp = head;
            while (contador < posicion - 1) {
                temp = temp.getNext();
                contador++;
            }
            Nodo temp2 = temp.getNext();
            Nodo temp3 = temp2.getNext();
            temp.setNext(temp3);
        }

    }

    /* public void concat(Lista uncominglist) {
        Nodo temporal = this.getHead();
        if (temporal != null) {
            while (temporal.getNext() != null) {
                temporal = temporal.getNext();
            }
            temporal.setNext(uncominglist.getHead());
        } else {
            this.head = uncominglist.getHead();
        }
        
    }*/
}
