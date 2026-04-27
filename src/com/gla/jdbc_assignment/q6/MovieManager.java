package com.gla.jdbc_assignment.q6;

import com.gla.jdbc_assignment.q1.DBConnection;
import java.sql.*;

public class MovieManager {
    public static void main(String[] args) {

        try (Connection con = DBConnection.getConnection()) {

            // INSERT
            PreparedStatement ps = con.prepareStatement(
                    "INSERT INTO movies VALUES (?,?,?)");
            ps.setInt(1, 1);
            ps.setString(2, "Avengers");
            ps.setInt(3, 50);
            ps.executeUpdate();

            // READ
            ResultSet rs = con.createStatement()
                    .executeQuery("SELECT * FROM movies WHERE seats > 0");

            while (rs.next()) {
                System.out.println(rs.getString("name"));
            }

            // UPDATE (book ticket)
            PreparedStatement ps2 = con.prepareStatement(
                    "UPDATE movies SET seats = seats - 1 WHERE id=?");
            ps2.setInt(1, 1);
            ps2.executeUpdate();

            // DELETE
            con.createStatement()
                    .executeUpdate("DELETE FROM movies WHERE id=1");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}