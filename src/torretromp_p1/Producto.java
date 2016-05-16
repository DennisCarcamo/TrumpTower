package torretromp_p1;

public class Producto {

    Lista headlistademateriales;
    String nombre, descripcion;
    int tiempoensamblar;

    public Producto() {
    }

    public Producto(Lista headlistademateriales, String nombre, String descripcion, int tiempoensamblar) {
        this.headlistademateriales = headlistademateriales;
        this.nombre = nombre;
        this.descripcion = descripcion;

        this.tiempoensamblar = tiempoensamblar;
    }

    public void setHead(Nodo uncomingnode) {
        if (this.headlistademateriales == null) {
            this.headlistademateriales.setHead(uncomingnode);
        } else {
            uncomingnode.setNext(headlistademateriales.getHead());
            headlistademateriales.setHead(uncomingnode.getNext());
        }
    }

    public Nodo getHead() {
        return headlistademateriales.getHead();
    }

    public void insert(int position, Material value) {
        if (position == 0) {
            Nodo temporal = new Nodo(null, null, value);
            headlistademateriales.setHead(temporal);
        } else {
            Nodo headtemp = headlistademateriales.getHead();
            int contador = 0;
            while (headtemp.getNext() != null) {
                contador++;
                if (contador == position) {
                    Nodo nodoinsertar = new Nodo(null, null, value);
                    nodoinsertar.setNext(headtemp.getNext());
                    headtemp.setNext(nodoinsertar);
                    break;
                }
                headtemp = headtemp.getNext();
            }

        }
    }

    public Material at(int position) {
        Nodo temporal = this.headlistademateriales.getHead();
        int contador = -1;
        Material returnvalue = null;
        while (temporal != null) {
            contador++;
            if (contador == position) {
                Object materialObject = temporal.getData();
                Material materialretorno = (Material) materialObject;
                returnvalue = materialretorno;
                break;
            }
            temporal = temporal.getNext();
        }

        return returnvalue;
    }

    /* public void concat( uncominglist) {
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
    public Nodo getHeadlistademateriales() {
        return headlistademateriales.getHead();
    }

    public void setHeadlistademateriales(Nodo headlistademateriales) {
        this.headlistademateriales.setHead(headlistademateriales);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getTiempoensamblar() {
        return tiempoensamblar;
    }

    public void setTiempoensamblar(int tiempoensamblar) {
        this.tiempoensamblar = tiempoensamblar;
    }

}
