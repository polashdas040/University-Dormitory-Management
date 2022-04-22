package universitydormitorymanagement;


import java.awt.Color;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class StudentsFees extends javax.swing.JFrame {

    StuFees studentfees = new StuFees();
    DefaultTableModel model;

    public StudentsFees() {
        initComponents();

        visibleLoc();
        visibleInt();

    }

    public void visibleLoc() {
        model = (DefaultTableModel) loc_jTable1.getModel();
        loc_jTable1.setRowHeight(30);
        loc_jTable1.setShowGrid(true);
        loc_jTable1.setGridColor(Color.black);
        loc_jTable1.setBackground(Color.white);
        loc_jTable1.setSelectionBackground(Color.gray);

        loc_name.setEditable(false);
        loc_phone.setEditable(false);
        loc_program.setEditable(false);
        loc_roomNumber.setEditable(false);
        loc_month.setEditable(false);
        loc_dorFees.setEditable(false);
        loc_email.setEditable(false);
        loc_uni.setEditable(false);
    }

    public void visibleInt() {
        model = (DefaultTableModel) int_jTable1.getModel();
        int_jTable1.setRowHeight(30);
        int_jTable1.setShowGrid(true);
        int_jTable1.setGridColor(Color.black);
        int_jTable1.setBackground(Color.white);
        int_jTable1.setSelectionBackground(Color.gray);
        
        int_name.setEditable(false);
        int_phone.setEditable(false);
        int_dorFees.setEditable(false);
        int_roomNumber.setEditable(false);
        int_program.setEditable(false);
        int_month.setEditable(false);
        int_email.setEditable(false);
        int_pass.setEditable(false);
    }

    public void clearLoc() {
        loc_name.setText("");
        loc_phone.setText("");
        loc_email.setText("");
        loc_roomNumber.setText("");
        loc_dorFees.setText("");
        loc_month.setText("");
        loc_searchField.setText("");
        loc_program.setText("");
        loc_uni.setText("");
        loc_payment.setEnabled(true);
        DefaultTableModel table = (DefaultTableModel) loc_jTable1.getModel();
        table.setRowCount(0);
    }

    public void clearInt() {
        int_name.setText("");
        int_phone.setText("");
        int_email.setText("");
        int_roomNumber.setText("");
        int_dorFees.setText("");
        int_program.setText("");
        int_searchField.setText("");
        int_month.setText("");
        int_pass.setText("");
        int_payment.setEnabled(true);
        DefaultTableModel table = (DefaultTableModel) int_jTable1.getModel();
        table.setRowCount(0);
    }

    public void getTableDetailsLoc() {
        String pnone1 = loc_phone.getText();
        studentfees.getTableLoc(pnone1, loc_jTable1);

    }

    public void getTableDetailsInt() {
        String pnone1 = int_phone.getText();
        studentfees.getTableInt(pnone1, int_jTable1);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        loc_payment = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        loc_jTable1 = new javax.swing.JTable();
        loc_name = new javax.swing.JTextField();
        loc_month = new javax.swing.JTextField();
        loc_program = new javax.swing.JTextField();
        loc_uni = new javax.swing.JTextField();
        loc_phone = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        loc_clear = new javax.swing.JButton();
        loc_dorFees = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        loc_searchField = new app.bolivia.swing.JCTextField();
        loc__search = new javax.swing.JButton();
        loc_email = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        loc_roomNumber = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        int_payment = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        int_jTable1 = new javax.swing.JTable();
        int_name = new javax.swing.JTextField();
        int_program = new javax.swing.JTextField();
        int_dorFees = new javax.swing.JTextField();
        int_pass = new javax.swing.JTextField();
        int_phone = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        int_clear = new javax.swing.JButton();
        int_month = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        int_searchField = new app.bolivia.swing.JCTextField();
        int_search = new javax.swing.JButton();
        int_email = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        int_roomNumber = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(520, 160));
        setUndecorated(true);

        jPanel1.setBackground(java.awt.SystemColor.activeCaption);

        jTabbedPane1.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N

        jPanel2.setBackground(java.awt.SystemColor.activeCaption);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel3.setText("Name");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Email Address");

        loc_payment.setBackground(new java.awt.Color(0, 204, 51));
        loc_payment.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        loc_payment.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/save.png"))); // NOI18N
        loc_payment.setText("Payment");
        loc_payment.setBorder(null);
        loc_payment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loc_paymentActionPerformed(evt);
            }
        });

        loc_jTable1.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        loc_jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Payment Month", "Dormitory Fees", "Payment Date"
            }
        ));
        jScrollPane1.setViewportView(loc_jTable1);

        loc_name.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        loc_month.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        loc_program.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        loc_uni.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        loc_phone.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel5.setText("Phone Number");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel6.setText("Payment Month");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel7.setText("Room Number");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel8.setText("Dormitory Fees");

        loc_clear.setBackground(new java.awt.Color(204, 204, 255));
        loc_clear.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        loc_clear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/clear.png"))); // NOI18N
        loc_clear.setText("Clear");
        loc_clear.setBorder(null);
        loc_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loc_clearActionPerformed(evt);
            }
        });

        loc_dorFees.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel12.setText("Search");

        loc_searchField.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        loc_searchField.setPlaceholder("Enter phone number");
        loc_searchField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                loc_searchFieldKeyTyped(evt);
            }
        });

        loc__search.setBackground(new java.awt.Color(0, 204, 51));
        loc__search.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        loc__search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search.png"))); // NOI18N
        loc__search.setText("Search");
        loc__search.setBorder(null);
        loc__search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loc__searchActionPerformed(evt);
            }
        });

        loc_email.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel9.setText("Degree Programs");

        loc_roomNumber.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel10.setText("University ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addGap(22, 22, 22))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel3)))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel10)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(loc_name, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(loc_phone, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(loc_uni, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(loc_searchField, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(loc_roomNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel6)
                                                .addComponent(jLabel8))
                                            .addComponent(jLabel4))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(loc_month, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(loc_program, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(loc_dorFees, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(loc_email, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(loc__search, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(30, 30, 30))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(loc_payment, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(loc_clear, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loc_searchField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(loc__search, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loc_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(loc_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loc_phone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(loc_program, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(loc_month, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(loc_dorFees)
                            .addComponent(jLabel8)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(loc_uni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(loc_roomNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loc_payment, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(loc_clear, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Local Students", jPanel2);

        jPanel3.setBackground(java.awt.SystemColor.activeCaption);

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel11.setText("Name");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("Email Address");

        int_payment.setBackground(new java.awt.Color(0, 204, 51));
        int_payment.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        int_payment.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/save.png"))); // NOI18N
        int_payment.setText("Payment");
        int_payment.setBorder(null);
        int_payment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                int_paymentActionPerformed(evt);
            }
        });

        int_jTable1.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        int_jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Payment Month", "Dormitory Fees", "Payment Date"
            }
        ));
        jScrollPane2.setViewportView(int_jTable1);

        int_name.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        int_program.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        int_dorFees.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        int_pass.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        int_phone.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        jLabel14.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel14.setText("Phone Number");

        jLabel15.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel15.setText("Payment Month");

        jLabel16.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel16.setText("Passport");

        jLabel17.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel17.setText("Dormitory Fees");

        int_clear.setBackground(new java.awt.Color(204, 204, 255));
        int_clear.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        int_clear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/clear.png"))); // NOI18N
        int_clear.setText("Clear");
        int_clear.setBorder(null);
        int_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                int_clearActionPerformed(evt);
            }
        });

        int_month.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        jLabel18.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel18.setText("Search");

        int_searchField.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        int_searchField.setPlaceholder("Enter phone number");
        int_searchField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                int_searchFieldKeyTyped(evt);
            }
        });

        int_search.setBackground(new java.awt.Color(0, 204, 51));
        int_search.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        int_search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search.png"))); // NOI18N
        int_search.setText("Search");
        int_search.setBorder(null);
        int_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                int_searchActionPerformed(evt);
            }
        });

        int_email.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        jLabel19.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel19.setText("Degree Programs");

        int_roomNumber.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        jLabel20.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel20.setText("Room Number");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane2)
                        .addGap(22, 22, 22))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel18)
                                    .addComponent(jLabel11)))
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel16)
                                    .addComponent(jLabel20))))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(int_name, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(int_phone, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(int_pass, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(int_searchField, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(int_roomNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel15)
                                            .addComponent(jLabel19)
                                            .addComponent(jLabel17)
                                            .addComponent(jLabel13))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(int_program, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(int_dorFees, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(int_month, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(int_email, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(int_search, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(30, 30, 30))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(int_payment, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(int_clear, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(int_searchField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18)
                    .addComponent(int_search, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(int_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(int_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(int_phone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(int_program, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(int_pass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(int_month, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(int_dorFees, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17)
                    .addComponent(int_roomNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(int_payment, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(int_clear, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67))
        );

        jTabbedPane1.addTab("International Students", jPanel3);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel4MouseDragged(evt);
            }
        });
        jPanel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel4MousePressed(evt);
            }
        });

        jLabel21.setBackground(new java.awt.Color(255, 255, 255));
        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(153, 153, 153));
        jLabel21.setText("X");
        jLabel21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel21MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel21MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel21MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel21)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel21, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 534, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loc_paymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loc_paymentActionPerformed
        String phone1 = loc_phone.getText();
        if (phone1.equals("")) {
            JOptionPane.showMessageDialog(null, "Missing Data", "Warning", 2);
        } else {

            String month1 = loc_month.getText();
            String fees = loc_dorFees.getText();
            Date date = new Date();
            SimpleDateFormat df = new SimpleDateFormat("EEEE, dd/MM-yyyy");
            String paymentDay = (df.format(date));

            studentfees.feesManageLoc("insert", phone1, month1, fees, paymentDay);
            getTableDetailsLoc();
            loc_payment.setEnabled(false);
        }
    }//GEN-LAST:event_loc_paymentActionPerformed

    private void loc_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loc_clearActionPerformed
        clearLoc();
    }//GEN-LAST:event_loc_clearActionPerformed

    private void loc__searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loc__searchActionPerformed
        String phone1 = loc_phone.getText();
        if (loc_searchField.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "You haven't entered any mobile number");
        } else {
            String moblieNumber = loc_searchField.getText();
            studentfees.mobileExitLoc(moblieNumber);
        }
        getTableDetailsLoc();
    }//GEN-LAST:event_loc__searchActionPerformed

    private void int_paymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_int_paymentActionPerformed
        String phone1 = int_phone.getText();
        if (phone1.equals("")) {
            JOptionPane.showMessageDialog(null, "Missing Data", "Warning", 2);
        } else {

            String month1 = int_month.getText();
            String fees = int_dorFees.getText();
            Date date = new Date();
            SimpleDateFormat df = new SimpleDateFormat("EEEE, dd/MM-yyyy");
            String paymentDay = (df.format(date));

            studentfees.feesManageInt("insert", phone1, month1, fees, paymentDay);
            getTableDetailsInt();
            loc_payment.setEnabled(false);
        }
    }//GEN-LAST:event_int_paymentActionPerformed

    private void int_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_int_clearActionPerformed
        clearInt();
    }//GEN-LAST:event_int_clearActionPerformed

    private void int_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_int_searchActionPerformed
        String phone1 = int_phone.getText();
        if (int_searchField.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "You haven't entered any mobile number");
        } else {
            String moblieNumber = int_searchField.getText();
            studentfees.mobileExitInt(moblieNumber);
        }
        getTableDetailsInt();
    }//GEN-LAST:event_int_searchActionPerformed

    private void jLabel21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel21MouseClicked
        setVisible(false);
        try{
         Home.jLabel11.setForeground(new Color(0,0,0)); 
        }catch(NullPointerException e){           
        }
    }//GEN-LAST:event_jLabel21MouseClicked

    private void jLabel21MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel21MouseEntered
        jLabel21.setForeground(new Color(250, 0, 0));
    }//GEN-LAST:event_jLabel21MouseEntered

    private void jLabel21MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel21MouseExited
        jLabel21.setForeground(new Color(153, 153, 153));
    }//GEN-LAST:event_jLabel21MouseExited

    private void loc_searchFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_loc_searchFieldKeyTyped
         if (!Character.isDigit(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_loc_searchFieldKeyTyped

    private void int_searchFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_int_searchFieldKeyTyped
         if (!Character.isDigit(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_int_searchFieldKeyTyped

    int xx,xy; 
    private void jPanel4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MousePressed
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_jPanel4MousePressed

    private void jPanel4MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        StudentsFees.this.setLocation(x - xx, y - xy);
    }//GEN-LAST:event_jPanel4MouseDragged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton int_clear;
    public static javax.swing.JTextField int_dorFees;
    public static javax.swing.JTextField int_email;
    public static javax.swing.JTable int_jTable1;
    public static javax.swing.JTextField int_month;
    public static javax.swing.JTextField int_name;
    public static javax.swing.JTextField int_pass;
    public static javax.swing.JButton int_payment;
    public static javax.swing.JTextField int_phone;
    public static javax.swing.JTextField int_program;
    public static javax.swing.JTextField int_roomNumber;
    public static javax.swing.JButton int_search;
    public static app.bolivia.swing.JCTextField int_searchField;
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
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    public static javax.swing.JButton loc__search;
    private javax.swing.JButton loc_clear;
    public static javax.swing.JTextField loc_dorFees;
    public static javax.swing.JTextField loc_email;
    public static javax.swing.JTable loc_jTable1;
    public static javax.swing.JTextField loc_month;
    public static javax.swing.JTextField loc_name;
    public static javax.swing.JButton loc_payment;
    public static javax.swing.JTextField loc_phone;
    public static javax.swing.JTextField loc_program;
    public static javax.swing.JTextField loc_roomNumber;
    public static app.bolivia.swing.JCTextField loc_searchField;
    public static javax.swing.JTextField loc_uni;
    // End of variables declaration//GEN-END:variables
}
