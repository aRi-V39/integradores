package org.example;

import java.io.Serializable;

public class Estudiante extends Persona implements Serializable  {
    private static final long serialVersionUID = 1L;
    private double[] notas;
    public Estudiante(String nombre, int edad, double[] notas){
        super(nombre, edad);
        this.notas = notas;
    }

    public double[] getNotas() {
        return notas;
    }

    @Override
    public String toString(){
        String retorno = "Nombre: " + getNombre() + ", Edad: " + getEdad();;
        for (double aux : getNotas()){
            retorno = retorno + ", " + String.format("%.2f",aux);
        }
        return retorno;
    }
}
