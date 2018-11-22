/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lexicalanalyzerc;
import java.util.*;

/**
 *
 * @author Oscar
 */
public class tableOfSymbols {
    ArrayList<ObjectS> table = new ArrayList<ObjectS>();
    /*Ambito al que pertenece*/
    public String ambit = "";
    static String bitacora = "";
    
    public tableOfSymbols(){
        System.out.println("Tabla creada " + table.size());
    }
    
    public void addSymbolS(ObjectS e, LinkedList<String> ambits){
        if(!searchSymbolS(e, ambits))
            table.add(e);
    }
    
    public boolean searchSymbolS(ObjectS e, LinkedList<String> ambits){
        boolean decision = false;
        for (int j = 0; j < table.size(); j++) {
            for (int i = ambits.size() - 1; i >= 0; i--) {
                if (e.name.equals(table.get(j).getName()) && table.get(j).getAmbit().equals(ambits.get(i)))
                    decision = true;
            }
        }
        
        return decision;
    }
    
    public ObjectS getSymbolS(ObjectS e, LinkedList<String> ambits){
    ObjectS object = null;        
        for (int i = 0; i < table.size(); i++) {
            for (int j = ambits.size()-1; j >= 0; j--) {
                if (e.name.equals(table.get(i).getName()) && table.get(i).getAmbit().equals(ambits.get(j)))
                    object = table.get(i);
            }         
        }       
        return object;
    }
    
    public void deleteSymbolS(ObjectS e){
        for (int i = 0; i < table.size(); i++) {
            if (e.name.equals(table.get(i).getName()) && e.ambit.equals(table.get(i).getAmbit()))
                table.remove(i);
        }
    }
    
    
    public void addToLog(String s){
        bitacora += s + "\n";
    }
    
    
}
