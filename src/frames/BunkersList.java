package frames;

import static frames.ApplicationsList.al1;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import supporting_classes.DatabaseConnection;
import supporting_classes.UILook;

public class BunkersList extends javax.swing.JFrame {

    {
        UILook.changeLook(this);
    }

    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    String query = "";
    static ArrayList<String> al1 = new ArrayList<>();
    static ArrayList<String> al2 = new ArrayList<>();

    ImageIcon img1 = new ImageIcon(getClass().getResource("/images/back.png"));
    ImageIcon img2 = new ImageIcon(getClass().getResource("/images/back2.png"));
    HODdashboard dash;
    String dept = "CS";

    public BunkersList() {
        initComponents();
        TableColumnModel cm = jTable1.getColumnModel();
        cm.getColumn(0).setMaxWidth(170);
        cm.getColumn(0).setMinWidth(170);
        cm.getColumn(2).setMaxWidth(50);
        cm.getColumn(3).setMaxWidth(80);
        cm.getColumn(4).setMaxWidth(0);
        cm.getColumn(4).setMinWidth(0);

        query = "SELECT * FROM status_table AS a \n"
                + "JOIN student_login AS b ON a.EnrollmentNo = b.EnrollmentNo \n"
                + "JOIN attendence_status AS c ON c.StatusId = a.StatusId \n "
                + "GROUP BY a.EnrollmentNo \n"
                + "HAVING SUM(CASE a.Status WHEN 'Absent' THEN 1 ELSE 0 END) >=2 "
                + "AND (Branch='"+dept+"' OR Branch='"+dept+"')"
                + "AND c.FineStatus='N/A'; " ;
        
        getTableData(query);
    }

    public BunkersList(HODdashboard dash) {
        this();
        this.dash = dash;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 18, 54));
        jPanel1.setPreferredSize(new java.awt.Dimension(1080, 93));

        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Students List");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/back.png"))); // NOI18N
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel3MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 694, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jPanel2.setBackground(new java.awt.Color(0, 18, 54));
        jPanel2.setPreferredSize(new java.awt.Dimension(1080, 36));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1080, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 36, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2, java.awt.BorderLayout.PAGE_END);

        jPanel3.setBackground(new java.awt.Color(255, 230, 153));

        jTable1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Enrolment No", "Name", "Section", "Apply Fine ", "Status Id "
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setRowHeight(20);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTable1MousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Section : ");

        jComboBox1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "(SELECT)", "A", "B", "C", "D", "E", "F", "G", "H", "I" }));
        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setText("Impose Fine");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setText("Delete Record");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1060, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 374, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap())
        );

        getContentPane().add(jPanel3, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        if (dash != null) {
            dash.setState(HODdashboard.NORMAL);
        }
        dispose();
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseEntered
        jLabel3.setIcon(img2);
    }//GEN-LAST:event_jLabel3MouseEntered

    private void jLabel3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseExited
        jLabel3.setIcon(img1);
    }//GEN-LAST:event_jLabel3MouseExited

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        if (dash != null) {
            dash.setState(HODdashboard.NORMAL);
        }
        dispose();
    }//GEN-LAST:event_formWindowClosed

    private void jTable1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MousePressed
        if (jTable1.getSelectedColumn() == 0) {
            return;
        }

        int n = jTable1.getSelectedRow();
        if (jTable1.getValueAt(n, 3) == null) {
            jTable1.setValueAt(false, n, 3);
        }
        Boolean opt = (Boolean) jTable1.getValueAt(n, 3);
        if (opt) {
            jTable1.setValueAt(false, n, 3);
        } else {
            jTable1.setValueAt(true, n, 3);
        }
    }//GEN-LAST:event_jTable1MousePressed

    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged
        comboBoxOperation();
    }//GEN-LAST:event_jComboBox1ItemStateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //option2
        validateTable(2);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        //option1
        validateTable(1);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(BunkersList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BunkersList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BunkersList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BunkersList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BunkersList().setVisible(true);
            }
        });
    }

    public void getTableData(String sql) {
        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
        dtm.getDataVector().removeAllElements();
        dtm.fireTableDataChanged();
        int rows = 0;
        try {
            con = DatabaseConnection.getConnection();
            ps = con.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                Object data[] = {rs.getString("EnrollmentNo"),
                    rs.getString("Name"), rs.getString("Section"),
                    false,rs.getString("StatusId")};
                dtm.addRow(data);
                rows++;
            }
            con.close();
            int h = jTable1.getHeight();
            for (int i = 0; i < h; i += 20) {
                Object[] extrarow = {"","","",false,""};
                dtm.addRow(extrarow);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void comboBoxOperation() {
        String section = (String) jComboBox1.getSelectedItem();
        if (section.equals("(SELECT)")) {
            query = "SELECT * FROM status_table AS a \n"
                + "JOIN student_login AS b ON a.EnrollmentNo = b.EnrollmentNo \n"
                + "JOIN attendence_status AS c ON c.StatusId = a.StatusId \n "
                + "GROUP BY a.EnrollmentNo \n"
                + "HAVING SUM(CASE a.Status WHEN 'Absent' THEN 1 ELSE 0 END) >=2 "
                + "AND (Branch='"+dept+"' OR Branch='"+dept+"')"
                + "AND c.FineStatus='N/A'; " ;
            getTableData(query);
        } else {
            query = "SELECT * FROM status_table AS a \n"
                + "JOIN student_login AS b ON a.EnrollmentNo = b.EnrollmentNo \n"
                + "JOIN attendence_status AS c ON c.StatusId = a.StatusId \n"
                + "GROUP BY a.EnrollmentNo \n"
                + "HAVING SUM(CASE a.Status WHEN 'Absent' THEN 1 ELSE 0 END) >=2 "
                + "AND (Branch='"+dept+"' OR Branch='"+dept+"') AND Section='"+section+"' "
                + "AND c.FineStatus='N/A';";
            getTableData(query);
        }
    }
    
    public void validateTable(int option) 
    {
        int i, flag = 0;

        for (i = 0; i < jTable1.getRowCount(); i++) {
            boolean check = (Boolean) jTable1.getValueAt(i,3);
            if (check == true) {
                flag = 0;
                break;
            } else {
                flag = 1;
            }
        }

        if (flag == 1) {
            
            JOptionPane.showMessageDialog(this, "Please select atleast one candidate");
            return;
        }

        for (i = 0; i < jTable1.getRowCount(); i++) {
            String entry = (String) jTable1.getValueAt(i, 4);
            boolean check = (Boolean) jTable1.getValueAt(i, 3);
            if (check == true) {
                if (option == 1) {
                    if (!entry.equals("")) 
                    {
                        al1.add(entry);
                    }
                } else if (option == 2) {
                    if (!entry.equals("")) {
                        al2.add(entry);
                    }
                }
            }
        }
      
        try {
            int size = 1;
            con = DatabaseConnection.getConnection();
            String queries;
            String lNo;
            for (int j = 0; j < size; j++) {
                if (option == 1) {
                    lNo = al1.get(j);
                    size = al1.size();
                   queries = "update attendence_status "
                            + "set FineStatus='No Fine' "
                            + "where StatusId=?";
                } else {
                    lNo = al2.get(j);
                    size = al2.size();
                    queries = "update attendence_status "
                            + "set FineStatus='Fine Applied' "
                            + "where StatusId=?";
                }

                ps = con.prepareStatement(queries);
                ps.setString(1, lNo);
                ps.executeUpdate();
            }
            con.close();
            al1.clear();
            al2.clear();
            comboBoxOperation();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
