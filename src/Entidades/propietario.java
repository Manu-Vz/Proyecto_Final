/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author pcdlc
 */
public class propietario {
  private int idpropetario;
   private String nombre;
   private String apellido;
    private int dni;
    private String domicilio;
   private int telefono;
    
   
   public propietario(){
       
   }
    
    public propietario (String nombre, String apellido, int dni, int telefono){
        
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.telefono = telefono;
        this.domicilio = domicilio;
    }
    
    public propietario (int idPropetario , String nombre, String apellido, int dni, int telefono){
       this.idpropetario = idpropetario;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.telefono = telefono;
        this.domicilio = domicilio;
    }

    public int getIdpropetario() {
        return idpropetario;
    }

    public void setIdpropetario(int idpropetario) {
        this.idpropetario = idpropetario;
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

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    
    
    
    

 @Override
public String toString() {
    return "Propietario [nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + ", telefono=" + telefono + ", domicilio=" + domicilio + "]";
} 
}
    