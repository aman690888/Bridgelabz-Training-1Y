package com.gla.jdbc_assignment.q2;

import java.sql.*;

public class ProductManager {

    public static void main(String[] args) {

        try (Connection con = DBConnection.getConnection()) {

            // 🔹 INSERT (3 products)
            String insertQuery = "INSERT INTO product VALUES (?,?,?)";
            PreparedStatement ps = con.prepareStatement(insertQuery);

            ps.setInt(1, 101);
            ps.setString(2, "Laptop");
            ps.setInt(3, 5);
            ps.executeUpdate();

            ps.setInt(1, 102);
            ps.setString(2, "Mouse");
            ps.setInt(3, 20);
            ps.executeUpdate();

            ps.setInt(1, 103);
            ps.setString(2, "Keyboard");
            ps.setInt(3, 8);
            ps.executeUpdate();

            System.out.println("Products inserted");

            // 🔹 READ (low stock: qty < 10)
            String selectQuery = "SELECT * FROM product WHERE qty < 10";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(selectQuery);

            System.out.println("\nLow Stock Products:");
            while (rs.next()) {
                System.out.println(rs.getInt("pid") + " " +
                        rs.getString("pname") + " " +
                        rs.getInt("qty"));
            }

            // 🔹 UPDATE (increase stock)
            String updateQuery = "UPDATE product SET qty = qty + 10 WHERE pid = ?";
            PreparedStatement ps2 = con.prepareStatement(updateQuery);

            ps2.setInt(1, 101);
            ps2.executeUpdate();

            System.out.println("\nStock updated");

            // 🔹 DELETE (discontinued product)
            String deleteQuery = "DELETE FROM product WHERE pid = ?";
            PreparedStatement ps3 = con.prepareStatement(deleteQuery);

            ps3.setInt(1, 103);
            ps3.executeUpdate();

            System.out.println("Product deleted");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}