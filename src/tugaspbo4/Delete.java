/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugaspbo4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Scanner;
import java.sql.PreparedStatement;
/**
 *
 * @author Ailsa
 */
public class Delete {
    
    public static void main(String[] args) {
        String QUERY = "DELETE FROM identitas WHERE id_dokter = ?";
        Connection conn = null;
        PreparedStatement pstmt = null;
        
        try {
            Class.forName("org.postgresql.Driver");
            conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Dokter", "postgres", "Chanhee98");
            pstmt = conn.prepareStatement(QUERY );
            
            
            System.out.println("Masukkan id dokter yang ingin dihapus: ");
            Scanner scann = new Scanner(System.in);
            String hapus = scann.nextLine();
//            int hapusid = Integer.parseInt(hapus);
            
            pstmt.setString(1, hapus);
            int k = pstmt.executeUpdate();
            
            if (k > 0) {
                System.out.println("Hapus id_dokter " + hapus + " BERHASIL. ");
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        } 
            finally {
            try {
                pstmt.close();
                conn.close();
            } catch (Exception e) {
            }
        }
    }
}

    /**
     * @param args the command line arguments
     */
    
