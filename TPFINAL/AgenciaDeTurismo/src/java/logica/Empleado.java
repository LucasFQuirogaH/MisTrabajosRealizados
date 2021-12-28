package logica;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;
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
public class Empleado implements Serializable {

    // Atributos  ------------------------------------------------------------------------------------------------------------------------------
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id_empleado;
    
    @Basic
    private String nombre;
    private String apellido;
    private String dirección;
    private String dni;
    private Date fecha_nac;
    private String nacionalidad;
    private String celular;
    private String email;
    private String cargo;
    private String sueldo;

    // Relaciones  ---------------------------------
    //Relacion 1 a 1 (Con Usuario)
    @OneToOne
    private Usuario usu;

    // Relacion 1 a n (Con Ventas)
//    @OneToOne
//    private List<Venta> listaVentas;
    
    // Constructores  -----------------------------------------------------------------------------------------------------------------------

    public Empleado() {
    }

    public Empleado(int id_empleado, String nombre, String apellido, String dirección, String dni, Date fecha_nac, String nacionalidad, String celular, String email, String cargo, String sueldo, Usuario usu) {
        this.id_empleado = id_empleado;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dirección = dirección;
        this.dni = dni;
        this.fecha_nac = fecha_nac;
        this.nacionalidad = nacionalidad;
        this.celular = celular;
        this.email = email;
        this.cargo = cargo;
        this.sueldo = sueldo;
        this.usu = usu;
    }
   
    // Getters & Setters

    public int getId_empleado() {
        return id_empleado;
    }

    public void setId_empleado(int id_empleado) {
        this.id_empleado = id_empleado;
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

    public String getDirección() {
        return dirección;
    }

    public void setDirección(String dirección) {
        this.dirección = dirección;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Date getFecha_nac() {
        return fecha_nac;
    }

    public void setFecha_nac(Date fecha_nac) {
        this.fecha_nac = fecha_nac;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getSueldo() {
        return sueldo;
    }

    public void setSueldo(String sueldo) {
        this.sueldo = sueldo;
    }

    public Usuario getUsu() {
        return usu;
    }

    public void setUsu(Usuario usu) {
        this.usu = usu;
    }
    
    
}
