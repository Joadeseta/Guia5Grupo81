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
        
    Alumnos juan=new Alumnos(30303030,"Juan", "Perez", LocalDate.of(1980,5, 5),true );
    
    AlumnoData alu=new AlumnoData();
    alu.guardarAlumno(juan);
    
    
    
    }
    
}
