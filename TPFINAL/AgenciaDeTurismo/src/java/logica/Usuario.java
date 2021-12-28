package logica;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 *
 * @author lucquifer
 */
@Entity
public class Usuario implements Serializable {

    //  Atributos  -----------------------------------------------------------------------------------------------------------------------------
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    
    @Basic
    private String nombreUsu;
    private String contrasenia;

    // Relaciones  --------------------------------
    @OneToOne
    private Empleado emple;

    //  Constructores  ----------------------------------------------------------------------------------------------------------------------
    public Usuario() {
    }

    public Usuario(int id, String nombreUsu, String contrasenia, Empleado emple) {
        this.id = id;
        this.nombreUsu = nombreUsu;
        this.contrasenia = contrasenia;
        this.emple = emple;
    }

    //  Getters & Setters  -----------------------------------------------------------------------------------------------------------------
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreUsu() {
        return nombreUsu;
    }

    public void setNombreUsu(String nombreUsu) {
        this.nombreUsu = nombreUsu;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public Empleado getEmple() {
        return emple;
    }

    public void setEmple(Empleado emple) {
        this.emple = emple;
    }

}
