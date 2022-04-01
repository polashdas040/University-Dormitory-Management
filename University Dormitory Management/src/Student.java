
import java.sql.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Student {

    public void LocalStuManage(String op, String name, String fname, String mname, String email, String phone, String programs, String uni, String uid, String roomNumber, String date, String gender, String status, String add) {

        Connection con = MyConnection.getConnection();
        PreparedStatement ps;
        PreparedStatement ps1;

        if (op == "insert") {
            String sql = "INSERT INTO local_students (student_name, father_name, mother_name,date_of_birth,gender,email,phone,degree_programs, university,university_id, room_number,living_status,address) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)";
            String sql1 = "update room set room_status='Booked' where room_number = ?";
            try {
                ps = con.prepareStatement(sql);
                ps.setString(1, name);
                ps.setString(2, fname);
                ps.setString(3, mname);
                ps.setString(4, date);
                ps.setString(5, gender);
                ps.setString(6, email);
                ps.setString(7, phone);
                ps.setString(8, programs);
                ps.setString(9, uni);
                ps.setString(10, uid);
                ps.setString(11, roomNumber);
                ps.setString(12, status);
                ps.setString(13, add);

                ps1 = con.prepareStatement(sql1);
                ps1.setString(1, roomNumber);
                ps1.executeUpdate();

                if (ps.executeUpdate() > 0) {
                    JOptionPane.showMessageDialog(null, "New Student Added Successfully");
                }
            } catch (SQLException ex) {
                Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        if (op == "update") {
            try {
                con = MyConnection.getConnection();
                Statement st = con.createStatement();
                if (status.equals("Living")) {
                    st.executeUpdate("update room set room_status='Booked' where room_number='" + roomNumber + "'");
                } else {
                    st.executeUpdate("update room set room_status='Not Booked' where room_number='" + roomNumber + "'");

                }
                if (status.equals("Leaved")) {
                    roomNumber = "";
                }

                ps = con.prepareStatement("update local_students set student_name=?, father_name=?, mother_name=?,date_of_birth=?,gender=?,email=?,degree_programs=?, university=?,university_id=?,living_status=?,room_number=?,address=? where phone=?");
                ps.setString(1, name);
                ps.setString(2, fname);
                ps.setString(3, mname);
                ps.setString(4, date);
                ps.setString(5, gender);
                ps.setString(6, email);
                ps.setString(7, programs);
                ps.setString(8, uni);
                ps.setString(9, uid);
                ps.setString(10, status);
                ps.setString(11, roomNumber);
                ps.setString(12, add);
                ps.setString(13, phone);

                if (ps.executeUpdate() > 0) {
                    JOptionPane.showMessageDialog(null, "Updated Successfully");

                }

            } catch (SQLException ex) {
                Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

        if (op == "delete") {
            int YesOrNo = JOptionPane.showConfirmDialog(null, "Details of student payments will also be deleted", "Delete Student", JOptionPane.OK_CANCEL_OPTION, 0);
            if (YesOrNo == JOptionPane.OK_OPTION) {
                try {
                    Statement st = con.createStatement();
                    ps = con.prepareStatement("delete from local_students where phone=?");
                    st.executeUpdate("update room set room_status='Not Booked' where room_number='" + roomNumber + "'");

                    ps.setString(1, phone);
                    if (ps.executeUpdate() > 0) {
                        JOptionPane.showMessageDialog(null, "Student Deleted");
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        }

    }

    public void IntStuManage(String op, String name, String fname, String mname, String email, String phone, String programs, String uni, String uid, String roomNumber, String date, String gender, String status, String add, String pass, String country) {

        Connection con = MyConnection.getConnection();
        PreparedStatement ps;
        PreparedStatement ps1;

        if (op == "insert") {
            String sql = "INSERT INTO int_students (student_name, father_name, mother_name,date_of_birth,gender,email,phone,degree_programs, university,university_id, room_number,living_status,address,passport,country) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            String sql1 = "update room set room_status='Booked' where room_number = ?";
            try {
                ps = con.prepareStatement(sql);
                ps.setString(1, name);
                ps.setString(2, fname);
                ps.setString(3, mname);
                ps.setString(4, date);
                ps.setString(5, gender);
                ps.setString(6, email);
                ps.setString(7, phone);
                ps.setString(8, programs);
                ps.setString(9, uni);
                ps.setString(10, uid);
                ps.setString(11, roomNumber);
                ps.setString(12, status);
                ps.setString(13, add);
                ps.setString(14, pass);
                ps.setString(15, country);

                ps1 = con.prepareStatement(sql1);
                ps1.setString(1, roomNumber);
                ps1.executeUpdate();

                if (ps.executeUpdate() > 0) {
                    JOptionPane.showMessageDialog(null, "New Student Added Successfully");
                }
            } catch (SQLException ex) {
                Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        if (op == "update") {
            try {
                con = MyConnection.getConnection();
                Statement st = con.createStatement();
                if (status.equals("Living")) {
                    st.executeUpdate("update room set room_status='Booked' where room_number='" + roomNumber + "'");
                } else {
                    st.executeUpdate("update room set room_status='Not Booked' where room_number='" + roomNumber + "'");

                }
                if (status.equals("Leaved")) {
                    roomNumber = "";
                }

                ps = con.prepareStatement("update int_students set student_name=?, father_name=?, mother_name=?,date_of_birth=?,gender=?,email=?,degree_programs=?, university=?,university_id=?,living_status=?,room_number=?,address=?,passport=?,country=? where phone=?");
                ps.setString(1, name);
                ps.setString(2, fname);
                ps.setString(3, mname);
                ps.setString(4, date);
                ps.setString(5, gender);
                ps.setString(6, email);
                ps.setString(7, programs);
                ps.setString(8, uni);
                ps.setString(9, uid);
                ps.setString(10, status);
                ps.setString(11, roomNumber);
                ps.setString(12, add);
                ps.setString(13, pass);
                ps.setString(14, country);
                ps.setString(15, phone);

                if (ps.executeUpdate() > 0) {
                    JOptionPane.showMessageDialog(null, "Updated Successfully");

                }

            } catch (SQLException ex) {
                Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

        if (op == "delete") {
            int YesOrNo = JOptionPane.showConfirmDialog(null, "Details of student payments will also be deleted", "Delete Student", JOptionPane.OK_CANCEL_OPTION, 0);
            if (YesOrNo == JOptionPane.OK_OPTION) {
                try {
                    Statement st = con.createStatement();
                    ps = con.prepareStatement("delete from int_students where phone=?");
                    st.executeUpdate("update room set room_status='Not Booked' where room_number='" + roomNumber + "'");

                    ps.setString(1, phone);
                    if (ps.executeUpdate() > 0) {
                        JOptionPane.showMessageDialog(null, "Student Deleted");
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        }

    }

    public void mobileExitLocal(String number) {
        try {

            Connection con = MyConnection.getConnection();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM local_students WHERE phone ='" + number + "'");

            if (rs.next()) {

                ManageStudents.loc_status.removeAllItems();
                ManageStudents.loc_roomNumber.removeAllItems();
                ManageStudents.loc_name.setText(rs.getString(2));
                ManageStudents.loc_fName.setText(rs.getString(3));
                ManageStudents.loc_mName.setText(rs.getString(4));
                ManageStudents.loc_date.setDate(rs.getDate(5));
                ManageStudents.loc_email.setText(rs.getString(7));
                ManageStudents.loc_phone.setText(rs.getString(8));
                ManageStudents.loc_dpro.setSelectedItem(rs.getString(9));
                ManageStudents.loc_uni.setText(rs.getString(10));
                ManageStudents.loc_uId.setText(rs.getString(11));
                ManageStudents.loc_roomNumber.addItem(rs.getString(12));
                ManageStudents.loc_add.setText(rs.getString(14));

                if (rs.getString(6).equals("male")) {
                    ManageStudents.loc_male.setSelected(true);
                    ManageStudents.loc_female.setSelected(false);
                } else {
                    ManageStudents.loc_female.setSelected(true);
                    ManageStudents.loc_male.setSelected(false);
                }

                if (rs.getString(13).equals("Living")) {
                    ManageStudents.loc_status.addItem("Living");
                    ManageStudents.loc_status.addItem("Leaved");
                } else if (rs.getString(13).equals("Leaved")) {
                    ManageStudents.loc_status.addItem("Leaved");
                    ManageStudents.loc_status.addItem("Living");
                }

            } else {
                JOptionPane.showMessageDialog(null, "Student doesn't exist");
                 ManageStudents.loc_status.setSelectedIndex(-1);
            }

        } catch (SQLException ex) {
            Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void mobileExitInt(String number) {
        try {

            Connection con = MyConnection.getConnection();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM int_students WHERE phone ='" + number + "'");

            if (rs.next()) {

                ManageStudents.int_status.removeAllItems();
                ManageStudents.int_roomNumber.removeAllItems();
                ManageStudents.int_name.setText(rs.getString(2));
                ManageStudents.int_fName.setText(rs.getString(3));
                ManageStudents.int_mName.setText(rs.getString(4));
                ManageStudents.int_date.setDate(rs.getDate(5));
                ManageStudents.int_email.setText(rs.getString(7));
                ManageStudents.int_phone.setText(rs.getString(8));
                ManageStudents.int_dpro.setSelectedItem(rs.getString(9));
                ManageStudents.int_uni.setText(rs.getString(10));
                ManageStudents.int_uId.setText(rs.getString(11));
                ManageStudents.int_roomNumber.addItem(rs.getString(12));
                ManageStudents.int_add.setText(rs.getString(14));
                ManageStudents.int_pass.setText(rs.getString(15));
                ManageStudents.country.setText(rs.getString(16));

                if (rs.getString(6).equals("male")) {
                    ManageStudents.int_male.setSelected(true);
                    ManageStudents.int_female.setSelected(false);
                } else {
                    ManageStudents.int_female.setSelected(true);
                    ManageStudents.int_male.setSelected(false);
                }

                if (rs.getString(13).equals("Living")) {
                    ManageStudents.int_status.addItem("Living");
                    ManageStudents.int_status.addItem("Leaved");
                } else if (rs.getString(13).equals("Leaved")) {
                    ManageStudents.int_status.addItem("Leaved");
                    ManageStudents.int_status.addItem("Living");
                }

            } else {
                JOptionPane.showMessageDialog(null, "Student doesn't exist");
                ManageStudents.int_status.setSelectedIndex(-1);
            }

        } catch (SQLException ex) {
            Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public boolean isPhoneExist(String phone) {

        boolean isExist = false;
        Connection con = MyConnection.getConnection();
        PreparedStatement ps;
        try {
            ps = con.prepareStatement("SELECT * FROM local_students WHERE phone = ?");
            ps.setString(1, phone);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                isExist = true;
            }

        } catch (SQLException ex) {
            Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
        }

        return isExist;
    }
}
