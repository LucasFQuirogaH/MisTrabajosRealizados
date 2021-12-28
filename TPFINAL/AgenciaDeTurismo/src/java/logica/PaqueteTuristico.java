package logica;

import java.util.List;

/**
 *
 * @author lucquifer
 */
public class PaqueteTuristico {

    // Atributos  ------------------------------------------------------------------------------------------------------------------------------
    private int codigo_paquete;
    private Double costo_paquete;
    
    // Relaciones  ------------------------------------------- 
    private List<Venta> listaVentas;
    private List<ServicioTuristico>listaServicios;
    
    // Constructores  -----------------------------------------------------------------------------------------------------------------------

    public PaqueteTuristico() {
    }

    public PaqueteTuristico(int codigo_paquete, Double costo_paquete, List<Venta> listaVentas, List<ServicioTuristico> listaServicios) {
        this.codigo_paquete = codigo_paquete;
        this.costo_paquete = costo_paquete;
        this.listaVentas = listaVentas;
        this.listaServicios = listaServicios;
    }
    
    //  Getters & Setters  -----------------------------------------------------------------------------------------------------------------

    public int getCodigo_paquete() {
        return codigo_paquete;
    }

    public void setCodigo_paquete(int codigo_paquete) {
        this.codigo_paquete = codigo_paquete;
    }

    public Double getCosto_paquete() {
        return costo_paquete;
    }

    public void setCosto_paquete(Double costo_paquete) {
        this.costo_paquete = costo_paquete;
    }

    public List<Venta> getListaVentas() {
        return listaVentas;
    }

    public void setListaVentas(List<Venta> listaVentas) {
        this.listaVentas = listaVentas;
    }

    public List<ServicioTuristico> getListaServicios() {
        return listaServicios;
    }

    public void setListaServicios(List<ServicioTuristico> listaServicios) {
        this.listaServicios = listaServicios;
    }
    
}
