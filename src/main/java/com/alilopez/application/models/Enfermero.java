package com.alilopez.application.models;

public class Enfermero extends ServicioMedico{
    private String tipo;
    public Enfermero(){
        super();
    }
    public Enfermero(int id,String edad, String nombre, String apellido,String tipo){
        super(id, edad, nombre, apellido);
        this.tipo=tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Enfermero: " +
                "edad: " + edad + '\'' +
                ", nombre: " + nombre + '\'' +
                ", apellido: " + apellido ;
    }
}
