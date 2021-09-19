/* Clase coneccion a compra de productos*/
package Modelo;

public class Proveedores{
    //Atributos
    
    private int id;
    private int nit;
    private String razonSocial;
//  Constructores

    public Proveedores() {
    }

    public Proveedores(int id, int nit, String razonSocial) {
        this.id = id;
        this.nit = nit;
        this.razonSocial = razonSocial;
    }
    //Accesadores

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNit() {
        return nit;
    }

    public void setNit(int nit) {
        this.nit = nit;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }
    
    
}