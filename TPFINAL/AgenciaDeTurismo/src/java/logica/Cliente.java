package logica;

import java.sql.Date;
import java.util.List;

/**
 *
 * @author lucquifer
 */

public class Cliente {

    //Atributos  -------------------------------------------------------------------------------------------------------------------------------
    
    private int id_cliente;
    private String nombre;
    private String apellido;
    private String direccion;
    private String dni;
    private Date fecha_nac;
    private String nacionalidad;
    private String celular;
    private String email;
    
    // Relaciones  ----------------------------------------
    List <Venta>listaVendidos;
    
    // Constructores  -----------------------------------------------------------------------------------------------------------------------
    public Cliente() {
    }

    public Cliente(int id_cliente, String nombre, String apellido, String direccion, String dni, Date fecha_nac, String nacionalidad, String celular, String email, List<Venta> listaVendidos) {
        this.id_cliente = id_cliente;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.dni = dni;
        this.fecha_nac = fecha_nac;
        this.nacionalidad = nacionalidad;
        this.celular = celular;
        this.email = email;
        this.listaVendidos = listaVendidos;
    }
    
    // Getters & Setters  ------------------------------------------------------------------------------------------------------------------
    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
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

    public List<Venta> getListaVendidos() {
        return listaVendidos;
    }

    public void setListaVendidos(List<Venta> listaVendidos) {
        this.listaVendidos = listaVendidos;
    }
    
}
