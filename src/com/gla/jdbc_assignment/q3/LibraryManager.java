package com.gla.jdbc_assignment.q3;

import com.gla.jdbc_assignment.q1.DBConnection;
import java.sql.*;

public class LibraryManager {

    public static void main(String[] args) {

        try (Connection con = DBConnection.getConnection()) {

            // 🔹 INSERT
            String insert = "INSERT INTO books VALUES (?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(insert);

            ps.setInt(1, 1);
            ps.setString(2, "Java Basics");
            ps.setString(3, "James Gosling");
            ps.setString(4, "Available");
            ps.executeUpdate();

            System.out.println("Book inserted");

            // 🔹 READ (Available books)
            String select = "SELECT * FROM books WHERE status = 'Available'";
            ResultSet rs = con.createStatement().executeQuery(select);

            System.out.println("\nAvailable Books:");
            while (rs.next()) {
                System.out.println(rs.getInt("id") + " " +
                        rs.getString("title") + " " +
                        rs.getString("author"));
            }

            // 🔹 UPDATE (mark issued)
            String update = "UPDATE books SET status='Issued' WHERE id=?";
            PreparedStatement ps2 = con.prepareStatement(update);
            ps2.setInt(1, 1);
            ps2.executeUpdate();

            System.out.println("\nBook issued");

            // 🔹 DELETE (remove damaged)
            String delete = "DELETE FROM books WHERE id=?";
            PreparedStatement ps3 = con.prepareStatement(delete);
            ps3.setInt(1, 1);
            ps3.executeUpdate();

            System.out.println("Book deleted");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}