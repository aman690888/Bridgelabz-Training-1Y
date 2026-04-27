package com.gla.jdbc_assignment.q12;

import com.gla.jdbc_assignment.common.DBConnection;
import java.sql.*;

public class SalesManager {
    public static void main(String[] args) {
        try (Connection con = DBConnection.getConnection()) {

            PreparedStatement ps = con.prepareStatement(
                    "INSERT INTO sales VALUES (?,?,?,?)");
            ps.setInt(1, 1);
            ps.setString(2, "Java Book");
            ps.setInt(3, 2);
            ps.setDouble(4, 500);
            ps.executeUpdate();

            ResultSet rs = con.createStatement()
                    .executeQuery("SELECT * FROM sales WHERE quantity > 1");
            while (rs.next()) System.out.println(rs.getString("bookName"));

            con.createStatement()
                    .executeUpdate("UPDATE sales SET quantity=3 WHERE id=1");

            con.createStatement()
                    .executeUpdate("DELETE FROM sales WHERE id=1");

        } catch (Exception e) { e.printStackTrace(); }
    }
}