package com.gla.jdbc_assignment.q9;

import com.gla.jdbc_assignment.common.DBConnection;
import java.sql.*;

public class EnrollmentManager {
    public static void main(String[] args) {
        try (Connection con = DBConnection.getConnection()) {

            PreparedStatement ps = con.prepareStatement(
                    "INSERT INTO enrollments VALUES (?,?,?)");
            ps.setInt(1, 1);
            ps.setString(2, "Aman");
            ps.setString(3, "Java");
            ps.executeUpdate();

            ResultSet rs = con.createStatement()
                    .executeQuery("SELECT * FROM enrollments WHERE course='Java'");
            while (rs.next()) System.out.println(rs.getString("student"));

            con.createStatement()
                    .executeUpdate("UPDATE enrollments SET course='Python' WHERE id=1");

            con.createStatement()
                    .executeUpdate("DELETE FROM enrollments WHERE id=1");

        } catch (Exception e) { e.printStackTrace(); }
    }
}