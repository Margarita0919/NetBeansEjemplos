/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operaciones;

/**
 *
 * @author MargaritaVargasGuerra
 */
public class Operaciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        short suma;
        suma = 3+10;
        int resta= 8-17;
        long residuo = 9%2;
        float multiplicacion =2*(15*(-2));
        double division = 10/3.4;
        
        System.out.println("El resultado de la suma es:" + suma);//suma
        System.out.println("El resultado de la resta es:" + resta);//resta
        System.out.println("El resultado de la multiplicacion es:" + multiplicacion);//suma
        System.out.println("El resultado de la division es:" + division);//division
        System.out.println("El residuo de la division es:" + residuo);//modulo o residuo
       
        
    }
    
}
