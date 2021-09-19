/* Clase Tiendas-usuarios-productos-compra-venta-inventario */
package Modelo;

import java.sql.Connection;
import java.sql.ResultSet;
import MiConexion.Conexion_DB;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Tiendas_DB {    
    Conexion_DB cn=new Conexion_DB();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
    public Tiendas validar(String user,String password){
        Tiendas td=new Tiendas();
        String sql="select *from Tiendas where User=? and password=?";
        try{
            con=cn.Conexion();
            ps=(PreparedStatement) con.prepareStatement(sql);
            ps.setString(1, user);
            ps.setString(2, password);
            rs=ps.executeQuery();
            while(rs.next()){
                td.RegistroCC(rs.getInt("RegistroCamaradeComercio"));
                td.setUser(rs.getString("User"));
                td.setPassword(rs.getString("password"));
                td.setNombre(rs.getString("Nombre"));
            }
        } catch(SQLException e){
        }
        return td;
    }

}
