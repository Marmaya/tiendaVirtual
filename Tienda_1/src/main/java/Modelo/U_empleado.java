/*sub_clase de clase Usuarios*/
package Modelo;

public class U_empleado extends Usuarios {
    //Atributos
    private int id;

    // Constructores

    public U_empleado() {
    }

    public U_empleado(int id) {
        this.id = id;
    }

    public U_empleado(String user, String password, String nombre, String apellido, String genero, String tipoIdentificacion, int numIdentificacion, String telefono, String direccion, String correo) {
        super(user, password, nombre, apellido, genero, tipoIdentificacion, numIdentificacion, telefono, direccion, correo);
    }
    
    // Accesadores
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
}  
    
    
    
    