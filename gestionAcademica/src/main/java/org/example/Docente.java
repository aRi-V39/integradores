package org.example;

import java.io.Serializable;

public class Docente extends Persona implements Serializable {
    private static final long serialVersionUID = 1L;
    private String especialidad;
    public Docente (String nombre, int edad, String especialidad){
        super(nombre, edad);
        this.especialidad = especialidad;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public String toString(){
        return "Docente: " + getNombre() + ", Edad: " + getEdad() + ", Especialidad: " + getEspecialidad();
    }
}
