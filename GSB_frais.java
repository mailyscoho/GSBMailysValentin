// GSB_frais
  // creation de la classe
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gsb_frais;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
/**
 *
 * @author vnicot
 */
public class GSB_frais {

    public GSB_frais(){
        
    }
    
    public static void main(String[] args) {
        try{
            String url = "jdbc:mysql://localhost/gsb_frais";
            String user = "util";
            String password = "1234";
            Connection connect = DriverManager.getConnection(url, user, password);
            Statement stmt = connect.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT id, libelle FROM etat");
            while (rs.next()) {
                String x = rs.getString("id");
                String s = rs.getString("libelle");
                System.out.println("cat_code: "+x+" cat_libelle: "+s);
            }
            
            connect.close();
            
        }
        catch (SQLException e) {
            System.out.println (e.getMessage());
        }
    }
    
                                 
        
    
}