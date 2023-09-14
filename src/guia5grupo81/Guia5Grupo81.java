/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia5grupo81;

import com.sun.org.apache.xml.internal.security.encryption.AgreementMethod;
import guia5grupo81.accesoadatos.AlumnoData;
import guia5grupo81.entidades.Alumnos;
import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author joadz
 */
public class Guia5Grupo81 {

    public static void main(String[] args) {

        /*Alumnos juan = new Alumnos(1, 311111111, "Juan Pablo", "Perez", LocalDate.of(1980, 5, 5), true);*/
        Alumnos Pedro = new Alumnos(7, 32222222, "Pedro Almo", "Perez", LocalDate.of(1980, 5, 5),true);
        /*Alumnos Mari = new Alumnos(8, 33333333, "Mari", "Ladelbarrio", LocalDate.of(1980, 5, 5), true);
        Alumnos Alicia = new Alumnos(9, 44444444, "Alicia", "Mara", LocalDate.of(1980, 5, 5), true);*/

        AlumnoData alu = new AlumnoData();
        /*
        alu.guardarAlumno(juan);*/
        /*alu.guardarAlumno(Pedro);*/
        /*alu.guardarAlumno(Mari);
        alu.guardarAlumno(Alicia);*/
        /*alu.modificarAlumno(juan);*/
        alu.modificarAlumno(Pedro);
        /*alu.modificarAlumno(Mari);
        alu.modificarAlumno(Alicia);*/
        alu.eliminarAlumno(7);
 
    }

}
