
import java.text.SimpleDateFormat;
import java.awt.Color;
import java.util.Date;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;

public class ManageEmployees extends javax.swing.JFrame {

    Employee emp = new Employee();

    public ManageEmployees() {
        initComponents();

        ButtonGroup bg1 = new ButtonGroup();
        ButtonGroup bg2 = new ButtonGroup();
        bg1.add(loc_male);
        bg1.add(loc_female);
        loc_male.setSelected(true);

        bg2.add(int_male);
        bg2.add(int_female);
        int_male.setSelected(true);

        loc_phone.setEditable(false);
        int_phone.setEditable(false);
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
        loc_status.removeAllItems();
        loc_searchField.setText("");

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
        pass.setText("");
        country.setText("");
        int_status.removeAllItems();
        int_searchField.setText("");

    }

    public void showdetailsLeavedEmployees() {
        Home.showWorkLocEmployees.setText(Integer.toString(MyFunction.countLeavedLocEmployees("local_employees")));
        Home.showWorkIntEmployees.setText(Integer.toString(MyFunction.countLeavedIntEmployees("int_employees")));
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
        if (pass.getText().equals("")) {
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
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
        loc_update = new javax.swing.JButton();
        loc_clear = new javax.swing.JButton();
        loc_delete = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        loc_searchField = new app.bolivia.swing.JCTextField();
        loc_search = new javax.swing.JButton();
        loc_status = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
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
        int_update = new javax.swing.JButton();
        int_clear = new javax.swing.JButton();
        int_delete = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();
        int_searchField = new app.bolivia.swing.JCTextField();
        int_search = new javax.swing.JButton();
        int_status = new javax.swing.JComboBox<>();
        jLabel25 = new javax.swing.JLabel();
        pass = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        country = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(520, 160));
        setUndecorated(true);

        jPanel1.setBackground(java.awt.SystemColor.activeCaption);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel2MouseDragged(evt);
            }
        });
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel2MousePressed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(153, 153, 153));
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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jTabbedPane1.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N

        jPanel3.setBackground(java.awt.SystemColor.activeCaption);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel2.setText("Name");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel4.setText("Father Name");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel5.setText("Gender");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel6.setText("Phone Number");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel7.setText("Present Address");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel8.setText("Permanent Address");

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel9.setText("Designation");

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel10.setText("Email Address");

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel11.setText("Mother Name");

        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel12.setText("Date Of Birth");

        loc_name.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        loc_father.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        loc_male.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        loc_male.setText("Male");

        loc_female.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        loc_female.setText("Female");

        loc_phone.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

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

        loc_update.setBackground(new java.awt.Color(102, 255, 102));
        loc_update.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        loc_update.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/update.png"))); // NOI18N
        loc_update.setText("Update");
        loc_update.setBorder(null);
        loc_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loc_updateActionPerformed(evt);
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

        loc_delete.setBackground(new java.awt.Color(255, 102, 102));
        loc_delete.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        loc_delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/delete.png"))); // NOI18N
        loc_delete.setText("Delete");
        loc_delete.setBorder(null);
        loc_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loc_deleteActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel13.setText("Search");

        loc_searchField.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        loc_searchField.setPlaceholder("Enter phone number");
        loc_searchField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                loc_searchFieldKeyTyped(evt);
            }
        });

        loc_search.setBackground(new java.awt.Color(0, 204, 51));
        loc_search.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        loc_search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search.png"))); // NOI18N
        loc_search.setText("Search");
        loc_search.setBorder(null);
        loc_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loc_searchActionPerformed(evt);
            }
        });

        loc_status.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        jLabel14.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel14.setText("Status");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 11, Short.MAX_VALUE))
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(loc_father)
                    .addComponent(loc_phone)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(loc_name)
                    .addComponent(loc_searchField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(loc_male, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(loc_female, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel14))
                                .addGap(18, 27, Short.MAX_VALUE)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(loc_mother)
                                    .addComponent(loc_email, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(loc_designation, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(loc_status, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(loc_search, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel12))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(loc_dateOfBirth, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(30, 30, 30))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(187, 187, 187)
                .addComponent(loc_update, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(loc_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(loc_clear, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(loc_searchField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel13))
                    .addComponent(loc_search, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(loc_name)
                    .addComponent(jLabel2)
                    .addComponent(jLabel12)
                    .addComponent(loc_dateOfBirth, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(14, 14, 14)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loc_father, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(loc_mother, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loc_male)
                    .addComponent(loc_female)
                    .addComponent(jLabel10)
                    .addComponent(loc_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(8, 8, 8)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loc_designation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(loc_phone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(loc_status, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14))
                        .addGap(15, 15, 15)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loc_clear, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(loc_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(loc_update, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(73, 73, 73))
        );

        jTabbedPane1.addTab("Local Employees", jPanel3);

        jPanel4.setBackground(java.awt.SystemColor.activeCaption);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel3.setText("Name");

        jLabel15.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel15.setText("Father Name");

        jLabel16.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel16.setText("Gender");

        jLabel17.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel17.setText("Phone Number");

        jLabel18.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel18.setText("Passport");

        jLabel19.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel19.setText("Permanent Address");

        jLabel20.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel20.setText("Designation");

        jLabel21.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel21.setText("Email Address");

        jLabel22.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel22.setText("Mother Name");

        jLabel23.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel23.setText("Date Of Birth");

        int_name.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        int_father.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        int_male.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        int_male.setText("Male");

        int_female.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        int_female.setText("Female");

        int_phone.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

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

        int_update.setBackground(new java.awt.Color(102, 255, 102));
        int_update.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        int_update.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/update.png"))); // NOI18N
        int_update.setText("Update");
        int_update.setBorder(null);
        int_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                int_updateActionPerformed(evt);
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

        int_delete.setBackground(new java.awt.Color(255, 102, 102));
        int_delete.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        int_delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/delete.png"))); // NOI18N
        int_delete.setText("Delete");
        int_delete.setBorder(null);
        int_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                int_deleteActionPerformed(evt);
            }
        });

        jLabel24.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel24.setText("Search");

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

        int_status.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        jLabel25.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel25.setText("Status");

        pass.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        jLabel26.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel26.setText("Present Address");

        country.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        jLabel27.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel27.setText("Country Name");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17)
                            .addComponent(jLabel15)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel24)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 11, Short.MAX_VALUE))
                    .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel26, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(int_update, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(int_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(int_clear, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(int_father)
                            .addComponent(int_phone)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(int_name)
                            .addComponent(int_searchField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(int_male, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(int_female, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(pass))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel22)
                                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel25)
                                            .addComponent(jLabel27)
                                            .addComponent(jLabel19))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(int_mother)
                                            .addComponent(int_email, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(int_designation, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(int_status, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(country, javax.swing.GroupLayout.Alignment.TRAILING)))
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(int_search, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel23))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(int_dateOfBirth, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(30, 30, 30))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel21)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(int_searchField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel24))
                    .addComponent(int_search, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(int_name)
                    .addComponent(jLabel3)
                    .addComponent(jLabel23)
                    .addComponent(int_dateOfBirth, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(14, 14, 14)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(int_father, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(int_mother, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(int_male)
                    .addComponent(int_female)
                    .addComponent(jLabel21)
                    .addComponent(int_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addGap(8, 8, 8)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(int_designation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(int_phone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20)
                    .addComponent(jLabel17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(int_status, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel25))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(country, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel27))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19))
                        .addContainerGap(90, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18)
                            .addComponent(pass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel26))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(int_update, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(int_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(int_clear, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36))))
        );

        jTabbedPane1.addTab("International Employees", jPanel4);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTabbedPane1)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        setVisible(false);
        try {
            Home.jLabel19.setForeground(new Color(0, 0, 0));
        } catch (NullPointerException e) {
        }
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseEntered
        jLabel1.setForeground(new Color(250, 0, 0));
    }//GEN-LAST:event_jLabel1MouseEntered

    private void jLabel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseExited
        jLabel1.setForeground(new Color(153, 153, 153));
    }//GEN-LAST:event_jLabel1MouseExited

    private void loc_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loc_updateActionPerformed
        String name1 = loc_name.getText();
        String father1 = loc_father.getText();
        String mother1 = loc_mother.getText();
        String email1 = loc_email.getText();
        String Design = loc_designation.getSelectedItem().toString();
        String status1 = (String) loc_status.getSelectedItem();
        String present = loc_presentAdd.getText();
        String permanent = loc_permanentAdd.getText();

        String gender = "male";
        if (loc_female.isSelected()) {
            gender = "female";
        }

        if (validLoc()) {
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            String date = dateFormat.format(loc_dateOfBirth.getDate());
            emp.EmployeeManageLoc("update", name1, father1, mother1, loc_phone.getText(), date, gender, Design, email1, present, permanent, status1);
            NewEmployee.showdetailsEmployees();
            showdetailsLeavedEmployees();
            clearLoc();
        }
    }//GEN-LAST:event_loc_updateActionPerformed

    private void loc_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loc_clearActionPerformed
        clearLoc();
    }//GEN-LAST:event_loc_clearActionPerformed

    private void loc_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loc_deleteActionPerformed
        if (loc_phone.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "You haven't selected any employee");
        } else {
            String Phone = loc_phone.getText();
            emp.EmployeeManageLoc("delete", null, null, null, Phone, null, null, null, null, null, null, null);
            NewEmployee.showdetailsEmployees();
            showdetailsLeavedEmployees();
            clearLoc();
        }
    }//GEN-LAST:event_loc_deleteActionPerformed

    private void loc_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loc_searchActionPerformed
        if (loc_searchField.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "You haven't entered any mobile number");
        } else {
            String moblieNumber = loc_searchField.getText();
            emp.mobileExitLoc(moblieNumber);
        }
    }//GEN-LAST:event_loc_searchActionPerformed
    int xx, xy;
    private void int_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_int_updateActionPerformed
        String name1 = int_name.getText();
        String father1 = int_father.getText();
        String mother1 = int_mother.getText();
        String email1 = int_email.getText();
        String Design = int_designation.getSelectedItem().toString();
        String status1 = (String) int_status.getSelectedItem();
        String present = int_presentAdd.getText();
        String permanent = int_permanentAdd.getText();
        String passport = pass.getText();
        String count = country.getText();

        String gender = "male";
        if (int_female.isSelected()) {
            gender = "female";
        }

        if (validInt()) {
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            String date = dateFormat.format(int_dateOfBirth.getDate());
            emp.EmployeeManageInt("update", name1, father1, mother1, int_phone.getText(), date, gender, Design, email1, present, permanent, status1, passport, count);
            NewEmployee.showdetailsEmployees();
            showdetailsLeavedEmployees();
            clearInt();
        }
    }//GEN-LAST:event_int_updateActionPerformed

    private void int_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_int_clearActionPerformed
        clearInt();
    }//GEN-LAST:event_int_clearActionPerformed

    private void int_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_int_deleteActionPerformed
        if (int_phone.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "You haven't selected any employee");
        } else {
            String Phone = int_phone.getText();
            emp.EmployeeManageInt("delete", null, null, null, Phone, null, null, null, null, null, null, null, null, null);
            NewEmployee.showdetailsEmployees();
            showdetailsLeavedEmployees();
            clearInt();
        }
    }//GEN-LAST:event_int_deleteActionPerformed

    private void int_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_int_searchActionPerformed
        if (int_searchField.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "You haven't entered any mobile number");
        } else {
            String moblieNumber = int_searchField.getText();
            emp.mobileExitInt(moblieNumber);
        }
    }//GEN-LAST:event_int_searchActionPerformed

    private void int_searchFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_int_searchFieldKeyTyped
        if (!Character.isDigit(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_int_searchFieldKeyTyped

    private void loc_searchFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_loc_searchFieldKeyTyped
        if (!Character.isDigit(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_loc_searchFieldKeyTyped

    private void jPanel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        ManageEmployees.this.setLocation(x - xx, y - xy);
    }//GEN-LAST:event_jPanel2MouseDragged

    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_jPanel2MousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTextField country;
    private javax.swing.JButton int_clear;
    public static com.toedter.calendar.JDateChooser int_dateOfBirth;
    public static javax.swing.JButton int_delete;
    public static javax.swing.JComboBox<String> int_designation;
    public static javax.swing.JTextField int_email;
    public static javax.swing.JTextField int_father;
    public static javax.swing.JRadioButton int_female;
    public static javax.swing.JRadioButton int_male;
    public static javax.swing.JTextField int_mother;
    public static javax.swing.JTextField int_name;
    public static javax.swing.JTextArea int_permanentAdd;
    public static javax.swing.JTextField int_phone;
    public static javax.swing.JTextArea int_presentAdd;
    public static javax.swing.JButton int_search;
    public static app.bolivia.swing.JCTextField int_searchField;
    public static javax.swing.JComboBox<String> int_status;
    public static javax.swing.JButton int_update;
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
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
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
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton loc_clear;
    public static com.toedter.calendar.JDateChooser loc_dateOfBirth;
    public static javax.swing.JButton loc_delete;
    public static javax.swing.JComboBox<String> loc_designation;
    public static javax.swing.JTextField loc_email;
    public static javax.swing.JTextField loc_father;
    public static javax.swing.JRadioButton loc_female;
    public static javax.swing.JRadioButton loc_male;
    public static javax.swing.JTextField loc_mother;
    public static javax.swing.JTextField loc_name;
    public static javax.swing.JTextArea loc_permanentAdd;
    public static javax.swing.JTextField loc_phone;
    public static javax.swing.JTextArea loc_presentAdd;
    public static javax.swing.JButton loc_search;
    public static app.bolivia.swing.JCTextField loc_searchField;
    public static javax.swing.JComboBox<String> loc_status;
    public static javax.swing.JButton loc_update;
    public static javax.swing.JTextField pass;
    // End of variables declaration//GEN-END:variables
}
