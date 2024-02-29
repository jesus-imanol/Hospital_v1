package com.alilopez.application.models;

import java.util.ArrayList;

public class Citas {

    private int idCita;
    private ArrayList<Paciente> pacientes= new ArrayList<>();
    public Citas() {
        this.idCita = (int)(Math.random()*899+100);
    }
    public boolean addPaciente (Paciente pacient){
        boolean status;
        status=pacientes.add(pacient);
        return status;
    }

    public int getIdCita() {
        return idCita;
    }

    public void setIdCita(int idCita) {
        this.idCita = idCita;
    }


    public ArrayList<Paciente> getPacientes(){
        return pacientes;
    }

}
