package com.alilopez.application.models;

import java.util.ArrayList;

public class ServicioMedico {

    protected int id;
    protected String edad;
    protected String nombre;
    protected String apellido;

/*    servicioMedicos.add(doctor);
    ((Doctor)serviciosmedicos.get(0)).setEspecialidad*/


    public ServicioMedico(int id,String edad, String nombre, String apellido) {
        this.id = id;
        this.edad = edad;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public ServicioMedico() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
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
}
