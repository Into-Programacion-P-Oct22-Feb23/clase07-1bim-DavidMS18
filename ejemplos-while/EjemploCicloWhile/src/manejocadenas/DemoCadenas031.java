/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejocadenas;

/**
 *
 * @author reroes
 */
public class DemoCadenas031 {
    public static void main(String[] args) {
        String nombre = "Ariel David";
        String apellido = "Montoya";
        int edad = 19;
        String cadenaAcumuladora = "Datos Personales\n";
        
        cadenaAcumuladora = String.format("%s%s\n", cadenaAcumuladora, nombre);
        //%s para rem´plazar con variables
        cadenaAcumuladora = String.format("%s%s\n", cadenaAcumuladora, apellido);
        //acumular cadena es "variable(en este caso)cadenaAcumuladora = String.format()"
        cadenaAcumuladora = String.format("%s%s\n", cadenaAcumuladora,edad);
        
        System.out.printf("%s", cadenaAcumuladora);
        
    }
}
