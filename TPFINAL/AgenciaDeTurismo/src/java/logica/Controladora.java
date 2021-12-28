package logica;

import java.sql.Date;
import persistencia.ControladoraPersistencia;

/**
 *
 * @author lucquifer
 */
public class Controladora {

    public void crearEmpleado(String nombre, String apellido, String direccion, String dni, Date fecha_nac, String nacionalidad, String celular, String email, String cargo, String sueldo, String nombreUsu, String contrasenia) {

        // Instancias a la controladora de persistencia
        ControladoraPersistencia controlPersis = new ControladoraPersistencia();
        
        Empleado emple = new Empleado();
        Usuario usu = new Usuario();

        // Asignando a empleado  --------------------------------------------------------------------------------------------------------
        emple.setNombre(nombre);
        emple.setApellido(apellido);
        emple.setDirección(direccion);
        emple.setDni(dni);
        emple.setFecha_nac(fecha_nac);
        emple.setNacionalidad(nacionalidad);
        emple.setCelular(celular);
        emple.setEmail(email);
        emple.setCargo(cargo);
        emple.setSueldo(sueldo);
        
        // Asigno el usuario al empleado
        emple.setUsu(usu);
        
        // Asignando a Usuario  -----------------------------------------------------------------------------------------------------------
        usu.setNombreUsu(nombreUsu);
        usu.setContrasenia(contrasenia);
        
        // Llama al metodo que crea al empleado
        controlPersis.crearEmpleado(emple , usu);
        
    }

}
