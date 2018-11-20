/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lexicalanalyzerc;
import java.util.Dictionary;
import java.util.HashMap;
import java.lang.Object;

/**
 *
 * @author Oscar
 */
public class tableOfSymbols {
    HashMap<String, ObjectS> table = new HashMap();
    
    /*Ambito al que pertenece*/
    public int ambit = 0;
    
    public tableOfSymbols(){
        System.out.println("Tabla creada " + table.size());
    }
    
    public ObjectS searchSymbolS(String key){
        return table.get(key);
    }
    
    public void addSymbolS(String key, ObjectS object){
        if (table.get(key) == null)
            table.put(key, object);
        
    }
    
    
    
    /*Agrego el ambito a la tabla*/
    public void addAmbitToTable(){
        table.put("ambit,"+ambit, new ObjectS("","","","ambit",""));
        System.out.println("nuevo ambito con id: " + ambit);
    }
    
    /*Se creo un ambito nuevo*/
    public void newAmbit(){
        ambit++;
    }
    
    public void ambitFinished(){
        ambit--;
    }
    
    
}
