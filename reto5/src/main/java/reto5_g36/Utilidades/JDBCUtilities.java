package reto5_g36.Utilidades;
import java.sql.*;

public class JDBCUtilities {
    public static Connection conexion() {
        Connection conn=null;
        try {
            String url="jdbc:sqlite:C:/Users/ytmor/OneDrive/Documents/mintic/ciclo2/Semana5/ProyectosConstruccion.db";
            conn=DriverManager.getConnection(url);
        } catch (Exception e) {
            System.out.println(e);
        }
        return conn;
    }
}
