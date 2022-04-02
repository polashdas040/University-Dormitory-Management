package universitydormitorymanagement;


import java.awt.Color;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;

public class NewStudent extends javax.swing.JFrame {

    /**
     * Creates new form Test
     */
    Student s = new Student();

    public NewStudent() {
        initComponents();
        ButtonGroup bg1 = new ButtonGroup();
        ButtonGroup bg2 = new ButtonGroup();
        bg1.add(loc_male);
        bg1.add(loc_female);
        loc_male.setSelected(true);

        bg2.add(int_male);
        bg2.add(int_female);
        int_male.setSelected(true);
    }

    public void clearLoc() {
        loc_name.setText("");
        loc_fName.setText("");
        loc_mName.setText("");
        loc_date.setDate(null);
        loc_male.setSelected(true);
        loc_email.setText("");
        loc_phone.setText("");
        loc_dpro.setSelectedIndex(0);
        loc_uni.setText("");
        loc_uId.setText("");
        loc_add.setText("");
        loc_roomNumber.removeAllItems();

    }

    public void clearInt() {
        int_name.setText("");
        int_fName.setText("");
        int_mName.setText("");
        int_date.setDate(null);
        int_male.setSelected(true);
        int_email.setText("");
        int_phone.setText("");
        int_dpro.setSelectedIndex(0);
        int_uni.setText("");
        int_uId.setText("");
        int_add.setText("");
        int_pass.setText("");
        country.setText("");
        int_roomNumber.removeAllItems();

    }

    public void getroom() {
        int i = 0;
        try {
            Connection con = MyConnection.getConnection();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM room where room_status = 'Not Booked' and active = 'YES'");
            while (rs.next()) {
                i = 1;

                loc_roomNumber.addItem(rs.getString(2));
                int_roomNumber.addItem(rs.getString(2));

            }
            if (i == 0) {
                JOptionPane.showMessageDialog(this, "All rooms are already booked.");
                setVisible(false);
                try {
                    Home.jLabel7.setForeground(new Color(0, 0, 0));
                } catch (NullPointerException e) {
                }
            }

        } catch (SQLException ex) {
            Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public boolean validLoc() {

        String Email = loc_email.getText();
        if (loc_name.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Student name is missing", "Warning", 2);
            return false;
        }
        if (loc_date.getDate() == null) {
            JOptionPane.showMessageDialog(null, "Student Date of birth is missing", "Warning", 2);
            return false;
        }

        if (loc_date.getDate().compareTo(new Date()) > 0) {
            JOptionPane.showMessageDialog(null, "No Student From The Future Are Allowed");
            return false;
        }
        if (loc_fName.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Student father name is missing", "Warning", 2);
            return false;
        }
        if (loc_mName.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Student mother name is missing", "Warning", 2);
            return false;
        }
        if (Email.equals("") || !Email.matches("^.+@.+\\..+$")) {
            JOptionPane.showMessageDialog(null, "Invalid email address", "Warning", 2);
            return false;
        }
        if (loc_phone.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Student phone is missing", "Warning", 2);
            return false;
        }
        if (loc_uni.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Student University name is missing", "Warning", 2);
            return false;
        }

        if (loc_uId.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Student University Id is missing", "Warning", 2);
            return false;
        }
        if (loc_add.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "It's important to fill up address field", "Warning", 2);
            return false;
        }

        return true;
    }

    public boolean validInt() {

        String Email = int_email.getText();
        if (int_name.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Student name is missing", "Warning", 2);
            return false;
        }
        if (int_date.getDate() == null) {
            JOptionPane.showMessageDialog(null, "Student Date of birth is missing", "Warning", 2);
            return false;
        }

        if (int_date.getDate().compareTo(new Date()) > 0) {
            JOptionPane.showMessageDialog(null, "No Student From The Future Are Allowed");
            return false;
        }
        if (int_fName.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Student father name is missing", "Warning", 2);
            return false;
        }
        if (int_mName.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Student mother name is missing", "Warning", 2);
            return false;
        }
        if (Email.equals("") || !Email.matches("^.+@.+\\..+$")) {
            JOptionPane.showMessageDialog(null, "Invalid email address", "Warning", 2);
            return false;
        }
        if (int_phone.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Student phone is missing", "Warning", 2);
            return false;
        }
        if (int_uni.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Student University name is missing", "Warning", 2);
            return false;
        }

        if (int_uId.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Student University Id is missing", "Warning", 2);
            return false;
        }
        if (country.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Country name is missing", "Warning", 2);
            return false;
        }
        if (int_pass.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Passport Number is missing", "Warning", 2);
            return false;
        }
        if (int_add.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "It's important to fill up address field", "Warning", 2);
            return false;
        }

        return true;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        loc_name = new javax.swing.JTextField();
        loc_fName = new javax.swing.JTextField();
        loc_male = new javax.swing.JRadioButton();
        loc_female = new javax.swing.JRadioButton();
        loc_phone = new javax.swing.JTextField();
        loc_uni = new javax.swing.JTextField();
        loc_roomNumber = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        loc_date = new com.toedter.calendar.JDateChooser();
        loc_mName = new javax.swing.JTextField();
        loc_email = new javax.swing.JTextField();
        loc_dpro = new javax.swing.JComboBox<>();
        loc_uId = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        loc_add = new javax.swing.JTextArea();
        jLabel38 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        loc_save = new javax.swing.JButton();
        loc_clear = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        int_name = new javax.swing.JTextField();
        int_fName = new javax.swing.JTextField();
        int_male = new javax.swing.JRadioButton();
        int_female = new javax.swing.JRadioButton();
        int_phone = new javax.swing.JTextField();
        int_uni = new javax.swing.JTextField();
        int_roomNumber = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        int_date = new com.toedter.calendar.JDateChooser();
        int_mName = new javax.swing.JTextField();
        int_email = new javax.swing.JTextField();
        int_dpro = new javax.swing.JComboBox<>();
        int_uId = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        int_add = new javax.swing.JTextArea();
        jLabel26 = new javax.swing.JLabel();
        country = new javax.swing.JTextField();
        int_pass = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        int_save = new javax.swing.JButton();
        int_clear = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(520, 160));
        setUndecorated(true);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jPanel1.setBackground(java.awt.SystemColor.activeCaption);
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel1MouseDragged(evt);
            }
        });
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
        });

        jTabbedPane1.setBackground(java.awt.SystemColor.activeCaption);
        jTabbedPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTabbedPane1.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N

        jPanel6.setBackground(java.awt.SystemColor.activeCaption);

        jPanel7.setBackground(java.awt.SystemColor.activeCaption);

        loc_name.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        loc_fName.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        loc_male.setText("Male");

        loc_female.setText("Female");

        loc_phone.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        loc_phone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                loc_phoneKeyTyped(evt);
            }
        });

        loc_uni.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        loc_roomNumber.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        jLabel13.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel13.setText("Name");

        jLabel24.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel24.setText("Father Name");

        jLabel28.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel28.setText("Gender");

        jLabel31.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel31.setText("Phone Number");

        jLabel32.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel32.setText("University Name");

        loc_date.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        loc_mName.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        loc_email.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        loc_dpro.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        loc_dpro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bachelor Programs", "Master Programs", "Doctoral Programs" }));

        loc_uId.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        jLabel34.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel34.setText("Date Of Birth");

        jLabel35.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel35.setText("Mother Name");

        jLabel36.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel36.setText("Email");

        jLabel37.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel37.setText("Address");

        loc_add.setColumns(20);
        loc_add.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        loc_add.setRows(5);
        jScrollPane3.setViewportView(loc_add);

        jLabel38.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel38.setText("University ID");

        jLabel40.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel40.setText("Degree Programs");

        jLabel41.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel41.setText("Room Number");

        loc_save.setBackground(new java.awt.Color(0, 204, 51));
        loc_save.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        loc_save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/save.png"))); // NOI18N
        loc_save.setText("Save");
        loc_save.setBorder(null);
        loc_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loc_saveActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel24)
                            .addComponent(jLabel31)
                            .addComponent(jLabel32)
                            .addComponent(jLabel28)
                            .addComponent(jLabel13)
                            .addComponent(jLabel41))
                        .addGap(4, 4, 4))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel40)))
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(loc_roomNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(loc_dpro, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(loc_save, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(loc_clear, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(loc_fName)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel7Layout.createSequentialGroup()
                                .addComponent(loc_male, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(loc_female))
                            .addComponent(loc_phone, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
                            .addComponent(loc_uni)
                            .addComponent(loc_name, javax.swing.GroupLayout.Alignment.LEADING))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel34, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel38)
                                .addComponent(jLabel36, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(jLabel35)
                            .addComponent(jLabel37))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
                    .addComponent(loc_uId, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(loc_email, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(loc_mName)
                    .addComponent(loc_date, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(38, 38, 38))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(loc_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel13)
                        .addComponent(jLabel34))
                    .addComponent(loc_date, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(loc_mName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel35))
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(loc_fName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel24)))
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(loc_male)
                                    .addComponent(loc_female)))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(jLabel28)))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(loc_phone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel31))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(loc_uni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel32))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(loc_dpro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel40))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(loc_roomNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel41))
                        .addGap(36, 36, 36)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(loc_save, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(loc_clear, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(loc_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel36))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(loc_uId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel38))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel37))))
                .addGap(42, 42, 42))
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 801, Short.MAX_VALUE)
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 394, Short.MAX_VALUE)
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Local Students", jPanel6);

        jPanel3.setBackground(java.awt.SystemColor.activeCaption);

        jPanel5.setBackground(java.awt.SystemColor.activeCaption);

        int_name.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        int_fName.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        int_male.setText("Male");

        int_female.setText("Female");

        int_phone.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        int_phone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                int_phoneKeyTyped(evt);
            }
        });

        int_uni.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        int_roomNumber.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel12.setText("Name");

        jLabel16.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel16.setText("Father Name");

        jLabel17.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel17.setText("Gender");

        jLabel18.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel18.setText("Phone Number");

        jLabel19.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel19.setText("University Name");

        jLabel20.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel20.setText("Passport Number");

        int_date.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        int_mName.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        int_email.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        int_dpro.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        int_dpro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bachelor Programs", "Master Programs", "Doctoral Programs" }));

        int_uId.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        jLabel21.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel21.setText("Date Of Birth");

        jLabel22.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel22.setText("Mother Name");

        jLabel23.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel23.setText("Email");

        jLabel25.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel25.setText("Address");

        int_add.setColumns(20);
        int_add.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        int_add.setRows(5);
        jScrollPane2.setViewportView(int_add);

        jLabel26.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel26.setText("University ID");

        country.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        int_pass.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        jLabel27.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel27.setText("Country");

        jLabel29.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel29.setText("Degree Programs");

        jLabel30.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel30.setText("Room Number");

        int_save.setBackground(new java.awt.Color(0, 204, 51));
        int_save.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        int_save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/save.png"))); // NOI18N
        int_save.setText("Save");
        int_save.setBorder(null);
        int_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                int_saveActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addComponent(jLabel18)
                            .addComponent(jLabel19)
                            .addComponent(jLabel17)
                            .addComponent(jLabel12)
                            .addComponent(jLabel30))
                        .addGap(4, 4, 4))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel29, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel20, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(int_roomNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(int_dpro, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(int_save, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(int_clear, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(int_fName)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                                .addComponent(int_male, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(int_female))
                            .addComponent(int_phone, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
                            .addComponent(int_uni)
                            .addComponent(int_pass)
                            .addComponent(int_name, javax.swing.GroupLayout.Alignment.LEADING))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel26)
                                .addComponent(jLabel23, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                                    .addGap(3, 3, 3)
                                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel25)
                                        .addComponent(jLabel27))))
                            .addComponent(jLabel22))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
                    .addComponent(int_uId, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(int_email, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(int_mName)
                    .addComponent(country)
                    .addComponent(int_date, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(38, 38, 38))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(int_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel12)
                        .addComponent(jLabel21))
                    .addComponent(int_date, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(int_mName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel22))
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(int_fName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel16)))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(int_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel23))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(int_uId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel26))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(country, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel27))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel25)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(int_male)
                                    .addComponent(int_female)))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(jLabel17)))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(int_phone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(int_uni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(int_pass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel20))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(int_dpro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel29))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(int_roomNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel30))))
                .addGap(21, 21, 21)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(int_save, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(int_clear, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 801, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 394, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("International Students", jPanel3);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 153));
        jLabel1.setText("X");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel1MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
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
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        setVisible(false);
        try {
            Home.jLabel7.setForeground(new Color(0, 0, 0));
        } catch (NullPointerException e) {
        }
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseEntered
        jLabel1.setForeground(new Color(250, 0, 0));
    }//GEN-LAST:event_jLabel1MouseEntered

    private void jLabel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseExited
        jLabel1.setForeground(new Color(153, 153, 153));
    }//GEN-LAST:event_jLabel1MouseExited
    int xx, xy;

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        NewStudent.this.setLocation(x - xx, y - xy);
    }//GEN-LAST:event_jPanel1MouseDragged

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_jPanel1MousePressed

    private void int_phoneKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_int_phoneKeyTyped
        if (!Character.isDigit(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_int_phoneKeyTyped

    private void int_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_int_saveActionPerformed

        if (validInt()) {
            String name1 = int_name.getText();
            String fName1 = int_fName.getText();
            String mName1 = int_mName.getText();
            String Email = int_email.getText();
            String phone1 = int_phone.getText();
            String programs = int_dpro.getSelectedItem().toString();
            String uni1 = int_uni.getText();
            String uid = int_uId.getText();
            String room = int_roomNumber.getSelectedItem().toString();
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            String Date = dateFormat.format(int_date.getDate());
            String add = int_add.getText();
            String country1 = country.getText();
            String passport = int_pass.getText();
            String gender = "male";
            if (int_female.isSelected()) {
                gender = "female";
            }
            String status = "Living";

            if (!s.isPhoneExist(phone1)) {

                s.IntStuManage("insert", name1, fName1, mName1, Email, phone1, programs, uni1, uid, room, Date, gender, status, add, passport, country1);
                showdetailsStudents();
                LoginForm.showdetails();
                clearInt();
                getroom();
            } else {
                JOptionPane.showMessageDialog(null, "This Phone Number Already Exists", "Warning", 2);
            }
        }
    }//GEN-LAST:event_int_saveActionPerformed

    public static void showdetailsStudents() {
        Home.showLocalStudents.setText(Integer.toString(MyFunction.countLocalStudents("local_students")));
        Home.showInternationalStudents.setText(Integer.toString(MyFunction.countInternationalStudents("int_students")));
    }

    private void int_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_int_clearActionPerformed
        clearInt();
    }//GEN-LAST:event_int_clearActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        getroom();
    }//GEN-LAST:event_formComponentShown

    private void loc_phoneKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_loc_phoneKeyTyped
        if (!Character.isDigit(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_loc_phoneKeyTyped

    private void loc_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loc_saveActionPerformed
        if (validLoc()) {
            String name1 = loc_name.getText();
            String fName1 = loc_fName.getText();
            String mName1 = loc_mName.getText();
            String Email = loc_email.getText();
            String phone1 = loc_phone.getText();
            String programs = loc_dpro.getSelectedItem().toString();
            String uni1 = loc_uni.getText();
            String uid = loc_uId.getText();
            String room = loc_roomNumber.getSelectedItem().toString();
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            String Date = dateFormat.format(loc_date.getDate());
            String add = loc_add.getText();
            String gender = "male";
            if (loc_female.isSelected()) {
                gender = "female";
            }
            String status = "Living";

            if (!s.isPhoneExist(phone1)) {

                s.LocalStuManage("insert", name1, fName1, mName1, Email, phone1, programs, uni1, uid, room, Date, gender, status, add);
                showdetailsStudents();
                LoginForm.showdetails();
                clearLoc();
                getroom();
            } else {
                JOptionPane.showMessageDialog(null, "This Phone Number Already Exists", "Warning", 2);
            }
        }
    }//GEN-LAST:event_loc_saveActionPerformed

    private void loc_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loc_clearActionPerformed
        clearLoc();
    }//GEN-LAST:event_loc_clearActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTextField country;
    public static javax.swing.JTextArea int_add;
    private javax.swing.JButton int_clear;
    private com.toedter.calendar.JDateChooser int_date;
    private javax.swing.JComboBox<String> int_dpro;
    private javax.swing.JTextField int_email;
    private javax.swing.JTextField int_fName;
    private javax.swing.JRadioButton int_female;
    private javax.swing.JTextField int_mName;
    private javax.swing.JRadioButton int_male;
    public static javax.swing.JTextField int_name;
    public static javax.swing.JTextField int_pass;
    private javax.swing.JTextField int_phone;
    public static javax.swing.JComboBox<String> int_roomNumber;
    public static javax.swing.JButton int_save;
    private javax.swing.JTextField int_uId;
    private javax.swing.JTextField int_uni;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    public static javax.swing.JTextArea loc_add;
    private javax.swing.JButton loc_clear;
    private com.toedter.calendar.JDateChooser loc_date;
    private javax.swing.JComboBox<String> loc_dpro;
    private javax.swing.JTextField loc_email;
    private javax.swing.JTextField loc_fName;
    private javax.swing.JRadioButton loc_female;
    private javax.swing.JTextField loc_mName;
    private javax.swing.JRadioButton loc_male;
    public static javax.swing.JTextField loc_name;
    private javax.swing.JTextField loc_phone;
    public static javax.swing.JComboBox<String> loc_roomNumber;
    public static javax.swing.JButton loc_save;
    private javax.swing.JTextField loc_uId;
    private javax.swing.JTextField loc_uni;
    // End of variables declaration//GEN-END:variables
}
