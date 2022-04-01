
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.sql.Statement;

public class Employee {

    public void EmployeeManageLoc(String op, String name, String fname, String mname, String phone, String dateOfBirth, String gender, String designation, String email, String presentAdd, String PermanentAdd, String status) {

        Connection con = MyConnection.getConnection();
        PreparedStatement ps;

        if (op == "insert") {
            String sql = "INSERT INTO local_employees (employee_name,father,mother,phone,date_of_birth, gender, designation, email, present_address, permanent_address,status) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
            try {
                ps = con.prepareStatement(sql);
                ps.setString(1, name);
                ps.setString(2, fname);
                ps.setString(3, mname);
                ps.setString(4, phone);
                ps.setString(5, dateOfBirth);
                ps.setString(6, gender);
                ps.setString(7, designation);
                ps.setString(8, email);
                ps.setString(9, presentAdd);
                ps.setString(10, PermanentAdd);
                ps.setString(11, status);

                if (ps.executeUpdate() > 0) {
                    JOptionPane.showMessageDialog(null, "New Employee Added Successfully");
                }
            } catch (SQLException ex) {
                Logger.getLogger(Employee.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        if (op == "update") {

            try {
                con = MyConnection.getConnection();
                Statement st = con.createStatement();

                String sql = "update local_employees set employee_name=?, father=?, mother=?,date_of_birth=?,gender=?,designation=?,email=?,present_address=?, permanent_address=?,status=? where phone=?";

                ps = con.prepareStatement(sql);
                ps.setString(1, name);
                ps.setString(2, fname);
                ps.setString(3, mname);
                ps.setString(4, dateOfBirth);
                ps.setString(5, gender);
                ps.setString(6, designation);
                ps.setString(7, email);
                ps.setString(8, presentAdd);
                ps.setString(9, PermanentAdd); 
                ps.setString(10, status);  
                ps.setString(11, phone);

                if (ps.executeUpdate() > 0) {
                    JOptionPane.showMessageDialog(null, "Updated Successfully");

                }

            } catch (SQLException ex) {
                Logger.getLogger(Employee.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

         if (op == "delete") {
            int YesOrNo = JOptionPane.showConfirmDialog(null, "Details of Employee Salary will also be deleted", "Delete Employee", JOptionPane.OK_CANCEL_OPTION, 0);
            if (YesOrNo == JOptionPane.OK_OPTION) {
                try {
                   Statement st = con.createStatement();
                    ps = con.prepareStatement("delete from local_employees where phone=?");
                 
                     ps.setString(1, phone);
                    if (ps.executeUpdate() > 0) {
                        JOptionPane.showMessageDialog(null, "Employee Deleted");
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(Employee.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        }
    }
    
        public void EmployeeManageInt(String op, String name, String fname, String mname, String phone, String dateOfBirth, String gender, String designation, String email, String presentAdd, String PermanentAdd, String status,String passport,String country) {

        Connection con = MyConnection.getConnection();
        PreparedStatement ps;

        if (op == "insert") {
            String sql = "INSERT INTO int_employees (employee_name,father,mother,phone,date_of_birth, gender, designation, email, present_address, permanent_address,status,passport,country) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)";
            try {
                ps = con.prepareStatement(sql);
                ps.setString(1, name);
                ps.setString(2, fname);
                ps.setString(3, mname);
                ps.setString(4, phone);
                ps.setString(5, dateOfBirth);
                ps.setString(6, gender);
                ps.setString(7, designation);
                ps.setString(8, email);
                ps.setString(9, presentAdd);
                ps.setString(10, PermanentAdd);
                ps.setString(11, status);
                ps.setString(12, passport);
                ps.setString(13, country);

                if (ps.executeUpdate() > 0) {
                    JOptionPane.showMessageDialog(null, "New Employee Added Successfully");
                }
            } catch (SQLException ex) {
                Logger.getLogger(Employee.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        if (op == "update") {

            try {
                con = MyConnection.getConnection();
                Statement st = con.createStatement();

                String sql = "update int_employees set employee_name=?, father=?, mother=?,date_of_birth=?,gender=?,designation=?,email=?,present_address=?, permanent_address=?,status=?,passport=?,country=? where phone=?";

                ps = con.prepareStatement(sql);
                ps.setString(1, name);
                ps.setString(2, fname);
                ps.setString(3, mname);
                ps.setString(4, dateOfBirth);
                ps.setString(5, gender);
                ps.setString(6, designation);
                ps.setString(7, email);
                ps.setString(8, presentAdd);
                ps.setString(9, PermanentAdd); 
                ps.setString(10, status); 
                ps.setString(11, passport); 
                ps.setString(12, country); 
                ps.setString(13, phone);

                if (ps.executeUpdate() > 0) {
                    JOptionPane.showMessageDialog(null, "Updated Successfully");

                }

            } catch (SQLException ex) {
                Logger.getLogger(Employee.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

         if (op == "delete") {
            int YesOrNo = JOptionPane.showConfirmDialog(null, "Details of Employee Salary will also be deleted", "Delete Employee", JOptionPane.OK_CANCEL_OPTION, 0);
            if (YesOrNo == JOptionPane.OK_OPTION) {
                try {
                   Statement st = con.createStatement();
                    ps = con.prepareStatement("delete from int_employees where phone=?");
                 
                     ps.setString(1, phone);
                    if (ps.executeUpdate() > 0) {
                        JOptionPane.showMessageDialog(null, "Employee Deleted");
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(Employee.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        }
    }

    public boolean isPhoneExistLoc(String phone) {

        boolean isExist = false;
        Connection con = MyConnection.getConnection();
        PreparedStatement ps;
        try {
            ps = con.prepareStatement("SELECT * FROM local_employees WHERE phone = ?");
            ps.setString(1, phone);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                isExist = true;
            }

        } catch (SQLException ex) {
            Logger.getLogger(Employee.class.getName()).log(Level.SEVERE, null, ex);
        }

        return isExist;
    }
    
     public boolean isPhoneExistInt(String phone) {

        boolean isExist = false;
        Connection con = MyConnection.getConnection();
        PreparedStatement ps;
        try {
            ps = con.prepareStatement("SELECT * FROM int_employees WHERE phone = ?");
            ps.setString(1, phone);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                isExist = true;
            }

        } catch (SQLException ex) {
            Logger.getLogger(Employee.class.getName()).log(Level.SEVERE, null, ex);
        }

        return isExist;
    }

    public void mobileExitLoc(String number) {
        try {

            Connection con = MyConnection.getConnection();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM local_employees WHERE phone ='" + number + "'");

            if (rs.next()) {
                ManageEmployees.loc_status.removeAllItems();
                ManageEmployees.loc_name.setText(rs.getString(2));
                ManageEmployees.loc_father.setText(rs.getString(3));
                ManageEmployees.loc_mother.setText(rs.getString(4));
                ManageEmployees.loc_phone.setText(rs.getString(5));
                ManageEmployees.loc_dateOfBirth.setDate(rs.getDate(6));
                ManageEmployees.loc_designation.setSelectedItem(rs.getString(8));
                ManageEmployees.loc_email.setText(rs.getString(9));
                ManageEmployees.loc_presentAdd.setText(rs.getString(10));
                ManageEmployees.loc_permanentAdd.setText(rs.getString(11));

                if (rs.getString(7).equals("male")) {
                    ManageEmployees.loc_male.setSelected(true);
                    ManageEmployees.loc_female.setSelected(false);
                } else {
                    ManageEmployees.loc_female.setSelected(true);
                    ManageEmployees.loc_male.setSelected(false);
                }

                if (rs.getString(12).equals("Working")) {
                    ManageEmployees.loc_status.addItem("Working");
                    ManageEmployees.loc_status.addItem("Not Working");
                } else {
                    ManageEmployees.loc_status.addItem("Not Working");
                    ManageEmployees.loc_status.addItem("Working");
                }

            } else {
                JOptionPane.showMessageDialog(null, "Employee doesn't exist");
            }

        } catch (SQLException ex) {
            Logger.getLogger(Employee.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    public void mobileExitInt(String number) {
        try {

            Connection con = MyConnection.getConnection();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM int_employees WHERE phone ='" + number + "'");

            if (rs.next()) {
                ManageEmployees.int_status.removeAllItems();
                ManageEmployees.int_name.setText(rs.getString(2));
                ManageEmployees.int_father.setText(rs.getString(3));
                ManageEmployees.int_mother.setText(rs.getString(4));
                ManageEmployees.int_phone.setText(rs.getString(5));
                ManageEmployees.int_dateOfBirth.setDate(rs.getDate(6));
                ManageEmployees.int_designation.setSelectedItem(rs.getString(8));
                ManageEmployees.int_email.setText(rs.getString(9));
                ManageEmployees.int_presentAdd.setText(rs.getString(10));
                ManageEmployees.int_permanentAdd.setText(rs.getString(11));
                ManageEmployees.pass.setText(rs.getString(13));
                ManageEmployees.country.setText(rs.getString(14));
                if (rs.getString(7).equals("male")) {
                    ManageEmployees.int_male.setSelected(true);
                    ManageEmployees.int_female.setSelected(false);
                } else {
                    ManageEmployees.int_female.setSelected(true);
                    ManageEmployees.int_male.setSelected(false);
                }

                if (rs.getString(12).equals("Working")) {
                    ManageEmployees.int_status.addItem("Working");
                    ManageEmployees.int_status.addItem("Not Working");
                } else {
                    ManageEmployees.int_status.addItem("Not Working");
                    ManageEmployees.int_status.addItem("Working");
                }

            } else {
                JOptionPane.showMessageDialog(null, "Employee doesn't exist");
            }

        } catch (SQLException ex) {
            Logger.getLogger(Employee.class.getName()).log(Level.SEVERE, null, ex);
        }
}
}
