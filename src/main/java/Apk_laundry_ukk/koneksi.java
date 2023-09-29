package Apk_laundry_ukk;

import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;

public class koneksi {
    private String url = "jdbc:mysql://localhost:3306/laundry";
    private String username = "root";
    private String password = "";
    private Connection conn;

    public void connect() {
        try {
            conn = DriverManager.getConnection(url, username, password);
            System.out.println("Koneksi berhasil!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public Connection getConn() {
        return conn;
    }
}
