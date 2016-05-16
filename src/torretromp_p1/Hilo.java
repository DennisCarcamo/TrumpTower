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
    
  
    private void esperarXsegundos(int segundos) {
        try {
            Thread.sleep(segundos * 1000);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }
}
