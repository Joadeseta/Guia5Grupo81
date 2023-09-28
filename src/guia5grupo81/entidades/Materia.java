/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia5grupo81.entidades;

// La entidad Materia representa una materia académica que puede ser inscrita por estudiantes.
public class Materia {

    private int idMateria;    // Identificador único de la materia.
    private String nombre;    // Nombre de la materia.
    private int año;          // Año en el que se imparte la materia.
    private boolean estado;   // Estado de la materia, si está activa o no.

    // Constructor para crear una nueva materia (sin ID).
    public Materia(String nombre, int año, boolean estado) {
        this.nombre = nombre;
        this.año = año;
        this.estado = estado;
    }

    // Constructor para crear una materia con un ID específico (normalmente desde la base de datos).
    public Materia(int idMateria, String nombre, int año, boolean estado) {
        this.idMateria = idMateria;
        this.nombre = nombre;
        this.año = año;
        this.estado = estado;
    }

    // Constructor por defecto.
    public Materia() {
    }

    // Métodos getters y setters para acceder y modificar los atributos de la entidad.
    // Estos son utilizados para obtener y establecer valores en los objetos Materia.
    public int getIdMateria() {
        return idMateria;
    }

    public void setIdMateria(int idMateria) {
        this.idMateria = idMateria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    // Método toString que devuelve una representación en texto de la materia.
    // En este caso, se muestra el ID de la materia, el nombre, el año y el estado.
    @Override
    public String toString() {

        return "Materia{" + "idMateria=" + idMateria + ", nombre=" + nombre + ", año=" + año + ", estado=" + estado + '}';

        return "ID: "+idMateria+"; "+nombre+"; "+año;

    }
}
