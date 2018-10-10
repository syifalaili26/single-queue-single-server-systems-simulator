/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package single.queue.simulator;

import java.awt.Color;
import java.text.DecimalFormat;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;

/**
 *
 * @author Syifa Laili
 */
public class singlequeuesimulator extends javax.swing.JFrame {

    /**
     * Creates new form singlequeuesimulator
     */
    int Tmax, I;
    public singlequeuesimulator() {
        initComponents();
        setcolumn();
        setparagraph();
        setlayout();
        setheader();
                
        this.I = 10;
        this.Tmax = 50;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    public void setcolumn(){ 
        TableColumn column;
        ArrivalTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        ClockTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
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
        
        column = ClockTable.getColumnModel().getColumn(0); 
        column.setPreferredWidth(125);
        column = ClockTable.getColumnModel().getColumn(1); 
        column.setPreferredWidth(125); 
        column = ClockTable.getColumnModel().getColumn(2); 
        column.setPreferredWidth(125); 
    }
    
    public void setparagraph(){
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment( SwingConstants.CENTER );
        ArrivalTable.getColumnModel().getColumn(0).setCellRenderer( centerRenderer );
        ArrivalTable.getColumnModel().getColumn(1).setCellRenderer( centerRenderer );
        ArrivalTable.getColumnModel().getColumn(2).setCellRenderer( centerRenderer );              
        ArrivalTable.getColumnModel().getColumn(3).setCellRenderer( centerRenderer );
        ArrivalTable.getColumnModel().getColumn(4).setCellRenderer( centerRenderer );
        
        ClockTable.getColumnModel().getColumn(0).setCellRenderer( centerRenderer );
        ClockTable.getColumnModel().getColumn(1).setCellRenderer( centerRenderer );
        ClockTable.getColumnModel().getColumn(2).setCellRenderer( centerRenderer );              
    }
    
    public void setlayout(){
        ArrivalTable.setSelectionBackground(Color.CYAN);
        ArrivalTable.setSelectionForeground(Color.RED);
        ArrivalTable.setRowSelectionAllowed(true);
        ArrivalTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
        ClockTable.setSelectionBackground(Color.CYAN);
        ClockTable.setSelectionForeground(Color.RED);
        ClockTable.setRowSelectionAllowed(true);
        ClockTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    }
    
    public void setheader(){
        // Mendekorasi table header
        JTableHeader headerarrival = ArrivalTable.getTableHeader();
        JTableHeader headerclock = ClockTable.getTableHeader();
        ((DefaultTableCellRenderer) headerarrival.getDefaultRenderer()).setHorizontalAlignment(JLabel.CENTER);
        ((DefaultTableCellRenderer) headerclock.getDefaultRenderer()).setHorizontalAlignment(JLabel.CENTER);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        ArrivalTable = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        averageNumberCustomer = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        averageTimeCustomer = new javax.swing.JLabel();
        Enter = new javax.swing.JButton();
        Reset = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        ClockTable = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

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
                false, false, false, false, false
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

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Average Number of Customers");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("in The Systems");

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

        jScrollPane2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        ClockTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Time", "Event", "No. in Systems"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        ClockTable.setGridColor(new java.awt.Color(102, 255, 255));
        jScrollPane2.setViewportView(ClockTable);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Arrival Table");

        jLabel6.setText("Clock Table");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(200, 200, 200)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(209, 209, 209))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(286, 286, 286)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel8)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(Enter)
                                .addComponent(jLabel7)))
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(averageNumberCustomer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(averageTimeCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(473, 473, 473)
                        .addComponent(Reset)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5))
                    .addComponent(averageNumberCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8)
                    .addComponent(averageTimeCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Enter)
                    .addComponent(Reset))
                .addContainerGap(63, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EnterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnterActionPerformed
        // TODO add your handling code here:
        DefaultTableModel arrival = (DefaultTableModel) ArrivalTable.getModel();
        DefaultTableModel clock = (DefaultTableModel) ClockTable.getModel();
        DecimalFormat decimal = new DecimalFormat("#.##");
        singlequeuesimulator simulator = new singlequeuesimulator();
        int indexB = 1; //Pelanggan mulai dilayani
        int indexC = 1; //Pelanggan selesai dilayani
        int indexT = 1; //Kedatangan pelanggan
        int indexS = 0; //Service time ke berapa
        int remain = 99; //Banyak waktu sebelum complete
        int[] a = new int[simulator.Tmax]; //Biner kapan ada kedatangan atau tidak
        int q = 0; //Banyak customer dalam sistem
        int work = 1; //Banyaknya server
        
        int Tw [] = new int[simulator.I];// {6,3,6,1,9,2,3,9,4,4};
        int Ts [] = new int[] {3, 5, 6, 4, 7, 3, 6, 7, 2, 6}; //waktu pelayanan customer
        int Ta [] = new int[] {4, 10, 13, 19, 20, 29, 31, 34, 43, 47, 51}; //waktu kedatangan customer berikutnya

        for (int i=0; i<simulator.I; i++){
            Tw[i] = Ta[i+1] - Ta[i];
            arrival.addRow(new Object[]{i + 1, i + 1, Ta[i], Tw[i], Ts[i]});
        }
        
        for(int i = 0; i < simulator.Tmax; i++){
            a[i] = 0;
        }
        for(int i = 0; i < simulator.I; i++){
            a[Ta[i]] = 1;
        }
        
        int[] n = new int[58];
        for(int i = 0; i < simulator.Tmax; i++){
            if(a[i] == 1){
                q++;
                clock.addRow(new Object[]{i, "t"+indexT, q});
                indexT++;
            }
            if(remain == 0){
                work = 1;
                q--;
                clock.addRow(new Object[]{i, "c"+indexC, q});
                indexC++;
            }
            if(work == 1 && q!=0){
                clock.addRow(new Object[]{i, "b"+indexB, q});
                work = 0;
                remain = Ts[indexS];
                indexB++;
                indexS++;
            }
            remain--;
            n[i] = q;
        }
        int j = 50;
        while(q != 0){
            if(remain == 0){
                work = 1;
                q--;
                clock.addRow(new Object[]{j, "c"+indexC, q});
                indexC++;
            }
            if(work == 1 && q!=0){
                clock.addRow(new Object[]{j, "b"+indexB, q});
                work = 0;
                remain = Ts[indexS];
                indexB++;
                indexS++;
            }
            remain--;
            j++;
            n[j] = q;
        }

        int sigmaN = 0;
        for(int i = 0; i < 58; i++){
            sigmaN = sigmaN + n[i];
        }
        double nbar = (double)sigmaN/(double)56;
        double wbar = (double)sigmaN/(double)10;
        String avgnumber = String.valueOf(decimal.format(nbar));
        String avgtime = String.valueOf(decimal.format(wbar));
        averageNumberCustomer.setText(avgnumber);
        averageTimeCustomer.setText(avgtime);
    }//GEN-LAST:event_EnterActionPerformed

    private void ResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetActionPerformed
        // TODO add your handling code here:
        DefaultTableModel arrival = (DefaultTableModel) ArrivalTable.getModel();
        DefaultTableModel clock = (DefaultTableModel) ClockTable.getModel();
        averageNumberCustomer.setText("");
        averageTimeCustomer.setText("");
        arrival.setRowCount(0);
        clock.setRowCount(0);
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
    private javax.swing.JTable ClockTable;
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
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
