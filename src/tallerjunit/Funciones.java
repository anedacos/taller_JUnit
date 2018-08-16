/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallerjunit;

import java.util.HashMap;
import java.util.Map;

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
    
    public static String getPropValue(final String key){
        Map<String, String> appProps = new HashMap<String, String>();
        appProps.put("key1", "value 1");
        appProps.put("key2", "value 2");
        appProps.put("key3", "value 3");
        return appProps.get(key);
    }
    
}
