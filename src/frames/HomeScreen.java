package frames;

import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import supporting_classes.DatabaseConnection;
import supporting_classes.UILook;

public class HomeScreen extends javax.swing.JFrame {

    {
        UILook.changeLook(this);
    }

    public HomeScreen() {
        initComponents();
        jLabel11.setText("");
    }

    @SuppressWarnings("unchecked")

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPasswordField1 = new javax.swing.JPasswordField();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 153, 255));
        setResizable(false);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 204, 255));
        jPanel1.setForeground(new java.awt.Color(153, 153, 255));
        jPanel1.setOpaque(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jRadioButton1.setText("Student");
        jRadioButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jRadioButton1.setOpaque(false);
        jRadioButton1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jRadioButton1StateChanged(evt);
            }
        });
        jPanel1.add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 270, 80, -1));

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jRadioButton2.setText("Faculty");
        jRadioButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jRadioButton2.setOpaque(false);
        jRadioButton2.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jRadioButton2StateChanged(evt);
            }
        });
        jPanel1.add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 270, 80, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Password  :");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 350, -1, 30));

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 310, 240, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Login Id    :");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 310, 80, 30));

        jButton1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jButton1.setText("SIGN IN");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 410, 90, -1));

        jPasswordField1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 350, 240, 30));

        jButton2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jButton2.setText("SIGN UP");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 410, 90, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Universitylogo.png"))); // NOI18N
        jLabel6.setOpaque(true);
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 150, -1, 100));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/FacultyLogo.png"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(234, 150, 100, 100));
        jLabel8.setVisible(false);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/studentlogo.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(234, 150, 100, 100));
        jLabel7.setVisible(false);

        jLabel4.setFont(new java.awt.Font("AR JULIAN", 0, 34)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 255));
        jLabel4.setText(" WELCOME TO UNIVERSITY");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, 460, 70));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(204, 0, 0));
        jLabel11.setText("* Validation Text");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 390, 230, -1));

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 0, 560, 460));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("About us");
        jLabel10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel10MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel10MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel10MousePressed(evt);
            }
        });
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 70, 20));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Change Password ");
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel9MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel9MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel9MousePressed(evt);
            }
        });
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 10, 130, 20));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/HomeBack.jpg"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 500));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 502, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    static String id;
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        try {
            if (jRadioButton1.isSelected() || jRadioButton2.isSelected()) {
                jLabel11.setText("");
                String text1 = jTextField1.getText();
                String text2 = jPasswordField1.getText();
                if (text1.equals("") || text2.equals("")) {
                    jLabel11.setText("* userid or password is required");
                    return;
                }
                Connection con;
                con = DatabaseConnection.getConnection();

                if (jRadioButton1.isSelected()) {
                    PreparedStatement ps = con.prepareStatement("SELECT Name,Branch,Section,EnrollmentNo,User_id,Password,Branch"
                            + " FROM student_login"
                            + " WHERE EnrollmentNo=? OR User_id=?");

                    ps.setString(1, text1);
                    ps.setString(2, text1);
                    ResultSet rs = ps.executeQuery();
                    int xx = 0;
                    while (rs.next()) {
                        xx = 1;
                        String name = rs.getString("Name");
                        String branch = rs.getString("Branch");
                        String section = rs.getString("Section");
                        String enrollmentNo = rs.getString("EnrollmentNo");
                        String userId = rs.getString("User_id");
                        String password = rs.getString("Password");

                        if ((text1.equals(userId) || text1.equals(enrollmentNo)) & text2.equals(password)) {
//                            System.out.println("Student");
//                            JOptionPane.showMessageDialog(this, "Student Dashboard is under development");
                            new StudentDashboard(name, enrollmentNo, branch, section).setVisible(true);
                            dispose();
                        }
                        else {
//                            jLabel11.setText("* invalid userid or password");
                            xx=0;
                        }
                    }

                    if (xx == 0) {
                        jLabel11.setText("* invalid userid or password");
                    }
                } else if (jRadioButton2.isSelected()) {
                    int xx = 0;
                    PreparedStatement ps1 = con.prepareStatement("SELECT Name,FacultyId,UserId,Password,Department"
                            + " FROM faculty_login"
                            + " WHERE FacultyId=? OR UserId=?");

                    PreparedStatement ps2 = con.prepareStatement("SELECT Name,HodId,UserId,Password,Department"
                            + " FROM hod_login"
                            + " WHERE HodId=? OR UserId=?");

                    ps1.setString(1, text1);
                    ps1.setString(2, text1);
                    ps2.setString(1, text1);
                    ps2.setString(2, text1);

                    ResultSet rs1 = ps1.executeQuery();
                    ResultSet rs2 = ps2.executeQuery();
                    int flag = 0;
                    while (rs1.next()) {
                        xx = 1;
                        flag++;
                        String facultyId = rs1.getString("FacultyId");
                        String facultyUserId = rs1.getString("UserId");
                        String fPassword = rs1.getString("Password");
                        String dept1 = rs1.getString("Department");
                        String name = rs1.getString("Name");

                        if ((text1.equals(facultyId) || text1.equals(facultyUserId)) & text2.equals(fPassword)) {
                            //Faculty Dashboard
//                            System.out.println("Faculty");
//                            JOptionPane.showMessageDialog(this, "Faculty Dashboard is under development");
                            new FacultyDashboard(facultyId, name, dept1).setVisible(true);
                            dispose();
                        } else {
                            jLabel11.setText("* invalid userid or password");
                        }
                    }

                    while (rs2.next()) {
                        xx = 1;
                        flag++;
                        String hodId = rs2.getString("HodId");
                        String hodUserId = rs2.getString("UserId");
                        String hPassword = rs2.getString("Password");
                        String dept2 = rs2.getString("Department");
                        String name = rs2.getString("Name");

                        if ((text1.equals(hodId) || text1.equals(hodUserId)) & text2.equals(hPassword)) {

                            new HODdashboard(hodId, name, dept2).setVisible(true);
                            dispose();
                        } else {
                            jLabel11.setText("* invalid userid or password");
                        }
                    }

                    if (flag == 0) {
                        jLabel11.setText("* invalid userid or password");
                    }
                    if (xx == 0) {
                        jLabel11.setText("* invalid userid or password");
                    }

                }
                con.close();

            } else {
                jLabel11.setText("* Please select any one category");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Some error occured try again");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        if(!(jRadioButton1.isSelected() || jRadioButton2.isSelected())){
            jLabel11.setText("* Please select any one category");
            return;
        }
        
        if (jRadioButton1.isSelected()) {
            new StudentSignUp().setVisible(true);
            dispose();
        }
        else{
            new FacultySignUp().setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jRadioButton1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jRadioButton1StateChanged
        if (jRadioButton1.isSelected()) {
            jLabel8.setVisible(false);
            jLabel6.setVisible(false);
            jLabel7.setVisible(true);
            jButton2.setVisible(true);
        }
    }//GEN-LAST:event_jRadioButton1StateChanged

    private void jLabel10MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseEntered
        jLabel10.setForeground(entered);
    }//GEN-LAST:event_jLabel10MouseEntered

    private void jLabel10MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseExited
        jLabel10.setForeground(exited);
    }//GEN-LAST:event_jLabel10MouseExited

    private void jLabel9MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseEntered
        jLabel9.setForeground(entered);
    }//GEN-LAST:event_jLabel9MouseEntered

    private void jLabel9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseExited
        jLabel9.setForeground(exited);
    }//GEN-LAST:event_jLabel9MouseExited

    private void jRadioButton2StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jRadioButton2StateChanged
        if (jRadioButton2.isSelected()) {
            jLabel7.setVisible(false);
            jLabel6.setVisible(false);
            jLabel8.setVisible(true);
        }
    }//GEN-LAST:event_jRadioButton2StateChanged

    private void jLabel9MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MousePressed
        new PasswordChange().setVisible(true);
    }//GEN-LAST:event_jLabel9MousePressed

    private void jLabel10MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MousePressed
        new AboutUs().setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel10MousePressed

    ImageIcon img3 = new ImageIcon(getClass().getResource("/images/invisible eye.png"));
    ImageIcon img4 = new ImageIcon(getClass().getResource("/images/eye.png"));
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomeScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new HomeScreen().setVisible(true);
            }
        });
    }

    Color entered = new Color(255, 51, 51);
    Color exited = new Color(0, 0, 0);
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
