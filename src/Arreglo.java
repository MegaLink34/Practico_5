/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author EL MEGAS
 */
public class Arreglo {
    
    public static void sumarLista (int arregloDeEnteros[]){
        
        int suma = 0;
        
        double promedio;
        
        for (int i = 0; i < arregloDeEnteros.length; i++) {
            suma += arregloDeEnteros[i];
        }
        promedio = suma / arregloDeEnteros.length;
        
        System.out.println("La suma de los numeros es:" + suma + " y el promedio es de " + promedio);
        
        
    }
    
    public static int buscarMayor (int arregloBidimensionalIrregular[][]){
        
        int mayor = arregloBidimensionalIrregular[0][0];
        
        for (int i = 0; i < arregloBidimensionalIrregular.length; i++) {
            for (int j = 0; j < arregloBidimensionalIrregular[i].length; j++) {
            
                if (mayor < arregloBidimensionalIrregular[i][j]) {
                    mayor = arregloBidimensionalIrregular[i][j];
                }
            }
        }
        return mayor;
    }
    
    public static int cuentaVocales (String string){
        
        char arreglo[] = string.toCharArray();
        
        int contador = 0;
        
        for (int i = 0; i < arreglo.length; i++) {
            switch(arreglo[i]){
            
                case 'a':
                    contador++;
                break;
                
                case 'e':
                    contador++;
                break;
                
                case 'i':
                    contador++;
                break;
                
                case 'o':
                    contador++;
                break;
                
                case 'u':
                    contador++;
                break;
            }
        }
        return contador;
    }
    
    public static int cuentaCaracter (String string, char letra){
        
        char arreglo[] = string.toCharArray();
        
        int contador = 0;
                
        for (char c : arreglo) {
            if(c == letra){
                contador++;
            }
        }
        return contador;
    }
    
}
