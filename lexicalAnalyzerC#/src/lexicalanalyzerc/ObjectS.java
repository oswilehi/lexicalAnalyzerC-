/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lexicalanalyzerc;

/**
 *
 * @author Oscar
 */
public class ObjectS {
    /*Nombre del objeto, el identificador*/
    public String name;
    /*Tipo de dato del objeto, int, double, etc*/
    public String type;
    /*Valor*/
    public String val;
    /*Ambito*/
    public String ambit;
    /*Tipo de objeto, funcion, variable, ambito, parametro etc...*/
    public String objectType;
    
    public ObjectS(String name, String type, String val, String objectType, String ambit){
        this.name = name;
        this.type = type;
        this.val = val;
        this.objectType = objectType;
        this.ambit = ambit;
    }
    
    public ObjectS()
    {
        
    }
    
    public String getName()
    {
        return this.name;
    }
    
    public String getAmbit()
    {
        return this.ambit;
    }
    
    
    
}
