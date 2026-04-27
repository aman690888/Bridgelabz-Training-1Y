package com.gla.jdbc_assignment.q11;

import com.gla.jdbc_assignment.common.DBConnection;
import java.sql.*;

public class GymManager {
    public static void main(String[] args) {
        try (Connection con = DBConnection.getConnection()) {

            PreparedStatement ps = con.prepareStatement(
                    "INSERT INTO members VALUES (?,?,?,?)");
            ps.setInt(1, 1);
            ps.setString(2, "Aman");
            ps.setString(3, "Premium");
            ps.setInt(4, 6);
            ps.executeUpdate();

            ResultSet rs = con.createStatement()
                    .executeQuery("SELECT * FROM members WHERE type='Premium'");
            while (rs.next()) System.out.println(rs.getString("name"));

            con.createStatement()
                    .executeUpdate("UPDATE members SET months=12 WHERE id=1");

            con.createStatement()
                    .executeUpdate("DELETE FROM members WHERE id=1");

        } catch (Exception e) { e.printStackTrace(); }
    }
}