    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete5;

import java.util.ArrayList;
import paquete1.Empresa;
/**
 *
 * @author reroes
 */
public class ManejoArrayList1 {
    public static void main(String[] args) {
    
        Empresa e1 = new Empresa("carros", "Loja");
        Empresa e2 = new Empresa("Comida", "Cuenca");
        Empresa e3 = new Empresa("Platas","loja");
        
        
        ArrayList <Empresa> empresas = new ArrayList<>();
        empresas.add(e1);
        empresas.add(e2);
        empresas.add(e3);
        
         for (int i = 0; i <empresas.size(); i++) {
            System.out.printf("%s - %s\n", empresas.get(i).obtenerNombre(),
                    empresas.get(i).obtenerCiudad());
        }
        
    }
}