package com.gla.jdbc_assignment.q13;

import com.gla.jdbc_assignment.common.DBConnection;
import java.sql.*;

public class TaskManager {
    public static void main(String[] args) {
        try (Connection con = DBConnection.getConnection()) {

            PreparedStatement ps = con.prepareStatement(
                    "INSERT INTO tasks VALUES (?,?,?)");
            ps.setInt(1, 1);
            ps.setString(2, "Complete Assignment");
            ps.setString(3, "Pending");
            ps.executeUpdate();

            ResultSet rs = con.createStatement()
                    .executeQuery("SELECT * FROM tasks WHERE status='Pending'");
            while (rs.next()) System.out.println(rs.getString("title"));

            con.createStatement()
                    .executeUpdate("UPDATE tasks SET status='Completed' WHERE id=1");

            con.createStatement()
                    .executeUpdate("DELETE FROM tasks WHERE id=1");

        } catch (Exception e) { e.printStackTrace(); }
    }
}