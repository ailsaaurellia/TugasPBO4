/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugaspbo4;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Ailsa
 */
public class Insert {
    
    static final String db_URL = "jdbc:postgresql://localhost:5432/Dokter";
    static final String USER = "postgres";
    static final String PASS = "Chanhee98";

    public static void main(String[] args) {

        try ( Scanner scan = new Scanner(System.in);  
            Connection conn = DriverManager.getConnection(db_URL, USER, PASS)) {
            if (conn != null) {
                System.out.println("Koneksi sukses!");
                
                System.out.println("masukkan nama : ");
                String nama = scan.nextLine();
                
                System.out.println("masukkan id dokter : ");
                String id_dokter = scan.nextLine();

                System.out.println("masukkan alamat : ");
                String alamat = scan.nextLine();

                String QUERY = "INSERT INTO identitas (nama, id_dokter, alamat) VALUES(?,?,?)";

                try ( PreparedStatement preparedStatement = conn.prepareStatement(QUERY)) {
                    preparedStatement.setString(1, nama);
                    preparedStatement.setString(2, id_dokter);
                    preparedStatement.setString(3, alamat);
                    preparedStatement.executeUpdate();

                    
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        } 
        catch (SQLException ex) {
            Logger.getLogger(Insert.class.getName()).log(Level.SEVERE, null, ex);

        }
    } 
    
}
