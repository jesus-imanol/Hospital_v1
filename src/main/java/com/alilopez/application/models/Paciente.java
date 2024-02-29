package com.alilopez.application.models;

import java.util.ArrayList;

public class Paciente {
    private int idPaciente;
    private String nombrePaciente;
    private String edadPaciente;
    private String casoPaciente;
    private boolean statuss;
    private ArrayList<ServicioMedico> servicioMedicos=new ArrayList<>();
    public Paciente(String nombrePaciente, String edadPaciente, String casoPaciente) {
        this.nombrePaciente = nombrePaciente;
        this.edadPaciente = edadPaciente;
        this.casoPaciente = casoPaciente;
        this.idPaciente = (int)(Math.random()*899+100);
        this.statuss=false;
    }

    public Paciente(){}
    public boolean isStatuss() {
        return statuss;
    }

    public void setStatuss(boolean statuss) {
        this.statuss = statuss;
    }

    public String getNombrePaciente() {
        return nombrePaciente;
    }

    public int getIdPaciente() {
        return idPaciente;
    }

    public void setNombrePaciente(String nombrePaciente) {
        this.nombrePaciente = nombrePaciente;
    }

    public String getEdadPaciente() {
        return edadPaciente;
    }

    public void setEdadPaciente(String edadPaciente) {
        this.edadPaciente = edadPaciente;
    }

    public String getCasoPaciente() {
        return casoPaciente;
    }

    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }

    public void setCasoPaciente(String casoPaciente) {
        this.casoPaciente = casoPaciente;
    }

    public boolean addServiceMedical(ServicioMedico servicioMedic){
        boolean status;
        status = servicioMedicos.add(servicioMedic);
        return status;
    }


    public ArrayList<ServicioMedico> getServicioMedicos() {
        return servicioMedicos;
    }
    @Override
    public String toString() {
        return "Paciente" +'\n'+
                "Id: " + idPaciente+'\n'+
                "  NombrePaciente: " + nombrePaciente + '\n'+
                ", EdadPaciente: " + edadPaciente + '\n' +
                ", CasoPaciente: " + casoPaciente + '\n' ;
    }
}
