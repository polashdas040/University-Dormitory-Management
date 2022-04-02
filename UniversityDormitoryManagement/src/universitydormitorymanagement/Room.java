package universitydormitorymanagement;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Room {

    public void roomManage(String op, String roomNumber, String active, String roomStatus) {

        Connection con = MyConnection.getConnection();
        PreparedStatement ps;

        if (op == "insert") {
            String sql = "INSERT INTO room(room_number, active, room_status) VALUES (?,?,?)";
            try {
                ps = con.prepareStatement(sql);
                ps.setString(1, roomNumber);
                ps.setString(2, active);
                ps.setString(3, roomStatus);

                if (ps.executeUpdate() > 0) {
                    JOptionPane.showMessageDialog(null, "New Room Added Successfully");
                } else {

                }

            } catch (SQLException ex) {
                Logger.getLogger(Room.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        if (op == "update") {

            try {
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery("select * from room where room_number='" + roomNumber + "'");
                while (rs.next()) {
                    if (rs.getString(4).equals("Booked")) {
                        JOptionPane.showMessageDialog(null, "Update command is not allowed because this room is already booked.", "Warning", 2);

                    } else {
                        try {
                            ps = con.prepareStatement("update room set active = ? where room_number = ?");
                            ps.setString(1, active);
                            ps.setString(2, roomNumber);

                            if (ps.executeUpdate() > 0) {
                                JOptionPane.showMessageDialog(null, "Room active status successfully updated");
                            }
                        } catch (SQLException ex) {
                            Logger.getLogger(Room.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(Room.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

        if (op == "delete") {
            try {

                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery("select * from room where room_number='" + roomNumber + "'");
                while (rs.next()) {
                    if (rs.getString(4).equals("Booked")) {
                        JOptionPane.showMessageDialog(null, "Delete command is not allowed because this room is already booked.", "Warning", 2);

                    } else {
                        int choose = JOptionPane.showConfirmDialog(null, "Are you sure to delete this room?", "Select", JOptionPane.YES_NO_OPTION);
                        if (choose == 0) {
                            try {
                                ps = con.prepareStatement("delete from room where room_number = ?");
                                ps.setString(1, roomNumber);

                                if (ps.executeUpdate() > 0) {
                                    JOptionPane.showMessageDialog(null, "Room successfully deleted ");
                                }
                            } catch (SQLException ex) {
                                Logger.getLogger(Room.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(Room.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    public void roomTable(JTable table, String valueToSearch) {

        Connection con = MyConnection.getConnection();
        PreparedStatement ps;

        String sql = "SELECT * FROM room WHERE CONCAT(room_number)LIKE ? order by room_id desc";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, "%" + valueToSearch + "%");

            ResultSet rs = ps.executeQuery();
            DefaultTableModel model = (DefaultTableModel) table.getModel();

            Object[] row;

            while (rs.next()) {
                row = new Object[3];
                row[0] = rs.getInt(2);
                row[1] = rs.getString(3);
                row[2] = rs.getString(4);

                model.addRow(row);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Room.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public boolean isRoomExist(String roomNumber) {

        boolean isExist = false;
        Connection con = MyConnection.getConnection();
        PreparedStatement ps;
        try {
            ps = con.prepareStatement("SELECT * FROM room WHERE room_number = ?");
            ps.setString(1, roomNumber);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                isExist = true;

            }

        } catch (SQLException ex) {
            Logger.getLogger(Room.class.getName()).log(Level.SEVERE, null, ex);
        }

        return isExist;
    }
}
