package com.gla.jdbc_assignment.q5;

import com.gla.jdbc_assignment.q1.DBConnection;
import java.sql.*;

public class BankManager {
    public static void main(String[] args) {

        try (Connection con = DBConnection.getConnection()) {

            // INSERT
            PreparedStatement ps = con.prepareStatement(
                    "INSERT INTO accounts VALUES (?,?,?)");
            ps.setInt(1, 101);
            ps.setString(2, "Aman");
            ps.setDouble(3, 15000);
            ps.executeUpdate();

            // READ
            ResultSet rs = con.createStatement()
                    .executeQuery("SELECT * FROM accounts WHERE balance > 10000");

            while (rs.next()) {
                System.out.println(rs.getString("name"));
            }

            // UPDATE (deposit)
            PreparedStatement ps2 = con.prepareStatement(
                    "UPDATE accounts SET balance = balance + 5000 WHERE accNo=?");
            ps2.setInt(1, 101);
            ps2.executeUpdate();

            // DELETE
            con.createStatement()
                    .executeUpdate("DELETE FROM accounts WHERE accNo=101");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}