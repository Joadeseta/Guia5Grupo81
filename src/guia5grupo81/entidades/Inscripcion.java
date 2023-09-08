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
    private int alumno;
    private int materia;

    public Inscripcion() {
    }

    public Inscripcion(int nota, int alumno, int materia) {
        this.nota = nota;
        this.alumno = alumno;
        this.materia = materia;
    }

    public Inscripcion(int idInscripcion, int nota, int alumno, int materia) {
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

    public int getAlumno() {
        return alumno;
    }

    public void setAlumno(int idAlumno) {
        this.alumno = idAlumno;
    }

    public int getMateria() {
        return materia;
    }

    public void setMateria(int idMateria) {
        this.materia = idMateria;
    }

    @Override
    public String toString() {
        return "Inscripcion{" + "idInscripcion=" + idInscripcion + ", nota=" + nota + ", alumno=" + alumno + ", materia=" + materia + '}';
    }

   
   
    
    
}
