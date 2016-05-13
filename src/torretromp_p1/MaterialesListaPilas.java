package torretromp_p1;

public class MaterialesListaPilas {

    Nodo head;
    int size;

    public Nodo top() {
        return this.head;
    }

    public int size() {
        return this.size;
    }

    public Material pop() {
        Nodo temporal = this.head;
        head = head.getNext();
        return (Material) temporal.getData();
    }

    public void push(Material material) {
        Nodo nuevonodo = new Nodo(null, null, material);
        nuevonodo.setPila(head);
        head = nuevonodo;
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

}
