/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author manuv
 */
public class PropiedadInmueble {
    private int idPropiedadInmueble;
    private Propietario propietario;
    private String accedibilidad;
    private String caracteristicasString;
    private String direccion;
    private EstadoLocal estadoLocal;
    private float precioTrazado;
    private Inspector inspector;
    private TipoLocal tipoLocal;
    private Zona zona;
    private boolean disponibilidad;
    
    public PropiedadInmueble(){}

    public PropiedadInmueble(Propietario propietario, String accedibilidad, String caracteristicasString, String direccion, EstadoLocal estadoLocal, float precioTrazado, Inspector inspector, TipoLocal tipoLocal, Zona zona, boolean disponibilidad) {
        this.propietario = propietario;
        this.accedibilidad = accedibilidad;
        this.caracteristicasString = caracteristicasString;
        this.direccion = direccion;
        this.estadoLocal = estadoLocal;
        this.precioTrazado = precioTrazado;
        this.inspector = inspector;
        this.tipoLocal = tipoLocal;
        this.zona = zona;
        this.disponibilidad = disponibilidad;
    }

    public PropiedadInmueble(int idPropiedadInmueble, Propietario propietario, String accedibilidad, String caracteristicasString, String direccion, EstadoLocal estadoLocal, float precioTrazado, Inspector inspector, TipoLocal tipoLocal, Zona zona, boolean disponibilidad) {
        this.idPropiedadInmueble = idPropiedadInmueble;
        this.propietario = propietario;
        this.accedibilidad = accedibilidad;
        this.caracteristicasString = caracteristicasString;
        this.direccion = direccion;
        this.estadoLocal = estadoLocal;
        this.precioTrazado = precioTrazado;
        this.inspector = inspector;
        this.tipoLocal = tipoLocal;
        this.zona = zona;
        this.disponibilidad = disponibilidad;
    }

    public int getIdPropiedadInmueble() {
        return idPropiedadInmueble;
    }

    public void setIdPropiedadInmueble(int idPropiedadInmueble) {
        this.idPropiedadInmueble = idPropiedadInmueble;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
    }

    public String getAccedibilidad() {
        return accedibilidad;
    }

    public void setAccedibilidad(String accedibilidad) {
        this.accedibilidad = accedibilidad;
    }

    public String getCaracteristicasString() {
        return caracteristicasString;
    }

    public void setCaracteristicasString(String caracteristicasString) {
        this.caracteristicasString = caracteristicasString;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public EstadoLocal getEstadoLocal() {
        return estadoLocal;
    }

    public void setEstadoLocal(EstadoLocal estadoLocal) {
        this.estadoLocal = estadoLocal;
    }

    public float getPrecioTrazado() {
        return precioTrazado;
    }

    public void setPrecioTrazado(float precioTrazado) {
        this.precioTrazado = precioTrazado;
    }

    public Inspector getInspector() {
        return inspector;
    }

    public void setInspector(Inspector inspector) {
        this.inspector = inspector;
    }

    public TipoLocal getTipoLocal() {
        return tipoLocal;
    }

    public void setTipoLocal(TipoLocal tipoLocal) {
        this.tipoLocal = tipoLocal;
    }

    public Zona getZona() {
        return zona;
    }

    public void setZona(Zona zona) {
        this.zona = zona;
    }

    public boolean isDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    @Override
    public String toString() {
        return "PropiedadInmueble{" + "idPropiedadInmueble=" + idPropiedadInmueble + ", propietario=" + propietario + ", accedibilidad=" + accedibilidad + ", caracteristicasString=" + caracteristicasString + ", direccion=" + direccion + ", estadoLocal=" + estadoLocal + ", precioTrazado=" + precioTrazado + ", inspector=" + inspector + ", tipoLocal=" + tipoLocal + ", zona=" + zona + ", disponibilidad=" + disponibilidad + '}';
    }
    
    
    
    
}
