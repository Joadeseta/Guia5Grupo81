/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia5grupo81.entidades;

// La entidad Inscripcion representa la relación entre un alumno y una materia, junto con la nota obtenida.

public class Inscripcion {
    
    private int idInscripcion;    // Identificador único de la inscripción.
    private int nota;             // Nota obtenida en la materia.
    private Alumnos alumno;       // Referencia al objeto Alumnos que representa al estudiante.
    private Materia materia;      // Referencia al objeto Materia que representa la materia inscrita.

    // Constructor por defecto.
    public Inscripcion() {
    }

    // Constructor para crear una nueva inscripción (sin ID).
    public Inscripcion(int nota, Alumnos alumno, Materia materia) {
        this.nota = nota;
        this.alumno = alumno;
        this.materia = materia;
    }

    // Constructor para crear una inscripción con un ID específico (normalmente desde la base de datos).
    public Inscripcion(int idInscripcion, int nota, Alumnos alumno, Materia materia) {
        this.idInscripcion = idInscripcion;
        this.nota = nota;
        this.alumno = alumno;
        this.materia = materia;
    }

    // Métodos getters y setters para acceder y modificar los atributos de la entidad.
    // Estos son utilizados para obtener y establecer valores en los objetos Inscripcion.

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

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    // Método toString que devuelve una representación en texto de la inscripción.
    // En este caso, se muestra el ID de la inscripción, el apellido y nombre del alumno, y el nombre de la materia.

    @Override
    public String toString() {
        String inscripcion = idInscripcion + " " + alumno.getApellido() + " " + alumno.getNombre() + " " + materia.getNombre();
        return inscripcion;
    }
}