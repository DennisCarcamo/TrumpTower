package torretromp_p1;

public class LineaDeEnsablajeTDAcola {

    Nodo head;
    int size;

    public LineaDeEnsablajeTDAcola() {
    }

    public void insert(int posicion, Producto valor) {
        if (posicion > 0) {
            if (!(head.getNext() != null)) {
                if (posicion == 1) {
                    head.setNext(new Nodo(null, null, valor));
                } else if (posicion > 1) {
                    System.err.println("Index out of bounds");
                } else {
                    Nodo temp = head;
                    head.setData(valor);
                    head.setNext(temp);
                }
            } else {
                Nodo temp = head;
                int cont = 0;
                if (size() >= posicion) {
                    while (cont < posicion - 1) {
                        temp = temp.getNext();
                        cont++;
                    }
                    Nodo nuevo = new Nodo(null, null, valor);
                    if (temp.getNext() != null) {
                        Nodo temp2 = temp.getNext();
                        nuevo.setNext(temp2);
                    }
                    temp.setNext(nuevo);
                }
            }
        } else if (posicion == 0) {
            if (head != null) {
                Nodo temp = head;
                setHead(new Nodo(null, null, valor));
                head.setNext(temp);
            } else {
                setHead(new Nodo(null, null, valor));
            }
        } else {
            System.err.println("Invalid position");
        }
    }

    public int find(Object valor) {
        int contador = 0;
        Nodo temp = head;
        while (temp.getNext() != null) {
            if (temp.getData() == valor) {
                return contador;
            }
            temp = temp.getNext();
            contador++;
        }
        return -1;
    }

    public Nodo elementAt(int posicion) {
        int contador = 0;
        Nodo temp = head;
        if (size() > posicion) {
            if (posicion == 0) {
                return head;
            }
            while (contador < posicion) {
                temp = temp.getNext();
                contador++;
            }
            return temp;
        }
        return new Nodo();
    }

    public void remove(int posicion) {
        if (size() > posicion) {
            if (posicion == 0 && head.getNext() != null) {
                head = null;
            } else if (posicion == 0) {
                setHead(head.getNext());
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

        } else {
            System.err.println("Index out of bounds");
        }
    }

    public Nodo first() {
        return head;
    }

    public void print() {
        if (head != null) {
            if (head.getNext() != null) {
                System.out.print("[");
                Nodo temp = head;
                for (int i = 0; i < size(); i++) {
                    if (temp.getNext() != null) {
                        System.out.print(temp.toString() + ",");
                        temp = temp.getNext();
                    } else {
                        System.out.print(temp.toString() + "]");
                    }
                }
            } else {
                System.out.println("[" + head.toString() + "]");
            }
        }
    }

    public int size() {
        int size = 0;
        if (head != null) {
            size++;
            Nodo temp = head;
            while (temp.getNext() != null) {
                size++;
                temp = temp.getNext();
            }
        }
        return size;
    }

    public void push_back(Producto value) {
        insert(size(), value);
    }

    public void setHead(Nodo head) {
        this.head = head;
    }

    public Nodo last() {
        return elementAt(size() - 1);
    }
}
