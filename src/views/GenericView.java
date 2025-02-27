package views;

import javax.swing.*;
import java.awt.*;

/**
 * Esta clase sirve para crear una plantilla para las interfaces gráficas utilizadas
 * en la aplicación,
 * Esta clase hereda de {@link JFrame} ,
 * Todas las interfaces gráficas usadas en la aplicación a su vez heredarán de esta clase.
 */
public class GenericView extends javax.swing.JFrame {
    /**
     * Este constructor define las carcterísticas comunes que tienen las interfaces
     * gráficas usadas en la aplicación
     *
     * @param title Título de la ventana actual
     * @param icon  Icono de la ventana actual
     */
    public GenericView(String title, String icon) {
        this.setTitle(title);
        this.setSize(700, 700);
        this.setLocationRelativeTo(null); // para centrar la pantalla en la ventana
        this.setResizable(false); // permite no maximizar la pantalla
        Image icono = Toolkit.getDefaultToolkit().getImage("src/images/" + icon); // para NetBeans
        //Image icono = Toolkit.getDefaultToolkit().getImage("images/" + icon); // para Ejecución
        this.setIconImage(icono);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
