/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package torretromp_p1;

import javax.swing.JOptionPane;

/**
 *
 * @author Dennis Joel Carcamos
 */
public class Hilo extends Thread {

    private MaterialesListaPilas materialesexistentes;
    private ColaEmpleados empleadoscola;
    private LineaDeEnsablajeTDAcola ordenes;

    public Hilo(MaterialesListaPilas materialesexistentes, ColaEmpleados empleadoscola, LineaDeEnsablajeTDAcola ordenes) {
        this.materialesexistentes = materialesexistentes;
        this.empleadoscola = empleadoscola;
        this.ordenes = ordenes;
    }

    public MaterialesListaPilas getMaterialesexistentes() {
        return materialesexistentes;
    }

    public void setMaterialesexistentes(MaterialesListaPilas materialesexistentes) {
        this.materialesexistentes = materialesexistentes;
    }

    public ColaEmpleados getEmpleadoscola() {
        return empleadoscola;
    }

    public void setEmpleadoscola(ColaEmpleados empleadoscola) {
        this.empleadoscola = empleadoscola;
    }

    public LineaDeEnsablajeTDAcola getOrdenes() {
        return ordenes;
    }

    public void setOrdenes(LineaDeEnsablajeTDAcola ordenes) {
        this.ordenes = ordenes;
    }

    private boolean hayordenes(Nodo actual) {
        return actual != null;
    }

    @Override
    public void run() {
        System.out.println("estoy en el hilo");
        ColaEmpleados empleadosocupados = new ColaEmpleados();
        Nodo ordenestemp = ordenes.head;
        while (ordenestemp != null) {
            esperarXsegundos(((Producto) ordenestemp.getData()).getTiempoensamblar());
            ordenes.remove(ordenes.size);
            ordenestemp = ordenes.last();
        }

        JOptionPane.showMessageDialog(null, "Productos terminados");

        /*boolean continuar = false;
        Nodo materialnesesario = ((Producto) ordenestemp.getData()).getHeadlistademateriales();
        while (materialnesesario != null) {
            System.out.println("primer while");
            Nodo materialesdispo = this.materialesexistentes.getHead();
            int contador = -1;
            while (materialesdispo != null) {
                System.out.println("segundo while");
                contador++;
                if (((Material) materialnesesario.getData()).getNombre().equals(((Material) materialesdispo.getData()).getNombre())) {
                    if (materialesdispo.getPila() != null) {
                        materialesdispo.setPila(materialesdispo.getPila().getPila());
                        System.out.println("habian materiales en pila");
                        continuar = true;
                    } else {
                        continuar = true;
                        materialesexistentes.delete(contador);
                    }
                }

                materialesdispo = materialesdispo.getNext();
            }

            materialnesesario = materialnesesario.getNext();
        }
        if (continuar == false) {
            JOptionPane.showMessageDialog(null, "hace falta materiales para el producto anterior"
                    + " Se cancela la produccionde este Producto");

        } else {
            Nodo empltemp = this.empleadoscola.head;
            while (empltemp != null) {
                empleadosocupados.Queue(empltemp);
                esperarXsegundos(((Producto) ordenestemp.getData()).getTiempoensamblar());
                ordenes.remove(ordenes.size);
                ordenestemp = ordenes.last();

            }
        }*/
    }

    private void esperarXsegundos(int segundos) {
        try {
            System.out.println("ensamblando");
            Thread.sleep(segundos * 1000);
            System.out.println("terminado");
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }
}
