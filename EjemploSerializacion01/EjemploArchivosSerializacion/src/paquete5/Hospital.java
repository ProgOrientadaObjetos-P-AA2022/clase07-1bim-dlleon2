/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete5;

import java.io.Serializable;

/**
 *
 * @author reroes
 */
public class Hospital implements Serializable{
    String nombre;
    int numeroCamas;
    double presupuesto;
    
    public Hospital(String n, int nu, double pre){
        nombre = n;
        numeroCamas = nu;
        presupuesto = pre;
    }

    Hospital(String san_Agustin, String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void establecerNombre(String n){
        nombre = n;
    }
    
    public void establecernumerodeCamas(int nu){
        numeroCamas = nu;
    }
    
    public void establecerpresupuesto(double pre){
        presupuesto = pre;
    }
    
    public String obtenerNombre(){
        return nombre;
    }
    
    public int obtenernumerodeCamas(){
        return numeroCamas;
    }
    
    public double obtenerpresupuesto(){
        return presupuesto;
    }
   
}