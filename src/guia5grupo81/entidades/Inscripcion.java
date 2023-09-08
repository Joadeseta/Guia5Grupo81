/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia5grupo81.entidades;

/**
 *
 * @author joadz
 */
public class Inscripcion {
    
    private int idInscripcion;
    private int nota;
    private Alumnos alumno;
    private Materia materia;

    public Inscripcion() {
    }

    public Inscripcion(int nota, Alumnos alumno, Materia materia) {
        this.nota = nota;
        this.alumno = alumno;
        this.materia = materia;
    }

    public Inscripcion(int idInscripcion, int nota, Alumnos alumno, Materia materia) {
        this.idInscripcion = idInscripcion;
        this.nota = nota;
        this.alumno = alumno;
        this.materia = materia;
    }

    public int getIdInscripcion() {
        return idInscripcion;
    }

    public void setIdInscripcion(int idInscripcion) {
        this.idInscripcion = idInscripcion;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public Alumnos getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumnos alumno) {
        this.alumno = alumno;
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia Materia) {
        this.materia = Materia;
    }

    @Override
    public String toString() {
        String  insc=idInscripcion+" "+ alumno.getApellido()+" "+ alumno.getNombre()+" "+materia.getNombre();
        return insc;
    }

   
   
    
    
}
