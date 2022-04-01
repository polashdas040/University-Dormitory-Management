import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.sql.Statement;
import java.util.Calendar;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class EmpSalary {

    public void empSalaryLoc(String op, String phone, String salary, String month, String payDate) {

        Connection con = MyConnection.getConnection();
        PreparedStatement ps;

        if (op == "insert") {
            String sql = "INSERT INTO local_employees_salary (phone,salary, payment_month, payment_date) VALUES (?,?,?,?)";
            try {
                ps = con.prepareStatement(sql);
                ps.setString(1, phone);
                ps.setString(2, salary);
                ps.setString(3, month);
                ps.setString(4, payDate);

                if (ps.executeUpdate() > 0) {
                    JOptionPane.showMessageDialog(null, "Employee Payment Successfully");
                }
            } catch (SQLException ex) {
                Logger.getLogger(EmpSalary.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void empSalaryInt(String op, String phone, String salary, String month, String payDate) {

        Connection con = MyConnection.getConnection();
        PreparedStatement ps;

        if (op == "insert") {
            String sql = "INSERT INTO int_employees_salary (phone,salary, payment_month, payment_date) VALUES (?,?,?,?)";
            try {
                ps = con.prepareStatement(sql);
                ps.setString(1, phone);
                ps.setString(2, salary);
                ps.setString(3, month);
                ps.setString(4, payDate);

                if (ps.executeUpdate() > 0) {
                    JOptionPane.showMessageDialog(null, "Employee Payment Successfully");
                }
            } catch (SQLException ex) {
                Logger.getLogger(EmpSalary.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void getTableLoc(String phone, JTable t) {
        DefaultTableModel table = (DefaultTableModel) t.getModel();
        table.setRowCount(0);
        try {
            Connection con = MyConnection.getConnection();
            Statement st = con.createStatement();
            String sql = "select * from local_employees_salary where phone='" + phone + "' order by id desc";
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {

                table.addRow(new Object[]{rs.getString(4), rs.getString(3), rs.getString(5)});
            }
        } catch (SQLException ex) {
            Logger.getLogger(EmpSalary.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void getTableInt(String phone, JTable t) {
        DefaultTableModel table = (DefaultTableModel) t.getModel();
        table.setRowCount(0);
        try {
            Connection con = MyConnection.getConnection();
            Statement st = con.createStatement();
            String sql = "select * from int_employees_salary where phone='" + phone + "' order by id desc";
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {

                table.addRow(new Object[]{rs.getString(4), rs.getString(3), rs.getString(5)});
            }
        } catch (SQLException ex) {
            Logger.getLogger(EmpSalary.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void mobileExitLoc(String number) {
        try {

            Connection con = MyConnection.getConnection();
            Statement st = con.createStatement();
            String sql = "SELECT * FROM local_employees WHERE phone ='" + number + "' and status='Working'";
            ResultSet rs = st.executeQuery(sql);

            Calendar c = Calendar.getInstance();
            int month = c.get(Calendar.MONTH);
            String year = String.valueOf(c.get(Calendar.YEAR));

            String paymentDate = (getMonth(month+1) + "-" + year);

            if (rs.next()) {

                EmployeeSalary.loc_payment.setEnabled(true);
                EmployeeSalary.loc_name.setText(rs.getString(2));
                EmployeeSalary.loc_phone.setText(rs.getString(5));
                EmployeeSalary.loc_designation.setText(rs.getString(8));
                EmployeeSalary.loc_email.setText(rs.getString(9));
                EmployeeSalary.loc_month.setText(paymentDate);

                if (rs.getString(8).equals("Accounting")) {
                    EmployeeSalary.loc_salary.setText("$650");
                } else if (rs.getString(8).equals("Chef")) {
                    EmployeeSalary.loc_salary.setText("$600");
                } else if (rs.getString(8).equals("Electrician")) {
                    EmployeeSalary.loc_salary.setText("$550");
                } else if (rs.getString(8).equals("Housekeeping")) {
                    EmployeeSalary.loc_salary.setText("$500");
                } else {
                    EmployeeSalary.loc_salary.setText("$700");
                }

                String sql1 = "SELECT * FROM local_employees_salary inner join local_employees where local_employees.status='Working' and local_employees_salary.payment_month='" + paymentDate + "' and local_employees_salary.phone='" + number + "' and local_employees.phone='" + number + "'";
                rs = st.executeQuery(sql1);

                if (rs.next()) {
                    EmployeeSalary.loc_payment.setEnabled(false);

                    JOptionPane.showMessageDialog(null, "Already payment");
                }

            } else {
                JOptionPane.showMessageDialog(null, "Employee doesn't exist");
            }

        } catch (SQLException ex) {
            Logger.getLogger(EmpSalary.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void mobileExitInt(String number) {
        try {

            Connection con = MyConnection.getConnection();
            Statement st = con.createStatement();
            String sql = "SELECT * FROM int_employees WHERE phone ='" + number + "' and status='Working'";
            ResultSet rs = st.executeQuery(sql);

            Calendar c = Calendar.getInstance();
            int month = c.get(Calendar.MONTH);
            String year = String.valueOf(c.get(Calendar.YEAR));

            String paymentDate = (getMonth(month+1) + "-" + year);

            if (rs.next()) {

                EmployeeSalary.int_payment.setEnabled(true);
                EmployeeSalary.int_name.setText(rs.getString(2));
                EmployeeSalary.int_phone.setText(rs.getString(5));
                EmployeeSalary.int_designation.setText(rs.getString(8));
                EmployeeSalary.int_email.setText(rs.getString(9));
                EmployeeSalary.int_month.setText(paymentDate);

                if (rs.getString(8).equals("Accounting")) {
                    EmployeeSalary.int_salary.setText("$650");
                } else if (rs.getString(8).equals("Chef")) {
                    EmployeeSalary.int_salary.setText("$600");
                } else if (rs.getString(8).equals("Electrician")) {
                    EmployeeSalary.int_salary.setText("$550");
                } else if (rs.getString(8).equals("Housekeeping")) {
                    EmployeeSalary.int_salary.setText("$500");
                } else {
                    EmployeeSalary.int_salary.setText("$700");
                }

                String sql1 = "SELECT * FROM int_employees_salary inner join int_employees where int_employees.status='Working' and int_employees_salary.payment_month='" + paymentDate + "' and int_employees_salary.phone='" + number + "' and int_employees.phone='" + number + "'";
                rs = st.executeQuery(sql1);

                if (rs.next()) {
                    EmployeeSalary.int_payment.setEnabled(false);

                    JOptionPane.showMessageDialog(null, "Already payment");
                }

            } else {
                JOptionPane.showMessageDialog(null, "Employee doesn't exist");
            }

        } catch (SQLException ex) {
            Logger.getLogger(EmpSalary.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public String getMonth(int month) {
        String monthName = "";
        switch (month) {
            case 1 -> monthName = "December";
            case 2 -> monthName = "January";
            case 3 -> monthName = "February";
            case 4 -> monthName = "March";
            case 5 -> monthName = "April";
            case 6 -> monthName = "May";
            case 7 -> monthName = "June";
            case 8 -> monthName = "July";
            case 9 -> monthName = "August";
            case 10 -> monthName = "September";
            case 11 -> monthName = "October";
            case 12 -> monthName = "November";
        }
        return monthName;
    }
}
