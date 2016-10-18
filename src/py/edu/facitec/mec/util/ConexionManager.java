/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package py.edu.facitec.mec.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jorge Fabio
 * Esta clase sera la encargada de crear una conexion a la BD
 * y por ende la desconexion cuando haya terminado el trabajo
 * 
 */
public class ConexionManager {
    public static final String DB = "bd_taller_mecanico";
    public static final String URL = "jdbc:postgresql://localhost:5432/"+DB;
    public static final String USER = "postgres";
    public static final String PASSWORD = "masterkey";

    public static Connection con=null;
    public static Statement st=null;
    public static PreparedStatement pst=null;

    public static void conectar(){
        
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ConexionManager.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error al cargar el driver " + ex);
        }
        
       
        try {
            con = DriverManager.getConnection(URL, USER, PASSWORD);
            st = con.createStatement();
            System.out.println("conectado base de datos "+ DB +" user: "+USER);
        } catch (SQLException ex) {
            Logger.getLogger(ConexionManager.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error de conexión " + ex);
        }
    }		

    public static void desconectar(){
        if(con != null){
            try {
                con.close();
                st.close();
                System.out.println("Sesion cerrada");
            } catch (SQLException e) {
                System.out.println("Error de desconexión" + e);
            }
        }
    }
}
