package Entidades;

import java.time.LocalDate;


/*
 * @author manuv
 */

public class contratoAlquiler {
    private int idContratoAlquiler;
    private Inquilino idInquilino;
    private PropiedadInmueble idPropiedadInmueble;
    private LocalDate fechaFinal;
    private LocalDate fechaInicio;
    private LocalDate fechaRealizacion;
    private final String marca = "La43";
    private int idVendedor;
    
    public contratoAlquiler(){};

    public contratoAlquiler(Inquilino idInquilino, PropiedadInmueble idPropiedadInmueble, LocalDate fechaFinal, LocalDate fechaInicio, LocalDate fechaRealizacion, int idVendedor) {
        this.idInquilino = idInquilino;
        this.idPropiedadInmueble = idPropiedadInmueble;
        this.fechaFinal = fechaFinal;
        this.fechaInicio = fechaInicio;
        this.fechaRealizacion = fechaRealizacion;
        this.idVendedor = idVendedor;
    }

    public int getIdContratoAlquiler() {
        return idContratoAlquiler;
    }

    public void setIdContratoAlquiler(int idContratoAlquiler) {
        this.idContratoAlquiler = idContratoAlquiler;
    }

    public Inquilino getIdInquilino() {
        return idInquilino;
    }

    public void setIdInquilino(Inquilino idInquilino) {
        this.idInquilino = idInquilino;
    }

    public PropiedadInmueble getIdPropiedadInmueble() {
        return idPropiedadInmueble;
    }

    public void setIdPropiedadInmueble(PropiedadInmueble idPropiedadInmueble) {
        this.idPropiedadInmueble = idPropiedadInmueble;
    }

    public LocalDate getFechaFinal() {
        return fechaFinal;
    }

    public void setFechaFinal(LocalDate fechaFinal) {
        this.fechaFinal = fechaFinal;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaRealizacion() {
        return fechaRealizacion;
    }

    public void setFechaRealizacion(LocalDate fechaRealizacion) {
        this.fechaRealizacion = fechaRealizacion;
    }

    public int getIdVendedor() {
        return idVendedor;
    }

    public void setIdVendedor(int idVendedor) {
        this.idVendedor = idVendedor;
    }

    @Override
    public String toString() {
        return "contratoAlquiler{" + "idContratoAlquiler=" + idContratoAlquiler + ", idInquilino=" + idInquilino + ", idPropiedadInmueble=" + idPropiedadInmueble + ", fechaFinal=" + fechaFinal + ", fechaInicio=" + fechaInicio + ", fechaRealizacion=" + fechaRealizacion + ", marca=" + marca + ", idVendedor=" + idVendedor + '}';
    }
    
}
