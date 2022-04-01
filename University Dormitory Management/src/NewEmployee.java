
import java.awt.Color;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;

public class NewEmployee extends javax.swing.JFrame {

    Employee emp = new Employee();

    public NewEmployee() {
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
        loc_father.setText("");
        loc_mother.setText("");
        loc_dateOfBirth.setDate(null);
        loc_male.setSelected(true);
        loc_email.setText("");
        loc_phone.setText("");
        loc_designation.setSelectedIndex(0);
        loc_presentAdd.setText("");
        loc_permanentAdd.setText("");

    }

    public void clearInt() {
        int_name.setText("");
        int_father.setText("");
        int_mother.setText("");
        int_dateOfBirth.setDate(null);
        int_male.setSelected(true);
        int_email.setText("");
        int_phone.setText("");
        int_designation.setSelectedIndex(0);
        int_presentAdd.setText("");
        int_permanentAdd.setText("");
        int_pass.setText("");
        country.setText("");

    }
    
    public static void showdetailsEmployees(){
        Home.showLocalEmployees.setText(Integer.toString(MyFunction.countLocalEmployees("local_employees"))); 
        Home.showIntEmployees.setText(Integer.toString(MyFunction.countInternationalEmployees("int_employees")));
    }

    public boolean validLoc() {

        String Email = loc_email.getText();
        if (loc_name.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Employee name is missing", "Warning", 2);
            return false;
        }
        if (loc_dateOfBirth.getDate() == null) {
            JOptionPane.showMessageDialog(null, "Employee Date of birth is missing", "Warning", 2);
            return false;
        }

        if (loc_dateOfBirth.getDate().compareTo(new Date()) > 0) {
            JOptionPane.showMessageDialog(null, "No Employee From The Future Are Allowed");
            return false;
        }
        if (loc_father.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Employee father name is missing", "Warning", 2);
            return false;
        }
        if (loc_mother.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Employee mother name is missing", "Warning", 2);
            return false;
        }
        if (Email.equals("") || !Email.matches("^.+@.+\\..+$")) {
            JOptionPane.showMessageDialog(null, "Invalid email address", "Warning", 2);
            return false;
        }
        if (loc_phone.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Employee phone is missing", "Warning", 2);
            return false;
        }
        if (loc_presentAdd.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "It's important to fill up present address field", "Warning", 2);
            return false;
        }

        if (loc_permanentAdd.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "It's important to fill up permanent address field", "Warning", 2);
            return false;
        }

        return true;
    }

    public boolean validInt() {

        String Email = int_email.getText();
        if (int_name.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Employee name is missing", "Warning", 2);
            return false;
        }
        if (int_dateOfBirth.getDate() == null) {
            JOptionPane.showMessageDialog(null, "Employee Date of birth is missing", "Warning", 2);
            return false;
        }

        if (int_dateOfBirth.getDate().compareTo(new Date()) > 0) {
            JOptionPane.showMessageDialog(null, "No Employee From The Future Are Allowed");
            return false;
        }
        if (int_father.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Employee father name is missing", "Warning", 2);
            return false;
        }
        if (int_mother.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Employee mother name is missing", "Warning", 2);
            return false;
        }
        if (Email.equals("") || !Email.matches("^.+@.+\\..+$")) {
            JOptionPane.showMessageDialog(null, "Invalid email address", "Warning", 2);
            return false;
        }
        if (int_phone.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Employee phone is missing", "Warning", 2);
            return false;
        }
        if (int_pass.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Employee passport number is missing", "Warning", 2);
            return false;
        }
        if (country.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Employee country name is missing", "Warning", 2);
            return false;
        }
        if (int_presentAdd.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "It's important to fill up present address field", "Warning", 2);
            return false;
        }

        if (int_permanentAdd.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "It's important to fill up permanent address field", "Warning", 2);
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

        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        loc_name = new javax.swing.JTextField();
        loc_father = new javax.swing.JTextField();
        loc_male = new javax.swing.JRadioButton();
        loc_female = new javax.swing.JRadioButton();
        loc_phone = new javax.swing.JTextField();
        loc_dateOfBirth = new com.toedter.calendar.JDateChooser();
        loc_mother = new javax.swing.JTextField();
        loc_email = new javax.swing.JTextField();
        loc_designation = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        loc_presentAdd = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        loc_permanentAdd = new javax.swing.JTextArea();
        loc_save = new javax.swing.JButton();
        loc_clear = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        int_name = new javax.swing.JTextField();
        int_father = new javax.swing.JTextField();
        int_male = new javax.swing.JRadioButton();
        int_female = new javax.swing.JRadioButton();
        int_phone = new javax.swing.JTextField();
        int_dateOfBirth = new com.toedter.calendar.JDateChooser();
        int_mother = new javax.swing.JTextField();
        int_email = new javax.swing.JTextField();
        int_designation = new javax.swing.JComboBox<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        int_presentAdd = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        int_permanentAdd = new javax.swing.JTextArea();
        int_save = new javax.swing.JButton();
        int_clear = new javax.swing.JButton();
        int_pass = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        country = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(520, 160));
        setUndecorated(true);

        jPanel2.setBackground(java.awt.SystemColor.activeCaption);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setForeground(new java.awt.Color(153, 153, 153));
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jTabbedPane1.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N

        jPanel3.setBackground(java.awt.SystemColor.activeCaption);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel5.setText("Name");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel6.setText("Father Name");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel7.setText("Gender");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel8.setText("Phone Number");

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel9.setText("Present Address");

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel10.setText("Permanent Address");

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel11.setText("Designation");

        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel12.setText("Email Address");

        jLabel13.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel13.setText("Mother Name");

        jLabel14.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel14.setText("Date Of Birth");

        loc_name.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        loc_father.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        loc_male.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        loc_male.setText("Male");

        loc_female.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        loc_female.setText("Female");

        loc_phone.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        loc_phone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                loc_phoneKeyTyped(evt);
            }
        });

        loc_dateOfBirth.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        loc_mother.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        loc_email.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        loc_designation.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        loc_designation.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Accounting", "Chef", "Electrician", "Housekeeping", "Maintenance" }));

        loc_presentAdd.setColumns(20);
        loc_presentAdd.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        loc_presentAdd.setRows(5);
        jScrollPane1.setViewportView(loc_presentAdd);

        loc_permanentAdd.setColumns(20);
        loc_permanentAdd.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        loc_permanentAdd.setRows(5);
        jScrollPane2.setViewportView(loc_permanentAdd);

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

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(loc_save, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(71, 71, 71))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(96, 96, 96)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(loc_father, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(loc_name, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                            .addComponent(loc_male, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(loc_female, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addComponent(loc_phone, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14)
                            .addComponent(loc_clear, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(45, 45, 45))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(loc_dateOfBirth, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                        .addComponent(loc_mother)
                        .addComponent(loc_email, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(loc_designation, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(loc_dateOfBirth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(loc_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14)
                            .addComponent(jLabel5))))
                .addGap(7, 7, 7)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loc_father, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(loc_mother, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel13))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(loc_male)
                            .addComponent(loc_female)
                            .addComponent(jLabel7)
                            .addComponent(jLabel12)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(loc_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loc_phone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel11)
                    .addComponent(loc_designation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel9)
                    .addComponent(jScrollPane1))
                .addGap(32, 32, 32)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loc_clear, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(loc_save, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(94, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Local Employees", jPanel3);

        jPanel5.setBackground(java.awt.SystemColor.activeCaption);

        jLabel15.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel15.setText("Name");

        jLabel16.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel16.setText("Father Name");

        jLabel17.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel17.setText("Gender");

        jLabel18.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel18.setText("Phone Number");

        jLabel19.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel19.setText("Present Address");

        jLabel20.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel20.setText("Permanent Address");

        jLabel21.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel21.setText("Designation");

        jLabel22.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel22.setText("Email Address");

        jLabel23.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel23.setText("Mother Name");

        jLabel24.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel24.setText("Date Of Birth");

        int_name.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        int_father.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        int_male.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        int_male.setText("Male");

        int_female.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        int_female.setText("Female");

        int_phone.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        int_phone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                int_phoneKeyTyped(evt);
            }
        });

        int_dateOfBirth.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        int_mother.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        int_email.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        int_designation.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        int_designation.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Accounting", "Chef", "Electrician", "Housekeeping", "Maintenance" }));

        int_presentAdd.setColumns(20);
        int_presentAdd.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        int_presentAdd.setRows(5);
        jScrollPane3.setViewportView(int_presentAdd);

        int_permanentAdd.setColumns(20);
        int_permanentAdd.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        int_permanentAdd.setRows(5);
        jScrollPane4.setViewportView(int_permanentAdd);

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

        int_pass.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        jLabel25.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel25.setText("Passport Number");

        country.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        jLabel26.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel26.setText("Country Name");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel5Layout.createSequentialGroup()
                                    .addComponent(jLabel25)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(int_pass, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel5Layout.createSequentialGroup()
                                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(96, 96, 96)
                                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(int_father, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(int_name, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                            .addComponent(int_male, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(int_female, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addComponent(int_phone, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel5Layout.createSequentialGroup()
                                    .addComponent(jLabel19)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(242, 242, 242)
                        .addComponent(int_save, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(int_clear, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel22)
                                    .addComponent(jLabel23)
                                    .addComponent(jLabel24))
                                .addGap(46, 46, 46))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel20)
                                    .addComponent(jLabel26))
                                .addGap(18, 18, 18)))
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(int_dateOfBirth, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                .addComponent(int_mother)
                                .addComponent(int_email, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(int_designation, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(country, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(31, 31, 31))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(int_dateOfBirth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(int_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel24)
                            .addComponent(jLabel15))))
                .addGap(7, 7, 7)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(int_father, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(int_mother, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16)
                    .addComponent(jLabel23))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(int_male)
                            .addComponent(int_female)
                            .addComponent(jLabel17)
                            .addComponent(jLabel22)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(int_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(int_phone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18)
                    .addComponent(jLabel21)
                    .addComponent(int_designation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(int_pass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25)
                    .addComponent(country, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20))
                .addGap(54, 54, 54)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(int_save, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(int_clear, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("International Employees", jPanel5);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTabbedPane1)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        setVisible(false);
        try{
         Home.jLabel17.setForeground(new Color(0,0,0)); 
        }catch(NullPointerException e){           
        }
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseEntered
        jLabel1.setForeground(new Color(250, 0, 0));
    }//GEN-LAST:event_jLabel1MouseEntered

    private void jLabel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseExited
        jLabel1.setForeground(new Color(153, 153, 153));
    }//GEN-LAST:event_jLabel1MouseExited
    int xx, xy;
    private void loc_phoneKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_loc_phoneKeyTyped
        if (!Character.isDigit(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_loc_phoneKeyTyped

    private void loc_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loc_saveActionPerformed

        if (validLoc()) {
            String name1 = loc_name.getText();
            String fName = loc_father.getText();
            String mName = loc_mother.getText();
            String email1 = loc_email.getText();
            String phone1 = loc_phone.getText();
            String designation1 = loc_designation.getSelectedItem().toString();
            String permanenAddress = loc_permanentAdd.getText();
            String persentAddress = loc_presentAdd.getText();
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            String date = dateFormat.format(loc_dateOfBirth.getDate());
            String gender = "male";
            String status = "Working";
            if (loc_female.isSelected()) {
                gender = "female";
            }

            if (!emp.isPhoneExistLoc(phone1)) {
                emp.EmployeeManageLoc("insert", name1, fName, mName, phone1, date, gender, designation1, email1, persentAddress, permanenAddress, status);
                showdetailsEmployees();                
                clearLoc();
            } else {
                JOptionPane.showMessageDialog(null, "This Phone Number Already Exists", "Warning", 2);
            }
        }
    }//GEN-LAST:event_loc_saveActionPerformed

    private void loc_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loc_clearActionPerformed
        clearLoc();
    }//GEN-LAST:event_loc_clearActionPerformed

    private void int_phoneKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_int_phoneKeyTyped
        if (!Character.isDigit(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_int_phoneKeyTyped

    private void int_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_int_saveActionPerformed
          if (validInt()) {
            String name1 = int_name.getText();
            String fName = int_father.getText();
            String mName = int_mother.getText();
            String email1 = int_email.getText();
            String phone1 = int_phone.getText();
            String designation1 = int_designation.getSelectedItem().toString();
            String permanenAddress = int_permanentAdd.getText();
            String persentAddress = int_presentAdd.getText();
            String passport = int_pass.getText();
            String count = country.getText();
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            String date = dateFormat.format(int_dateOfBirth.getDate());
            String gender = "male";
            String status = "Working";
            if (int_female.isSelected()) {
                gender = "female";
            }

            if (!emp.isPhoneExistInt(phone1)) {
                emp.EmployeeManageInt("insert", name1, fName, mName, phone1, date, gender, designation1, email1, persentAddress, permanenAddress, status,passport,count);
                showdetailsEmployees();
                clearInt();
            } else {
                JOptionPane.showMessageDialog(null, "This Phone Number Already Exists", "Warning", 2);
            }
        }
    }//GEN-LAST:event_int_saveActionPerformed

    private void int_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_int_clearActionPerformed
        clearInt();
    }//GEN-LAST:event_int_clearActionPerformed

    private void jPanel4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MousePressed
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_jPanel4MousePressed

    private void jPanel4MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        NewEmployee.this.setLocation(x - xx, y - xy);
    }//GEN-LAST:event_jPanel4MouseDragged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField country;
    private javax.swing.JButton int_clear;
    private com.toedter.calendar.JDateChooser int_dateOfBirth;
    private javax.swing.JComboBox<String> int_designation;
    private javax.swing.JTextField int_email;
    private javax.swing.JTextField int_father;
    private javax.swing.JRadioButton int_female;
    private javax.swing.JRadioButton int_male;
    private javax.swing.JTextField int_mother;
    private javax.swing.JTextField int_name;
    private javax.swing.JTextField int_pass;
    private javax.swing.JTextArea int_permanentAdd;
    private javax.swing.JTextField int_phone;
    private javax.swing.JTextArea int_presentAdd;
    public static javax.swing.JButton int_save;
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
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton loc_clear;
    private com.toedter.calendar.JDateChooser loc_dateOfBirth;
    private javax.swing.JComboBox<String> loc_designation;
    private javax.swing.JTextField loc_email;
    private javax.swing.JTextField loc_father;
    private javax.swing.JRadioButton loc_female;
    private javax.swing.JRadioButton loc_male;
    private javax.swing.JTextField loc_mother;
    private javax.swing.JTextField loc_name;
    private javax.swing.JTextArea loc_permanentAdd;
    private javax.swing.JTextField loc_phone;
    private javax.swing.JTextArea loc_presentAdd;
    public static javax.swing.JButton loc_save;
    // End of variables declaration//GEN-END:variables
}
