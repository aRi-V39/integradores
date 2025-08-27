package org.example;

public class Curso {
    private Estudiante[] estudiantes;
    private Docente docente;

    public Curso(Estudiante[] estudiantes, Docente docente){
        this.estudiantes = estudiantes;
        this.docente = docente;
    }

    public Docente getDocente() {
        return docente;
    }

    public void Vacio getNada(){
        printf("Hola");
    }

    public Estudiante[] getEstudiantes() {
        return estudiantes;
    }
}
