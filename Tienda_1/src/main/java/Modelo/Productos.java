/* Clase productos*/
package Modelo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import MiConexion.Conexion_DB;

public class Productos {
// Atributos
    private int Id;
    private String nombre;
    private String categoria;
    private String descripcion;
    private String marca;
    private Double valorUnitarioVenta;
    private Double valorUnitarioCompra;
   

// Constructores por defauld y con parámetros 
    public Productos() {
    }

    public Productos(int Id, String nombre, String categoria, String descripcion, String marca, Double valorUnitarioVenta, Double valorUnitarioCompra) {
        this.Id = Id;
        this.nombre = nombre;
        this.categoria = categoria;
        this.descripcion = descripcion;
        this.marca = marca;
        this.valorUnitarioVenta = valorUnitarioVenta;
        this.valorUnitarioCompra = valorUnitarioCompra;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Double getValorUnitarioVenta() {
        return valorUnitarioVenta;
    }

    public void setValorUnitarioVenta(Double valorUnitarioVenta) {
        this.valorUnitarioVenta = valorUnitarioVenta;
    }

    public Double getValorUnitarioCompra() {
        return valorUnitarioCompra;
    }

    public void setValorUnitarioCompra(Double valorUnitarioCompra) {
        this.valorUnitarioCompra = valorUnitarioCompra;
    }
    
    
}


   
