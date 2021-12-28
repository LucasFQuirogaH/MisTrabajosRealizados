package logica;

import java.sql.Date;

/**
 *
 * @author lucquifer
 */
public class Venta {

    //Atributos
    private int num_venta;
    private Date fecha_venta;
    private String medio_pago;

    //  Relaciones  ------------------------------
    private ServicioTuristico servi;
    private PaqueteTuristico paque;
    private Cliente clien;
    private Empleado emple;
    
    //  Constructores  ----------------------------------------------------------------------------------------------------------------------

    public Venta() {
    }

    public Venta(int num_venta, Date fecha_venta, String medio_pago, ServicioTuristico servi, PaqueteTuristico paque, Cliente clien, Empleado emple) {
        this.num_venta = num_venta;
        this.fecha_venta = fecha_venta;
        this.medio_pago = medio_pago;
        this.servi = servi;
        this.paque = paque;
        this.clien = clien;
        this.emple = emple;
    }
    
    //  Getters & Setters  ------------------------------------------------------------------------------------------------------------------

    public int getNum_venta() {
        return num_venta;
    }

    public void setNum_venta(int num_venta) {
        this.num_venta = num_venta;
    }

    public Date getFecha_venta() {
        return fecha_venta;
    }

    public void setFecha_venta(Date fecha_venta) {
        this.fecha_venta = fecha_venta;
    }

    public String getMedio_pago() {
        return medio_pago;
    }

    public void setMedio_pago(String medio_pago) {
        this.medio_pago = medio_pago;
    }

    public ServicioTuristico getServi() {
        return servi;
    }

    public void setServi(ServicioTuristico servi) {
        this.servi = servi;
    }

    public PaqueteTuristico getPaque() {
        return paque;
    }

    public void setPaque(PaqueteTuristico paque) {
        this.paque = paque;
    }

    public Cliente getClien() {
        return clien;
    }

    public void setClien(Cliente clien) {
        this.clien = clien;
    }

    public Empleado getEmple() {
        return emple;
    }

    public void setEmple(Empleado emple) {
        this.emple = emple;
    }
    
}
