/* Conexion a DB*/
package MiConexion;
import java.sql.Connection;
import java.sql.DriverManager;
import Modelo.Tiendas;
import Modelo.Tiendas_DB;


public class Conexion_DB {
    Connection con;
    // Atributos
    String url = "jdbc:mysql://localhost:3306/bd_tiendas";
    String user = "";
    String password = "";
    public Connection Conexion(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection(url,user,password);   
       }catch(Exception e){
       }
       return con;
    }
}