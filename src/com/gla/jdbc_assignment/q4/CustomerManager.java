package com.gla.jdbc_assignment.q4;

import com.gla.jdbc_assignment.q1.DBConnection;
import java.sql.*;

public class CustomerManager {
    public static void main(String[] args) {

        try (Connection con = DBConnection.getConnection()) {

            // INSERT
            PreparedStatement ps = con.prepareStatement(
                    "INSERT INTO customers VALUES (?,?,?)");
            ps.setInt(1, 1);
            ps.setString(2, "Aman");
            ps.setString(3, "9999999999");
            ps.executeUpdate();

            // READ (LIKE)
            ResultSet rs = con.createStatement()
                    .executeQuery("SELECT * FROM customers WHERE name LIKE '%man%'");

            while (rs.next()) {
                System.out.println(rs.getString("name"));
            }

            // UPDATE
            PreparedStatement ps2 = con.prepareStatement(
                    "UPDATE customers SET phone=? WHERE id=?");
            ps2.setString(1, "8888888888");
            ps2.setInt(2, 1);
            ps2.executeUpdate();

            // DELETE
            con.createStatement()
                    .executeUpdate("DELETE FROM customers WHERE id=1");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}