package frames;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import supporting_classes.DatabaseConnection;
import supporting_classes.UILook;

public class Course extends javax.swing.JFrame {

    int val, n;
    String enNo, facultyId, pos, name, dept, branch, sec;

    {
        UILook.changeLook(this);
    }

    public Course() {
        initComponents();
        jLabel2.setText("");
        this.setLocationRelativeTo(null);
    }

    public Course(int val, String id) {
        this();
        this.val = val;
        this.enNo = id;
    }

    public Course(int val, String id, String pos) {
        this();
        this.val = val;
        this.facultyId = id;
        this.pos = pos;
    }
    int code = 0;

    public Course(int code, String id, String name, String dept) {
        this();
        this.code = code;
        this.facultyId = id;
        this.name = name;
        this.dept = dept;
        int i = setData();
        this.n = i;
        this.val = code;
    }

    public Course(int val, String id, String name, String branch, String sec) {
        this();
        this.val = val;
        this.enNo = id;
        this.name = name;
        this.branch = branch;
        this.sec = sec;
        int i = setSData();
        this.n = i;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jtfCC1 = new javax.swing.JTextField();
        jtfCC2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jtfCC3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jtfCC4 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jtfCC6 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jtfCC5 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jtfCC7 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jtfCC8 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jtfCName5 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jtfCName6 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jtfCName7 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jtfCName3 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jButtonSubmit = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        jtfCName8 = new javax.swing.JTextField();
        jtfCName1 = new javax.swing.JTextField();
        jtfCName2 = new javax.swing.JTextField();
        jtfCName4 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        jComboBox4 = new javax.swing.JComboBox<>();
        jComboBox5 = new javax.swing.JComboBox<>();
        jComboBox6 = new javax.swing.JComboBox<>();
        jComboBox7 = new javax.swing.JComboBox<>();
        jComboBox8 = new javax.swing.JComboBox<>();

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

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 18, 54));
        jPanel1.setPreferredSize(new java.awt.Dimension(1080, 93));

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Course Preferences");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1050, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jPanel3.setBackground(new java.awt.Color(0, 18, 54));
        jPanel3.setPreferredSize(new java.awt.Dimension(1080, 36));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1080, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 36, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel3, java.awt.BorderLayout.PAGE_END);

        jPanel5.setBackground(new java.awt.Color(255, 230, 153));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Course Code  :");

        jtfCC1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jtfCC2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Course Code  :");

        jtfCC3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Course Code  :");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Course Code  :");

        jtfCC4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Course Code  :");

        jtfCC6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("Course Code  :");

        jtfCC5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("Course Code  :");

        jtfCC7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setText("Course Code  :");

        jtfCC8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setText("Course Name :");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel13.setText("Course Name :");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel14.setText("Course Name :");

        jtfCName5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel15.setText("Course Name :");

        jtfCName6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel16.setText("Course Name :");

        jtfCName7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel17.setText("Course Name :");

        jtfCName3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel18.setText("Course Name :");

        jButtonSubmit.setBackground(new java.awt.Color(255, 255, 255));
        jButtonSubmit.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonSubmit.setText("Submit");
        jButtonSubmit.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonSubmit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSubmitActionPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel19.setText("Course Name :");

        jtfCName8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jtfCName1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jtfCName2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jtfCName4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("*UPDATE");

        jComboBox1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "(T)", "(P)", "(Q)" }));

        jComboBox2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "(T)", "(P)", "(Q)" }));

        jComboBox3.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "(T)", "(P)", "(Q)" }));

        jComboBox4.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "(T)", "(P)", "(Q)" }));

        jComboBox5.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "(T)", "(P)", "(Q)" }));

        jComboBox6.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jComboBox6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "(T)", "(P)", "(Q)" }));

        jComboBox7.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jComboBox7.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "(T)", "(P)", "(Q)" }));

        jComboBox8.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jComboBox8.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "(T)", "(P)", "(Q)" }));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jtfCC8, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jtfCC7, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jtfCC6, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jtfCC5, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jtfCC4, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jtfCC2, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jtfCC1, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addGap(157, 157, 157)
                                        .addComponent(jtfCC3, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addGap(342, 342, 342)
                                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jComboBox7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jComboBox8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(57, 57, 57)
                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel5Layout.createSequentialGroup()
                                                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jtfCName8, javax.swing.GroupLayout.DEFAULT_SIZE, 259, Short.MAX_VALUE))
                                            .addGroup(jPanel5Layout.createSequentialGroup()
                                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addGap(14, 14, 14)
                                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jtfCName7)
                                                    .addComponent(jtfCName6)
                                                    .addComponent(jtfCName5)
                                                    .addComponent(jtfCName4)
                                                    .addComponent(jtfCName3)
                                                    .addComponent(jtfCName2)
                                                    .addComponent(jtfCName1))))))))))
                .addGap(60, 60, 60))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18)
                            .addComponent(jtfCName1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, 0)
                        .addComponent(jLabel11)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jtfCName2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(jtfCName3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(jtfCName4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(jtfCName5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(jtfCName6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(jtfCName7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19)
                            .addComponent(jtfCName8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jtfCC1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jtfCC2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jtfCC3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jtfCC4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jtfCC5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtfCC6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jtfCC7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jComboBox7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtfCC8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)
                            .addComponent(jComboBox8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(jButtonSubmit)
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(2, 2, 2))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel4, java.awt.BorderLayout.CENTER);

        setSize(new java.awt.Dimension(1096, 654));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSubmitActionPerformed
        // TODO add your handling code here:
        String code1 = jComboBox1.getSelectedItem().toString();
        String code2 = jComboBox2.getSelectedItem().toString();
        String code3 = jComboBox3.getSelectedItem().toString();
        String code4 = jComboBox4.getSelectedItem().toString();
        String code5 = jComboBox5.getSelectedItem().toString();
        String code6 = jComboBox6.getSelectedItem().toString();
        String code7 = jComboBox7.getSelectedItem().toString();
        String code8 = jComboBox8.getSelectedItem().toString();
        String course1 = jtfCC1.getText();
        String course2 = jtfCC2.getText();
        String course3 = jtfCC3.getText();
        String course4 = jtfCC4.getText();
        String course5 = jtfCC5.getText();
        String course6 = jtfCC6.getText();
        String course7 = jtfCC7.getText();
        String course8 = jtfCC8.getText();
        String courseCode1 = jtfCC1.getText().concat(" ").concat(code1);
        String courseCode2 = jtfCC2.getText().concat(" ").concat(code2);
        String courseCode3 = jtfCC3.getText().concat(" ").concat(code3);
        String courseCode4 = jtfCC4.getText().concat(" ").concat(code4);
        String courseCode5 = jtfCC5.getText().concat(" ").concat(code5);
        String courseCode6 = jtfCC6.getText().concat(" ").concat(code6);
        String courseCode7 = jtfCC7.getText().concat(" ").concat(code7);
        String courseCode8 = jtfCC8.getText().concat(" ").concat(code8);
        String courseName1 = jtfCName1.getText();
        String courseName2 = jtfCName2.getText();
        String courseName3 = jtfCName3.getText();
        String courseName4 = jtfCName4.getText();
        String courseName5 = jtfCName5.getText();
        String courseName6 = jtfCName6.getText();
        String courseName7 = jtfCName7.getText();
        String courseName8 = jtfCName8.getText();

        if (!course1.isEmpty()) {
            if (code1.equalsIgnoreCase(" ")) {
                jLabel2.setText("*Please Select Course Type of Course Code " + courseCode1 + "!!!!!");
                return;
            }
            if (!courseValidation(courseCode1)) {
                jLabel2.setText("* Entered Course Code " + courseCode1 + " is not valid!!!!!");
                return;
            }
        }
        if (!code1.equalsIgnoreCase(" ")) {
            if (course1.isEmpty()) {
                jLabel2.setText("*Please Enter Course Code for first Course !!!!!");

                return;
            }
        }
        if (!course2.isEmpty()) {
            if (code2.equalsIgnoreCase(" ")) {
                jLabel2.setText("*Please Select Course Type of Course Code " + courseCode2 + " !!!!!");
                return;
            }
            if (!courseValidation(courseCode2)) {
                jLabel2.setText("* Entered Course Code " + courseCode2 + " is not valid!!!!!");
                return;
            }
        }
        if (!code2.equalsIgnoreCase(" ")) {
            if (course2.isEmpty()) {
                jLabel2.setText("*Please Enter Course Code for second Course !!!!!");

                return;
            }
        }
        if (!course3.isEmpty()) {
            if (code3.equalsIgnoreCase(" ")) {
                jLabel2.setText("*Please Select Course Type of Course Code " + courseCode3 + " !!!!!");
                return;
            }
            if (!courseValidation(courseCode3)) {
                jLabel2.setText("* Entered Course Code " + courseCode3 + " is not valid!!!!!");
                return;
            }
        }
        if (!code3.equalsIgnoreCase(" ")) {
            if (course3.isEmpty()) {
                jLabel2.setText("*Please Enter Course Code for third Course !!!!!");

                return;
            }
        }
        if (!course4.isEmpty()) {
            if (code4.equalsIgnoreCase(" ")) {
                jLabel2.setText("*Please Select Course Type of Course Code " + courseCode4 + " !!!!!");
                return;
            }
            if (!courseValidation(courseCode4)) {
                jLabel2.setText("* Entered Course Code " + courseCode4 + " is not valid!!!!!");
                return;
            }
        }
        if (!code4.equalsIgnoreCase(" ")) {
            if (course4.isEmpty()) {
                jLabel2.setText("*Please Enter Course Code for fourth Course !!!!!");

                return;
            }
        }
        if (!course5.isEmpty()) {
            if (code5.equalsIgnoreCase(" ")) {
                jLabel2.setText("*Please Select Course Type of Course Code " + courseCode5 + " !!!!!");
                return;
            }
            if (!courseValidation(courseCode5)) {
                jLabel2.setText("* Entered Course Code " + courseCode5 + " is not valid!!!!!");
                return;
            }
        }
        if (!code5.equalsIgnoreCase(" ")) {
            if (course5.isEmpty()) {
                jLabel2.setText("*Please Enter Course Code for fifth Course !!!!!");

                return;
            }
        }
        if (!course6.isEmpty()) {
            if (code6.equalsIgnoreCase(" ")) {
                jLabel2.setText("*Please Select Course Type of " + courseCode6 + " !!!!!");
                return;
            }
            if (!courseValidation(courseCode6)) {
                jLabel2.setText("* Entered Course Code " + courseCode6 + " is not valid!!!!!");
                return;
            }
        }
        if (!code6.equalsIgnoreCase(" ")) {
            if (course6.isEmpty()) {
                jLabel2.setText("*Please Enter Course Code for sixth Course !!!!!");
                return;
            }
        }
        if (!course7.isEmpty()) {
            if (code7.equalsIgnoreCase(" ")) {
                jLabel2.setText("*Please Select Course Type of  " + courseCode7 + " !!!!!");
                return;
            }
            if (!courseValidation(courseCode7)) {
                jLabel2.setText("* Entered Course Code " + courseCode7 + " is not valid!!!!!");
                return;
            }
        }
        if (!code7.equalsIgnoreCase(" ")) {
            if (course7.isEmpty()) {
                jLabel2.setText("*Please Enter Course Code for seventh Course !!!!!");
                return;
            }
        }
        if (!course8.isEmpty()) {
            if (code8.equalsIgnoreCase(" ")) {
                jLabel2.setText("*Please Select Course Type of " + courseCode8 + " !!!!!");
                return;
            }
            if (!courseValidation(courseCode8)) {
                jLabel2.setText("* Entered Course Code " + courseCode8 + " is not valid!!!!!");
                return;
            }
        }
        if (!code8.equalsIgnoreCase(" ")) {
            if (course8.isEmpty()) {
                jLabel2.setText("*Please Enter Course Code for eigth Course !!!!!");
                return;
            }
        }

        switch (val) {
            case 0:
                if (course1.isEmpty() && course2.isEmpty() && course3.isEmpty() && course4.isEmpty() && course5.isEmpty()
                        && course6.isEmpty() && course7.isEmpty() && course8.isEmpty()) {
                    JOptionPane.showMessageDialog(this, "WARNING!!! You have not registered for any Course");
                } else {

                    if (!courseCode1.equals("")) {
                        insertCourse(courseCode1);
                    }

                    if (!courseCode2.equals("")) {
                        insertCourse(courseCode2);
                    }

                    if (!courseCode3.equals("")) {
                        insertCourse(courseCode3);
                    }

                    if (!courseCode4.equals("")) {
                        insertCourse(courseCode4);
                    }

                    if (!courseCode5.equals("")) {
                        insertCourse(courseCode5);
                    }

                    if (!courseCode6.equals("")) {
                        insertCourse(courseCode6);
                    }

                    if (!courseCode7.equals("")) {
                        insertCourse(courseCode7);
                    }

                    if (!courseCode8.equals("")) {
                        insertCourse(courseCode8);
                    }

                }
                JOptionPane.showMessageDialog(this, "Student Sign Up Completed Successfully");
                new HomeScreen().setVisible(true);
                dispose();
                return;

            case 1:

                if (course1.isEmpty() && course2.isEmpty() && course3.isEmpty() && course4.isEmpty() && course5.isEmpty()
                        && course6.isEmpty() && course7.isEmpty() && course8.isEmpty()) {
                    JOptionPane.showMessageDialog(this, "WARNING!!! You have not registered for any Course");
                } else if (!(pos.equalsIgnoreCase("hod") || pos.equalsIgnoreCase("Head of Department"))) {

                    if (!courseCode1.equals("")) {
                        insertData(courseCode1);
                    }

                    if (!courseCode2.equals("")) {
                        insertData(courseCode2);
                    }

                    if (!courseCode3.equals("")) {
                        insertData(courseCode3);
                    }

                    if (!courseCode4.equals("")) {
                        insertData(courseCode4);
                    }

                    if (!courseCode5.equals("")) {
                        insertData(courseCode5);
                    }

                    if (!courseCode6.equals("")) {
                        insertData(courseCode6);
                    }

                    if (!courseCode7.equals("")) {
                        insertData(courseCode7);
                    }

                    if (!courseCode8.equals("")) {
                        insertData(courseCode8);
                    }

                    JOptionPane.showMessageDialog(this, "Faculty Sign Up Completed Successfully");
                    new HomeScreen().setVisible(true);
                    dispose();
                } else {

                    if (!courseCode1.equals("")) {
                        insertDataHod(courseCode1);
                    }

                    if (!courseCode2.equals("")) {
                        insertDataHod(courseCode2);
                    }

                    if (!courseCode3.equals("")) {
                        insertDataHod(courseCode3);
                    }

                    if (!courseCode4.equals("")) {
                        insertDataHod(courseCode4);
                    }

                    if (!courseCode5.equals("")) {
                        insertDataHod(courseCode5);
                    }

                    if (!courseCode6.equals("")) {
                        insertDataHod(courseCode6);
                    }

                    if (!courseCode7.equals("")) {
                        insertDataHod(courseCode7);
                    }

                    if (!courseCode8.equals("")) {
                        insertDataHod(courseCode8);
                    }

                    JOptionPane.showMessageDialog(this, "HOD Sign Up Completed Successfully");
                    new HomeScreen().setVisible(true);
                    dispose();
                    return;
                }

            case 2:

                switch (n) {
                    case 0:
                        insertData(courseCode1);
                        break;
                    case 1:
                        insertData(courseCode2);
                        break;
                    case 2:
                        insertData(courseCode3);
                        break;
                    case 3:
                        insertData(courseCode4);
                        break;
                    case 4:
                        insertData(courseCode5);
                        break;
                    case 5:
                        insertData(courseCode6);
                        break;
                    case 6:
                        insertData(courseCode7);
                        break;
                    case 7:
                        insertData(courseCode8);
                        break;
                    default:
                        jLabel2.setText("*Maximum Course Choice Filled !!!!");
                        break;
                }
                FacultyDashboard fd = new FacultyDashboard(facultyId, name, dept);
                fd.setVisible(true);
                break;

            case 3:

                switch (n) {
                    case 0:
                        insertDataHod(courseCode1);
                        break;
                    case 1:
                        insertDataHod(courseCode2);
                        break;
                    case 2:
                        insertDataHod(courseCode3);
                        break;
                    case 3:
                        insertDataHod(courseCode4);
                        break;
                    case 4:
                        insertDataHod(courseCode5);
                        break;
                    case 5:
                        insertDataHod(courseCode6);
                        break;
                    case 6:
                        insertDataHod(courseCode7);
                        break;
                    case 7:
                        insertDataHod(courseCode8);
                        break;
                    default:
                        jLabel2.setText("*Maximum Course Choice Filled !!!!");
                        break;
                }
                HODdashboard hd = new HODdashboard(facultyId, name, dept);
                hd.setVisible(true);
                break;

            case 4:

                switch (n) {
                    case 0:
                        insertCourse(courseCode1);
                        break;
                    case 1:
                        insertCourse(courseCode2);
                        break;
                    case 2:
                        insertCourse(courseCode3);
                        break;
                    case 3:
                        insertCourse(courseCode4);
                        break;
                    case 4:
                        insertCourse(courseCode5);
                        break;
                    case 5:
                        insertCourse(courseCode6);
                        break;
                    case 6:
                        insertCourse(courseCode7);
                        break;
                    case 7:
                        insertCourse(courseCode8);
                        break;
                    default:
                        jLabel2.setText("*Maximum Course Choice Filled !!!!");
                        break;
                }
                StudentDashboard sd = new StudentDashboard(name, enNo, branch, sec);
                sd.setVisible(true);
                break;
        }
    }//GEN-LAST:event_jButtonSubmitActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        if (val == 4 || val == 2 || val == 3) {
        } else {
            new HomeScreen().setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_formWindowClosed

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
            java.util.logging.Logger.getLogger(Course.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Course.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Course.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Course.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Course().setVisible(true);
            }
        });
    }

    public boolean courseValidation(String code) {
        int i = length();
        //System.out.println(i);
        String[] str = new String[i];
        try {

            Connection con = DatabaseConnection.getConnection();
            Statement stmt = con.createStatement();
            String sql = "SELECT CourseCode FROM courses ";
            ResultSet rs = stmt.executeQuery(sql);
            int j = 0;
            while (rs.next()) {
                str[j] = rs.getString("CourseCode");
                j++;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        int k = 0;
        while (k < i) {
            if (str[k].equals(code)) {
                return true;
            }
            k++;
        }
        return false;
    }

    public int length() {
        int i = 0;
        try {

            Connection con = DatabaseConnection.getConnection();
            Statement stmt = con.createStatement();
            String sql = "SELECT CourseCode FROM courses ";
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                i = rs.getRow();
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return i;
    }

    public int setData() {
        int i = 0;
        try {
            String query = "";
            if (code == 2) {
                query = "SELECT * FROM faculty_junction JOIN courses ON courses.CourseCode = faculty_junction.CourseCode WHERE FacultyId=?";
            } else if (code == 3) {
                query = "SELECT * FROM hod_junction JOIN courses ON courses.CourseCode = hod_junction.CourseCode WHERE HodId=?";
            }
            /* else if(code == 4){
                query = "SELECT * FROM student_junction JOIN courses ON courses.CourseCode = student_junction.CourseCode WHERE EnrollmentNo=?";
                
            }*/
            Connection con = DatabaseConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, facultyId);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                String arr[] = {rs.getString("CourseCode"), rs.getString("CourseName")};
                switch (i) {
                    case 0:
                        {
                            String string = arr[0];
                            String[] str = string.split(" ");
                            int l = 0;
                            for (String temp : str) {
                                if (l == 0) {
                                    jtfCC1.setText(temp);
                                    l++;
                                } else {
                                    jComboBox1.setSelectedItem(temp);
                                }
                            }       jtfCName1.setText(arr[1]);
                            i++;
                            break;
                        }
                    case 1:
                        {
                            String code = arr[0];
                            String[] str = code.split(" ");
                            int l = 0;
                            for (String temp : str) {
                                if (l == 0) {
                                    jtfCC2.setText(temp);
                                    l++;
                                } else {
                                    jComboBox2.setSelectedItem(temp);
                                }
                            }       jtfCName2.setText(arr[1]);
                            i++;
                            break;
                        }
                    case 2:
                        {
                            String code = arr[0];
                            String[] str = code.split(" ");
                            int l = 0;
                            for (String temp : str) {
                                if (l == 0) {
                                    jtfCC3.setText(temp);
                                    l++;
                                } else {
                                    jComboBox3.setSelectedItem(temp);
                                }
                            }       jtfCName3.setText(arr[1]);
                            i++;
                            break;
                        }
                    case 3:
                        {
                            String code = arr[0];
                            String[] str = code.split(" ");
                            int l = 0;
                            for (String temp : str) {
                                if (l == 0) {
                                    jtfCC4.setText(temp);
                                    l++;
                                } else {
                                    jComboBox4.setSelectedItem(temp);
                                }
                            }       jtfCName4.setText(arr[1]);
                            i++;
                            break;
                        }
                    case 4:
                        {
                            String code = arr[0];
                            String[] str = code.split(" ");
                            int l = 0;
                            for (String temp : str) {
                                if (l == 0) {
                                    jtfCC5.setText(temp);
                                    l++;
                                } else {
                                    jComboBox5.setSelectedItem(temp);
                                }
                            }       jtfCName5.setText(arr[1]);
                            i++;
                            break;
                        }
                    case 5:
                        {
                            String code = arr[0];
                            String[] str = code.split(" ");
                            int l = 0;
                            for (String temp : str) {
                                if (l == 0) {
                                    jtfCC6.setText(temp);
                                    l++;
                                } else {
                                    jComboBox6.setSelectedItem(temp);
                                }
                            }       jtfCName6.setText(arr[1]);
                            i++;
                            break;
                        }
                    case 6:
                        {
                            String code = arr[0];
                            String[] str = code.split(" ");
                            int l = 0;
                            for (String temp : str) {
                                if (l == 0) {
                                    jtfCC7.setText(temp);
                                    l++;
                                } else {
                                    jComboBox7.setSelectedItem(temp);
                                }
                            }       jtfCName7.setText(arr[1]);
                            i++;
                            break;
                        }
                    case 7:
                        {
                            String code = arr[0];
                            String[] str = code.split(" ");
                            int l = 0;
                            for (String temp : str) {
                                if (l == 0) {
                                    jtfCC8.setText(temp);
                                    l++;
                                } else {
                                    jComboBox8.setSelectedItem(temp);
                                }
                            }       jtfCName8.setText(arr[1]);
                            i++;
                            break;
                        }
                    default:
                        break;
                }

            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return i;
    }

    public void insertData(String CourseCode) {
        try {
            Connection con = DatabaseConnection.getConnection();
            PreparedStatement st = con.prepareStatement("INSERT INTO faculty_junction VALUES(?,?)");//SQL
            st.setString(1, CourseCode);
            st.setString(2, facultyId);
            st.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();//exception name with line no
        }
    }

    public void insertDataHod(String CourseCode) {
        try {
            Connection con = DatabaseConnection.getConnection();
            PreparedStatement st = con.prepareStatement("INSERT INTO hod_junction VALUES(?,?)");//SQL
            st.setString(1, CourseCode);
            st.setString(2, facultyId);
            st.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();//exception name with line no
        }
    }

    public void insertCourse(String CourseCode) {
        try {
            Connection con = DatabaseConnection.getConnection();
            PreparedStatement st = con.prepareStatement("INSERT INTO student_junction VALUES(?,?)");//SQL
            st.setString(1, CourseCode);
            st.setString(2, enNo);
            st.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();//exception name with line no
        }
    }

    public int setSData() {
        int i = 0;
        try {
            /*String query="";
            if(code==2)
            {
                query = "SELECT * FROM faculty_junction JOIN courses ON courses.CourseCode = faculty_junction.CourseCode WHERE FacultyId=?";
            }
            else if(code == 3){
                query = "SELECT * FROM hod_junction JOIN courses ON courses.CourseCode = hod_junction.CourseCode WHERE HodId=?";
            }
           else if(code == 4){
                query = "SELECT * FROM student_junction JOIN courses ON courses.CourseCode = student_junction.CourseCode WHERE EnrollmentNo=?";
                
            }*/
            String query = "SELECT * FROM student_junction JOIN courses ON courses.CourseCode = student_junction.CourseCode WHERE EnrollmentNo=?";
            Connection con = DatabaseConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, enNo);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                String arr[] = {rs.getString("CourseCode"), rs.getString("CourseName")};
                switch (i) {
                    case 0:
                        {
                            String string = arr[0];
                            String[] str = string.split(" ");
                            int l = 0;
                            for (String temp : str) {
                                if (l == 0) {
                                    jtfCC1.setText(temp);
                                    l++;
                                } else {
                                    jComboBox1.setSelectedItem(temp);
                                }
                            }       jtfCName1.setText(arr[1]);
                            i++;
                            break;
                        }
                    case 1:
                        {
                            String code = arr[0];
                            String[] str = code.split(" ");
                            int l = 0;
                            for (String temp : str) {
                                if (l == 0) {
                                    jtfCC2.setText(temp);
                                    l++;
                                } else {
                                    jComboBox2.setSelectedItem(temp);
                                }
                            }       jtfCName2.setText(arr[1]);
                            i++;
                            break;
                        }
                    case 2:
                        {
                            String code = arr[0];
                            String[] str = code.split(" ");
                            int l = 0;
                            for (String temp : str) {
                                if (l == 0) {
                                    jtfCC3.setText(temp);
                                    l++;
                                } else {
                                    jComboBox3.setSelectedItem(temp);
                                }
                            }       jtfCName3.setText(arr[1]);
                            i++;
                            break;
                        }
                    case 3:
                        {
                            String code = arr[0];
                            String[] str = code.split(" ");
                            int l = 0;
                            for (String temp : str) {
                                if (l == 0) {
                                    jtfCC4.setText(temp);
                                    l++;
                                } else {
                                    jComboBox4.setSelectedItem(temp);
                                }
                            }       jtfCName4.setText(arr[1]);
                            i++;
                            break;
                        }
                    case 4:
                        {
                            String code = arr[0];
                            String[] str = code.split(" ");
                            int l = 0;
                            for (String temp : str) {
                                if (l == 0) {
                                    jtfCC5.setText(temp);
                                    l++;
                                } else {
                                    jComboBox5.setSelectedItem(temp);
                                }
                            }       jtfCName5.setText(arr[1]);
                            i++;
                            break;
                        }
                    case 5:
                        {
                            String code = arr[0];
                            String[] str = code.split(" ");
                            int l = 0;
                            for (String temp : str) {
                                if (l == 0) {
                                    jtfCC6.setText(temp);
                                    l++;
                                } else {
                                    jComboBox6.setSelectedItem(temp);
                                }
                            }       jtfCName6.setText(arr[1]);
                            i++;
                            break;
                        }
                    case 6:
                        {
                            String code = arr[0];
                            String[] str = code.split(" ");
                            int l = 0;
                            for (String temp : str) {
                                if (l == 0) {
                                    jtfCC7.setText(temp);
                                    l++;
                                } else {
                                    jComboBox7.setSelectedItem(temp);
                                }
                            }       jtfCName7.setText(arr[1]);
                            i++;
                            break;
                        }
                    case 7:
                        {
                            String code = arr[0];
                            String[] str = code.split(" ");
                            int l = 0;
                            for (String temp : str) {
                                if (l == 0) {
                                    jtfCC8.setText(temp);
                                    l++;
                                } else {
                                    jComboBox8.setSelectedItem(temp);
                                }
                            }       jtfCName8.setText(arr[1]);
                            i++;
                            break;
                        }
                    default:
                        break;
                }

            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return i;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonSubmit;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JComboBox<String> jComboBox6;
    private javax.swing.JComboBox<String> jComboBox7;
    private javax.swing.JComboBox<String> jComboBox8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTextField jtfCC1;
    private javax.swing.JTextField jtfCC2;
    private javax.swing.JTextField jtfCC3;
    private javax.swing.JTextField jtfCC4;
    private javax.swing.JTextField jtfCC5;
    private javax.swing.JTextField jtfCC6;
    private javax.swing.JTextField jtfCC7;
    private javax.swing.JTextField jtfCC8;
    private javax.swing.JTextField jtfCName1;
    private javax.swing.JTextField jtfCName2;
    private javax.swing.JTextField jtfCName3;
    private javax.swing.JTextField jtfCName4;
    private javax.swing.JTextField jtfCName5;
    private javax.swing.JTextField jtfCName6;
    private javax.swing.JTextField jtfCName7;
    private javax.swing.JTextField jtfCName8;
    // End of variables declaration//GEN-END:variables
}
