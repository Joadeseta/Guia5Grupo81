/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia5grupo81.entidades;

// Importamos la clase LocalDate para trabajar con fechas.
import java.time.LocalDate;

// La entidad Alumnos representa a los estudiantes.
public class Alumnos {

    private int idAlumno;           // Identificador único del alumno.
    private int dni;                // Número de identificación (Documento Nacional de Identidad) del alumno.
    private String nombre;          // Nombre del alumno.
    private String apellido;        // Apellido del alumno.
    private LocalDate fechaNacimiento; // Fecha de nacimiento del alumno.
    private boolean activo;         // Estado de activo/inactivo del alumno.

    // Constructor por defecto.
    public Alumnos() {
    }

    // Constructor para crear un nuevo alumno (sin ID).
    public Alumnos(int dni, String nombre, String apellido, LocalDate fechaNacimiento, boolean activo) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.activo = activo;
    }

    // Constructor para crear un alumno con un ID específico (normalmente desde la base de datos).
    public Alumnos(int idAlumno, int dni, String nombre, String apellido, LocalDate fechaNacimiento, boolean activo) {
        this.idAlumno = idAlumno;
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.activo = activo;
    }

    // Métodos getters y setters para acceder y modificar los atributos de la entidad.
    // Estos son utilizados para obtener y establecer valores en los objetos Alumnos.

    public int getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(int idAlumno) {
        this.idAlumno = idAlumno;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    // Método toString que devuelve una representación en texto del alumno.
    // En este caso, se muestra el DNI, apellido y nombre del alumno.

    @Override
    public String toString() {
        return dni + ", " + apellido + ", " + nombre;
    }
}