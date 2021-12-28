package persistencia;

import logica.Empleado;
import logica.Usuario;

/**
 *
 * @author lucquifer
 */
public class ControladoraPersistencia {

    // Instancias los JPA controller de cada parametro que le pasas
    EmpleadoJpaController empleJPA = new EmpleadoJpaController();
    UsuarioJpaController usuJPA = new UsuarioJpaController();
    
    public void crearEmpleado(Empleado emple, Usuario usu) {
        usuJPA.create(usu);
        empleJPA.create(emple);
    }
    
}
