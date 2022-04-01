
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class StuFees {

    public void feesManageLoc(String op,String phone, String month,String fees, String paymentDay) {

        Connection con = MyConnection.getConnection();
        PreparedStatement ps;

        if (op == "insert") {
            String sql = "INSERT INTO local_students_fees (phone,payment_month,fees,payment_date) VALUES (?,?,?,?)";

            try {
                ps = con.prepareStatement(sql);
                ps.setString(1, phone);
                ps.setString(2, month);
                ps.setString(3, fees);
                ps.setString(4, paymentDay);
                
                if (ps.executeUpdate() > 0) {
                    JOptionPane.showMessageDialog(null, "Payment Successfully");
                }

            } catch (SQLException ex) {
                Logger.getLogger(StuFees.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
           public void feesManageInt(String op,String phone, String month,String fees, String paymentDay) {

        Connection con = MyConnection.getConnection();
        PreparedStatement ps;

        if (op == "insert") {
            String sql = "INSERT INTO int_students_fees (phone,payment_month,fees,payment_date) VALUES (?,?,?,?)";

            try {
                ps = con.prepareStatement(sql);
                ps.setString(1, phone);
                ps.setString(2, month);
                ps.setString(3, fees);
                ps.setString(4, paymentDay);
                
                if (ps.executeUpdate() > 0) {
                    JOptionPane.showMessageDialog(null, "Payment Successfully");
                }

            } catch (SQLException ex) {
                Logger.getLogger(StuFees.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    public void mobileExitLoc(String phone) {
        try {

            Connection con = MyConnection.getConnection();
            Statement st = con.createStatement();
            String sql = "SELECT * FROM local_students WHERE phone ='" + phone + "' and living_status='Living'";
            ResultSet rs = st.executeQuery(sql);

            Calendar c = Calendar.getInstance();
            int month = c.get(Calendar.MONTH);
            String year = String.valueOf(c.get(Calendar.YEAR));

            String paymentDate = (getMonth(month+1) + "-" + year);

            if (rs.next()) {
                StudentsFees.loc_payment.setEnabled(true);
                StudentsFees.loc_name.setText(rs.getString(2));
                StudentsFees.loc_email.setText(rs.getString(7));
                StudentsFees.loc_phone.setText(rs.getString(8));
                StudentsFees.loc_program.setText(rs.getString(9));
                StudentsFees.loc_uni.setText(rs.getString(10));
                StudentsFees.loc_roomNumber.setText(rs.getString(12));
                StudentsFees.loc_month.setText(paymentDate);

                if (rs.getString(9).equals("Bachelor Programs")) {
                    StudentsFees.loc_dorFees.setText("$200");
                } else if (rs.getString(9).equals("Master Programs")) {
                    StudentsFees.loc_dorFees.setText("$250");
                } else {
                    StudentsFees.loc_dorFees.setText("$300");
                }

            } else {
                JOptionPane.showMessageDialog(null, "Student doesn't exist");
            }

            String sql1 = "SELECT * FROM local_students_fees inner join local_students where local_students.living_status='Living' and local_students_fees.payment_month='" + paymentDate + "' and local_students_fees.phone='" + phone + "' and local_students.phone='" + phone + "'";
            rs = st.executeQuery(sql1);

            if (rs.next()) {
                StudentsFees.loc_payment.setEnabled(false);

                JOptionPane.showMessageDialog(null, "Already payment");
            }

        } catch (SQLException ex) {
            Logger.getLogger(StuFees.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void mobileExitInt(String phone) {
        try {

            Connection con = MyConnection.getConnection();
            Statement st = con.createStatement();
            String sql = "SELECT * FROM int_students WHERE phone ='" + phone + "' and living_status='Living'";
            ResultSet rs = st.executeQuery(sql);

            Calendar c = Calendar.getInstance();
            int month = c.get(Calendar.MONTH);
            String year = String.valueOf(c.get(Calendar.YEAR));

            String paymentDate = (getMonth(month+1) + "-" + year);

            if (rs.next()) {
                StudentsFees.int_payment.setEnabled(true);
                StudentsFees.int_name.setText(rs.getString(2));
                StudentsFees.int_email.setText(rs.getString(7));
                StudentsFees.int_phone.setText(rs.getString(8));
                StudentsFees.int_program.setText(rs.getString(9));
                StudentsFees.int_pass.setText(rs.getString(15));
                StudentsFees.int_roomNumber.setText(rs.getString(12));
                StudentsFees.int_month.setText(paymentDate);

                if (rs.getString(9).equals("Bachelor Programs")) {
                    StudentsFees.int_dorFees.setText("$200");
                } else if (rs.getString(9).equals("Master Programs")) {
                    StudentsFees.int_dorFees.setText("$250");
                } else {
                    StudentsFees.int_dorFees.setText("$300");
                }

            } else {
                JOptionPane.showMessageDialog(null, "Student doesn't exist");
            }

            String sql1 = "SELECT * FROM int_students_fees inner join int_students where int_students.living_status='Living' and int_students_fees.payment_month='" + paymentDate + "' and int_students_fees.phone='" + phone + "' and int_students.phone='" + phone + "'";
            rs = st.executeQuery(sql1);

            if (rs.next()) {
                StudentsFees.int_payment.setEnabled(false);

                JOptionPane.showMessageDialog(null, "Already payment");
            }

        } catch (SQLException ex) {
            Logger.getLogger(StuFees.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void getTableLoc(String phone, JTable t) {
        DefaultTableModel table = (DefaultTableModel) t.getModel();
        table.setRowCount(0);
        try {
            Connection con = MyConnection.getConnection();
            Statement st = con.createStatement();
            String sql = "select * from local_students_fees where phone='" + phone + "' order by id desc";
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {

                table.addRow(new Object[]{rs.getString(3), rs.getString(4), rs.getString(5)});
            }
        } catch (SQLException ex) {
            Logger.getLogger(StuFees.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void getTableInt(String phone, JTable t) {
        DefaultTableModel table = (DefaultTableModel) t.getModel();
        table.setRowCount(0);
        try {
            Connection con = MyConnection.getConnection();
            Statement st = con.createStatement();
            String sql = "select * from int_students_fees where phone='" + phone + "' order by id desc";
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {

                table.addRow(new Object[]{rs.getString(3), rs.getString(4), rs.getString(5)});
            }
        } catch (SQLException ex) {
            Logger.getLogger(StuFees.class.getName()).log(Level.SEVERE, null, ex);
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
