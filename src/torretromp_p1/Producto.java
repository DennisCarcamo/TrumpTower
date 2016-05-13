package torretromp_p1;

public class Producto {

    Nodo headlistademateriales;
    String nombre, descripcion, marca;
    int tiempoensamblar;

    public Producto() {
    }

    public Producto(Nodo headlistademateriales, String nombre, String descripcion, String marca, int tiempoensamblar) {
        this.headlistademateriales = headlistademateriales;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.marca = marca;
        this.tiempoensamblar = tiempoensamblar;
    }

    public void setHead(Nodo uncomingnode) {
        if (this.headlistademateriales == null) {
            this.headlistademateriales = uncomingnode;
        } else {
            uncomingnode.setNext(headlistademateriales);
            this.headlistademateriales = uncomingnode;
        }
    }

    public Nodo getHead() {
        return this.headlistademateriales;
    }

    public void insert(int position, Material value) {
        if (position == 0) {
            Nodo temporal = new Nodo(null,null,value);
            headlistademateriales = temporal;
        } else {
            Nodo headtemp = headlistademateriales;
            int contador = 0;
            while (headtemp.getNext() != null) {
                contador++;
                if (contador == position) {
                    Nodo nodoinsertar = new Nodo(null,null, value);
                    nodoinsertar.setNext(headtemp.getNext());
                    headtemp.setNext(nodoinsertar);
                    break;
                }
                headtemp = headtemp.getNext();
            }

        }
    }

    public Material at(int position) {
        Nodo temporal = this.headlistademateriales;
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
        return headlistademateriales;
    }

    public void setHeadlistademateriales(Nodo headlistademateriales) {
        this.headlistademateriales = headlistademateriales;
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

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getTiempoensamblar() {
        return tiempoensamblar;
    }

    public void setTiempoensamblar(int tiempoensamblar) {
        this.tiempoensamblar = tiempoensamblar;
    }

}
