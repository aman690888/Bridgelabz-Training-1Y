package com.gla.jdbc_assignment.q7;

import com.gla.jdbc_assignment.common.DBConnection;
import java.sql.*;

public class PatientManager {
    public static void main(String[] args) {
        try (Connection con = DBConnection.getConnection()) {

            PreparedStatement ps = con.prepareStatement(
                    "INSERT INTO patients VALUES (?,?,?)");
            ps.setInt(1, 1);
            ps.setString(2, "Aman");
            ps.setString(3, "Flu");
            ps.executeUpdate();

            ResultSet rs = con.createStatement()
                    .executeQuery("SELECT * FROM patients WHERE disease='Flu'");
            while (rs.next()) System.out.println(rs.getString("name"));

            con.createStatement()
                    .executeUpdate("UPDATE patients SET disease='Cold' WHERE id=1");

            con.createStatement()
                    .executeUpdate("DELETE FROM patients WHERE id=1");

        } catch (Exception e) { e.printStackTrace(); }
    }
}