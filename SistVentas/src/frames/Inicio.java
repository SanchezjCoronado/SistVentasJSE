/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frames;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
/**
 *
 * @author Deivy
 */
public class Inicio {
    
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    //modelo
                    Login f = new Login();
                    //que aparezca maximizado
                    f.setLocationRelativeTo(null);
                    f.setVisible(true);
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "LA BASE DE DATOS NO EXISTE");
                }
            }
        });

    }
}
