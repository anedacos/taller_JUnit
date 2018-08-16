/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallerjunit;

/**
 *
 * @author piero512
 */
public class Funciones {
    
    public static final int factorial(int number){
        if(number < 0)
            throw new UnsupportedOperationException();
        int ac = 1;
        for(int i = 1; i < number; i++)
            ac*=i;
        return ac;
    }
    
}
