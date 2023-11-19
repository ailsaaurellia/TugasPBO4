/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugaspbo4;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Ailsa
 */
public class Pertemuan4 {
    static final String dbURL = "jdbc:postgresql://localhost:5432/Dokter";
    static final String USER = "postgres";
    static final String PASS = "Chanhee98";

    public static void main(String[] args) {

        try ( Connection conn = DriverManager.getConnection(dbURL, USER, PASS)) {
            if (conn != null) {
                System.out.println("Koneksi sukses!");
                System.out.println(" ");
                
                // Tampilkan data dari tabel identitas
                String query1 = "SELECT * FROM identitas ORDER BY id_dokter ASC";
                try ( Statement statement1 = conn.createStatement();  ResultSet rs = statement1.executeQuery(query1)) {
                    System.out.println(" ");
                    System.out.println("Tabel Identitas ========= ");
                    while (rs.next()) {
                        // Ambil data dari kolom-kolom yang sesuai
                        System.out.print("  Nama : " + String.valueOf(rs.getObject(1)));
                        System.out.print(", Id Dokter: " + String.valueOf(rs.getObject(2)));
                        System.out.print(", Alamat: " + String.valueOf(rs.getObject(3)));
                        
                    }
                }
                
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}

