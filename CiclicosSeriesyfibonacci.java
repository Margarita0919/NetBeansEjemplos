/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ciclicos.seriesyfibonacci;

/**
 *
 * @author MargaritaVargasGuerra
 */
public class CiclicosSeriesyfibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int x=1;
        int anterior =0;
        int temp;
        
        while(true)
        {
            System.out.println(x);
            temp = x ;
            x= x + anterior;
            anterior = temp ;
            if(x>30)
            {
                break;
            }
        }
    }
    
}
