/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgswitch;

/**
 *
 * @author MargaritaVargasGuerra
 */
public class Switch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char x;
        x='B';
        switch(x) 
        {
    case 'a':
    {
        System.out.println("Esta es la opcion 0");
        break;
    }
    case 'b':
    {
        System.out.println("Esta es la opcion 1");
        break;
    }
    default:
    {
                System.out.println("Esta opcion es la opcion por defecto ");

    }
        }
        
    }
}
    

