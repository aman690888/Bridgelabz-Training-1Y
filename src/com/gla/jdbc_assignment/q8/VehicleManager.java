package com.gla.jdbc_assignment.q8;

import com.gla.jdbc_assignment.common.DBConnection;
import java.sql.*;

public class VehicleManager {
    public static void main(String[] args) {
        try (Connection con = DBConnection.getConnection()) {

            PreparedStatement ps = con.prepareStatement(
                    "INSERT INTO vehicles VALUES (?,?,?)");
            ps.setString(1, "UP32AB1234");
            ps.setString(2, "Aman");
            ps.setString(3, "Pending");
            ps.executeUpdate();

            ResultSet rs = con.createStatement()
                    .executeQuery("SELECT * FROM vehicles WHERE status='Pending'");
            while (rs.next()) System.out.println(rs.getString("owner"));

            con.createStatement()
                    .executeUpdate("UPDATE vehicles SET status='Completed' WHERE regNo='UP32AB1234'");

            con.createStatement()
                    .executeUpdate("DELETE FROM vehicles WHERE regNo='UP32AB1234'");

        } catch (Exception e) { e.printStackTrace(); }
    }
}