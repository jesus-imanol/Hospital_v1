package com.alilopez.application.models;

import java.security.SecureRandom;

public class Farmaceutico extends ServicioMedico {
private String cargo;
public Farmaceutico(){
    super();
}
public Farmaceutico(int id, String edad, String nombre, String apellido, String cargo){
super(id, edad, nombre, apellido);
this.cargo=cargo;
}

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return "Farmaceutico: " +
                "edad: " + edad + '\'' +
                ", nombre: " + nombre + '\'' +
                ", apellido: " + apellido ;
    }
}
