/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia5grupo81;

import com.sun.org.apache.xml.internal.security.encryption.AgreementMethod;
import guia5grupo81.accesoadatos.AlumnoData;
import guia5grupo81.accesoadatos.InscripcionData;
import guia5grupo81.accesoadatos.MateriaData;
import guia5grupo81.entidades.Alumnos;
import guia5grupo81.entidades.Inscripcion;
import guia5grupo81.entidades.Materia;
import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author joadz
 */
public class Guia5Grupo81 {

    public static void main(String[] args) {

        /*Alumnos juan = new Alumnos(1, 311111111, "Juan Pablo", "Perez", LocalDate.of(1980, 5, 5), true);
        Alumnos Pedro = new Alumnos(7, 32222222, "Pedro Almo", "Perez", LocalDate.of(1980, 5, 5),true);
        Alumnos Mari = new Alumnos(8, 33333333, "Mari", "Ladelbarrio", LocalDate.of(1980, 5, 5), true);
        Alumnos Alicia = new Alumnos(9, 44444444, "Alicia", "Mara", LocalDate.of(1980, 5, 5), true);*/
        AlumnoData alu = new AlumnoData();

        /*for (Alumnos alumno : alu.listarAlumnos()) {
            System.out.println(alumno.getDni());
            System.out.println(alumno.getNombre());
            System.out.println(alumno.getApellido());
            System.out.println(alumno.getFechaNacimiento());
        }*/
 /*
        Alumnos alumnoEncontrado=alu.buscarAlumno(7);
        System.out.println("dni: " + alumnoEncontrado.getDni());
        System.out.println("nombre: " + alumnoEncontrado.getNombre());
        System.out.println( "apellido: "+alumnoEncontrado.getApellido());
         */
        Alumnos alumnoEncontrado = alu.buscarAlumnoPorDni(33333333);

        if (alumnoEncontrado != null) {

            System.out.println("dni: " + alumnoEncontrado.getDni());
            System.out.println("nombre: " + alumnoEncontrado.getNombre());
            System.out.println("apellido: " + alumnoEncontrado.getApellido());
        }
        /*
        alu.guardarAlumno(juan);*/
 /*alu.guardarAlumno(Pedro);*/
 /*alu.guardarAlumno(Mari);
        alu.guardarAlumno(Alicia);*/
 /*alu.modificarAlumno(juan);*/
        //alu.modificarAlumno(Pedro);
        /*alu.modificarAlumno(Mari);
        alu.modificarAlumno(Alicia);*/
        //alu.eliminarAlumno(7);
        ///Inscripcion
        /*
        AlumnoData ad=new AlumnoData();
        MateriaData md=new MateriaData();
        InscripcionData id=new InscripcionData();
        
        AlumnoData ricardo =ad.buscarAlumno(1);
        MateriaData md=new MateriaData(2);
        Inscripcion insc=new Inscripcion(ricardo,matematicas,9);
        
        
        id.guardarInscripcion(insc);
        id.actualizarNota(7,2,7);
        id.borrarInscripcionMaterialAlumno(7,2);
        
        
        for(Inscripcion inscripcion:id.obtenerInscripciones()){
            System.out.println("id"+inscripcion.getIdInscripcion());
            System.out.println("Apellido"+inscripcion.getAlumno().getApellido());
            System.out.println("Materia"+inscripcion.getMateria().getNombre());      
        }
         */
        //for(Materia materia:id.obtenerMateriasNOCursadas(22)){
        //    System.out.println("nombre"+materia.getNombre());
        //}
        //Apartado de Materias       
        Materia A = new Materia("Matemática", 2005, true);
        Materia B = new Materia("Lengua", 2006, true);
        Materia C = new Materia(3, "Lengua Extranjera: Ingles", 2008, true);
        Materia D = new Materia("Bilogía", 2006, true);
        Materia E = new Materia("Física", 2009, true);
        Materia F = new Materia("Química", 2010, true);
        Materia G = new Materia("Música", 2006, true);
        Materia H = new Materia(8, "Ed. Física", 2003, true);
        Materia I = new Materia(9, "Ed. Artística", 2006, true);
        MateriaData mat = new MateriaData();

        //Guardar Materias.
        /*mat.guardarMateria(A);
        mat.guardarMateria(B);
        mat.guardarMateria(C);
        mat.guardarMateria(D);
        mat.guardarMateria(E);
        mat.guardarMateria(F);
        mat.guardarMateria(G);
        mat.guardarMateria(H);
        mat.guardarMateria(I);*/
        //Modificar Materias.
        /*mat.modificarMateria(C);
        mat.modificarMateria(H);
        mat.modificarMateria(I);*/
        //Eliminar Materias.
        /*mat.eliminarMateria(3);
        mat.eliminarMateria(8);
        mat.eliminarMateria(9);*/
        //Activar Materias.
        /*mat.activarMateria(3);
        mat.activarMateria(8);*/
        //Buscar Materias.
        /*Materia materiaEncontrada = mat.buscarMateria(8);
            if (materiaEncontrada != null) {
                System.out.println("Nombre: " + materiaEncontrada.getNombre());
                System.out.println("Año: " + materiaEncontrada.getAño());
        }*/
        //Buscar Materias por Año.
        /*Materia materiaEncontrada = mat.buscarMateriaPorAño(2006);
        if (materiaEncontrada != null) {
            System.out.println("Nombre: " + materiaEncontrada.getNombre());
            System.out.println("Año: " + materiaEncontrada.getAño());
        }*/
        //Listar las Materias.
        /*for (Materia materia: mat.listarMaterias()) {
        System.out.println("Materia: " + materia.getNombre());
        System.out.println("Año: " + materia.getAño());
        }*/
        //Listar las Materias Anuladas.
        /*for (Materia materia: mat.listarMateriasAnuladas()) {
        System.out.println("Materia: " + materia.getNombre());
        System.out.println("Año: " + materia.getAño());
        }*/
    }

}
