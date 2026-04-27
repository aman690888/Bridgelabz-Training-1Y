package com.gla.jdbc_assignment.q1;

import java.sql.*;

public class EmployeeManager {

    public static void main(String[] args) {

        try (Connection con = DBConnection.getConnection()) {

            // 🔹 INSERT (Create)
            String insertQuery = "INSERT INTO employee VALUES (?,?,?)";
            PreparedStatement ps = con.prepareStatement(insertQuery);

            ps.setInt(1, 1);
            ps.setString(2, "Aman");
            ps.setDouble(3, 35000);
            ps.executeUpdate();

            System.out.println("Employee inserted");

            // 🔹 READ (salary > 30000)
            String selectQuery = "SELECT * FROM employee WHERE salary > 30000";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(selectQuery);

            System.out.println("\nEmployees with salary > 30000:");
            while (rs.next()) {
                System.out.println(rs.getInt("id") + " " +
                        rs.getString("name") + " " +
                        rs.getDouble("salary"));
            }

            // 🔹 UPDATE (increase salary by 10%)
            String updateQuery = "UPDATE employee SET salary = salary * 1.10 WHERE id = ?";
            PreparedStatement ps2 = con.prepareStatement(updateQuery);

            ps2.setInt(1, 1);
            ps2.executeUpdate();

            System.out.println("\nSalary updated");

            // 🔹 DELETE (salary < 15000)
            String deleteQuery = "DELETE FROM employee WHERE salary < 15000";
            Statement st2 = con.createStatement();
            st2.executeUpdate(deleteQuery);

            System.out.println("Low salary employees deleted");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}