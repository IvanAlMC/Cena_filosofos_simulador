/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package views;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import java.awt.*;

/**
 * @author criis
 */
public class Reports extends javax.swing.JDialog {

    private int quantity;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnReporteTotalComida;
    private javax.swing.JButton btnMayorvsMenor;
    private javax.swing.JLabel labelTittle;
    private javax.swing.JPanel jPanel1;

    /**
     * Creates new form Reports
     */
    public Reports(java.awt.Frame parent, boolean modal, int quantity) {
        super(parent, modal);
        this.quantity = quantity;
        this.setLocationRelativeTo(parent);
        initComponents();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Reports.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Reports.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Reports.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Reports.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Reports dialog = new Reports(new javax.swing.JFrame(), true, 10);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelTittle = new javax.swing.JLabel();
        btnReporteTotalComida = new javax.swing.JButton();
        btnMayorvsMenor = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        labelTittle.setText("Reportes");

        btnReporteTotalComida.setText("Reporte Total Comida");
        btnReporteTotalComida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnMayorvsMenor.setText("Mayor VS Menor");
        btnMayorvsMenor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        Border bordejpanel = new TitledBorder(new EtchedBorder(), "Graficas");
        jPanel1.setBorder(bordejpanel
        );
        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 677, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 330, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(122, 122, 122)
                                .addComponent(btnReporteTotalComida)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnMayorvsMenor)
                                .addGap(135, 135, 135))
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(333, 333, 333)
                                                .addComponent(labelTittle))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(21, 21, 21)
                                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(32, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(labelTittle)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnReporteTotalComida)
                                        .addComponent(btnMayorvsMenor))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        DefaultCategoryDataset barChartData = new DefaultCategoryDataset();
//        barChartData.setValue(20000, "ContributionAmount","JANUARY");
//                barChartData.setValue(15000, "ContributionAmount","FEBRUARY");
//        barChartData.setValue(30000, "ContributionAmount","MARCH");
        for (int i = 0; i < quantity; i++) {
            barChartData.setValue(ControlGUI.filoCount[i], "Eaten", (i + 1) + "");
        }


        JFreeChart barChartDatas = ChartFactory.createBarChart("Veces que cada  filosofo ha comido", "# filosofo", "Veces que comio", barChartData, PlotOrientation.VERTICAL, false, true, false);
        CategoryPlot barchart = barChartDatas.getCategoryPlot();
        barchart.setRangeGridlinePaint(Color.ORANGE);

        ChartPanel barPanel = new ChartPanel(barChartDatas);
        jPanel1.setLayout(new BorderLayout());
        jPanel1.removeAll();
        jPanel1.add(barPanel, BorderLayout.CENTER);
        jPanel1.validate();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        DefaultCategoryDataset barChartData = new DefaultCategoryDataset();
        int mayor, menor;
        mayor = menor = ControlGUI.filoCount[0];

        for (int i = 0; i < quantity; i++) {
            if (ControlGUI.filoCount[i] > mayor) {
                mayor = ControlGUI.filoCount[i];
            }
            if (ControlGUI.filoCount[i] < menor) {
                menor = ControlGUI.filoCount[i];
            }
        }
        System.out.println("veces que mas comio " + mayor);
        System.out.println("veces que mneos comio " + menor);
        barChartData.setValue(mayor, "Eaten", "Mayor");
        barChartData.setValue(menor, "Eaten", "Menor");

        /*for (int i = 0; i < quantity; i++) {
            System.out.println(ControlGUI.filoCount[i] + " - " + (i + 1));
            barChartData.setValue(ControlGUI.filoCount[i], "Eaten", (i + 1) + "");
        }*/


        JFreeChart barChartDatas = ChartFactory.createBarChart3D("Mas comelon vs menos comelon", "", "Veces que comio", barChartData, PlotOrientation.VERTICAL, false, false, false);
        CategoryPlot barchart = barChartDatas.getCategoryPlot();
        barchart.setRangeGridlinePaint(Color.ORANGE);
        ChartPanel barPanel = new ChartPanel(barChartDatas);
        jPanel1.setLayout(new BorderLayout());
        jPanel1.removeAll();
        jPanel1.add(barPanel, BorderLayout.CENTER);
        jPanel1.validate();
    }//GEN-LAST:event_jButton2ActionPerformed
    // End of variables declaration//GEN-END:variables
}
