/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package single.queue.simulator;

import java.text.DecimalFormat;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

/**
 *
 * @author Syifa Laili
 */
public class singlequeuesimulator extends javax.swing.JFrame {

    /**
     * Creates new form singlequeuesimulator
     */
    public singlequeuesimulator() {
        initComponents();
        setcolumn();
        setparagraph();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    public void setcolumn(){ 
        TableColumn column;
        ArrivalTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF); 
        column = ArrivalTable.getColumnModel().getColumn(0); 
        column.setPreferredWidth(30);
        column = ArrivalTable.getColumnModel().getColumn(1); 
        column.setPreferredWidth(50); 
        column = ArrivalTable.getColumnModel().getColumn(2); 
        column.setPreferredWidth(90); 
        column = ArrivalTable.getColumnModel().getColumn(3); 
        column.setPreferredWidth(125);
        column = ArrivalTable.getColumnModel().getColumn(4); 
        column.setPreferredWidth(110);
    }
    
    public void setparagraph(){
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment( SwingConstants.CENTER );
        ArrivalTable.getColumnModel().getColumn(0).setCellRenderer( centerRenderer );
        ArrivalTable.getColumnModel().getColumn(1).setCellRenderer( centerRenderer );
        ArrivalTable.getColumnModel().getColumn(2).setCellRenderer( centerRenderer );              
        ArrivalTable.getColumnModel().getColumn(3).setCellRenderer( centerRenderer );
        ArrivalTable.getColumnModel().getColumn(4).setCellRenderer( centerRenderer );
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        ArrivalTable = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        timeMaximum = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        averageNumberCustomer = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        averageTimeCustomer = new javax.swing.JLabel();
        Enter = new javax.swing.JButton();
        Reset = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Single Queue Single Server Systems Simulator");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                exitapp(evt);
            }
        });

        jScrollPane1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        ArrivalTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No.", "Arrival", "Time of Arrival", "Wait until Next Arrival", "Length of Service"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        ArrivalTable.setGridColor(new java.awt.Color(102, 255, 255));
        jScrollPane1.setViewportView(ArrivalTable);

        jPanel1.setBackground(new java.awt.Color(0, 0, 153));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Single Queue Single Server Systems Simulator");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("To simulate single queue with single server systems ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Operation's Time (In Minute)");

        timeMaximum.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        timeMaximum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timeMaximumActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Average Number of Customers");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("in The Systems");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("max. 1000 minutes");

        averageNumberCustomer.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("Average Time of Customers");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setText("in The Systems");

        averageTimeCustomer.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        Enter.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Enter.setText("Enter");
        Enter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnterActionPerformed(evt);
            }
        });

        Reset.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Reset.setText("Reset");
        Reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(timeMaximum, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                            .addComponent(averageNumberCustomer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(averageTimeCustomer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(24, 24, 24))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Enter)
                .addGap(40, 40, 40)
                .addComponent(Reset)
                .addGap(301, 301, 301))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Reset)
                            .addComponent(Enter)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(timeMaximum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(averageNumberCustomer, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(averageTimeCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void timeMaximumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timeMaximumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_timeMaximumActionPerformed

    private void EnterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnterActionPerformed
        // TODO add your handling code here:
        double tmax = Integer.valueOf(timeMaximum.getText());
        if(tmax <= 1000){
            DefaultTableModel table = (DefaultTableModel) ArrivalTable.getModel();
            table.getDataVector().removeAllElements();
            revalidate();
            double TN = 0 ; //TN = Integral waktu dari N
            int N = 0; //N = Jumlah pelanggan dalam sistem saat ini
            int K = 0; //K = Total jumlah kedatangan selama simulasi
            int T = 0; //T = Waktu saat ini
            int Tk = 0; // Tk = Index waktu kedatangan
       
            int[] Ta = new int[1000]; //Waktu kedatangan
            int[] Ts = new int[1000]; //Waktu pelayanan
            int[] Tw = new int[1000]; //Waktu menunggu sampai kedatangan selanjutnya
        
            Random random = new Random();
            DecimalFormat decimal = new DecimalFormat("#.##");
        
            for (int i=0; i<1000; i++){
                Ta[i] = random.nextInt(10)+2;
                Ts[i] = random.nextInt(10)+2;
            }
        
            while (Ta[Tk]<tmax){ //ke Next event
                if(Ta[Tk] != Ts[Tk]){ //ke Arrival
                    TN = TN + (Ta[Tk]-T)*N;
                    T = Ta[Tk];
                    N++;
                    K++;
                    Ta[Tk + 1] = T + random.nextInt(9)+1;
                
                    if (N==1){
                        Ts [Tk +1] = T + random.nextInt(9)+1;    
                    }
                }
                Tw [Tk] = Ta [Tk +1] - Ta [Tk];
                Tk++;
            }
        
            for (int i=0; i<Tk; i++){
                table.addRow(new Object[]{i + 1, i + 1, Ta[i], Tw[i], Ts[i]});
            }
        
            String avgnumber = String.valueOf(decimal.format(TN/T));
            String avgtime = String.valueOf(decimal.format(Math.floor((TN/K)*100)/100));
            averageNumberCustomer.setText(avgnumber);
            averageTimeCustomer.setText(avgtime);
        }
        else {
            JOptionPane.showMessageDialog(null, "Operational time more than 1000 minutes!","Alert Message", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_EnterActionPerformed

    private void ResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetActionPerformed
        // TODO add your handling code here:
        DefaultTableModel table = (DefaultTableModel) ArrivalTable.getModel();
        timeMaximum.setText("");
        averageNumberCustomer.setText("");
        averageTimeCustomer.setText("");
        table.getDataVector().removeAllElements();
        revalidate();
    }//GEN-LAST:event_ResetActionPerformed

    private void exitapp(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_exitapp
        // TODO add your handling code here:
        int confirm = JOptionPane.showConfirmDialog(this, "Are you sure want to exit?", "Exit Confirmation",
                      JOptionPane.YES_NO_OPTION,
                      JOptionPane.QUESTION_MESSAGE);

        if (confirm == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_exitapp

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
            java.util.logging.Logger.getLogger(singlequeuesimulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(singlequeuesimulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(singlequeuesimulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(singlequeuesimulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new singlequeuesimulator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable ArrivalTable;
    private javax.swing.JButton Enter;
    private javax.swing.JButton Reset;
    private javax.swing.JLabel averageNumberCustomer;
    private javax.swing.JLabel averageTimeCustomer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField timeMaximum;
    // End of variables declaration//GEN-END:variables
}
