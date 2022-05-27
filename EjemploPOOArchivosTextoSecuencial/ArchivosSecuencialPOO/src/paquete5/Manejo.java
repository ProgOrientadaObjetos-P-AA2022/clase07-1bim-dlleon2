/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete5;

import java.util.ArrayList;
import paquete1.Profesor;
import paquete1.Calificacion;
/**
 *
 * @author UTPL
 */
public class Manejo {
    public static void main(String[] args) {
        Calificacion c1 = new Calificacion(9.1,"Matematicas" );
        Calificacion c2 = new Calificacion(9.3, "Programacion");
                
        Profesor prof1 = new Profesor("Joseph Jimenez", "facturado");
        Profesor prof2 = new Profesor("David Jones", "nombramiento");
        
        c1.establecerProfesor(prof1);
        c2.establecerProfesor(prof2);
        
        System.out.println("-----------------------------");
        // Arreglo
        Profesor [] profesores = new Profesor[2];
        profesores[0] = prof1;
        profesores[1] = prof2;
        
        for (int i = 0; i < profesores.length; i++) {
            System.out.printf("%s - %s\n", profesores[i].obtenerNombre(),
                    profesores[i].obtenerTipo());
        }
        
        System.out.println("-----------------------------");
        
        // ArrayList
        ArrayList <Profesor> profesores2 = new ArrayList<>();
        profesores2.add(prof1);
        profesores2.add(prof2);
        
        for (int i = 0; i < profesores2.size(); i++) {
            //Nombre del profesor
            //Nombre de la materia
            //La nota
            //System.out.println("%s - %s\n", profesores[i].obtenerNombre(),
            //         profesores[i].obtenerTipo());
            Profesor p = profesores2.get(1);
            System.out.printf("%s - %s\n", profesores2.get(i).obtenerNombre(),
                    profesores2.get(i).obtenerTipo());
            
        }
        
        System.out.println("-----------------------------");
        
        Profesor prof3 = new Profesor("Melissa Gilbert", "contratado");
        profesores2.add(prof3);
        
        for (int i = 0; i < profesores2.size(); i++) {
            System.out.printf("%s - %s\n", profesores2.get(i).obtenerNombre(),
                    profesores2.get(i).obtenerTipo());
        }
    }
}

