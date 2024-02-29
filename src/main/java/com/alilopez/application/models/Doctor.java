package com.alilopez.application.models;

public class Doctor extends ServicioMedico{
    String especialidad;
    public Doctor(){
        super();
    }
    public Doctor(int id, String edad, String nombre, String apellido,String especialidad){
        super(id, edad, nombre, apellido);
        this.especialidad=especialidad;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public String toString() {
        return "Doctor: " +
                "edad: " + edad + '\'' +
                ", nombre: " + nombre + '\'' +
                ", apellido: " + apellido;
    }
}
