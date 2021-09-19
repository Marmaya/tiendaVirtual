/* Clase Usuario*/
package Modelo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import MiConexion.Conexion_DB;

public class Usuarios{
// Atributos
    private String user;
    private String password;
    private String nombre;
    private String apellido;
    private String genero;
    private String tipoIdentificacion;
    private int numIdentificacion;
    private String telefono;
    private String direccion;
    private String correo;
    
//Constructor default y con parámetros
    public Usuarios() {
    }

    public Usuarios(String user, String password, String nombre, String apellido, String genero, String tipoIdentificacion, int numIdentificacion, String telefono, String direccion, String correo) {
        this.user = user;
        this.password = password;
        this.nombre = nombre;
        this.apellido = apellido;
        this.genero = genero;
        this.tipoIdentificacion = tipoIdentificacion;
        this.numIdentificacion = numIdentificacion;
        this.telefono = telefono;
        this.direccion = direccion;
        this.correo = correo;
    }

 // Accesadores

    public String getUser() {
        return user;
    }

    public void setUser(String nickname) {
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

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getTipoIdentificacion() {
        return tipoIdentificacion;
    }

    public void setTipoIdentificacion(String tipoIdentificacion) {
        this.tipoIdentificacion = tipoIdentificacion;
    }

    public int getNumIdentificacion() {
        return numIdentificacion;
    }

    public void setNumIdentificacion(int numIdentificacion) {
        this.numIdentificacion = numIdentificacion;
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

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
} 
    
    