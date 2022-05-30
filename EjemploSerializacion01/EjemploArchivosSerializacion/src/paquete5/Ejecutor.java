/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete5;


public class Ejecutor {

    public static void main(String[] args) {
        String nombreArchivo = "Hospital.data";
        
        Hospital H1 = new Hospital("San Agustin" , "1200");
        Hospital H2 = new Hospital("san fracisco", "200");
        Hospital H3 = new Hospital("santa Maria", "2560");

        EscrituraArchivoSecuencial archivo = 
                new EscrituraArchivoSecuencial(nombreArchivo);
        
        // establecer el valor del atributo registro
        archivo.establecerHospital(H1);
        // establecer en el archivo el atributo del registro
        archivo.establecerSalida();
        archivo.establecerHospital(H2);
        archivo.establecerSalida();
        archivo.establecerHospital(H3);
        archivo.establecerSalida();
        archivo.cerrarArchivo();
        
        LecturaArchivoSecuencial lectura = 
                new LecturaArchivoSecuencial(nombreArchivo);
        lectura.establecerProfesores();
        System.out.println(lectura);
        }
       
    }

