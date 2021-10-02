/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author EL MEGAS
 */
public class PruebaArreglo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int arreglo1[] = {5, 40, 25, 45, 78};
        
        int arreglo2[][] = {{51, 15},
                            {1408, 1210, 887},
                            {715, 846, 212}};
        
        
        String arreglo3;
        
        arreglo3 = "Hola soy un string.";
        
        String arreglo4;
        
        arreglo4 = "Hola soy otro string.";
        
        
        Arreglo.sumarLista(arreglo1);
        
        System.out.println("El numero mayor del arreglo es: " + Arreglo.buscarMayor(arreglo2)); 
        
        System.out.println("La cantidad de vocales es:" + Arreglo.cuentaVocales(arreglo3));
        
        System.out.println("El caracter elegido se encuentra " + Arreglo.cuentaCaracter(arreglo4, 'o') + " veces.");
    }
    
}
