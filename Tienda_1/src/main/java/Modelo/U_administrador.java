/* Sub_clase de clase Usuarios */
package Modelo;

public class U_administrador extends Usuarios {

    public U_administrador() {
    }

    public U_administrador(String user, String password, String nombre, String apellido, String genero, String tipoIdentificacion, int numIdentificacion, String telefono, String direccion, String correo) {
        super(user, password, nombre, apellido, genero, tipoIdentificacion, numIdentificacion, telefono, direccion, correo);
    }

}