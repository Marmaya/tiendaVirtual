/* Clase Tienda*/
package Modelo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import MiConexion.Conexion_DB;

public class Tiendas{
    // Atributos
    private int RegistroCC;
    private String user;
    private String password;
    private String nombre;
    private String telefono;
    private String direccion;
   // Constructores
    public Tiendas() {
    }
    public Tiendas(int RegistroCC, String user, String password, String nombre, String telefono, String direccion) {
        this.RegistroCC = RegistroCC;
        this.user = user;
        this.password = password;
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion; 
    }
  //Accesadores
    public int getRegistroCC() {
        return RegistroCC;
    }

    public void setRegistroCC(int RegistroCC) {
        this.RegistroCC = RegistroCC;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    void RegistroCC(int aInt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
