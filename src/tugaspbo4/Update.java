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
public class Update {
    static final String db_URL = "jdbc:postgresql://localhost:5432/Dokter";
    static final String USER = "postgres";
    static final String PASS = "Chanhee98";

    public static void main(String[] args) {
        
        try ( Scanner scan = new Scanner(System.in);  
            Connection conn = DriverManager.getConnection(db_URL, USER, PASS)) {
            if (conn != null) {
                System.out.println("Koneksi sukses!");
        
                System.out.println("Masukkan id lama yang akan diperbarui : ");
                String idLama= scan.nextLine();
                
                System.out.println("Masukkan nama baru : ");
                String nama = scan.nextLine();
                
                System.out.println("Masukkan id dokter baru : ");
                String id_dokter = scan.nextLine();
                               
                System.out.println("Masukkan alamat baru : ");
                String alamat = scan.nextLine();
                
                String QUERY = "UPDATE identitas SET nama=?, id_dokter=?, alamat=? WHERE id_dokter=?";
       
                try ( PreparedStatement preparedStatement = conn.prepareStatement(QUERY)) {
                    preparedStatement.setString(1, nama);
                    preparedStatement.setString(2, id_dokter);
                    preparedStatement.setString(3, alamat);
                    preparedStatement.setString(4, idLama);
                    preparedStatement.executeUpdate();
                    
                    int rowsUpdated = preparedStatement.executeUpdate();
                    if(rowsUpdated > 0){
                        System.out.println("Data dengan id yang dimasukkan tidak ditemukan.");
                    }else{
                        System.out.println("Data berhasil diupdate.");
                    }

                    
                } catch (SQLException e) {
                    e.printStackTrace();
                }
        
        
            }
        
        
        } catch (SQLException ex) {
            Logger.getLogger(Update.class.getName()).log(Level.SEVERE, null, ex);
          }
    }
    
}
