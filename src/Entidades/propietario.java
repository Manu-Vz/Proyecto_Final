/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;
import java.util.ArrayList;
/**
 *
 * @author pcdlc
 */
public class propietario {
  
   private String nombre;
   private String apellido;
    private int dni;
    private String domicilio;
   private int telefono;
    private ArrayList<String> nombresLocales;
    
    public propietario (String nombre, String apellido, String dni, String telefono){
        
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.telefono = telefono;
        this.nombresLocales = new ArrayList<>(); 
        
    
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

    public int getDNI() {
        return dni;
    }

    public void setDNI(int dni) {
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

    public ArrayList<String> getNombresLocales() {
        return nombresLocales;
    }

    public void setNombresLocales(ArrayList<String> nombresLocales) {
        this.nombresLocales = nombresLocales;
    }
    
   @Override
    public String toString() {
        return "Propietario [nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + ", telefono="
                + telefono + ", nombresLocales=" + nombresLocales + "]"; {
        
    }
    

