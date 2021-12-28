package logica;

import java.sql.Date;
import java.util.List;

/**
 *
 * @author lucquifer
 */
public class ServicioTuristico {

    //Atributos  -------------------------------------------------------------------------------------------------------------------------------
    private int codigo_servicio;
    private String nombre;
    private String escripción_breve;
    private String destino_servicio;
    private Date fecha_servicio;
    private Double costo_servicio;
    
    // Relaciones   ---------------------------------------
    List<PaqueteTuristico> listaPaquetes;
    List<Venta>listaVentas;
    
    // Constructores  -----------------------------------------------------------------------------------------------------------------------

    public ServicioTuristico() {
    }

    public ServicioTuristico(int codigo_servicio, String nombre, String escripción_breve, String destino_servicio, Date fecha_servicio, Double costo_servicio, List<PaqueteTuristico> listaPaquetes, List<Venta> listaVentas) {
        this.codigo_servicio = codigo_servicio;
        this.nombre = nombre;
        this.escripción_breve = escripción_breve;
        this.destino_servicio = destino_servicio;
        this.fecha_servicio = fecha_servicio;
        this.costo_servicio = costo_servicio;
        this.listaPaquetes = listaPaquetes;
        this.listaVentas = listaVentas;
    }
    
    //  Getters & Setters  -----------------------------------------------------------------------------------------------------------------

    public int getCodigo_servicio() {
        return codigo_servicio;
    }

    public void setCodigo_servicio(int codigo_servicio) {
        this.codigo_servicio = codigo_servicio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEscripción_breve() {
        return escripción_breve;
    }

    public void setEscripción_breve(String escripción_breve) {
        this.escripción_breve = escripción_breve;
    }

    public String getDestino_servicio() {
        return destino_servicio;
    }

    public void setDestino_servicio(String destino_servicio) {
        this.destino_servicio = destino_servicio;
    }

    public Date getFecha_servicio() {
        return fecha_servicio;
    }

    public void setFecha_servicio(Date fecha_servicio) {
        this.fecha_servicio = fecha_servicio;
    }

    public Double getCosto_servicio() {
        return costo_servicio;
    }

    public void setCosto_servicio(Double costo_servicio) {
        this.costo_servicio = costo_servicio;
    }

    public List<PaqueteTuristico> getListaPaquetes() {
        return listaPaquetes;
    }

    public void setListaPaquetes(List<PaqueteTuristico> listaPaquetes) {
        this.listaPaquetes = listaPaquetes;
    }

    public List<Venta> getListaVentas() {
        return listaVentas;
    }

    public void setListaVentas(List<Venta> listaVentas) {
        this.listaVentas = listaVentas;
    }
    
    
}
