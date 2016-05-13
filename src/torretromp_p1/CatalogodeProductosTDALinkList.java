/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package torretromp_p1;

/**
 *
 * @author Dennis
 */
public class CatalogodeProductosTDALinkList {

    Nodo head;

    //opcional un zise;
    public CatalogodeProductosTDALinkList(Nodo head) {
        this.head = head;

    }

    public CatalogodeProductosTDALinkList() {
    }

    public void setHead(Nodo uncomingnode) {
        if (this.head == null) {
            this.head = uncomingnode;
        } else {
            uncomingnode.setNext(head);
            this.head = uncomingnode;
        }
    }

    public Nodo getHead() {
        return this.head;
    }

    public void insert(int position, Producto prod) {
        if (position == 0) {
            Nodo temporal = new Nodo(null,null, prod);
            head = temporal;
        } else {
            Nodo headtemp = head;
            int contador = 0;
            while (headtemp.getNext() != null) {
                contador++;
                if (contador == position) {
                    Nodo nodoinsertar = new Nodo(null,null, prod);
                    nodoinsertar.setNext(headtemp.getNext());
                    headtemp.setNext(nodoinsertar);
                    break;
                }
                headtemp = headtemp.getNext();
            }

        }
    }

    public Producto at(int position) {
        Nodo temporal = this.head;
        boolean bandera = false;
        int contador = -1;
        Producto returnvalue = null;
        while (temporal != null) {
            contador++;
            if (contador == position) {
                Object productoObject = temporal.getData();
                Producto productoretorno = (Producto) productoObject;
                returnvalue = productoretorno;
                bandera = true;
                break;
            }
            temporal = temporal.getNext();
        }

        return returnvalue;
    }

    /*  public void concat(Lista uncominglist) {
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
