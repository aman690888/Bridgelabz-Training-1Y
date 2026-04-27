package com.gla.jdbc_assignment.q10;

import com.gla.jdbc_assignment.common.DBConnection;
import java.sql.*;

public class MenuManager {
    public static void main(String[] args) {
        try (Connection con = DBConnection.getConnection()) {

            PreparedStatement ps = con.prepareStatement(
                    "INSERT INTO menu VALUES (?,?,?)");
            ps.setInt(1, 1);
            ps.setString(2, "Burger");
            ps.setDouble(3, 150);
            ps.executeUpdate();

            ResultSet rs = con.createStatement()
                    .executeQuery("SELECT * FROM menu WHERE price < 200");
            while (rs.next()) System.out.println(rs.getString("itemName"));

            con.createStatement()
                    .executeUpdate("UPDATE menu SET price=180 WHERE id=1");

            con.createStatement()
                    .executeUpdate("DELETE FROM menu WHERE id=1");

        } catch (Exception e) { e.printStackTrace(); }
    }
}