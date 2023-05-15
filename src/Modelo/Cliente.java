/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

public class Cliente {
    private int id;
    //private String dni;
    private String nombre;
    private String telefono;
    private String direccion;
    private String correo;
    private String hobbies;
    private String molestias;
    private String cumpleanios;

    public Cliente() {
    }
    // String dni
    public Cliente(int id, String nombre, String telefono, String direccion, String correo, String hobbies, String molestias, String cumpleanios) {
        this.id = id;
        //this.dni = dni;
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
        this.correo = correo;
        this.hobbies = hobbies;
        this.molestias = molestias;
        this.cumpleanios = cumpleanios;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getHobbies() {
        return hobbies;
    }

    public void setHobbies(String hobbies) {
        this.hobbies = hobbies;
    }

    public String getMolestias() {
        return molestias;
    }

    public void setMolestias(String molestias) {
        this.molestias = molestias;
    }

    public String getCumpleanios() {
        return cumpleanios;
    }

    public void setCumpleanios(String cumpleanios) {
        this.cumpleanios = cumpleanios;
    }   
}

